package com.robinhood.rosetta.experiment_assignment;

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
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: AssignmentResultDto.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u0006\u0010\u000fJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\u0013\u0010\u001a\u001a\u00020\u000e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001eH\u0016J\b\u0010$\u001a\u00020\u001eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006)"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentResultDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentResult;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentResultDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/experiment_assignment/AssignmentResultDto$Surrogate;)V", "assignment_name", "", "variant", "reason", "override_list_names", "within_universe", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAssignment_name", "()Ljava/lang/String;", "getVariant", "getReason", "getOverride_list_names", "getWithin_universe", "()Z", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class AssignmentResultDto implements Dto3<AssignmentResult>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AssignmentResultDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AssignmentResultDto, AssignmentResult>> binaryBase64Serializer$delegate;
    private static final AssignmentResultDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AssignmentResultDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AssignmentResultDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAssignment_name() {
        return this.surrogate.getAssignment_name();
    }

    public final String getVariant() {
        return this.surrogate.getVariant();
    }

    public final String getReason() {
        return this.surrogate.getReason();
    }

    public final String getOverride_list_names() {
        return this.surrogate.getOverride_list_names();
    }

    public final boolean getWithin_universe() {
        return this.surrogate.getWithin_universe();
    }

    public /* synthetic */ AssignmentResultDto(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? false : z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssignmentResultDto(String assignment_name, String variant, String reason, String override_list_names, boolean z) {
        this(new Surrogate(assignment_name, variant, reason, override_list_names, z));
        Intrinsics.checkNotNullParameter(assignment_name, "assignment_name");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(override_list_names, "override_list_names");
    }

    public static /* synthetic */ AssignmentResultDto copy$default(AssignmentResultDto assignmentResultDto, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assignmentResultDto.surrogate.getAssignment_name();
        }
        if ((i & 2) != 0) {
            str2 = assignmentResultDto.surrogate.getVariant();
        }
        if ((i & 4) != 0) {
            str3 = assignmentResultDto.surrogate.getReason();
        }
        if ((i & 8) != 0) {
            str4 = assignmentResultDto.surrogate.getOverride_list_names();
        }
        if ((i & 16) != 0) {
            z = assignmentResultDto.surrogate.getWithin_universe();
        }
        boolean z2 = z;
        String str5 = str3;
        return assignmentResultDto.copy(str, str2, str5, str4, z2);
    }

    public final AssignmentResultDto copy(String assignment_name, String variant, String reason, String override_list_names, boolean within_universe) {
        Intrinsics.checkNotNullParameter(assignment_name, "assignment_name");
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(override_list_names, "override_list_names");
        return new AssignmentResultDto(new Surrogate(assignment_name, variant, reason, override_list_names, within_universe));
    }

    @Override // com.robinhood.idl.Dto
    public AssignmentResult toProto() {
        return new AssignmentResult(this.surrogate.getAssignment_name(), this.surrogate.getVariant(), this.surrogate.getReason(), this.surrogate.getOverride_list_names(), this.surrogate.getWithin_universe(), null, 32, null);
    }

    public String toString() {
        return "[AssignmentResultDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AssignmentResultDto) && Intrinsics.areEqual(((AssignmentResultDto) other).surrogate, this.surrogate);
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
    /* compiled from: AssignmentResultDto.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 02\u00020\u0001:\u0002/0B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nBK\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J;\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010#\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\fHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J%\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0001¢\u0006\u0002\b.R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u001c¨\u00061"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentResultDto$Surrogate;", "", "assignment_name", "", "variant", "reason", "override_list_names", "within_universe", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAssignment_name$annotations", "()V", "getAssignment_name", "()Ljava/lang/String;", "getVariant$annotations", "getVariant", "getReason$annotations", "getReason", "getOverride_list_names$annotations", "getOverride_list_names", "getWithin_universe$annotations", "getWithin_universe", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$experiment_assignment_service_externalRelease", "$serializer", "Companion", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String assignment_name;
        private final String override_list_names;
        private final String reason;
        private final String variant;
        private final boolean within_universe;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, false, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.assignment_name;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.variant;
            }
            if ((i & 4) != 0) {
                str3 = surrogate.reason;
            }
            if ((i & 8) != 0) {
                str4 = surrogate.override_list_names;
            }
            if ((i & 16) != 0) {
                z = surrogate.within_universe;
            }
            boolean z2 = z;
            String str5 = str3;
            return surrogate.copy(str, str2, str5, str4, z2);
        }

        @SerialName("assignmentName")
        @JsonAnnotations2(names = {"assignment_name"})
        public static /* synthetic */ void getAssignment_name$annotations() {
        }

        @SerialName("overrideListNames")
        @JsonAnnotations2(names = {"override_list_names"})
        public static /* synthetic */ void getOverride_list_names$annotations() {
        }

        @SerialName("reason")
        @JsonAnnotations2(names = {"reason"})
        public static /* synthetic */ void getReason$annotations() {
        }

        @SerialName("variant")
        @JsonAnnotations2(names = {"variant"})
        public static /* synthetic */ void getVariant$annotations() {
        }

        @SerialName("withinUniverse")
        @JsonAnnotations2(names = {"within_universe"})
        public static /* synthetic */ void getWithin_universe$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getAssignment_name() {
            return this.assignment_name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getVariant() {
            return this.variant;
        }

        /* renamed from: component3, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        /* renamed from: component4, reason: from getter */
        public final String getOverride_list_names() {
            return this.override_list_names;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getWithin_universe() {
            return this.within_universe;
        }

        public final Surrogate copy(String assignment_name, String variant, String reason, String override_list_names, boolean within_universe) {
            Intrinsics.checkNotNullParameter(assignment_name, "assignment_name");
            Intrinsics.checkNotNullParameter(variant, "variant");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(override_list_names, "override_list_names");
            return new Surrogate(assignment_name, variant, reason, override_list_names, within_universe);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.assignment_name, surrogate.assignment_name) && Intrinsics.areEqual(this.variant, surrogate.variant) && Intrinsics.areEqual(this.reason, surrogate.reason) && Intrinsics.areEqual(this.override_list_names, surrogate.override_list_names) && this.within_universe == surrogate.within_universe;
        }

        public int hashCode() {
            return (((((((this.assignment_name.hashCode() * 31) + this.variant.hashCode()) * 31) + this.reason.hashCode()) * 31) + this.override_list_names.hashCode()) * 31) + Boolean.hashCode(this.within_universe);
        }

        public String toString() {
            return "Surrogate(assignment_name=" + this.assignment_name + ", variant=" + this.variant + ", reason=" + this.reason + ", override_list_names=" + this.override_list_names + ", within_universe=" + this.within_universe + ")";
        }

        /* compiled from: AssignmentResultDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentResultDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentResultDto$Surrogate;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AssignmentResultDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.assignment_name = "";
            } else {
                this.assignment_name = str;
            }
            if ((i & 2) == 0) {
                this.variant = "";
            } else {
                this.variant = str2;
            }
            if ((i & 4) == 0) {
                this.reason = "";
            } else {
                this.reason = str3;
            }
            if ((i & 8) == 0) {
                this.override_list_names = "";
            } else {
                this.override_list_names = str4;
            }
            if ((i & 16) == 0) {
                this.within_universe = false;
            } else {
                this.within_universe = z;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$experiment_assignment_service_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.assignment_name, "")) {
                output.encodeStringElement(serialDesc, 0, self.assignment_name);
            }
            if (!Intrinsics.areEqual(self.variant, "")) {
                output.encodeStringElement(serialDesc, 1, self.variant);
            }
            if (!Intrinsics.areEqual(self.reason, "")) {
                output.encodeStringElement(serialDesc, 2, self.reason);
            }
            if (!Intrinsics.areEqual(self.override_list_names, "")) {
                output.encodeStringElement(serialDesc, 3, self.override_list_names);
            }
            boolean z = self.within_universe;
            if (z) {
                output.encodeBooleanElement(serialDesc, 4, z);
            }
        }

        public Surrogate(String assignment_name, String variant, String reason, String override_list_names, boolean z) {
            Intrinsics.checkNotNullParameter(assignment_name, "assignment_name");
            Intrinsics.checkNotNullParameter(variant, "variant");
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(override_list_names, "override_list_names");
            this.assignment_name = assignment_name;
            this.variant = variant;
            this.reason = reason;
            this.override_list_names = override_list_names;
            this.within_universe = z;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? false : z);
        }

        public final String getAssignment_name() {
            return this.assignment_name;
        }

        public final String getVariant() {
            return this.variant;
        }

        public final String getReason() {
            return this.reason;
        }

        public final String getOverride_list_names() {
            return this.override_list_names;
        }

        public final boolean getWithin_universe() {
            return this.within_universe;
        }
    }

    /* compiled from: AssignmentResultDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentResultDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentResultDto;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentResult;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/experiment_assignment/AssignmentResultDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<AssignmentResultDto, AssignmentResult> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AssignmentResultDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AssignmentResultDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AssignmentResultDto> getBinaryBase64Serializer() {
            return (KSerializer) AssignmentResultDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AssignmentResult> getProtoAdapter() {
            return AssignmentResult.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AssignmentResultDto getZeroValue() {
            return AssignmentResultDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AssignmentResultDto fromProto(AssignmentResult proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new AssignmentResultDto(new Surrogate(proto.getAssignment_name(), proto.getVariant(), proto.getReason(), proto.getOverride_list_names(), proto.getWithin_universe()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.experiment_assignment.AssignmentResultDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssignmentResultDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AssignmentResultDto(null, null, null, null, false, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AssignmentResultDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentResultDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentResultDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentResultDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AssignmentResultDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.experiment_assignment.service.AssignmentResult", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AssignmentResultDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AssignmentResultDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AssignmentResultDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AssignmentResultDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentResultDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.experiment_assignment.AssignmentResultDto";
        }
    }
}
