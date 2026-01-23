package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.InvestmentsTrackerDisconnectedDataDto;
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

/* compiled from: InvestmentsTrackerComponentMetadataDetailsRowDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,+-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BG\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0014R\u0011\u0010\f\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010\u0014R\u0011\u0010\r\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0014R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006/"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsRowDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsRow;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsRowDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsRowDto$Surrogate;)V", "", "left_text", "right_text", "id", "bottom_left_text", "deeplink", "Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;", "disconnected_data", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;)V", "toProto", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsRow;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsRowDto$Surrogate;", "getLeft_text", "getRight_text", "getBottom_left_text", "getDeeplink", "getDisconnected_data", "()Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public final class InvestmentsTrackerComponentMetadataDetailsRowDto implements Dto3<InvestmentsTrackerComponentMetadataDetailsRow>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<InvestmentsTrackerComponentMetadataDetailsRowDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<InvestmentsTrackerComponentMetadataDetailsRowDto, InvestmentsTrackerComponentMetadataDetailsRow>> binaryBase64Serializer$delegate;
    private static final InvestmentsTrackerComponentMetadataDetailsRowDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ InvestmentsTrackerComponentMetadataDetailsRowDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private InvestmentsTrackerComponentMetadataDetailsRowDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getLeft_text() {
        return this.surrogate.getLeft_text();
    }

    public final String getRight_text() {
        return this.surrogate.getRight_text();
    }

    public final String getBottom_left_text() {
        return this.surrogate.getBottom_left_text();
    }

    public final String getDeeplink() {
        return this.surrogate.getDeeplink();
    }

    public final InvestmentsTrackerDisconnectedDataDto getDisconnected_data() {
        return this.surrogate.getDisconnected_data();
    }

    public /* synthetic */ InvestmentsTrackerComponentMetadataDetailsRowDto(String str, String str2, String str3, String str4, String str5, InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : investmentsTrackerDisconnectedDataDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InvestmentsTrackerComponentMetadataDetailsRowDto(String left_text, String right_text, String id, String bottom_left_text, String deeplink, InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto) {
        this(new Surrogate(left_text, right_text, id, bottom_left_text, deeplink, investmentsTrackerDisconnectedDataDto));
        Intrinsics.checkNotNullParameter(left_text, "left_text");
        Intrinsics.checkNotNullParameter(right_text, "right_text");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(bottom_left_text, "bottom_left_text");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
    }

    @Override // com.robinhood.idl.Dto
    public InvestmentsTrackerComponentMetadataDetailsRow toProto() {
        String left_text = this.surrogate.getLeft_text();
        String right_text = this.surrogate.getRight_text();
        String id = this.surrogate.getId();
        String bottom_left_text = this.surrogate.getBottom_left_text();
        String deeplink = this.surrogate.getDeeplink();
        InvestmentsTrackerDisconnectedDataDto disconnected_data = this.surrogate.getDisconnected_data();
        return new InvestmentsTrackerComponentMetadataDetailsRow(left_text, right_text, id, bottom_left_text, deeplink, disconnected_data != null ? disconnected_data.toProto() : null, null, 64, null);
    }

    public String toString() {
        return "[InvestmentsTrackerComponentMetadataDetailsRowDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof InvestmentsTrackerComponentMetadataDetailsRowDto) && Intrinsics.areEqual(((InvestmentsTrackerComponentMetadataDetailsRowDto) other).surrogate, this.surrogate);
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
    /* compiled from: InvestmentsTrackerComponentMetadataDetailsRowDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000232BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001bR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\"\u0012\u0004\b'\u0010%\u001a\u0004\b&\u0010\u001bR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b)\u0010%\u001a\u0004\b(\u0010\u001bR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010\u001bR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\"\u0012\u0004\b-\u0010%\u001a\u0004\b,\u0010\u001bR\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b1\u0010%\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsRowDto$Surrogate;", "", "", "left_text", "right_text", "id", "bottom_left_text", "deeplink", "Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;", "disconnected_data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsRowDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLeft_text", "getLeft_text$annotations", "()V", "getRight_text", "getRight_text$annotations", "getId", "getId$annotations", "getBottom_left_text", "getBottom_left_text$annotations", "getDeeplink", "getDeeplink$annotations", "Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;", "getDisconnected_data", "()Lbff_money_movement/service/v1/InvestmentsTrackerDisconnectedDataDto;", "getDisconnected_data$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String bottom_left_text;
        private final String deeplink;
        private final InvestmentsTrackerDisconnectedDataDto disconnected_data;
        private final String id;
        private final String left_text;
        private final String right_text;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (InvestmentsTrackerDisconnectedDataDto) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.left_text, surrogate.left_text) && Intrinsics.areEqual(this.right_text, surrogate.right_text) && Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.bottom_left_text, surrogate.bottom_left_text) && Intrinsics.areEqual(this.deeplink, surrogate.deeplink) && Intrinsics.areEqual(this.disconnected_data, surrogate.disconnected_data);
        }

        public int hashCode() {
            int iHashCode = ((((((((this.left_text.hashCode() * 31) + this.right_text.hashCode()) * 31) + this.id.hashCode()) * 31) + this.bottom_left_text.hashCode()) * 31) + this.deeplink.hashCode()) * 31;
            InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto = this.disconnected_data;
            return iHashCode + (investmentsTrackerDisconnectedDataDto == null ? 0 : investmentsTrackerDisconnectedDataDto.hashCode());
        }

        public String toString() {
            return "Surrogate(left_text=" + this.left_text + ", right_text=" + this.right_text + ", id=" + this.id + ", bottom_left_text=" + this.bottom_left_text + ", deeplink=" + this.deeplink + ", disconnected_data=" + this.disconnected_data + ")";
        }

        /* compiled from: InvestmentsTrackerComponentMetadataDetailsRowDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsRowDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsRowDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return InvestmentsTrackerComponentMetadataDetailsRowDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.left_text = "";
            } else {
                this.left_text = str;
            }
            if ((i & 2) == 0) {
                this.right_text = "";
            } else {
                this.right_text = str2;
            }
            if ((i & 4) == 0) {
                this.id = "";
            } else {
                this.id = str3;
            }
            if ((i & 8) == 0) {
                this.bottom_left_text = "";
            } else {
                this.bottom_left_text = str4;
            }
            if ((i & 16) == 0) {
                this.deeplink = "";
            } else {
                this.deeplink = str5;
            }
            if ((i & 32) == 0) {
                this.disconnected_data = null;
            } else {
                this.disconnected_data = investmentsTrackerDisconnectedDataDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.left_text, "")) {
                output.encodeStringElement(serialDesc, 0, self.left_text);
            }
            if (!Intrinsics.areEqual(self.right_text, "")) {
                output.encodeStringElement(serialDesc, 1, self.right_text);
            }
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 2, self.id);
            }
            if (!Intrinsics.areEqual(self.bottom_left_text, "")) {
                output.encodeStringElement(serialDesc, 3, self.bottom_left_text);
            }
            if (!Intrinsics.areEqual(self.deeplink, "")) {
                output.encodeStringElement(serialDesc, 4, self.deeplink);
            }
            InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto = self.disconnected_data;
            if (investmentsTrackerDisconnectedDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, InvestmentsTrackerDisconnectedDataDto.Serializer.INSTANCE, investmentsTrackerDisconnectedDataDto);
            }
        }

        public Surrogate(String left_text, String right_text, String id, String bottom_left_text, String deeplink, InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto) {
            Intrinsics.checkNotNullParameter(left_text, "left_text");
            Intrinsics.checkNotNullParameter(right_text, "right_text");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(bottom_left_text, "bottom_left_text");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            this.left_text = left_text;
            this.right_text = right_text;
            this.id = id;
            this.bottom_left_text = bottom_left_text;
            this.deeplink = deeplink;
            this.disconnected_data = investmentsTrackerDisconnectedDataDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? null : investmentsTrackerDisconnectedDataDto);
        }

        public final String getLeft_text() {
            return this.left_text;
        }

        public final String getRight_text() {
            return this.right_text;
        }

        public final String getId() {
            return this.id;
        }

        public final String getBottom_left_text() {
            return this.bottom_left_text;
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final InvestmentsTrackerDisconnectedDataDto getDisconnected_data() {
            return this.disconnected_data;
        }
    }

    /* compiled from: InvestmentsTrackerComponentMetadataDetailsRowDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsRowDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsRowDto;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsRow;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsRowDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<InvestmentsTrackerComponentMetadataDetailsRowDto, InvestmentsTrackerComponentMetadataDetailsRow> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<InvestmentsTrackerComponentMetadataDetailsRowDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerComponentMetadataDetailsRowDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<InvestmentsTrackerComponentMetadataDetailsRowDto> getBinaryBase64Serializer() {
            return (KSerializer) InvestmentsTrackerComponentMetadataDetailsRowDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<InvestmentsTrackerComponentMetadataDetailsRow> getProtoAdapter() {
            return InvestmentsTrackerComponentMetadataDetailsRow.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerComponentMetadataDetailsRowDto getZeroValue() {
            return InvestmentsTrackerComponentMetadataDetailsRowDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public InvestmentsTrackerComponentMetadataDetailsRowDto fromProto(InvestmentsTrackerComponentMetadataDetailsRow proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String left_text = proto.getLeft_text();
            String right_text = proto.getRight_text();
            String id = proto.getId();
            String bottom_left_text = proto.getBottom_left_text();
            String deeplink = proto.getDeeplink();
            InvestmentsTrackerDisconnectedData disconnected_data = proto.getDisconnected_data();
            return new InvestmentsTrackerComponentMetadataDetailsRowDto(new Surrogate(left_text, right_text, id, bottom_left_text, deeplink, disconnected_data != null ? InvestmentsTrackerDisconnectedDataDto.INSTANCE.fromProto(disconnected_data) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.InvestmentsTrackerComponentMetadataDetailsRowDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvestmentsTrackerComponentMetadataDetailsRowDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new InvestmentsTrackerComponentMetadataDetailsRowDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: InvestmentsTrackerComponentMetadataDetailsRowDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsRowDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsRowDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsRowDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<InvestmentsTrackerComponentMetadataDetailsRowDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.InvestmentsTrackerComponentMetadataDetailsRow", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, InvestmentsTrackerComponentMetadataDetailsRowDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public InvestmentsTrackerComponentMetadataDetailsRowDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new InvestmentsTrackerComponentMetadataDetailsRowDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: InvestmentsTrackerComponentMetadataDetailsRowDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/InvestmentsTrackerComponentMetadataDetailsRowDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4185_1)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.InvestmentsTrackerComponentMetadataDetailsRowDto";
        }
    }
}
