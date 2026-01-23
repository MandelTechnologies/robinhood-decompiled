package rh_server_driven_ui.p531v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.SignedIntAsNumberSerializer;
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
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.IconDto;
import rh_server_driven_ui.p531v1.TableColumnAlignmentDto;

/* compiled from: TableColumnHeaderDto.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 32\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00044356B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Bo\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0006\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020%2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u0014H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0014H\u0016¢\u0006\u0004\b(\u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010)R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00067"}, m3636d2 = {"Lrh_server_driven_ui/v1/TableColumnHeaderDto;", "Lcom/robinhood/idl/MessageDto;", "Lrh_server_driven_ui/v1/TableColumnHeader;", "Landroid/os/Parcelable;", "Lrh_server_driven_ui/v1/TableColumnHeaderDto$Surrogate;", "surrogate", "<init>", "(Lrh_server_driven_ui/v1/TableColumnHeaderDto$Surrogate;)V", "", "title", "Lrh_server_driven_ui/v1/IconDto;", "icon", "secondary_icon", "", "active", "Lrh_server_driven_ui/v1/ActionDto;", "action", "secondary_icon_action", "Lrh_server_driven_ui/v1/TableColumnAlignmentDto;", "alignment", "", "left_padding", "right_padding", "(Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/IconDto;ZLrh_server_driven_ui/v1/ActionDto;Lrh_server_driven_ui/v1/ActionDto;Lrh_server_driven_ui/v1/TableColumnAlignmentDto;Ljava/lang/Integer;Ljava/lang/Integer;)V", "toProto", "()Lrh_server_driven_ui/v1/TableColumnHeader;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lrh_server_driven_ui/v1/TableColumnHeaderDto$Surrogate;", "getTitle", "getIcon", "()Lrh_server_driven_ui/v1/IconDto;", "getActive", "()Z", "getAction", "()Lrh_server_driven_ui/v1/ActionDto;", "getLeft_padding", "()Ljava/lang/Integer;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes25.dex */
public final class TableColumnHeaderDto implements Dto3<TableColumnHeader>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TableColumnHeaderDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TableColumnHeaderDto, TableColumnHeader>> binaryBase64Serializer$delegate;
    private static final TableColumnHeaderDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TableColumnHeaderDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TableColumnHeaderDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final IconDto getIcon() {
        return this.surrogate.getIcon();
    }

    public final boolean getActive() {
        return this.surrogate.getActive();
    }

    public final ActionDto getAction() {
        return this.surrogate.getAction();
    }

    public final Integer getLeft_padding() {
        return this.surrogate.getLeft_padding();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TableColumnHeaderDto(java.lang.String r2, rh_server_driven_ui.p531v1.IconDto r3, rh_server_driven_ui.p531v1.IconDto r4, boolean r5, rh_server_driven_ui.p531v1.ActionDto r6, rh_server_driven_ui.p531v1.ActionDto r7, rh_server_driven_ui.p531v1.TableColumnAlignmentDto r8, java.lang.Integer r9, java.lang.Integer r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
        /*
            r1 = this;
            r12 = r11 & 1
            if (r12 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r12 = r11 & 2
            r0 = 0
            if (r12 == 0) goto Lc
            r3 = r0
        Lc:
            r12 = r11 & 4
            if (r12 == 0) goto L11
            r4 = r0
        L11:
            r12 = r11 & 8
            if (r12 == 0) goto L16
            r5 = 0
        L16:
            r12 = r11 & 16
            if (r12 == 0) goto L1b
            r6 = r0
        L1b:
            r12 = r11 & 32
            if (r12 == 0) goto L20
            r7 = r0
        L20:
            r12 = r11 & 64
            if (r12 == 0) goto L2a
            rh_server_driven_ui.v1.TableColumnAlignmentDto$Companion r8 = rh_server_driven_ui.p531v1.TableColumnAlignmentDto.INSTANCE
            rh_server_driven_ui.v1.TableColumnAlignmentDto r8 = r8.getZeroValue()
        L2a:
            r12 = r11 & 128(0x80, float:1.794E-43)
            if (r12 == 0) goto L2f
            r9 = r0
        L2f:
            r11 = r11 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L3e
            r12 = r0
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L48
        L3e:
            r12 = r10
            r11 = r9
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L48:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rh_server_driven_ui.p531v1.TableColumnHeaderDto.<init>(java.lang.String, rh_server_driven_ui.v1.IconDto, rh_server_driven_ui.v1.IconDto, boolean, rh_server_driven_ui.v1.ActionDto, rh_server_driven_ui.v1.ActionDto, rh_server_driven_ui.v1.TableColumnAlignmentDto, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TableColumnHeaderDto(String title, IconDto iconDto, IconDto iconDto2, boolean z, ActionDto actionDto, ActionDto actionDto2, TableColumnAlignmentDto alignment, Integer num, Integer num2) {
        this(new Surrogate(title, iconDto, iconDto2, z, actionDto, actionDto2, alignment, num, num2));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TableColumnHeader toProto() {
        String title = this.surrogate.getTitle();
        IconDto icon = this.surrogate.getIcon();
        Icon icon2 = icon != null ? (Icon) icon.toProto() : null;
        IconDto secondary_icon = this.surrogate.getSecondary_icon();
        Icon icon3 = secondary_icon != null ? (Icon) secondary_icon.toProto() : null;
        boolean active = this.surrogate.getActive();
        ActionDto action = this.surrogate.getAction();
        Action proto = action != null ? action.toProto() : null;
        ActionDto secondary_icon_action = this.surrogate.getSecondary_icon_action();
        return new TableColumnHeader(title, icon2, icon3, active, proto, secondary_icon_action != null ? secondary_icon_action.toProto() : null, (TableColumnAlignment) this.surrogate.getAlignment().toProto(), this.surrogate.getLeft_padding(), this.surrogate.getRight_padding(), null, 512, null);
    }

    public String toString() {
        return "[TableColumnHeaderDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TableColumnHeaderDto) && Intrinsics.areEqual(((TableColumnHeaderDto) other).surrogate, this.surrogate);
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
    /* compiled from: TableColumnHeaderDto.kt */
    @Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b+\b\u0083\b\u0018\u0000 H2\u00020\u0001:\u0002IHB\u008b\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0019\b\u0002\u0010\u0012\u001a\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0011\u0012\u0019\b\u0002\u0010\u0013\u001a\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u0011¢\u0006\u0004\b\u0014\u0010\u0015Bs\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J'\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010(\u001a\u00020\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010*\u0012\u0004\b,\u0010-\u001a\u0004\b+\u0010$R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010.\u0012\u0004\b1\u0010-\u001a\u0004\b/\u00100R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010.\u0012\u0004\b3\u0010-\u001a\u0004\b2\u00100R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00104\u0012\u0004\b7\u0010-\u001a\u0004\b5\u00106R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00108\u0012\u0004\b;\u0010-\u001a\u0004\b9\u0010:R\"\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00108\u0012\u0004\b=\u0010-\u001a\u0004\b<\u0010:R \u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010>\u0012\u0004\bA\u0010-\u001a\u0004\b?\u0010@R1\u0010\u0012\u001a\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010B\u0012\u0004\bE\u0010-\u001a\u0004\bC\u0010DR1\u0010\u0013\u001a\u0013\u0018\u00010\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\t0\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010B\u0012\u0004\bG\u0010-\u001a\u0004\bF\u0010D¨\u0006J"}, m3636d2 = {"Lrh_server_driven_ui/v1/TableColumnHeaderDto$Surrogate;", "", "", "title", "Lrh_server_driven_ui/v1/IconDto;", "icon", "secondary_icon", "", "active", "Lrh_server_driven_ui/v1/ActionDto;", "action", "secondary_icon_action", "Lrh_server_driven_ui/v1/TableColumnAlignmentDto;", "alignment", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "left_padding", "right_padding", "<init>", "(Ljava/lang/String;Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/IconDto;ZLrh_server_driven_ui/v1/ActionDto;Lrh_server_driven_ui/v1/ActionDto;Lrh_server_driven_ui/v1/TableColumnAlignmentDto;Ljava/lang/Integer;Ljava/lang/Integer;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lrh_server_driven_ui/v1/IconDto;Lrh_server_driven_ui/v1/IconDto;ZLrh_server_driven_ui/v1/ActionDto;Lrh_server_driven_ui/v1/ActionDto;Lrh_server_driven_ui/v1/TableColumnAlignmentDto;Ljava/lang/Integer;Ljava/lang/Integer;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$sdui_v1_externalRelease", "(Lrh_server_driven_ui/v1/TableColumnHeaderDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Lrh_server_driven_ui/v1/IconDto;", "getIcon", "()Lrh_server_driven_ui/v1/IconDto;", "getIcon$annotations", "getSecondary_icon", "getSecondary_icon$annotations", "Z", "getActive", "()Z", "getActive$annotations", "Lrh_server_driven_ui/v1/ActionDto;", "getAction", "()Lrh_server_driven_ui/v1/ActionDto;", "getAction$annotations", "getSecondary_icon_action", "getSecondary_icon_action$annotations", "Lrh_server_driven_ui/v1/TableColumnAlignmentDto;", "getAlignment", "()Lrh_server_driven_ui/v1/TableColumnAlignmentDto;", "getAlignment$annotations", "Ljava/lang/Integer;", "getLeft_padding", "()Ljava/lang/Integer;", "getLeft_padding$annotations", "getRight_padding", "getRight_padding$annotations", "Companion", "$serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ActionDto action;
        private final boolean active;
        private final TableColumnAlignmentDto alignment;
        private final IconDto icon;
        private final Integer left_padding;
        private final Integer right_padding;
        private final IconDto secondary_icon;
        private final ActionDto secondary_icon_action;
        private final String title;

        public Surrogate() {
            this((String) null, (IconDto) null, (IconDto) null, false, (ActionDto) null, (ActionDto) null, (TableColumnAlignmentDto) null, (Integer) null, (Integer) null, 511, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && this.icon == surrogate.icon && this.secondary_icon == surrogate.secondary_icon && this.active == surrogate.active && Intrinsics.areEqual(this.action, surrogate.action) && Intrinsics.areEqual(this.secondary_icon_action, surrogate.secondary_icon_action) && this.alignment == surrogate.alignment && Intrinsics.areEqual(this.left_padding, surrogate.left_padding) && Intrinsics.areEqual(this.right_padding, surrogate.right_padding);
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            IconDto iconDto = this.icon;
            int iHashCode2 = (iHashCode + (iconDto == null ? 0 : iconDto.hashCode())) * 31;
            IconDto iconDto2 = this.secondary_icon;
            int iHashCode3 = (((iHashCode2 + (iconDto2 == null ? 0 : iconDto2.hashCode())) * 31) + Boolean.hashCode(this.active)) * 31;
            ActionDto actionDto = this.action;
            int iHashCode4 = (iHashCode3 + (actionDto == null ? 0 : actionDto.hashCode())) * 31;
            ActionDto actionDto2 = this.secondary_icon_action;
            int iHashCode5 = (((iHashCode4 + (actionDto2 == null ? 0 : actionDto2.hashCode())) * 31) + this.alignment.hashCode()) * 31;
            Integer num = this.left_padding;
            int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
            Integer num2 = this.right_padding;
            return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", icon=" + this.icon + ", secondary_icon=" + this.secondary_icon + ", active=" + this.active + ", action=" + this.action + ", secondary_icon_action=" + this.secondary_icon_action + ", alignment=" + this.alignment + ", left_padding=" + this.left_padding + ", right_padding=" + this.right_padding + ")";
        }

        /* compiled from: TableColumnHeaderDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lrh_server_driven_ui/v1/TableColumnHeaderDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TableColumnHeaderDto$Surrogate;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TableColumnHeaderDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, IconDto iconDto, IconDto iconDto2, boolean z, ActionDto actionDto, ActionDto actionDto2, TableColumnAlignmentDto tableColumnAlignmentDto, Integer num, Integer num2, SerializationConstructorMarker serializationConstructorMarker) {
            this.title = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.icon = null;
            } else {
                this.icon = iconDto;
            }
            if ((i & 4) == 0) {
                this.secondary_icon = null;
            } else {
                this.secondary_icon = iconDto2;
            }
            if ((i & 8) == 0) {
                this.active = false;
            } else {
                this.active = z;
            }
            if ((i & 16) == 0) {
                this.action = null;
            } else {
                this.action = actionDto;
            }
            if ((i & 32) == 0) {
                this.secondary_icon_action = null;
            } else {
                this.secondary_icon_action = actionDto2;
            }
            if ((i & 64) == 0) {
                this.alignment = TableColumnAlignmentDto.INSTANCE.getZeroValue();
            } else {
                this.alignment = tableColumnAlignmentDto;
            }
            if ((i & 128) == 0) {
                this.left_padding = null;
            } else {
                this.left_padding = num;
            }
            if ((i & 256) == 0) {
                this.right_padding = null;
            } else {
                this.right_padding = num2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$sdui_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            IconDto iconDto = self.icon;
            if (iconDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, IconDto.Serializer.INSTANCE, iconDto);
            }
            IconDto iconDto2 = self.secondary_icon;
            if (iconDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, IconDto.Serializer.INSTANCE, iconDto2);
            }
            boolean z = self.active;
            if (z) {
                output.encodeBooleanElement(serialDesc, 3, z);
            }
            ActionDto actionDto = self.action;
            if (actionDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ActionDto.Serializer.INSTANCE, actionDto);
            }
            ActionDto actionDto2 = self.secondary_icon_action;
            if (actionDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, ActionDto.Serializer.INSTANCE, actionDto2);
            }
            if (self.alignment != TableColumnAlignmentDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 6, TableColumnAlignmentDto.Serializer.INSTANCE, self.alignment);
            }
            Integer num = self.left_padding;
            if (num != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, SignedIntAsNumberSerializer.INSTANCE, num);
            }
            Integer num2 = self.right_padding;
            if (num2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, SignedIntAsNumberSerializer.INSTANCE, num2);
            }
        }

        public Surrogate(String title, IconDto iconDto, IconDto iconDto2, boolean z, ActionDto actionDto, ActionDto actionDto2, TableColumnAlignmentDto alignment, Integer num, Integer num2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(alignment, "alignment");
            this.title = title;
            this.icon = iconDto;
            this.secondary_icon = iconDto2;
            this.active = z;
            this.action = actionDto;
            this.secondary_icon_action = actionDto2;
            this.alignment = alignment;
            this.left_padding = num;
            this.right_padding = num2;
        }

        public final String getTitle() {
            return this.title;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, rh_server_driven_ui.p531v1.IconDto r3, rh_server_driven_ui.p531v1.IconDto r4, boolean r5, rh_server_driven_ui.p531v1.ActionDto r6, rh_server_driven_ui.p531v1.ActionDto r7, rh_server_driven_ui.p531v1.TableColumnAlignmentDto r8, java.lang.Integer r9, java.lang.Integer r10, int r11, kotlin.jvm.internal.DefaultConstructorMarker r12) {
            /*
                r1 = this;
                r12 = r11 & 1
                if (r12 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r12 = r11 & 2
                r0 = 0
                if (r12 == 0) goto Lc
                r3 = r0
            Lc:
                r12 = r11 & 4
                if (r12 == 0) goto L11
                r4 = r0
            L11:
                r12 = r11 & 8
                if (r12 == 0) goto L16
                r5 = 0
            L16:
                r12 = r11 & 16
                if (r12 == 0) goto L1b
                r6 = r0
            L1b:
                r12 = r11 & 32
                if (r12 == 0) goto L20
                r7 = r0
            L20:
                r12 = r11 & 64
                if (r12 == 0) goto L2a
                rh_server_driven_ui.v1.TableColumnAlignmentDto$Companion r8 = rh_server_driven_ui.p531v1.TableColumnAlignmentDto.INSTANCE
                rh_server_driven_ui.v1.TableColumnAlignmentDto r8 = r8.getZeroValue()
            L2a:
                r12 = r11 & 128(0x80, float:1.794E-43)
                if (r12 == 0) goto L2f
                r9 = r0
            L2f:
                r11 = r11 & 256(0x100, float:3.59E-43)
                if (r11 == 0) goto L3e
                r12 = r0
                r10 = r8
                r11 = r9
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L48
            L3e:
                r12 = r10
                r11 = r9
                r9 = r7
                r10 = r8
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L48:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rh_server_driven_ui.p531v1.TableColumnHeaderDto.Surrogate.<init>(java.lang.String, rh_server_driven_ui.v1.IconDto, rh_server_driven_ui.v1.IconDto, boolean, rh_server_driven_ui.v1.ActionDto, rh_server_driven_ui.v1.ActionDto, rh_server_driven_ui.v1.TableColumnAlignmentDto, java.lang.Integer, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final IconDto getIcon() {
            return this.icon;
        }

        public final IconDto getSecondary_icon() {
            return this.secondary_icon;
        }

        public final boolean getActive() {
            return this.active;
        }

        public final ActionDto getAction() {
            return this.action;
        }

        public final ActionDto getSecondary_icon_action() {
            return this.secondary_icon_action;
        }

        public final TableColumnAlignmentDto getAlignment() {
            return this.alignment;
        }

        public final Integer getLeft_padding() {
            return this.left_padding;
        }

        public final Integer getRight_padding() {
            return this.right_padding;
        }
    }

    /* compiled from: TableColumnHeaderDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/TableColumnHeaderDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lrh_server_driven_ui/v1/TableColumnHeaderDto;", "Lrh_server_driven_ui/v1/TableColumnHeader;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrh_server_driven_ui/v1/TableColumnHeaderDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TableColumnHeaderDto, TableColumnHeader> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TableColumnHeaderDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TableColumnHeaderDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TableColumnHeaderDto> getBinaryBase64Serializer() {
            return (KSerializer) TableColumnHeaderDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TableColumnHeader> getProtoAdapter() {
            return TableColumnHeader.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TableColumnHeaderDto getZeroValue() {
            return TableColumnHeaderDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TableColumnHeaderDto fromProto(TableColumnHeader proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            Icon icon = proto.getIcon();
            DefaultConstructorMarker defaultConstructorMarker = null;
            IconDto iconDtoFromProto = icon != null ? IconDto.INSTANCE.fromProto(icon) : null;
            Icon secondary_icon = proto.getSecondary_icon();
            IconDto iconDtoFromProto2 = secondary_icon != null ? IconDto.INSTANCE.fromProto(secondary_icon) : null;
            boolean active = proto.getActive();
            Action action = proto.getAction();
            ActionDto actionDtoFromProto = action != null ? ActionDto.INSTANCE.fromProto(action) : null;
            Action secondary_icon_action = proto.getSecondary_icon_action();
            return new TableColumnHeaderDto(new Surrogate(title, iconDtoFromProto, iconDtoFromProto2, active, actionDtoFromProto, secondary_icon_action != null ? ActionDto.INSTANCE.fromProto(secondary_icon_action) : null, TableColumnAlignmentDto.INSTANCE.fromProto(proto.getAlignment()), proto.getLeft_padding(), proto.getRight_padding()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rh_server_driven_ui.v1.TableColumnHeaderDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TableColumnHeaderDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TableColumnHeaderDto(null, null, null, false, null, null, null, null, null, 511, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TableColumnHeaderDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lrh_server_driven_ui/v1/TableColumnHeaderDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrh_server_driven_ui/v1/TableColumnHeaderDto;", "<init>", "()V", "surrogateSerializer", "Lrh_server_driven_ui/v1/TableColumnHeaderDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TableColumnHeaderDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rh_server_driven_ui.v1.TableColumnHeader", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TableColumnHeaderDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TableColumnHeaderDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TableColumnHeaderDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TableColumnHeaderDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lrh_server_driven_ui/v1/TableColumnHeaderDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "rh_server_driven_ui.v1.TableColumnHeaderDto";
        }
    }
}
