package advisory.proto.p008v1;

import advisory.proto.p008v1.TaxLossHarvestDashboardActionDto;
import advisory.proto.p008v1.TaxLossHarvestDashboardActionModalDto;
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

/* compiled from: TaxLossHarvestDashboardStatusButtonDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004-,./B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BA\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001aH\u0016¢\u0006\u0004\b#\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010$R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\f\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b+\u0010\u0014¨\u00060"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto;", "Lcom/robinhood/idl/MessageDto;", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButton;", "Landroid/os/Parcelable;", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto$Surrogate;", "surrogate", "<init>", "(Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto$Surrogate;)V", "", "title", "Ladvisory/proto/v1/TaxLossHarvestDashboardActionDto;", "action", "action_url", "Ladvisory/proto/v1/TaxLossHarvestDashboardActionModalDto;", "action_modal", "logging_identifier", "(Ljava/lang/String;Ladvisory/proto/v1/TaxLossHarvestDashboardActionDto;Ljava/lang/String;Ladvisory/proto/v1/TaxLossHarvestDashboardActionModalDto;Ljava/lang/String;)V", "toProto", "()Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButton;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto$Surrogate;", "getTitle", "getAction", "()Ladvisory/proto/v1/TaxLossHarvestDashboardActionDto;", "getAction_url", "getAction_modal", "()Ladvisory/proto/v1/TaxLossHarvestDashboardActionModalDto;", "getLogging_identifier", "Companion", "Surrogate", "Serializer", "MultibindingModule", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class TaxLossHarvestDashboardStatusButtonDto implements Dto3<TaxLossHarvestDashboardStatusButton>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<TaxLossHarvestDashboardStatusButtonDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TaxLossHarvestDashboardStatusButtonDto, TaxLossHarvestDashboardStatusButton>> binaryBase64Serializer$delegate;
    private static final TaxLossHarvestDashboardStatusButtonDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ TaxLossHarvestDashboardStatusButtonDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TaxLossHarvestDashboardStatusButtonDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle() {
        return this.surrogate.getTitle();
    }

    public final TaxLossHarvestDashboardActionDto getAction() {
        return this.surrogate.getAction();
    }

    public final String getAction_url() {
        return this.surrogate.getAction_url();
    }

    public final TaxLossHarvestDashboardActionModalDto getAction_modal() {
        return this.surrogate.getAction_modal();
    }

    public final String getLogging_identifier() {
        return this.surrogate.getLogging_identifier();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ TaxLossHarvestDashboardStatusButtonDto(java.lang.String r2, advisory.proto.p008v1.TaxLossHarvestDashboardActionDto r3, java.lang.String r4, advisory.proto.p008v1.TaxLossHarvestDashboardActionModalDto r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L6
            java.lang.String r2 = ""
        L6:
            r8 = r7 & 2
            if (r8 == 0) goto L10
            advisory.proto.v1.TaxLossHarvestDashboardActionDto$Companion r3 = advisory.proto.p008v1.TaxLossHarvestDashboardActionDto.INSTANCE
            advisory.proto.v1.TaxLossHarvestDashboardActionDto r3 = r3.getZeroValue()
        L10:
            r8 = r7 & 4
            r0 = 0
            if (r8 == 0) goto L16
            r4 = r0
        L16:
            r8 = r7 & 8
            if (r8 == 0) goto L1b
            r5 = r0
        L1b:
            r7 = r7 & 16
            if (r7 == 0) goto L26
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L2c
        L26:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L2c:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: advisory.proto.p008v1.TaxLossHarvestDashboardStatusButtonDto.<init>(java.lang.String, advisory.proto.v1.TaxLossHarvestDashboardActionDto, java.lang.String, advisory.proto.v1.TaxLossHarvestDashboardActionModalDto, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TaxLossHarvestDashboardStatusButtonDto(String title, TaxLossHarvestDashboardActionDto action, String str, TaxLossHarvestDashboardActionModalDto taxLossHarvestDashboardActionModalDto, String str2) {
        this(new Surrogate(title, action, str, taxLossHarvestDashboardActionModalDto, str2));
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(action, "action");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public TaxLossHarvestDashboardStatusButton toProto() {
        String title = this.surrogate.getTitle();
        TaxLossHarvestDashboardAction taxLossHarvestDashboardAction = (TaxLossHarvestDashboardAction) this.surrogate.getAction().toProto();
        String action_url = this.surrogate.getAction_url();
        TaxLossHarvestDashboardActionModalDto action_modal = this.surrogate.getAction_modal();
        return new TaxLossHarvestDashboardStatusButton(title, taxLossHarvestDashboardAction, action_url, action_modal != null ? action_modal.toProto() : null, this.surrogate.getLogging_identifier(), null, 32, null);
    }

    public String toString() {
        return "[TaxLossHarvestDashboardStatusButtonDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof TaxLossHarvestDashboardStatusButtonDto) && Intrinsics.areEqual(((TaxLossHarvestDashboardStatusButtonDto) other).surrogate, this.surrogate);
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
    /* compiled from: TaxLossHarvestDashboardStatusButtonDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000232B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000bBM\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\"\u0012\u0004\b$\u0010%\u001a\u0004\b#\u0010\u001bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\"\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010\u001bR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010,\u0012\u0004\b/\u0010%\u001a\u0004\b-\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\"\u0012\u0004\b1\u0010%\u001a\u0004\b0\u0010\u001b¨\u00064"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto$Surrogate;", "", "", "title", "Ladvisory/proto/v1/TaxLossHarvestDashboardActionDto;", "action", "action_url", "Ladvisory/proto/v1/TaxLossHarvestDashboardActionModalDto;", "action_modal", "logging_identifier", "<init>", "(Ljava/lang/String;Ladvisory/proto/v1/TaxLossHarvestDashboardActionDto;Ljava/lang/String;Ladvisory/proto/v1/TaxLossHarvestDashboardActionModalDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ladvisory/proto/v1/TaxLossHarvestDashboardActionDto;Ljava/lang/String;Ladvisory/proto/v1/TaxLossHarvestDashboardActionModalDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$advisory_proto_v1_externalRelease", "(Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "Ladvisory/proto/v1/TaxLossHarvestDashboardActionDto;", "getAction", "()Ladvisory/proto/v1/TaxLossHarvestDashboardActionDto;", "getAction$annotations", "getAction_url", "getAction_url$annotations", "Ladvisory/proto/v1/TaxLossHarvestDashboardActionModalDto;", "getAction_modal", "()Ladvisory/proto/v1/TaxLossHarvestDashboardActionModalDto;", "getAction_modal$annotations", "getLogging_identifier", "getLogging_identifier$annotations", "Companion", "$serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final TaxLossHarvestDashboardActionDto action;
        private final TaxLossHarvestDashboardActionModalDto action_modal;
        private final String action_url;
        private final String logging_identifier;
        private final String title;

        public Surrogate() {
            this((String) null, (TaxLossHarvestDashboardActionDto) null, (String) null, (TaxLossHarvestDashboardActionModalDto) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title, surrogate.title) && this.action == surrogate.action && Intrinsics.areEqual(this.action_url, surrogate.action_url) && Intrinsics.areEqual(this.action_modal, surrogate.action_modal) && Intrinsics.areEqual(this.logging_identifier, surrogate.logging_identifier);
        }

        public int hashCode() {
            int iHashCode = ((this.title.hashCode() * 31) + this.action.hashCode()) * 31;
            String str = this.action_url;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            TaxLossHarvestDashboardActionModalDto taxLossHarvestDashboardActionModalDto = this.action_modal;
            int iHashCode3 = (iHashCode2 + (taxLossHarvestDashboardActionModalDto == null ? 0 : taxLossHarvestDashboardActionModalDto.hashCode())) * 31;
            String str2 = this.logging_identifier;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title=" + this.title + ", action=" + this.action + ", action_url=" + this.action_url + ", action_modal=" + this.action_modal + ", logging_identifier=" + this.logging_identifier + ")";
        }

        /* compiled from: TaxLossHarvestDashboardStatusButtonDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto$Surrogate;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return TaxLossHarvestDashboardStatusButtonDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, TaxLossHarvestDashboardActionDto taxLossHarvestDashboardActionDto, String str2, TaxLossHarvestDashboardActionModalDto taxLossHarvestDashboardActionModalDto, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            this.title = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.action = TaxLossHarvestDashboardActionDto.INSTANCE.getZeroValue();
            } else {
                this.action = taxLossHarvestDashboardActionDto;
            }
            if ((i & 4) == 0) {
                this.action_url = null;
            } else {
                this.action_url = str2;
            }
            if ((i & 8) == 0) {
                this.action_modal = null;
            } else {
                this.action_modal = taxLossHarvestDashboardActionModalDto;
            }
            if ((i & 16) == 0) {
                this.logging_identifier = null;
            } else {
                this.logging_identifier = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$advisory_proto_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.title, "")) {
                output.encodeStringElement(serialDesc, 0, self.title);
            }
            if (self.action != TaxLossHarvestDashboardActionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, TaxLossHarvestDashboardActionDto.Serializer.INSTANCE, self.action);
            }
            String str = self.action_url;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
            TaxLossHarvestDashboardActionModalDto taxLossHarvestDashboardActionModalDto = self.action_modal;
            if (taxLossHarvestDashboardActionModalDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, TaxLossHarvestDashboardActionModalDto.Serializer.INSTANCE, taxLossHarvestDashboardActionModalDto);
            }
            String str2 = self.logging_identifier;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str2);
            }
        }

        public Surrogate(String title, TaxLossHarvestDashboardActionDto action, String str, TaxLossHarvestDashboardActionModalDto taxLossHarvestDashboardActionModalDto, String str2) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(action, "action");
            this.title = title;
            this.action = action;
            this.action_url = str;
            this.action_modal = taxLossHarvestDashboardActionModalDto;
            this.logging_identifier = str2;
        }

        public final String getTitle() {
            return this.title;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.lang.String r2, advisory.proto.p008v1.TaxLossHarvestDashboardActionDto r3, java.lang.String r4, advisory.proto.p008v1.TaxLossHarvestDashboardActionModalDto r5, java.lang.String r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
            /*
                r1 = this;
                r8 = r7 & 1
                if (r8 == 0) goto L6
                java.lang.String r2 = ""
            L6:
                r8 = r7 & 2
                if (r8 == 0) goto L10
                advisory.proto.v1.TaxLossHarvestDashboardActionDto$Companion r3 = advisory.proto.p008v1.TaxLossHarvestDashboardActionDto.INSTANCE
                advisory.proto.v1.TaxLossHarvestDashboardActionDto r3 = r3.getZeroValue()
            L10:
                r8 = r7 & 4
                r0 = 0
                if (r8 == 0) goto L16
                r4 = r0
            L16:
                r8 = r7 & 8
                if (r8 == 0) goto L1b
                r5 = r0
            L1b:
                r7 = r7 & 16
                if (r7 == 0) goto L26
                r8 = r0
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L2c
            L26:
                r8 = r6
                r7 = r5
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L2c:
                r3.<init>(r4, r5, r6, r7, r8)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: advisory.proto.p008v1.TaxLossHarvestDashboardStatusButtonDto.Surrogate.<init>(java.lang.String, advisory.proto.v1.TaxLossHarvestDashboardActionDto, java.lang.String, advisory.proto.v1.TaxLossHarvestDashboardActionModalDto, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final TaxLossHarvestDashboardActionDto getAction() {
            return this.action;
        }

        public final String getAction_url() {
            return this.action_url;
        }

        public final TaxLossHarvestDashboardActionModalDto getAction_modal() {
            return this.action_modal;
        }

        public final String getLogging_identifier() {
            return this.logging_identifier;
        }
    }

    /* compiled from: TaxLossHarvestDashboardStatusButtonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto;", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButton;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<TaxLossHarvestDashboardStatusButtonDto, TaxLossHarvestDashboardStatusButton> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TaxLossHarvestDashboardStatusButtonDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLossHarvestDashboardStatusButtonDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TaxLossHarvestDashboardStatusButtonDto> getBinaryBase64Serializer() {
            return (KSerializer) TaxLossHarvestDashboardStatusButtonDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TaxLossHarvestDashboardStatusButton> getProtoAdapter() {
            return TaxLossHarvestDashboardStatusButton.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLossHarvestDashboardStatusButtonDto getZeroValue() {
            return TaxLossHarvestDashboardStatusButtonDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TaxLossHarvestDashboardStatusButtonDto fromProto(TaxLossHarvestDashboardStatusButton proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title = proto.getTitle();
            TaxLossHarvestDashboardActionDto taxLossHarvestDashboardActionDtoFromProto = TaxLossHarvestDashboardActionDto.INSTANCE.fromProto(proto.getAction());
            String action_url = proto.getAction_url();
            TaxLossHarvestDashboardActionModal action_modal = proto.getAction_modal();
            return new TaxLossHarvestDashboardStatusButtonDto(new Surrogate(title, taxLossHarvestDashboardActionDtoFromProto, action_url, action_modal != null ? TaxLossHarvestDashboardActionModalDto.INSTANCE.fromProto(action_modal) : null, proto.getLogging_identifier()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: advisory.proto.v1.TaxLossHarvestDashboardStatusButtonDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TaxLossHarvestDashboardStatusButtonDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new TaxLossHarvestDashboardStatusButtonDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TaxLossHarvestDashboardStatusButtonDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto;", "<init>", "()V", "surrogateSerializer", "Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<TaxLossHarvestDashboardStatusButtonDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/advisory.proto.v1.TaxLossHarvestDashboardStatusButton", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TaxLossHarvestDashboardStatusButtonDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public TaxLossHarvestDashboardStatusButtonDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new TaxLossHarvestDashboardStatusButtonDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: TaxLossHarvestDashboardStatusButtonDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ladvisory/proto/v1/TaxLossHarvestDashboardStatusButtonDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "advisory.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "advisory.proto.v1.TaxLossHarvestDashboardStatusButtonDto";
        }
    }
}
