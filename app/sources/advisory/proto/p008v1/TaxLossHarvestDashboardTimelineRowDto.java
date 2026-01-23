package advisory.proto.p008v1;

import advisory.proto.p008v1.BottomSheetDto;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TaxLossHarvestDashboardTimelineRowDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004+*,-B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B?\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010&R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010&R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineRowDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineRow;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineRowDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineRowDto$Surrogate;)V", "", "title", "subtitle", "", "is_completed", "should_show_info_icon", "Ladvisory/proto/v1/BottomSheetDto;", "info_bottom_sheet", "(Ljava/lang/String;Ljava/lang/String;ZZLadvisory/proto/v1/BottomSheetDto;)V", "toProto", "()Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineRow;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineRowDto$Surrogate;", "getTitle", "getSubtitle", "()Z", "getShould_show_info_icon", "getInfo_bottom_sheet", "()Ladvisory/proto/v1/BottomSheetDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class TaxLossHarvestDashboardTimelineRowDto implements Dto3<TaxLossHarvestDashboardTimelineRow>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TaxLossHarvestDashboardTimelineRowDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TaxLossHarvestDashboardTimelineRowDto, TaxLossHarvestDashboardTimelineRow>> binaryBase64Serializer$delegate;
    private static final TaxLossHarvestDashboardTimelineRowDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TaxLossHarvestDashboardTimelineRowDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TaxLossHarvestDashboardTimelineRowDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final String getSubtitle() {
        return this.surrogate.getSubtitle();
    }

    public final boolean is_completed() {
        return this.surrogate.getIs_completed();
    }

    public final boolean getShould_show_info_icon() {
        return this.surrogate.getShould_show_info_icon();
    }

    public final BottomSheetDto getInfo_bottom_sheet() {
        return this.surrogate.getInfo_bottom_sheet();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TaxLossHarvestDashboardTimelineRowDto(java.lang.String r3, java.lang.String r4, boolean r5, boolean r6, advisory.proto.p008v1.BottomSheetDto r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r2 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.String r3 = ""
        L6:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lc
            r4 = r0
        Lc:
            r9 = r8 & 4
            r1 = 0
            if (r9 == 0) goto L12
            r5 = r1
        L12:
            r9 = r8 & 8
            if (r9 == 0) goto L17
            r6 = r1
        L17:
            r8 = r8 & 16
            if (r8 == 0) goto L22
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r4 = r2
            goto L28
        L22:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
        L28:
            r4.<init>(r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: advisory.proto.p008v1.TaxLossHarvestDashboardTimelineRowDto.<init>(java.lang.String, java.lang.String, boolean, boolean, advisory.proto.v1.BottomSheetDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaxLossHarvestDashboardTimelineRowDto(String title, String str, boolean z, boolean z2, BottomSheetDto bottomSheetDto) {
        this(new Surrogate(title, str, z, z2, bottomSheetDto));
        Intrinsics.checkNotNullParameter(title, "title");
    }

    @Override // com.robinhood.idl.Dto
    public TaxLossHarvestDashboardTimelineRow toProto() {
        String title = this.surrogate.getTitle();
        String subtitle = this.surrogate.getSubtitle();
        boolean is_completed = this.surrogate.getIs_completed();
        boolean should_show_info_icon = this.surrogate.getShould_show_info_icon();
        BottomSheetDto info_bottom_sheet = this.surrogate.getInfo_bottom_sheet();
        return new TaxLossHarvestDashboardTimelineRow(title, subtitle, is_completed, should_show_info_icon, info_bottom_sheet != null ? info_bottom_sheet.toProto() : null, null, 32, null);
    }

    public String toString() {
        return "[TaxLossHarvestDashboardTimelineRowDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TaxLossHarvestDashboardTimelineRowDto) && Intrinsics.areEqual(((TaxLossHarvestDashboardTimelineRowDto) other).surrogate, this.surrogate);
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
    /* compiled from: TaxLossHarvestDashboardTimelineRowDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001c\b\u0083\b\u0018\u0000 02\u00020\u0001:\u000210B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001bR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u001bR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b)\u0010$\u001a\u0004\b\u0006\u0010(R \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010'\u0012\u0004\b+\u0010$\u001a\u0004\b*\u0010(R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010,\u0012\u0004\b/\u0010$\u001a\u0004\b-\u0010.¨\u00062"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineRowDto$Surrogate;", "", "", "title", "subtitle", "", "is_completed", "should_show_info_icon", "Ladvisory/proto/v1/BottomSheetDto;", "info_bottom_sheet", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZLadvisory/proto/v1/BottomSheetDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZZLadvisory/proto/v1/BottomSheetDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineRowDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getSubtitle", "getSubtitle$annotations", "Z", "()Z", "is_completed$annotations", "getShould_show_info_icon", "getShould_show_info_icon$annotations", "Ladvisory/proto/v1/BottomSheetDto;", "getInfo_bottom_sheet", "()Ladvisory/proto/v1/BottomSheetDto;", "getInfo_bottom_sheet$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BottomSheetDto info_bottom_sheet;
        private final boolean is_completed;
        private final boolean should_show_info_icon;
        private final String subtitle;
        private final String title;

        public Surrogate() {
            this((String) null, (String) null, false, false, (BottomSheetDto) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && Intrinsics.areEqual(this.subtitle, surrogate.subtitle) && this.is_completed == surrogate.is_completed && this.should_show_info_icon == surrogate.should_show_info_icon && Intrinsics.areEqual(this.info_bottom_sheet, surrogate.info_bottom_sheet);
        }

        public int hashCode() {
            int iHashCode = this.title.hashCode() * 31;
            String str = this.subtitle;
            int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.is_completed)) * 31) + Boolean.hashCode(this.should_show_info_icon)) * 31;
            BottomSheetDto bottomSheetDto = this.info_bottom_sheet;
            return iHashCode2 + (bottomSheetDto != null ? bottomSheetDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", subtitle=" + this.subtitle + ", is_completed=" + this.is_completed + ", should_show_info_icon=" + this.should_show_info_icon + ", info_bottom_sheet=" + this.info_bottom_sheet + ")";
        }

        /* compiled from: TaxLossHarvestDashboardTimelineRowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineRowDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineRowDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TaxLossHarvestDashboardTimelineRowDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, boolean z, boolean z2, BottomSheetDto bottomSheetDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.title = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str2;
            }
            if ((i & 4) == 0) {
                this.is_completed = false;
            } else {
                this.is_completed = z;
            }
            if ((i & 8) == 0) {
                this.should_show_info_icon = false;
            } else {
                this.should_show_info_icon = z2;
            }
            if ((i & 16) == 0) {
                this.info_bottom_sheet = null;
            } else {
                this.info_bottom_sheet = bottomSheetDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            String str = self.subtitle;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str);
            }
            boolean z = self.is_completed;
            if (z) {
                output.encodeBooleanElement(serialDesc, 2, z);
            }
            boolean z2 = self.should_show_info_icon;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 3, z2);
            }
            BottomSheetDto bottomSheetDto = self.info_bottom_sheet;
            if (bottomSheetDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, BottomSheetDto.Serializer.INSTANCE, bottomSheetDto);
            }
        }

        public Surrogate(String title, String str, boolean z, boolean z2, BottomSheetDto bottomSheetDto) {
            Intrinsics.checkNotNullParameter(title, "title");
            this.title = title;
            this.subtitle = str;
            this.is_completed = z;
            this.should_show_info_icon = z2;
            this.info_bottom_sheet = bottomSheetDto;
        }

        public final String getTitle() {
            return this.title;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r3, java.lang.String r4, boolean r5, boolean r6, advisory.proto.p008v1.BottomSheetDto r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r2 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L6
                java.lang.String r3 = ""
            L6:
                r9 = r8 & 2
                r0 = 0
                if (r9 == 0) goto Lc
                r4 = r0
            Lc:
                r9 = r8 & 4
                r1 = 0
                if (r9 == 0) goto L12
                r5 = r1
            L12:
                r9 = r8 & 8
                if (r9 == 0) goto L17
                r6 = r1
            L17:
                r8 = r8 & 16
                if (r8 == 0) goto L22
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r4 = r2
                goto L28
            L22:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
            L28:
                r4.<init>(r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: advisory.proto.p008v1.TaxLossHarvestDashboardTimelineRowDto.Surrogate.<init>(java.lang.String, java.lang.String, boolean, boolean, advisory.proto.v1.BottomSheetDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: is_completed, reason: from getter */
        public final boolean getIs_completed() {
            return this.is_completed;
        }

        public final boolean getShould_show_info_icon() {
            return this.should_show_info_icon;
        }

        public final BottomSheetDto getInfo_bottom_sheet() {
            return this.info_bottom_sheet;
        }
    }

    /* compiled from: TaxLossHarvestDashboardTimelineRowDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineRowDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineRowDto;", "Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineRow;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineRowDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TaxLossHarvestDashboardTimelineRowDto, TaxLossHarvestDashboardTimelineRow> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TaxLossHarvestDashboardTimelineRowDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLossHarvestDashboardTimelineRowDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLossHarvestDashboardTimelineRowDto> getBinaryBase64Serializer() {
            return (KSerializer) TaxLossHarvestDashboardTimelineRowDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TaxLossHarvestDashboardTimelineRow> getProtoAdapter() {
            return TaxLossHarvestDashboardTimelineRow.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLossHarvestDashboardTimelineRowDto getZeroValue() {
            return TaxLossHarvestDashboardTimelineRowDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLossHarvestDashboardTimelineRowDto fromProto(TaxLossHarvestDashboardTimelineRow proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            String subtitle = proto.getSubtitle();
            boolean is_completed = proto.getIs_completed();
            boolean should_show_info_icon = proto.getShould_show_info_icon();
            BottomSheet info_bottom_sheet = proto.getInfo_bottom_sheet();
            return new TaxLossHarvestDashboardTimelineRowDto(new Surrogate(title, subtitle, is_completed, should_show_info_icon, info_bottom_sheet != null ? BottomSheetDto.INSTANCE.fromProto(info_bottom_sheet) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.TaxLossHarvestDashboardTimelineRowDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxLossHarvestDashboardTimelineRowDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TaxLossHarvestDashboardTimelineRowDto(null, null, false, false, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TaxLossHarvestDashboardTimelineRowDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineRowDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineRowDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineRowDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TaxLossHarvestDashboardTimelineRowDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.TaxLossHarvestDashboardTimelineRow", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TaxLossHarvestDashboardTimelineRowDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TaxLossHarvestDashboardTimelineRowDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TaxLossHarvestDashboardTimelineRowDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TaxLossHarvestDashboardTimelineRowDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardTimelineRowDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "advisory.proto.v1.TaxLossHarvestDashboardTimelineRowDto";
        }
    }
}
