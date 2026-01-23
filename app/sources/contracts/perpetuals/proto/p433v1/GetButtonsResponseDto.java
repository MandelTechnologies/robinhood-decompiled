package contracts.perpetuals.proto.p433v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import contracts.perpetuals.proto.p433v1.GetButtonsResponse;
import contracts.perpetuals.proto.p433v1.GetButtonsResponseDto;
import contracts.perpetuals.proto.p433v1.SourceScreenDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import rh_server_driven_ui.p531v1.Button;
import rh_server_driven_ui.p531v1.ButtonDto;

/* compiled from: GetButtonsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007)(*+,-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\"R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006/"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponse;", "Landroid/os/Parcelable;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$Surrogate;)V", "Lcontracts/perpetuals/proto/v1/SourceScreenDto;", "source_screen", "", "perpetual_contract_id", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$DisplayTypeDto;", "display_type", "(Lcontracts/perpetuals/proto/v1/SourceScreenDto;Ljava/lang/String;Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$DisplayTypeDto;)V", "toProto", "()Lcontracts/perpetuals/proto/v1/GetButtonsResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$Surrogate;", "getSource_screen", "()Lcontracts/perpetuals/proto/v1/SourceScreenDto;", "getPerpetual_contract_id", "getDisplay_type", "()Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$DisplayTypeDto;", "Companion", "Surrogate", "DisplayTypeDto", "ButtonBarDto", "ExpandableButtonsDto", "Serializer", "MultibindingModule", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes18.dex */
public final class GetButtonsResponseDto implements Dto3<GetButtonsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetButtonsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetButtonsResponseDto, GetButtonsResponse>> binaryBase64Serializer$delegate;
    private static final GetButtonsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetButtonsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetButtonsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final SourceScreenDto getSource_screen() {
        return this.surrogate.getSource_screen();
    }

    public final String getPerpetual_contract_id() {
        return this.surrogate.getPerpetual_contract_id();
    }

    public final DisplayTypeDto getDisplay_type() {
        if (this.surrogate.getButton_bar() != null) {
            return new DisplayTypeDto.ButtonBar(this.surrogate.getButton_bar());
        }
        if (this.surrogate.getExpandable_buttons() != null) {
            return new DisplayTypeDto.ExpandableButtons(this.surrogate.getExpandable_buttons());
        }
        return null;
    }

    public /* synthetic */ GetButtonsResponseDto(SourceScreenDto sourceScreenDto, String str, DisplayTypeDto displayTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SourceScreenDto.INSTANCE.getZeroValue() : sourceScreenDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : displayTypeDto);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GetButtonsResponseDto(SourceScreenDto source_screen, String perpetual_contract_id, DisplayTypeDto displayTypeDto) {
        Intrinsics.checkNotNullParameter(source_screen, "source_screen");
        Intrinsics.checkNotNullParameter(perpetual_contract_id, "perpetual_contract_id");
        DisplayTypeDto.ButtonBar buttonBar = displayTypeDto instanceof DisplayTypeDto.ButtonBar ? (DisplayTypeDto.ButtonBar) displayTypeDto : null;
        ButtonBarDto value = buttonBar != null ? buttonBar.getValue() : null;
        DisplayTypeDto.ExpandableButtons expandableButtons = displayTypeDto instanceof DisplayTypeDto.ExpandableButtons ? (DisplayTypeDto.ExpandableButtons) displayTypeDto : null;
        this(new Surrogate(source_screen, perpetual_contract_id, value, expandableButtons != null ? expandableButtons.getValue() : null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetButtonsResponse toProto() {
        SourceScreen sourceScreen = (SourceScreen) this.surrogate.getSource_screen().toProto();
        String perpetual_contract_id = this.surrogate.getPerpetual_contract_id();
        ButtonBarDto button_bar = this.surrogate.getButton_bar();
        GetButtonsResponse.ButtonBar proto = button_bar != null ? button_bar.toProto() : null;
        ExpandableButtonsDto expandable_buttons = this.surrogate.getExpandable_buttons();
        return new GetButtonsResponse(sourceScreen, perpetual_contract_id, proto, expandable_buttons != null ? expandable_buttons.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[GetButtonsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetButtonsResponseDto) && Intrinsics.areEqual(((GetButtonsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetButtonsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000232B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b%\u0010&\u001a\u0004\b#\u0010$R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010'\u0012\u0004\b)\u0010&\u001a\u0004\b(\u0010\u001bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b-\u0010&\u001a\u0004\b+\u0010,R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b1\u0010&\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$Surrogate;", "", "Lcontracts/perpetuals/proto/v1/SourceScreenDto;", "source_screen", "", "perpetual_contract_id", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto;", "button_bar", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto;", "expandable_buttons", "<init>", "(Lcontracts/perpetuals/proto/v1/SourceScreenDto;Ljava/lang/String;Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto;Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcontracts/perpetuals/proto/v1/SourceScreenDto;Ljava/lang/String;Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto;Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_perpetuals_proto_v1_externalRelease", "(Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/perpetuals/proto/v1/SourceScreenDto;", "getSource_screen", "()Lcontracts/perpetuals/proto/v1/SourceScreenDto;", "getSource_screen$annotations", "()V", "Ljava/lang/String;", "getPerpetual_contract_id", "getPerpetual_contract_id$annotations", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto;", "getButton_bar", "()Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto;", "getButton_bar$annotations", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto;", "getExpandable_buttons", "()Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto;", "getExpandable_buttons$annotations", "Companion", "$serializer", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ButtonBarDto button_bar;
        private final ExpandableButtonsDto expandable_buttons;
        private final String perpetual_contract_id;
        private final SourceScreenDto source_screen;

        public Surrogate() {
            this((SourceScreenDto) null, (String) null, (ButtonBarDto) null, (ExpandableButtonsDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.source_screen == surrogate.source_screen && Intrinsics.areEqual(this.perpetual_contract_id, surrogate.perpetual_contract_id) && Intrinsics.areEqual(this.button_bar, surrogate.button_bar) && Intrinsics.areEqual(this.expandable_buttons, surrogate.expandable_buttons);
        }

        public int hashCode() {
            int iHashCode = ((this.source_screen.hashCode() * 31) + this.perpetual_contract_id.hashCode()) * 31;
            ButtonBarDto buttonBarDto = this.button_bar;
            int iHashCode2 = (iHashCode + (buttonBarDto == null ? 0 : buttonBarDto.hashCode())) * 31;
            ExpandableButtonsDto expandableButtonsDto = this.expandable_buttons;
            return iHashCode2 + (expandableButtonsDto != null ? expandableButtonsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(source_screen=" + this.source_screen + ", perpetual_contract_id=" + this.perpetual_contract_id + ", button_bar=" + this.button_bar + ", expandable_buttons=" + this.expandable_buttons + ")";
        }

        /* compiled from: GetButtonsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$Surrogate;", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetButtonsResponseDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, SourceScreenDto sourceScreenDto, String str, ButtonBarDto buttonBarDto, ExpandableButtonsDto expandableButtonsDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.source_screen = (i & 1) == 0 ? SourceScreenDto.INSTANCE.getZeroValue() : sourceScreenDto;
            if ((i & 2) == 0) {
                this.perpetual_contract_id = "";
            } else {
                this.perpetual_contract_id = str;
            }
            if ((i & 4) == 0) {
                this.button_bar = null;
            } else {
                this.button_bar = buttonBarDto;
            }
            if ((i & 8) == 0) {
                this.expandable_buttons = null;
            } else {
                this.expandable_buttons = expandableButtonsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$contracts_perpetuals_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.source_screen != SourceScreenDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, SourceScreenDto.Serializer.INSTANCE, self.source_screen);
            }
            if (!Intrinsics.areEqual(self.perpetual_contract_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.perpetual_contract_id);
            }
            ButtonBarDto buttonBarDto = self.button_bar;
            if (buttonBarDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ButtonBarDto.Serializer.INSTANCE, buttonBarDto);
            }
            ExpandableButtonsDto expandableButtonsDto = self.expandable_buttons;
            if (expandableButtonsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, ExpandableButtonsDto.Serializer.INSTANCE, expandableButtonsDto);
            }
        }

        public Surrogate(SourceScreenDto source_screen, String perpetual_contract_id, ButtonBarDto buttonBarDto, ExpandableButtonsDto expandableButtonsDto) {
            Intrinsics.checkNotNullParameter(source_screen, "source_screen");
            Intrinsics.checkNotNullParameter(perpetual_contract_id, "perpetual_contract_id");
            this.source_screen = source_screen;
            this.perpetual_contract_id = perpetual_contract_id;
            this.button_bar = buttonBarDto;
            this.expandable_buttons = expandableButtonsDto;
        }

        public final SourceScreenDto getSource_screen() {
            return this.source_screen;
        }

        public /* synthetic */ Surrogate(SourceScreenDto sourceScreenDto, String str, ButtonBarDto buttonBarDto, ExpandableButtonsDto expandableButtonsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? SourceScreenDto.INSTANCE.getZeroValue() : sourceScreenDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : buttonBarDto, (i & 8) != 0 ? null : expandableButtonsDto);
        }

        public final String getPerpetual_contract_id() {
            return this.perpetual_contract_id;
        }

        public final ButtonBarDto getButton_bar() {
            return this.button_bar;
        }

        public final ExpandableButtonsDto getExpandable_buttons() {
            return this.expandable_buttons;
        }
    }

    /* compiled from: GetButtonsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetButtonsResponseDto, GetButtonsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetButtonsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetButtonsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetButtonsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetButtonsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetButtonsResponse> getProtoAdapter() {
            return GetButtonsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetButtonsResponseDto getZeroValue() {
            return GetButtonsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetButtonsResponseDto fromProto(GetButtonsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            SourceScreenDto sourceScreenDtoFromProto = SourceScreenDto.INSTANCE.fromProto(proto.getSource_screen());
            String perpetual_contract_id = proto.getPerpetual_contract_id();
            GetButtonsResponse.ButtonBar button_bar = proto.getButton_bar();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ButtonBarDto buttonBarDtoFromProto = button_bar != null ? ButtonBarDto.INSTANCE.fromProto(button_bar) : null;
            GetButtonsResponse.ExpandableButtons expandable_buttons = proto.getExpandable_buttons();
            return new GetButtonsResponseDto(new Surrogate(sourceScreenDtoFromProto, perpetual_contract_id, buttonBarDtoFromProto, expandable_buttons != null ? ExpandableButtonsDto.INSTANCE.fromProto(expandable_buttons) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.perpetuals.proto.v1.GetButtonsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetButtonsResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetButtonsResponseDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetButtonsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$DisplayTypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "ButtonBar", "ExpandableButtons", "Companion", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$DisplayTypeDto$ButtonBar;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$DisplayTypeDto$ExpandableButtons;", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class DisplayTypeDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ DisplayTypeDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DisplayTypeDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: GetButtonsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$DisplayTypeDto$ButtonBar;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$DisplayTypeDto;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto;", "value", "<init>", "(Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto;", "getValue", "()Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto;", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ButtonBar extends DisplayTypeDto {
            private final ButtonBarDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ButtonBar) && Intrinsics.areEqual(this.value, ((ButtonBar) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ButtonBar(value=" + this.value + ")";
            }

            public final ButtonBarDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ButtonBar(ButtonBarDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: GetButtonsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$DisplayTypeDto$ExpandableButtons;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$DisplayTypeDto;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto;", "value", "<init>", "(Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto;", "getValue", "()Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto;", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class ExpandableButtons extends DisplayTypeDto {
            private final ExpandableButtonsDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ExpandableButtons) && Intrinsics.areEqual(this.value, ((ExpandableButtons) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "ExpandableButtons(value=" + this.value + ")";
            }

            public final ExpandableButtonsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ExpandableButtons(ExpandableButtonsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: GetButtonsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$DisplayTypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$DisplayTypeDto;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponse;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<DisplayTypeDto, GetButtonsResponse> {
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
            public ProtoAdapter<GetButtonsResponse> getProtoAdapter() {
                return GetButtonsResponse.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DisplayTypeDto fromProto(GetButtonsResponse proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getButton_bar() != null) {
                    return new ButtonBar(ButtonBarDto.INSTANCE.fromProto(proto.getButton_bar()));
                }
                if (proto.getExpandable_buttons() != null) {
                    return new ExpandableButtons(ExpandableButtonsDto.INSTANCE.fromProto(proto.getExpandable_buttons()));
                }
                return null;
            }
        }
    }

    /* compiled from: GetButtonsResponseDto.kt */
    @Serializable(with = Serializer.class)
    @RhGenerated
    @SourceDebugExtension
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004&%'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0006\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0016¢\u0006\u0004\b \u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006)"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponse$ButtonBar;", "Landroid/os/Parcelable;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto$Surrogate;)V", "", "helper_text", "", "Lrh_server_driven_ui/v1/ButtonDto;", CarResultComposable2.BUTTONS, "(Ljava/lang/String;Ljava/util/List;)V", "toProto", "()Lcontracts/perpetuals/proto/v1/GetButtonsResponse$ButtonBar;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto$Surrogate;", "getHelper_text", "getButtons", "()Ljava/util/List;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ButtonBarDto implements Dto3<GetButtonsResponse.ButtonBar>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ButtonBarDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ButtonBarDto, GetButtonsResponse.ButtonBar>> binaryBase64Serializer$delegate;
        private static final ButtonBarDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ButtonBarDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ButtonBarDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getHelper_text() {
            return this.surrogate.getHelper_text();
        }

        public final List<ButtonDto> getButtons() {
            return this.surrogate.getButtons();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ButtonBarDto(String str, List<ButtonDto> buttons) {
            this(new Surrogate(str, buttons));
            Intrinsics.checkNotNullParameter(buttons, "buttons");
        }

        public /* synthetic */ ButtonBarDto(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (List<ButtonDto>) ((i & 2) != 0 ? CollectionsKt.emptyList() : list));
        }

        @Override // com.robinhood.idl.Dto
        public GetButtonsResponse.ButtonBar toProto() {
            String helper_text = this.surrogate.getHelper_text();
            List<ButtonDto> buttons = this.surrogate.getButtons();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(buttons, 10));
            Iterator<T> it = buttons.iterator();
            while (it.hasNext()) {
                arrayList.add(((ButtonDto) it.next()).toProto());
            }
            return new GetButtonsResponse.ButtonBar(helper_text, arrayList, null, 4, null);
        }

        public String toString() {
            return "[ButtonBarDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ButtonBarDto) && Intrinsics.areEqual(((ButtonBarDto) other).surrogate, this.surrogate);
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
        /* compiled from: GetButtonsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 '2\u00020\u0001:\u0002('B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0018R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010#\u0012\u0004\b&\u0010\"\u001a\u0004\b$\u0010%¨\u0006)"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto$Surrogate;", "", "", "helper_text", "", "Lrh_server_driven_ui/v1/ButtonDto;", CarResultComposable2.BUTTONS, "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_perpetuals_proto_v1_externalRelease", "(Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getHelper_text", "getHelper_text$annotations", "()V", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "getButtons$annotations", "Companion", "$serializer", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            private final List<ButtonDto> buttons;
            private final String helper_text;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.perpetuals.proto.v1.GetButtonsResponseDto$ButtonBarDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetButtonsResponseDto.ButtonBarDto.Surrogate._childSerializers$_anonymous_();
                }
            })};

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((String) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(ButtonDto.Serializer.INSTANCE);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.helper_text, surrogate.helper_text) && Intrinsics.areEqual(this.buttons, surrogate.buttons);
            }

            public int hashCode() {
                String str = this.helper_text;
                return ((str == null ? 0 : str.hashCode()) * 31) + this.buttons.hashCode();
            }

            public String toString() {
                return "Surrogate(helper_text=" + this.helper_text + ", buttons=" + this.buttons + ")";
            }

            /* compiled from: GetButtonsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto$Surrogate;", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return GetButtonsResponseDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, List list, SerializationConstructorMarker serializationConstructorMarker) {
                this.helper_text = (i & 1) == 0 ? null : str;
                if ((i & 2) == 0) {
                    this.buttons = CollectionsKt.emptyList();
                } else {
                    this.buttons = list;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts_perpetuals_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                String str = self.helper_text;
                if (str != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
                }
                if (Intrinsics.areEqual(self.buttons, CollectionsKt.emptyList())) {
                    return;
                }
                output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.buttons);
            }

            public Surrogate(String str, List<ButtonDto> buttons) {
                Intrinsics.checkNotNullParameter(buttons, "buttons");
                this.helper_text = str;
                this.buttons = buttons;
            }

            public final String getHelper_text() {
                return this.helper_text;
            }

            public final List<ButtonDto> getButtons() {
                return this.buttons;
            }

            public /* synthetic */ Surrogate(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
            }
        }

        /* compiled from: GetButtonsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponse$ButtonBar;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<ButtonBarDto, GetButtonsResponse.ButtonBar> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ButtonBarDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ButtonBarDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ButtonBarDto> getBinaryBase64Serializer() {
                return (KSerializer) ButtonBarDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GetButtonsResponse.ButtonBar> getProtoAdapter() {
                return GetButtonsResponse.ButtonBar.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ButtonBarDto getZeroValue() {
                return ButtonBarDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ButtonBarDto fromProto(GetButtonsResponse.ButtonBar proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                String helper_text = proto.getHelper_text();
                List<Button> buttons = proto.getButtons();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(buttons, 10));
                Iterator<T> it = buttons.iterator();
                while (it.hasNext()) {
                    arrayList.add(ButtonDto.INSTANCE.fromProto((Button) it.next()));
                }
                return new ButtonBarDto(new Surrogate(helper_text, arrayList), (DefaultConstructorMarker) null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.perpetuals.proto.v1.GetButtonsResponseDto$ButtonBarDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetButtonsResponseDto.ButtonBarDto.binaryBase64Serializer_delegate$lambda$1();
                }
            });
            zeroValue = new ButtonBarDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: GetButtonsResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<ButtonBarDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.perpetuals.proto.v1.GetButtonsResponse.ButtonBar", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ButtonBarDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ButtonBarDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ButtonBarDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: GetButtonsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ButtonBarDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4193_9)
            public final String provideIntoMap() {
                return "contracts.perpetuals.proto.v1.GetButtonsResponseDto$ButtonBarDto";
            }
        }
    }

    /* compiled from: GetButtonsResponseDto.kt */
    @Serializable(with = Serializer.class)
    @RhGenerated
    @SourceDebugExtension
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*)+,B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0013¨\u0006-"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponse$ExpandableButtons;", "Landroid/os/Parcelable;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto$Surrogate;", "surrogate", "<init>", "(Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto$Surrogate;)V", "", "Lrh_server_driven_ui/v1/ButtonDto;", CarResultComposable2.BUTTONS, "", "left_title", "left_subtitle", "expand_button_title", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lcontracts/perpetuals/proto/v1/GetButtonsResponse$ExpandableButtons;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto$Surrogate;", "getButtons", "()Ljava/util/List;", "getLeft_title", "getLeft_subtitle", "getExpand_button_title", "Companion", "Surrogate", "Serializer", "MultibindingModule", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ExpandableButtonsDto implements Dto3<GetButtonsResponse.ExpandableButtons>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ExpandableButtonsDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ExpandableButtonsDto, GetButtonsResponse.ExpandableButtons>> binaryBase64Serializer$delegate;
        private static final ExpandableButtonsDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ExpandableButtonsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ExpandableButtonsDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final List<ButtonDto> getButtons() {
            return this.surrogate.getButtons();
        }

        public final String getLeft_title() {
            return this.surrogate.getLeft_title();
        }

        public final String getLeft_subtitle() {
            return this.surrogate.getLeft_subtitle();
        }

        public final String getExpand_button_title() {
            return this.surrogate.getExpand_button_title();
        }

        public /* synthetic */ ExpandableButtonsDto(List list, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ExpandableButtonsDto(List<ButtonDto> buttons, String left_title, String left_subtitle, String expand_button_title) {
            this(new Surrogate(buttons, left_title, left_subtitle, expand_button_title));
            Intrinsics.checkNotNullParameter(buttons, "buttons");
            Intrinsics.checkNotNullParameter(left_title, "left_title");
            Intrinsics.checkNotNullParameter(left_subtitle, "left_subtitle");
            Intrinsics.checkNotNullParameter(expand_button_title, "expand_button_title");
        }

        @Override // com.robinhood.idl.Dto
        public GetButtonsResponse.ExpandableButtons toProto() {
            List<ButtonDto> buttons = this.surrogate.getButtons();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(buttons, 10));
            Iterator<T> it = buttons.iterator();
            while (it.hasNext()) {
                arrayList.add(((ButtonDto) it.next()).toProto());
            }
            return new GetButtonsResponse.ExpandableButtons(arrayList, this.surrogate.getLeft_title(), this.surrogate.getLeft_subtitle(), this.surrogate.getExpand_button_title(), null, 16, null);
        }

        public String toString() {
            return "[ExpandableButtonsDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ExpandableButtonsDto) && Intrinsics.areEqual(((ExpandableButtonsDto) other).surrogate, this.surrogate);
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
        /* compiled from: GetButtonsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0083\b\u0018\u0000 -2\u00020\u0001:\u0002.-B5\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nBI\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010\u001aR \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b*\u0010%\u001a\u0004\b)\u0010\u001aR \u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010&\u0012\u0004\b,\u0010%\u001a\u0004\b+\u0010\u001a¨\u0006/"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto$Surrogate;", "", "", "Lrh_server_driven_ui/v1/ButtonDto;", CarResultComposable2.BUTTONS, "", "left_title", "left_subtitle", "expand_button_title", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$contracts_perpetuals_proto_v1_externalRelease", "(Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "getButtons$annotations", "()V", "Ljava/lang/String;", "getLeft_title", "getLeft_title$annotations", "getLeft_subtitle", "getLeft_subtitle$annotations", "getExpand_button_title", "getExpand_button_title$annotations", "Companion", "$serializer", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {
            private final List<ButtonDto> buttons;
            private final String expand_button_title;
            private final String left_subtitle;
            private final String left_title;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);

            @JvmField
            private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: contracts.perpetuals.proto.v1.GetButtonsResponseDto$ExpandableButtonsDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetButtonsResponseDto.ExpandableButtonsDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, null, null};

            public Surrogate() {
                this((List) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
                return new ArrayListSerializer(ButtonDto.Serializer.INSTANCE);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.buttons, surrogate.buttons) && Intrinsics.areEqual(this.left_title, surrogate.left_title) && Intrinsics.areEqual(this.left_subtitle, surrogate.left_subtitle) && Intrinsics.areEqual(this.expand_button_title, surrogate.expand_button_title);
            }

            public int hashCode() {
                return (((((this.buttons.hashCode() * 31) + this.left_title.hashCode()) * 31) + this.left_subtitle.hashCode()) * 31) + this.expand_button_title.hashCode();
            }

            public String toString() {
                return "Surrogate(buttons=" + this.buttons + ", left_title=" + this.left_title + ", left_subtitle=" + this.left_subtitle + ", expand_button_title=" + this.expand_button_title + ")";
            }

            /* compiled from: GetButtonsResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto$Surrogate;", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return GetButtonsResponseDto3.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, List list, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
                this.buttons = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
                if ((i & 2) == 0) {
                    this.left_title = "";
                } else {
                    this.left_title = str;
                }
                if ((i & 4) == 0) {
                    this.left_subtitle = "";
                } else {
                    this.left_subtitle = str2;
                }
                if ((i & 8) == 0) {
                    this.expand_button_title = "";
                } else {
                    this.expand_button_title = str3;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$contracts_perpetuals_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
                if (!Intrinsics.areEqual(self.buttons, CollectionsKt.emptyList())) {
                    output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.buttons);
                }
                if (!Intrinsics.areEqual(self.left_title, "")) {
                    output.encodeStringElement(serialDesc, 1, self.left_title);
                }
                if (!Intrinsics.areEqual(self.left_subtitle, "")) {
                    output.encodeStringElement(serialDesc, 2, self.left_subtitle);
                }
                if (Intrinsics.areEqual(self.expand_button_title, "")) {
                    return;
                }
                output.encodeStringElement(serialDesc, 3, self.expand_button_title);
            }

            public Surrogate(List<ButtonDto> buttons, String left_title, String left_subtitle, String expand_button_title) {
                Intrinsics.checkNotNullParameter(buttons, "buttons");
                Intrinsics.checkNotNullParameter(left_title, "left_title");
                Intrinsics.checkNotNullParameter(left_subtitle, "left_subtitle");
                Intrinsics.checkNotNullParameter(expand_button_title, "expand_button_title");
                this.buttons = buttons;
                this.left_title = left_title;
                this.left_subtitle = left_subtitle;
                this.expand_button_title = expand_button_title;
            }

            public final List<ButtonDto> getButtons() {
                return this.buttons;
            }

            public /* synthetic */ Surrogate(List list, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3);
            }

            public final String getLeft_title() {
                return this.left_title;
            }

            public final String getLeft_subtitle() {
                return this.left_subtitle;
            }

            public final String getExpand_button_title() {
                return this.expand_button_title;
            }
        }

        /* compiled from: GetButtonsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponse$ExpandableButtons;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<ExpandableButtonsDto, GetButtonsResponse.ExpandableButtons> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ExpandableButtonsDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ExpandableButtonsDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ExpandableButtonsDto> getBinaryBase64Serializer() {
                return (KSerializer) ExpandableButtonsDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<GetButtonsResponse.ExpandableButtons> getProtoAdapter() {
                return GetButtonsResponse.ExpandableButtons.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ExpandableButtonsDto getZeroValue() {
                return ExpandableButtonsDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ExpandableButtonsDto fromProto(GetButtonsResponse.ExpandableButtons proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                List<Button> buttons = proto.getButtons();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(buttons, 10));
                Iterator<T> it = buttons.iterator();
                while (it.hasNext()) {
                    arrayList.add(ButtonDto.INSTANCE.fromProto((Button) it.next()));
                }
                return new ExpandableButtonsDto(new Surrogate(arrayList, proto.getLeft_title(), proto.getLeft_subtitle(), proto.getExpand_button_title()), null);
            }
        }

        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: contracts.perpetuals.proto.v1.GetButtonsResponseDto$ExpandableButtonsDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GetButtonsResponseDto.ExpandableButtonsDto.binaryBase64Serializer_delegate$lambda$1();
                }
            });
            zeroValue = new ExpandableButtonsDto(null, null, null, null, 15, null);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: GetButtonsResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<ExpandableButtonsDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.perpetuals.proto.v1.GetButtonsResponse.ExpandableButtons", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ExpandableButtonsDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ExpandableButtonsDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ExpandableButtonsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: GetButtonsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$ExpandableButtonsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4187_3)
            public final String provideIntoMap() {
                return "contracts.perpetuals.proto.v1.GetButtonsResponseDto$ExpandableButtonsDto";
            }
        }
    }

    /* compiled from: GetButtonsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetButtonsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/contracts.perpetuals.proto.v1.GetButtonsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetButtonsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetButtonsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetButtonsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetButtonsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcontracts/perpetuals/proto/v1/GetButtonsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "contracts.perpetuals.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "contracts.perpetuals.proto.v1.GetButtonsResponseDto";
        }
    }
}
