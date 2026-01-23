package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
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
import rh_server_driven_ui.p531v1.TimelineRow;
import rh_server_driven_ui.p531v1.TimelineRowDto;

/* compiled from: TimelineRowDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006324567B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BW\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b&\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010'R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0017R\u0011\u0010\f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b,\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b1\u0010.¨\u00068"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineRowDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/TimelineRow;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/TimelineRowDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/TimelineRowDto$Surrogate;)V", "Lrh_server_driven_ui/v1/TimelineRowDto$StateDto;", "state", "", "primary_information", "secondary_information", "detail_text", "Lrh_server_driven_ui/v1/ActionDto;", "detail_action", "Lrh_server_driven_ui/v1/TimelineRowDto$InfoIconDto;", "info_icon", "action", "(Lrh_server_driven_ui/v1/TimelineRowDto$StateDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/ActionDto;Lrh_server_driven_ui/v1/TimelineRowDto$InfoIconDto;Lrh_server_driven_ui/v1/ActionDto;)V", "toProto", "()Lrh_server_driven_ui/v1/TimelineRow;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/TimelineRowDto$Surrogate;", "getState", "()Lrh_server_driven_ui/v1/TimelineRowDto$StateDto;", "getPrimary_information", "getSecondary_information", "getDetail_text", "getDetail_action", "()Lrh_server_driven_ui/v1/ActionDto;", "getInfo_icon", "()Lrh_server_driven_ui/v1/TimelineRowDto$InfoIconDto;", "getAction", "Companion", "Surrogate", "InfoIconDto", "StateDto", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class TimelineRowDto implements Dto3<TimelineRow>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TimelineRowDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TimelineRowDto, TimelineRow>> binaryBase64Serializer$delegate;
    private static final TimelineRowDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TimelineRowDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TimelineRowDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final StateDto getState() {
        return this.surrogate.getState();
    }

    public final String getPrimary_information() {
        return this.surrogate.getPrimary_information();
    }

    public final String getSecondary_information() {
        return this.surrogate.getSecondary_information();
    }

    public final String getDetail_text() {
        return this.surrogate.getDetail_text();
    }

    public final ActionDto getDetail_action() {
        return this.surrogate.getDetail_action();
    }

    public final InfoIconDto getInfo_icon() {
        return this.surrogate.getInfo_icon();
    }

    public final ActionDto getAction() {
        return this.surrogate.getAction();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TimelineRowDto(rh_server_driven_ui.v1.TimelineRowDto.StateDto r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, rh_server_driven_ui.p531v1.ActionDto r6, rh_server_driven_ui.v1.TimelineRowDto.InfoIconDto r7, rh_server_driven_ui.p531v1.ActionDto r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto La
            rh_server_driven_ui.v1.TimelineRowDto$StateDto$Companion r2 = rh_server_driven_ui.v1.TimelineRowDto.StateDto.INSTANCE
            rh_server_driven_ui.v1.TimelineRowDto$StateDto r2 = r2.getZeroValue()
        La:
            r10 = r9 & 2
            java.lang.String r0 = ""
            if (r10 == 0) goto L11
            r3 = r0
        L11:
            r10 = r9 & 4
            if (r10 == 0) goto L16
            r4 = r0
        L16:
            r10 = r9 & 8
            r0 = 0
            if (r10 == 0) goto L1c
            r5 = r0
        L1c:
            r10 = r9 & 16
            if (r10 == 0) goto L21
            r6 = r0
        L21:
            r10 = r9 & 32
            if (r10 == 0) goto L26
            r7 = r0
        L26:
            r9 = r9 & 64
            if (r9 == 0) goto L33
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L3b
        L33:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L3b:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rh_server_driven_ui.p531v1.TimelineRowDto.<init>(rh_server_driven_ui.v1.TimelineRowDto$StateDto, java.lang.String, java.lang.String, java.lang.String, rh_server_driven_ui.v1.ActionDto, rh_server_driven_ui.v1.TimelineRowDto$InfoIconDto, rh_server_driven_ui.v1.ActionDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TimelineRowDto(StateDto state, String primary_information, String secondary_information, String str, ActionDto actionDto, InfoIconDto infoIconDto, ActionDto actionDto2) {
        this(new Surrogate(state, primary_information, secondary_information, str, actionDto, infoIconDto, actionDto2));
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(primary_information, "primary_information");
        Intrinsics.checkNotNullParameter(secondary_information, "secondary_information");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TimelineRow toProto() {
        TimelineRow.State state = (TimelineRow.State) this.surrogate.getState().toProto();
        String primary_information = this.surrogate.getPrimary_information();
        String secondary_information = this.surrogate.getSecondary_information();
        String detail_text = this.surrogate.getDetail_text();
        ActionDto detail_action = this.surrogate.getDetail_action();
        Action proto = detail_action != null ? detail_action.toProto() : null;
        InfoIconDto info_icon = this.surrogate.getInfo_icon();
        TimelineRow.InfoIcon infoIcon = info_icon != null ? (TimelineRow.InfoIcon) info_icon.toProto() : null;
        ActionDto action = this.surrogate.getAction();
        return new TimelineRow(state, primary_information, secondary_information, detail_text, proto, infoIcon, action != null ? action.toProto() : null, null, 128, null);
    }

    public String toString() {
        return "[TimelineRowDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TimelineRowDto) && Intrinsics.areEqual(((TimelineRowDto) other).surrogate, this.surrogate);
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
    /* compiled from: TimelineRowDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0083\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010*\u0012\u0004\b,\u0010)\u001a\u0004\b+\u0010\u001eR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010*\u0012\u0004\b.\u0010)\u001a\u0004\b-\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010*\u0012\u0004\b0\u0010)\u001a\u0004\b/\u0010\u001eR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\b4\u0010)\u001a\u0004\b2\u00103R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00105\u0012\u0004\b8\u0010)\u001a\u0004\b6\u00107R\"\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00101\u0012\u0004\b:\u0010)\u001a\u0004\b9\u00103¨\u0006="}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineRowDto$Surrogate;", "", "Lrh_server_driven_ui/v1/TimelineRowDto$StateDto;", "state", "", "primary_information", "secondary_information", "detail_text", "Lrh_server_driven_ui/v1/ActionDto;", "detail_action", "Lrh_server_driven_ui/v1/TimelineRowDto$InfoIconDto;", "info_icon", "action", "<init>", "(Lrh_server_driven_ui/v1/TimelineRowDto$StateDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/ActionDto;Lrh_server_driven_ui/v1/TimelineRowDto$InfoIconDto;Lrh_server_driven_ui/v1/ActionDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrh_server_driven_ui/v1/TimelineRowDto$StateDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrh_server_driven_ui/v1/ActionDto;Lrh_server_driven_ui/v1/TimelineRowDto$InfoIconDto;Lrh_server_driven_ui/v1/ActionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/TimelineRowDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lrh_server_driven_ui/v1/TimelineRowDto$StateDto;", "getState", "()Lrh_server_driven_ui/v1/TimelineRowDto$StateDto;", "getState$annotations", "()V", "Ljava/lang/String;", "getPrimary_information", "getPrimary_information$annotations", "getSecondary_information", "getSecondary_information$annotations", "getDetail_text", "getDetail_text$annotations", "Lrh_server_driven_ui/v1/ActionDto;", "getDetail_action", "()Lrh_server_driven_ui/v1/ActionDto;", "getDetail_action$annotations", "Lrh_server_driven_ui/v1/TimelineRowDto$InfoIconDto;", "getInfo_icon", "()Lrh_server_driven_ui/v1/TimelineRowDto$InfoIconDto;", "getInfo_icon$annotations", "getAction", "getAction$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ActionDto action;
        private final ActionDto detail_action;
        private final String detail_text;
        private final InfoIconDto info_icon;
        private final String primary_information;
        private final String secondary_information;
        private final StateDto state;

        public Surrogate() {
            this((StateDto) null, (String) null, (String) null, (String) null, (ActionDto) null, (InfoIconDto) null, (ActionDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.state == surrogate.state && Intrinsics.areEqual(this.primary_information, surrogate.primary_information) && Intrinsics.areEqual(this.secondary_information, surrogate.secondary_information) && Intrinsics.areEqual(this.detail_text, surrogate.detail_text) && Intrinsics.areEqual(this.detail_action, surrogate.detail_action) && this.info_icon == surrogate.info_icon && Intrinsics.areEqual(this.action, surrogate.action);
        }

        public int hashCode() {
            int iHashCode = ((((this.state.hashCode() * 31) + this.primary_information.hashCode()) * 31) + this.secondary_information.hashCode()) * 31;
            String str = this.detail_text;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            ActionDto actionDto = this.detail_action;
            int iHashCode3 = (iHashCode2 + (actionDto == null ? 0 : actionDto.hashCode())) * 31;
            InfoIconDto infoIconDto = this.info_icon;
            int iHashCode4 = (iHashCode3 + (infoIconDto == null ? 0 : infoIconDto.hashCode())) * 31;
            ActionDto actionDto2 = this.action;
            return iHashCode4 + (actionDto2 != null ? actionDto2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(state=" + this.state + ", primary_information=" + this.primary_information + ", secondary_information=" + this.secondary_information + ", detail_text=" + this.detail_text + ", detail_action=" + this.detail_action + ", info_icon=" + this.info_icon + ", action=" + this.action + ")";
        }

        /* compiled from: TimelineRowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineRowDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TimelineRowDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TimelineRowDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, StateDto stateDto, String str, String str2, String str3, ActionDto actionDto, InfoIconDto infoIconDto, ActionDto actionDto2, SerializationConstructorMarker serializationConstructorMarker) {
            this.state = (i & 1) == 0 ? StateDto.INSTANCE.getZeroValue() : stateDto;
            if ((i & 2) == 0) {
                this.primary_information = "";
            } else {
                this.primary_information = str;
            }
            if ((i & 4) == 0) {
                this.secondary_information = "";
            } else {
                this.secondary_information = str2;
            }
            if ((i & 8) == 0) {
                this.detail_text = null;
            } else {
                this.detail_text = str3;
            }
            if ((i & 16) == 0) {
                this.detail_action = null;
            } else {
                this.detail_action = actionDto;
            }
            if ((i & 32) == 0) {
                this.info_icon = null;
            } else {
                this.info_icon = infoIconDto;
            }
            if ((i & 64) == 0) {
                this.action = null;
            } else {
                this.action = actionDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.state != StateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, StateDto.Serializer.INSTANCE, self.state);
            }
            if (!Intrinsics.areEqual(self.primary_information, "")) {
                output.encodeStringElement(serialDesc, 1, self.primary_information);
            }
            if (!Intrinsics.areEqual(self.secondary_information, "")) {
                output.encodeStringElement(serialDesc, 2, self.secondary_information);
            }
            String str = self.detail_text;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, str);
            }
            ActionDto actionDto = self.detail_action;
            if (actionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ActionDto.Serializer.INSTANCE, actionDto);
            }
            InfoIconDto infoIconDto = self.info_icon;
            if (infoIconDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, InfoIconDto.Serializer.INSTANCE, infoIconDto);
            }
            ActionDto actionDto2 = self.action;
            if (actionDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, ActionDto.Serializer.INSTANCE, actionDto2);
            }
        }

        public Surrogate(StateDto state, String primary_information, String secondary_information, String str, ActionDto actionDto, InfoIconDto infoIconDto, ActionDto actionDto2) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(primary_information, "primary_information");
            Intrinsics.checkNotNullParameter(secondary_information, "secondary_information");
            this.state = state;
            this.primary_information = primary_information;
            this.secondary_information = secondary_information;
            this.detail_text = str;
            this.detail_action = actionDto;
            this.info_icon = infoIconDto;
            this.action = actionDto2;
        }

        public final StateDto getState() {
            return this.state;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(rh_server_driven_ui.v1.TimelineRowDto.StateDto r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, rh_server_driven_ui.p531v1.ActionDto r6, rh_server_driven_ui.v1.TimelineRowDto.InfoIconDto r7, rh_server_driven_ui.p531v1.ActionDto r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto La
                rh_server_driven_ui.v1.TimelineRowDto$StateDto$Companion r2 = rh_server_driven_ui.v1.TimelineRowDto.StateDto.INSTANCE
                rh_server_driven_ui.v1.TimelineRowDto$StateDto r2 = r2.getZeroValue()
            La:
                r10 = r9 & 2
                java.lang.String r0 = ""
                if (r10 == 0) goto L11
                r3 = r0
            L11:
                r10 = r9 & 4
                if (r10 == 0) goto L16
                r4 = r0
            L16:
                r10 = r9 & 8
                r0 = 0
                if (r10 == 0) goto L1c
                r5 = r0
            L1c:
                r10 = r9 & 16
                if (r10 == 0) goto L21
                r6 = r0
            L21:
                r10 = r9 & 32
                if (r10 == 0) goto L26
                r7 = r0
            L26:
                r9 = r9 & 64
                if (r9 == 0) goto L33
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L3b
            L33:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L3b:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rh_server_driven_ui.p531v1.TimelineRowDto.Surrogate.<init>(rh_server_driven_ui.v1.TimelineRowDto$StateDto, java.lang.String, java.lang.String, java.lang.String, rh_server_driven_ui.v1.ActionDto, rh_server_driven_ui.v1.TimelineRowDto$InfoIconDto, rh_server_driven_ui.v1.ActionDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getPrimary_information() {
            return this.primary_information;
        }

        public final String getSecondary_information() {
            return this.secondary_information;
        }

        public final String getDetail_text() {
            return this.detail_text;
        }

        public final ActionDto getDetail_action() {
            return this.detail_action;
        }

        public final InfoIconDto getInfo_icon() {
            return this.info_icon;
        }

        public final ActionDto getAction() {
            return this.action;
        }
    }

    /* compiled from: TimelineRowDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineRowDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/TimelineRowDto;", "Lrh_server_driven_ui/v1/TimelineRow;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TimelineRowDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TimelineRowDto, TimelineRow> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TimelineRowDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TimelineRowDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TimelineRowDto> getBinaryBase64Serializer() {
            return (KSerializer) TimelineRowDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TimelineRow> getProtoAdapter() {
            return TimelineRow.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TimelineRowDto getZeroValue() {
            return TimelineRowDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TimelineRowDto fromProto(TimelineRow proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            StateDto stateDtoFromProto = StateDto.INSTANCE.fromProto(proto.getState());
            String primary_information = proto.getPrimary_information();
            String secondary_information = proto.getSecondary_information();
            String detail_text = proto.getDetail_text();
            Action detail_action = proto.getDetail_action();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ActionDto actionDtoFromProto = detail_action != null ? ActionDto.INSTANCE.fromProto(detail_action) : null;
            TimelineRow.InfoIcon info_icon = proto.getInfo_icon();
            InfoIconDto infoIconDtoFromProto = info_icon != null ? InfoIconDto.INSTANCE.fromProto(info_icon) : null;
            Action action = proto.getAction();
            return new TimelineRowDto(new Surrogate(stateDtoFromProto, primary_information, secondary_information, detail_text, actionDtoFromProto, infoIconDtoFromProto, action != null ? ActionDto.INSTANCE.fromProto(action) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TimelineRowDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TimelineRowDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TimelineRowDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TimelineRowDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineRowDto$InfoIconDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/TimelineRow$InfoIcon;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "INFO_ICON_UNSPECIFIED", "INFO_ICON_TITLE", "INFO_ICON_METADATA", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class InfoIconDto implements Dto2<TimelineRow.InfoIcon>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InfoIconDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<InfoIconDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<InfoIconDto, TimelineRow.InfoIcon>> binaryBase64Serializer$delegate;
        public static final InfoIconDto INFO_ICON_UNSPECIFIED = new INFO_ICON_UNSPECIFIED("INFO_ICON_UNSPECIFIED", 0);
        public static final InfoIconDto INFO_ICON_TITLE = new INFO_ICON_TITLE("INFO_ICON_TITLE", 1);
        public static final InfoIconDto INFO_ICON_METADATA = new INFO_ICON_METADATA("INFO_ICON_METADATA", 2);

        private static final /* synthetic */ InfoIconDto[] $values() {
            return new InfoIconDto[]{INFO_ICON_UNSPECIFIED, INFO_ICON_TITLE, INFO_ICON_METADATA};
        }

        public /* synthetic */ InfoIconDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<InfoIconDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: TimelineRowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TimelineRowDto.InfoIconDto.INFO_ICON_UNSPECIFIED", "Lrh_server_driven_ui/v1/TimelineRowDto$InfoIconDto;", "toProto", "Lrh_server_driven_ui/v1/TimelineRow$InfoIcon;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        static final class INFO_ICON_UNSPECIFIED extends InfoIconDto {
            INFO_ICON_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TimelineRow.InfoIcon toProto() {
                return TimelineRow.InfoIcon.INFO_ICON_UNSPECIFIED;
            }
        }

        private InfoIconDto(String str, int i) {
        }

        static {
            InfoIconDto[] infoIconDtoArr$values = $values();
            $VALUES = infoIconDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(infoIconDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TimelineRowDto$InfoIconDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TimelineRowDto.InfoIconDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TimelineRowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TimelineRowDto.InfoIconDto.INFO_ICON_TITLE", "Lrh_server_driven_ui/v1/TimelineRowDto$InfoIconDto;", "toProto", "Lrh_server_driven_ui/v1/TimelineRow$InfoIcon;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        static final class INFO_ICON_TITLE extends InfoIconDto {
            INFO_ICON_TITLE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TimelineRow.InfoIcon toProto() {
                return TimelineRow.InfoIcon.INFO_ICON_TITLE;
            }
        }

        /* compiled from: TimelineRowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TimelineRowDto.InfoIconDto.INFO_ICON_METADATA", "Lrh_server_driven_ui/v1/TimelineRowDto$InfoIconDto;", "toProto", "Lrh_server_driven_ui/v1/TimelineRow$InfoIcon;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        static final class INFO_ICON_METADATA extends InfoIconDto {
            INFO_ICON_METADATA(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TimelineRow.InfoIcon toProto() {
                return TimelineRow.InfoIcon.INFO_ICON_METADATA;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TimelineRowDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineRowDto$InfoIconDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/TimelineRowDto$InfoIconDto;", "Lrh_server_driven_ui/v1/TimelineRow$InfoIcon;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TimelineRowDto$InfoIconDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Companion implements Dto2.Creator<InfoIconDto, TimelineRow.InfoIcon> {

            /* compiled from: TimelineRowDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TimelineRow.InfoIcon.values().length];
                    try {
                        iArr[TimelineRow.InfoIcon.INFO_ICON_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TimelineRow.InfoIcon.INFO_ICON_TITLE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TimelineRow.InfoIcon.INFO_ICON_METADATA.ordinal()] = 3;
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

            public final KSerializer<InfoIconDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<InfoIconDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<InfoIconDto> getBinaryBase64Serializer() {
                return (KSerializer) InfoIconDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<TimelineRow.InfoIcon> getProtoAdapter() {
                return TimelineRow.InfoIcon.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public InfoIconDto getZeroValue() {
                return InfoIconDto.INFO_ICON_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public InfoIconDto fromProto(TimelineRow.InfoIcon proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return InfoIconDto.INFO_ICON_UNSPECIFIED;
                }
                if (i == 2) {
                    return InfoIconDto.INFO_ICON_TITLE;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return InfoIconDto.INFO_ICON_METADATA;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TimelineRowDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineRowDto$InfoIconDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TimelineRowDto$InfoIconDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<InfoIconDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<InfoIconDto, TimelineRow.InfoIcon> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.TimelineRow.InfoIcon", InfoIconDto.getEntries(), InfoIconDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public InfoIconDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (InfoIconDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, InfoIconDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static InfoIconDto valueOf(String str) {
            return (InfoIconDto) Enum.valueOf(InfoIconDto.class, str);
        }

        public static InfoIconDto[] values() {
            return (InfoIconDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TimelineRowDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineRowDto$StateDto;", "Lcom/robinhood/idl/EnumDto;", "Lrh_server_driven_ui/v1/TimelineRow$State;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "STATE_UNSPECIFIED", "STATE_INCOMPLETE", "STATE_COMPLETE", "STATE_ERROR", "STATE_WARNING", "STATE_ONGOING", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class StateDto implements Dto2<TimelineRow.State>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ StateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<StateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<StateDto, TimelineRow.State>> binaryBase64Serializer$delegate;
        public static final StateDto STATE_UNSPECIFIED = new STATE_UNSPECIFIED("STATE_UNSPECIFIED", 0);
        public static final StateDto STATE_INCOMPLETE = new STATE_INCOMPLETE("STATE_INCOMPLETE", 1);
        public static final StateDto STATE_COMPLETE = new STATE_COMPLETE("STATE_COMPLETE", 2);
        public static final StateDto STATE_ERROR = new STATE_ERROR("STATE_ERROR", 3);
        public static final StateDto STATE_WARNING = new STATE_WARNING("STATE_WARNING", 4);
        public static final StateDto STATE_ONGOING = new STATE_ONGOING("STATE_ONGOING", 5);

        private static final /* synthetic */ StateDto[] $values() {
            return new StateDto[]{STATE_UNSPECIFIED, STATE_INCOMPLETE, STATE_COMPLETE, STATE_ERROR, STATE_WARNING, STATE_ONGOING};
        }

        public /* synthetic */ StateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<StateDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: TimelineRowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TimelineRowDto.StateDto.STATE_UNSPECIFIED", "Lrh_server_driven_ui/v1/TimelineRowDto$StateDto;", "toProto", "Lrh_server_driven_ui/v1/TimelineRow$State;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATE_UNSPECIFIED extends StateDto {
            STATE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TimelineRow.State toProto() {
                return TimelineRow.State.STATE_UNSPECIFIED;
            }
        }

        private StateDto(String str, int i) {
        }

        static {
            StateDto[] stateDtoArr$values = $values();
            $VALUES = stateDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TimelineRowDto$StateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return TimelineRowDto.StateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: TimelineRowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TimelineRowDto.StateDto.STATE_INCOMPLETE", "Lrh_server_driven_ui/v1/TimelineRowDto$StateDto;", "toProto", "Lrh_server_driven_ui/v1/TimelineRow$State;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATE_INCOMPLETE extends StateDto {
            STATE_INCOMPLETE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TimelineRow.State toProto() {
                return TimelineRow.State.STATE_INCOMPLETE;
            }
        }

        /* compiled from: TimelineRowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TimelineRowDto.StateDto.STATE_COMPLETE", "Lrh_server_driven_ui/v1/TimelineRowDto$StateDto;", "toProto", "Lrh_server_driven_ui/v1/TimelineRow$State;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATE_COMPLETE extends StateDto {
            STATE_COMPLETE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TimelineRow.State toProto() {
                return TimelineRow.State.STATE_COMPLETE;
            }
        }

        /* compiled from: TimelineRowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TimelineRowDto.StateDto.STATE_ERROR", "Lrh_server_driven_ui/v1/TimelineRowDto$StateDto;", "toProto", "Lrh_server_driven_ui/v1/TimelineRow$State;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATE_ERROR extends StateDto {
            STATE_ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TimelineRow.State toProto() {
                return TimelineRow.State.STATE_ERROR;
            }
        }

        /* compiled from: TimelineRowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TimelineRowDto.StateDto.STATE_WARNING", "Lrh_server_driven_ui/v1/TimelineRowDto$StateDto;", "toProto", "Lrh_server_driven_ui/v1/TimelineRow$State;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATE_WARNING extends StateDto {
            STATE_WARNING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TimelineRow.State toProto() {
                return TimelineRow.State.STATE_WARNING;
            }
        }

        /* compiled from: TimelineRowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"rh_server_driven_ui/v1/TimelineRowDto.StateDto.STATE_ONGOING", "Lrh_server_driven_ui/v1/TimelineRowDto$StateDto;", "toProto", "Lrh_server_driven_ui/v1/TimelineRow$State;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STATE_ONGOING extends StateDto {
            STATE_ONGOING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public TimelineRow.State toProto() {
                return TimelineRow.State.STATE_ONGOING;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: TimelineRowDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineRowDto$StateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrh_server_driven_ui/v1/TimelineRowDto$StateDto;", "Lrh_server_driven_ui/v1/TimelineRow$State;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TimelineRowDto$StateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<StateDto, TimelineRow.State> {

            /* compiled from: TimelineRowDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes25.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[TimelineRow.State.values().length];
                    try {
                        iArr[TimelineRow.State.STATE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[TimelineRow.State.STATE_INCOMPLETE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[TimelineRow.State.STATE_COMPLETE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[TimelineRow.State.STATE_ERROR.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[TimelineRow.State.STATE_WARNING.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[TimelineRow.State.STATE_ONGOING.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

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
            public ProtoAdapter<TimelineRow.State> getProtoAdapter() {
                return TimelineRow.State.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StateDto getZeroValue() {
                return StateDto.STATE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public StateDto fromProto(TimelineRow.State proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return StateDto.STATE_UNSPECIFIED;
                    case 2:
                        return StateDto.STATE_INCOMPLETE;
                    case 3:
                        return StateDto.STATE_COMPLETE;
                    case 4:
                        return StateDto.STATE_ERROR;
                    case 5:
                        return StateDto.STATE_WARNING;
                    case 6:
                        return StateDto.STATE_ONGOING;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: TimelineRowDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineRowDto$StateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TimelineRowDto$StateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public static final class Serializer implements KSerializer<StateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<StateDto, TimelineRow.State> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rh_server_driven_ui.v1.TimelineRow.State", StateDto.getEntries(), StateDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public StateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (StateDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, StateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static StateDto valueOf(String str) {
            return (StateDto) Enum.valueOf(StateDto.class, str);
        }

        public static StateDto[] values() {
            return (StateDto[]) $VALUES.clone();
        }
    }

    /* compiled from: TimelineRowDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineRowDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TimelineRowDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/TimelineRowDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TimelineRowDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.TimelineRow", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TimelineRowDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TimelineRowDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TimelineRowDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TimelineRowDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/TimelineRowDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.TimelineRowDto";
        }
    }
}
