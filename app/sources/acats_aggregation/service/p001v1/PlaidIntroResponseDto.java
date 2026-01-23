package acats_aggregation.service.p001v1;

import acats_aggregation.service.p001v1.PlaidIntroSelectionDto;
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
import rh_server_driven_ui.p531v1.UIComponent;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: PlaidIntroResponseDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 .2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004/.01B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Ba\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b*\u0010)R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b-\u0010,¨\u00062"}, m3636d2 = {"Lacats_aggregation/service/v1/PlaidIntroResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lacats_aggregation/service/v1/PlaidIntroResponse;", "Landroid/os/Parcelable;", "Lacats_aggregation/service/v1/PlaidIntroResponseDto$Surrogate;", "surrogate", "<init>", "(Lacats_aggregation/service/v1/PlaidIntroResponseDto$Surrogate;)V", "Lrh_server_driven_ui/v1/UIComponentDto;", "body_content", "footer_content", "", "plaid_cta_label", "manual_cta_label", "plaid_cta_logging_id", "manual_cta_logging_id", "Lacats_aggregation/service/v1/PlaidIntroSelectionDto;", "plaid_selection", "manual_selection", "(Lrh_server_driven_ui/v1/UIComponentDto;Lrh_server_driven_ui/v1/UIComponentDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lacats_aggregation/service/v1/PlaidIntroSelectionDto;Lacats_aggregation/service/v1/PlaidIntroSelectionDto;)V", "toProto", "()Lacats_aggregation/service/v1/PlaidIntroResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lacats_aggregation/service/v1/PlaidIntroResponseDto$Surrogate;", "getBody_content", "()Lrh_server_driven_ui/v1/UIComponentDto;", "getFooter_content", "getPlaid_selection", "()Lacats_aggregation/service/v1/PlaidIntroSelectionDto;", "getManual_selection", "Companion", "Surrogate", "Serializer", "MultibindingModule", "acats_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class PlaidIntroResponseDto implements Dto3<PlaidIntroResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PlaidIntroResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PlaidIntroResponseDto, PlaidIntroResponse>> binaryBase64Serializer$delegate;
    private static final PlaidIntroResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PlaidIntroResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PlaidIntroResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final UIComponentDto getBody_content() {
        return this.surrogate.getBody_content();
    }

    public final UIComponentDto getFooter_content() {
        return this.surrogate.getFooter_content();
    }

    public final PlaidIntroSelectionDto getPlaid_selection() {
        return this.surrogate.getPlaid_selection();
    }

    public final PlaidIntroSelectionDto getManual_selection() {
        return this.surrogate.getManual_selection();
    }

    public /* synthetic */ PlaidIntroResponseDto(UIComponentDto uIComponentDto, UIComponentDto uIComponentDto2, String str, String str2, String str3, String str4, PlaidIntroSelectionDto plaidIntroSelectionDto, PlaidIntroSelectionDto plaidIntroSelectionDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uIComponentDto, (i & 2) != 0 ? null : uIComponentDto2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? null : plaidIntroSelectionDto, (i & 128) != 0 ? null : plaidIntroSelectionDto2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidIntroResponseDto(UIComponentDto uIComponentDto, UIComponentDto uIComponentDto2, String plaid_cta_label, String manual_cta_label, String plaid_cta_logging_id, String manual_cta_logging_id, PlaidIntroSelectionDto plaidIntroSelectionDto, PlaidIntroSelectionDto plaidIntroSelectionDto2) {
        this(new Surrogate(uIComponentDto, uIComponentDto2, plaid_cta_label, manual_cta_label, plaid_cta_logging_id, manual_cta_logging_id, plaidIntroSelectionDto, plaidIntroSelectionDto2));
        Intrinsics.checkNotNullParameter(plaid_cta_label, "plaid_cta_label");
        Intrinsics.checkNotNullParameter(manual_cta_label, "manual_cta_label");
        Intrinsics.checkNotNullParameter(plaid_cta_logging_id, "plaid_cta_logging_id");
        Intrinsics.checkNotNullParameter(manual_cta_logging_id, "manual_cta_logging_id");
    }

    @Override // com.robinhood.idl.Dto
    public PlaidIntroResponse toProto() {
        UIComponentDto body_content = this.surrogate.getBody_content();
        UIComponent proto = body_content != null ? body_content.toProto() : null;
        UIComponentDto footer_content = this.surrogate.getFooter_content();
        UIComponent proto2 = footer_content != null ? footer_content.toProto() : null;
        String plaid_cta_label = this.surrogate.getPlaid_cta_label();
        String manual_cta_label = this.surrogate.getManual_cta_label();
        String plaid_cta_logging_id = this.surrogate.getPlaid_cta_logging_id();
        String manual_cta_logging_id = this.surrogate.getManual_cta_logging_id();
        PlaidIntroSelectionDto plaid_selection = this.surrogate.getPlaid_selection();
        PlaidIntroSelection proto3 = plaid_selection != null ? plaid_selection.toProto() : null;
        PlaidIntroSelectionDto manual_selection = this.surrogate.getManual_selection();
        return new PlaidIntroResponse(proto, proto2, plaid_cta_label, manual_cta_label, plaid_cta_logging_id, manual_cta_logging_id, proto3, manual_selection != null ? manual_selection.toProto() : null, null, 256, null);
    }

    public String toString() {
        return "[PlaidIntroResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PlaidIntroResponseDto) && Intrinsics.areEqual(((PlaidIntroResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: PlaidIntroResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0083\b\u0018\u0000 ;2\u00020\u0001:\u0002<;B_\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eBk\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010%\u0012\u0004\b+\u0010)\u001a\u0004\b*\u0010'R \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010,\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u001eR \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b0\u0010)\u001a\u0004\b/\u0010\u001eR \u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b2\u0010)\u001a\u0004\b1\u0010\u001eR \u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b4\u0010)\u001a\u0004\b3\u0010\u001eR\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\b8\u0010)\u001a\u0004\b6\u00107R\"\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00105\u0012\u0004\b:\u0010)\u001a\u0004\b9\u00107¨\u0006="}, m3636d2 = {"Lacats_aggregation/service/v1/PlaidIntroResponseDto$Surrogate;", "", "Lrh_server_driven_ui/v1/UIComponentDto;", "body_content", "footer_content", "", "plaid_cta_label", "manual_cta_label", "plaid_cta_logging_id", "manual_cta_logging_id", "Lacats_aggregation/service/v1/PlaidIntroSelectionDto;", "plaid_selection", "manual_selection", "<init>", "(Lrh_server_driven_ui/v1/UIComponentDto;Lrh_server_driven_ui/v1/UIComponentDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lacats_aggregation/service/v1/PlaidIntroSelectionDto;Lacats_aggregation/service/v1/PlaidIntroSelectionDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/UIComponentDto;Lrh_server_driven_ui/v1/UIComponentDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lacats_aggregation/service/v1/PlaidIntroSelectionDto;Lacats_aggregation/service/v1/PlaidIntroSelectionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$acats_aggregation_service_v1_externalRelease", "(Lacats_aggregation/service/v1/PlaidIntroResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/UIComponentDto;", "getBody_content", "()Lrh_server_driven_ui/v1/UIComponentDto;", "getBody_content$annotations", "()V", "getFooter_content", "getFooter_content$annotations", "Ljava/lang/String;", "getPlaid_cta_label", "getPlaid_cta_label$annotations", "getManual_cta_label", "getManual_cta_label$annotations", "getPlaid_cta_logging_id", "getPlaid_cta_logging_id$annotations", "getManual_cta_logging_id", "getManual_cta_logging_id$annotations", "Lacats_aggregation/service/v1/PlaidIntroSelectionDto;", "getPlaid_selection", "()Lacats_aggregation/service/v1/PlaidIntroSelectionDto;", "getPlaid_selection$annotations", "getManual_selection", "getManual_selection$annotations", "Companion", "$serializer", "acats_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final UIComponentDto body_content;
        private final UIComponentDto footer_content;
        private final String manual_cta_label;
        private final String manual_cta_logging_id;
        private final PlaidIntroSelectionDto manual_selection;
        private final String plaid_cta_label;
        private final String plaid_cta_logging_id;
        private final PlaidIntroSelectionDto plaid_selection;

        public Surrogate() {
            this((UIComponentDto) null, (UIComponentDto) null, (String) null, (String) null, (String) null, (String) null, (PlaidIntroSelectionDto) null, (PlaidIntroSelectionDto) null, 255, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.body_content, surrogate.body_content) && Intrinsics.areEqual(this.footer_content, surrogate.footer_content) && Intrinsics.areEqual(this.plaid_cta_label, surrogate.plaid_cta_label) && Intrinsics.areEqual(this.manual_cta_label, surrogate.manual_cta_label) && Intrinsics.areEqual(this.plaid_cta_logging_id, surrogate.plaid_cta_logging_id) && Intrinsics.areEqual(this.manual_cta_logging_id, surrogate.manual_cta_logging_id) && Intrinsics.areEqual(this.plaid_selection, surrogate.plaid_selection) && Intrinsics.areEqual(this.manual_selection, surrogate.manual_selection);
        }

        public int hashCode() {
            UIComponentDto uIComponentDto = this.body_content;
            int iHashCode = (uIComponentDto == null ? 0 : uIComponentDto.hashCode()) * 31;
            UIComponentDto uIComponentDto2 = this.footer_content;
            int iHashCode2 = (((((((((iHashCode + (uIComponentDto2 == null ? 0 : uIComponentDto2.hashCode())) * 31) + this.plaid_cta_label.hashCode()) * 31) + this.manual_cta_label.hashCode()) * 31) + this.plaid_cta_logging_id.hashCode()) * 31) + this.manual_cta_logging_id.hashCode()) * 31;
            PlaidIntroSelectionDto plaidIntroSelectionDto = this.plaid_selection;
            int iHashCode3 = (iHashCode2 + (plaidIntroSelectionDto == null ? 0 : plaidIntroSelectionDto.hashCode())) * 31;
            PlaidIntroSelectionDto plaidIntroSelectionDto2 = this.manual_selection;
            return iHashCode3 + (plaidIntroSelectionDto2 != null ? plaidIntroSelectionDto2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(body_content=" + this.body_content + ", footer_content=" + this.footer_content + ", plaid_cta_label=" + this.plaid_cta_label + ", manual_cta_label=" + this.manual_cta_label + ", plaid_cta_logging_id=" + this.plaid_cta_logging_id + ", manual_cta_logging_id=" + this.manual_cta_logging_id + ", plaid_selection=" + this.plaid_selection + ", manual_selection=" + this.manual_selection + ")";
        }

        /* compiled from: PlaidIntroResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lacats_aggregation/service/v1/PlaidIntroResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lacats_aggregation/service/v1/PlaidIntroResponseDto$Surrogate;", "acats_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PlaidIntroResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, UIComponentDto uIComponentDto, UIComponentDto uIComponentDto2, String str, String str2, String str3, String str4, PlaidIntroSelectionDto plaidIntroSelectionDto, PlaidIntroSelectionDto plaidIntroSelectionDto2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.body_content = null;
            } else {
                this.body_content = uIComponentDto;
            }
            if ((i & 2) == 0) {
                this.footer_content = null;
            } else {
                this.footer_content = uIComponentDto2;
            }
            if ((i & 4) == 0) {
                this.plaid_cta_label = "";
            } else {
                this.plaid_cta_label = str;
            }
            if ((i & 8) == 0) {
                this.manual_cta_label = "";
            } else {
                this.manual_cta_label = str2;
            }
            if ((i & 16) == 0) {
                this.plaid_cta_logging_id = "";
            } else {
                this.plaid_cta_logging_id = str3;
            }
            if ((i & 32) == 0) {
                this.manual_cta_logging_id = "";
            } else {
                this.manual_cta_logging_id = str4;
            }
            if ((i & 64) == 0) {
                this.plaid_selection = null;
            } else {
                this.plaid_selection = plaidIntroSelectionDto;
            }
            if ((i & 128) == 0) {
                this.manual_selection = null;
            } else {
                this.manual_selection = plaidIntroSelectionDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$acats_aggregation_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            UIComponentDto uIComponentDto = self.body_content;
            if (uIComponentDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, UIComponentDto.Serializer.INSTANCE, uIComponentDto);
            }
            UIComponentDto uIComponentDto2 = self.footer_content;
            if (uIComponentDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, UIComponentDto.Serializer.INSTANCE, uIComponentDto2);
            }
            if (!Intrinsics.areEqual(self.plaid_cta_label, "")) {
                output.encodeStringElement(serialDesc, 2, self.plaid_cta_label);
            }
            if (!Intrinsics.areEqual(self.manual_cta_label, "")) {
                output.encodeStringElement(serialDesc, 3, self.manual_cta_label);
            }
            if (!Intrinsics.areEqual(self.plaid_cta_logging_id, "")) {
                output.encodeStringElement(serialDesc, 4, self.plaid_cta_logging_id);
            }
            if (!Intrinsics.areEqual(self.manual_cta_logging_id, "")) {
                output.encodeStringElement(serialDesc, 5, self.manual_cta_logging_id);
            }
            PlaidIntroSelectionDto plaidIntroSelectionDto = self.plaid_selection;
            if (plaidIntroSelectionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, PlaidIntroSelectionDto.Serializer.INSTANCE, plaidIntroSelectionDto);
            }
            PlaidIntroSelectionDto plaidIntroSelectionDto2 = self.manual_selection;
            if (plaidIntroSelectionDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, PlaidIntroSelectionDto.Serializer.INSTANCE, plaidIntroSelectionDto2);
            }
        }

        public Surrogate(UIComponentDto uIComponentDto, UIComponentDto uIComponentDto2, String plaid_cta_label, String manual_cta_label, String plaid_cta_logging_id, String manual_cta_logging_id, PlaidIntroSelectionDto plaidIntroSelectionDto, PlaidIntroSelectionDto plaidIntroSelectionDto2) {
            Intrinsics.checkNotNullParameter(plaid_cta_label, "plaid_cta_label");
            Intrinsics.checkNotNullParameter(manual_cta_label, "manual_cta_label");
            Intrinsics.checkNotNullParameter(plaid_cta_logging_id, "plaid_cta_logging_id");
            Intrinsics.checkNotNullParameter(manual_cta_logging_id, "manual_cta_logging_id");
            this.body_content = uIComponentDto;
            this.footer_content = uIComponentDto2;
            this.plaid_cta_label = plaid_cta_label;
            this.manual_cta_label = manual_cta_label;
            this.plaid_cta_logging_id = plaid_cta_logging_id;
            this.manual_cta_logging_id = manual_cta_logging_id;
            this.plaid_selection = plaidIntroSelectionDto;
            this.manual_selection = plaidIntroSelectionDto2;
        }

        public /* synthetic */ Surrogate(UIComponentDto uIComponentDto, UIComponentDto uIComponentDto2, String str, String str2, String str3, String str4, PlaidIntroSelectionDto plaidIntroSelectionDto, PlaidIntroSelectionDto plaidIntroSelectionDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uIComponentDto, (i & 2) != 0 ? null : uIComponentDto2, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? null : plaidIntroSelectionDto, (i & 128) != 0 ? null : plaidIntroSelectionDto2);
        }

        public final UIComponentDto getBody_content() {
            return this.body_content;
        }

        public final UIComponentDto getFooter_content() {
            return this.footer_content;
        }

        public final String getPlaid_cta_label() {
            return this.plaid_cta_label;
        }

        public final String getManual_cta_label() {
            return this.manual_cta_label;
        }

        public final String getPlaid_cta_logging_id() {
            return this.plaid_cta_logging_id;
        }

        public final String getManual_cta_logging_id() {
            return this.manual_cta_logging_id;
        }

        public final PlaidIntroSelectionDto getPlaid_selection() {
            return this.plaid_selection;
        }

        public final PlaidIntroSelectionDto getManual_selection() {
            return this.manual_selection;
        }
    }

    /* compiled from: PlaidIntroResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lacats_aggregation/service/v1/PlaidIntroResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lacats_aggregation/service/v1/PlaidIntroResponseDto;", "Lacats_aggregation/service/v1/PlaidIntroResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lacats_aggregation/service/v1/PlaidIntroResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "acats_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<PlaidIntroResponseDto, PlaidIntroResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PlaidIntroResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PlaidIntroResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PlaidIntroResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) PlaidIntroResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PlaidIntroResponse> getProtoAdapter() {
            return PlaidIntroResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PlaidIntroResponseDto getZeroValue() {
            return PlaidIntroResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PlaidIntroResponseDto fromProto(PlaidIntroResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            UIComponent body_content = proto.getBody_content();
            DefaultConstructorMarker defaultConstructorMarker = null;
            UIComponentDto uIComponentDtoFromProto = body_content != null ? UIComponentDto.INSTANCE.fromProto(body_content) : null;
            UIComponent footer_content = proto.getFooter_content();
            UIComponentDto uIComponentDtoFromProto2 = footer_content != null ? UIComponentDto.INSTANCE.fromProto(footer_content) : null;
            String plaid_cta_label = proto.getPlaid_cta_label();
            String manual_cta_label = proto.getManual_cta_label();
            String plaid_cta_logging_id = proto.getPlaid_cta_logging_id();
            String manual_cta_logging_id = proto.getManual_cta_logging_id();
            PlaidIntroSelection plaid_selection = proto.getPlaid_selection();
            PlaidIntroSelectionDto plaidIntroSelectionDtoFromProto = plaid_selection != null ? PlaidIntroSelectionDto.INSTANCE.fromProto(plaid_selection) : null;
            PlaidIntroSelection manual_selection = proto.getManual_selection();
            return new PlaidIntroResponseDto(new Surrogate(uIComponentDtoFromProto, uIComponentDtoFromProto2, plaid_cta_label, manual_cta_label, plaid_cta_logging_id, manual_cta_logging_id, plaidIntroSelectionDtoFromProto, manual_selection != null ? PlaidIntroSelectionDto.INSTANCE.fromProto(manual_selection) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: acats_aggregation.service.v1.PlaidIntroResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlaidIntroResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PlaidIntroResponseDto(null, null, null, null, null, null, null, null, 255, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: PlaidIntroResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lacats_aggregation/service/v1/PlaidIntroResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lacats_aggregation/service/v1/PlaidIntroResponseDto;", "<init>", "()V", "surrogateSerializer", "Lacats_aggregation/service/v1/PlaidIntroResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "acats_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes23.dex */
    public static final class Serializer implements KSerializer<PlaidIntroResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/acats_aggregation.service.v1.PlaidIntroResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PlaidIntroResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PlaidIntroResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PlaidIntroResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PlaidIntroResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lacats_aggregation/service/v1/PlaidIntroResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "acats_aggregation.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "acats_aggregation.service.v1.PlaidIntroResponseDto";
        }
    }
}
