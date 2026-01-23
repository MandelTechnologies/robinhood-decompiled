package identi.service.p471v1.models_workflow.p472v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.squareup.wire.ProtoAdapter;
import identi.service.p471v1.models_workflow.p472v1.WorkflowRoute;
import identi.service.p471v1.models_workflow.p472v1.WorkflowRouteDto;
import identi.service.p471v1.models_workflow.p472v1.WorkflowScreenDto;
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

/* compiled from: WorkflowRouteDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007#\"$%&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006)"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto;", "Lcom/robinhood/idl/MessageDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowRoute;", "Landroid/os/Parcelable;", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$Surrogate;", "surrogate", "<init>", "(Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$Surrogate;)V", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$TypeDto;", "type", "(Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$TypeDto;)V", "toProto", "()Lidenti/service/v1/models_workflow/v1/WorkflowRoute;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$Surrogate;", "getType", "()Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$TypeDto;", "Companion", "Surrogate", "TypeDto", "ReplaceDto", "ExitDto", "Serializer", "MultibindingModule", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public final class WorkflowRouteDto implements Dto3<WorkflowRoute>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<WorkflowRouteDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<WorkflowRouteDto, WorkflowRoute>> binaryBase64Serializer$delegate;
    private static final WorkflowRouteDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ WorkflowRouteDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private WorkflowRouteDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final TypeDto getType() {
        if (this.surrogate.getReplace() != null) {
            return new TypeDto.Replace(this.surrogate.getReplace());
        }
        if (this.surrogate.getExit() != null) {
            return new TypeDto.Exit(this.surrogate.getExit());
        }
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WorkflowRouteDto(TypeDto typeDto) {
        TypeDto.Replace replace = typeDto instanceof TypeDto.Replace ? (TypeDto.Replace) typeDto : null;
        ReplaceDto value = replace != null ? replace.getValue() : null;
        TypeDto.Exit exit = typeDto instanceof TypeDto.Exit ? (TypeDto.Exit) typeDto : null;
        this(new Surrogate(value, exit != null ? exit.getValue() : null));
    }

    public /* synthetic */ WorkflowRouteDto(TypeDto typeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : typeDto);
    }

    @Override // com.robinhood.idl.Dto
    public WorkflowRoute toProto() {
        ReplaceDto replace = this.surrogate.getReplace();
        WorkflowRoute.Replace proto = replace != null ? replace.toProto() : null;
        ExitDto exit = this.surrogate.getExit();
        return new WorkflowRoute(proto, exit != null ? exit.toProto() : null, null, 4, null);
    }

    public String toString() {
        return "[WorkflowRouteDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof WorkflowRouteDto) && Intrinsics.areEqual(((WorkflowRouteDto) other).surrogate, this.surrogate);
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
    /* compiled from: WorkflowRouteDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0083\b\u0018\u0000 (2\u00020\u0001:\u0002)(B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010$\u0012\u0004\b'\u0010#\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$Surrogate;", "", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto;", "replace", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto;", "exit", "<init>", "(Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto;Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto;Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identi_v1_models_workflow_v1_externalRelease", "(Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto;", "getReplace", "()Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto;", "getReplace$annotations", "()V", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto;", "getExit", "()Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto;", "getExit$annotations", "Companion", "$serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ExitDto exit;
        private final ReplaceDto replace;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((ReplaceDto) null, (ExitDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.replace, surrogate.replace) && Intrinsics.areEqual(this.exit, surrogate.exit);
        }

        public int hashCode() {
            ReplaceDto replaceDto = this.replace;
            int iHashCode = (replaceDto == null ? 0 : replaceDto.hashCode()) * 31;
            ExitDto exitDto = this.exit;
            return iHashCode + (exitDto != null ? exitDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(replace=" + this.replace + ", exit=" + this.exit + ")";
        }

        /* compiled from: WorkflowRouteDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$Surrogate;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return WorkflowRouteDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ReplaceDto replaceDto, ExitDto exitDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.replace = null;
            } else {
                this.replace = replaceDto;
            }
            if ((i & 2) == 0) {
                this.exit = null;
            } else {
                this.exit = exitDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$identi_v1_models_workflow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            ReplaceDto replaceDto = self.replace;
            if (replaceDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, ReplaceDto.Serializer.INSTANCE, replaceDto);
            }
            ExitDto exitDto = self.exit;
            if (exitDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ExitDto.Serializer.INSTANCE, exitDto);
            }
        }

        public Surrogate(ReplaceDto replaceDto, ExitDto exitDto) {
            this.replace = replaceDto;
            this.exit = exitDto;
        }

        public /* synthetic */ Surrogate(ReplaceDto replaceDto, ExitDto exitDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : replaceDto, (i & 2) != 0 ? null : exitDto);
        }

        public final ReplaceDto getReplace() {
            return this.replace;
        }

        public final ExitDto getExit() {
            return this.exit;
        }
    }

    /* compiled from: WorkflowRouteDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowRoute;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<WorkflowRouteDto, WorkflowRoute> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<WorkflowRouteDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<WorkflowRouteDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<WorkflowRouteDto> getBinaryBase64Serializer() {
            return (KSerializer) WorkflowRouteDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<WorkflowRoute> getProtoAdapter() {
            return WorkflowRoute.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public WorkflowRouteDto getZeroValue() {
            return WorkflowRouteDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public WorkflowRouteDto fromProto(WorkflowRoute proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            WorkflowRoute.Replace replace = proto.getReplace();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ReplaceDto replaceDtoFromProto = replace != null ? ReplaceDto.INSTANCE.fromProto(replace) : null;
            WorkflowRoute.Exit exit = proto.getExit();
            return new WorkflowRouteDto(new Surrogate(replaceDtoFromProto, exit != null ? ExitDto.INSTANCE.fromProto(exit) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.WorkflowRouteDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WorkflowRouteDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new WorkflowRouteDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: WorkflowRouteDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00062\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$TypeDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Replace", "Exit", "Companion", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$TypeDto$Exit;", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$TypeDto$Replace;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class TypeDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ TypeDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TypeDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: WorkflowRouteDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$TypeDto$Replace;", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$TypeDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Replace extends TypeDto {
            private final ReplaceDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Replace) && Intrinsics.areEqual(this.value, ((Replace) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Replace(value=" + this.value + ")";
            }

            public final ReplaceDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Replace(ReplaceDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowRouteDto.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$TypeDto$Exit;", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$TypeDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto;", "value", "<init>", "(Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto;", "getValue", "()Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Exit extends TypeDto {
            private final ExitDto value;

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Exit) && Intrinsics.areEqual(this.value, ((Exit) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Exit(value=" + this.value + ")";
            }

            public final ExitDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Exit(ExitDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: WorkflowRouteDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$TypeDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$TypeDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowRoute;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Companion implements Dto4.Creator<TypeDto, WorkflowRoute> {
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
            public ProtoAdapter<WorkflowRoute> getProtoAdapter() {
                return WorkflowRoute.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public TypeDto fromProto(WorkflowRoute proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getReplace() != null) {
                    return new Replace(ReplaceDto.INSTANCE.fromProto(proto.getReplace()));
                }
                if (proto.getExit() != null) {
                    return new Exit(ExitDto.INSTANCE.fromProto(proto.getExit()));
                }
                return null;
            }
        }
    }

    /* compiled from: WorkflowRouteDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#\"$%B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0015\b\u0016\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006&"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto;", "Lcom/robinhood/idl/MessageDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Replace;", "Landroid/os/Parcelable;", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto$Surrogate;", "surrogate", "<init>", "(Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto$Surrogate;)V", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto;", "screen", "(Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto;)V", "toProto", "()Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Replace;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto$Surrogate;", "getScreen", "()Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ReplaceDto implements Dto3<WorkflowRoute.Replace>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ReplaceDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ReplaceDto, WorkflowRoute.Replace>> binaryBase64Serializer$delegate;
        private static final ReplaceDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ReplaceDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ReplaceDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final WorkflowScreenDto getScreen() {
            return this.surrogate.getScreen();
        }

        public ReplaceDto(WorkflowScreenDto workflowScreenDto) {
            this(new Surrogate(workflowScreenDto));
        }

        public /* synthetic */ ReplaceDto(WorkflowScreenDto workflowScreenDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : workflowScreenDto);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public WorkflowRoute.Replace toProto() {
            WorkflowScreenDto screen = this.surrogate.getScreen();
            return new WorkflowRoute.Replace(screen != null ? screen.toProto() : null, null, 2, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[ReplaceDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ReplaceDto) && Intrinsics.areEqual(((ReplaceDto) other).surrogate, this.surrogate);
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
        /* compiled from: WorkflowRouteDto.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto$Surrogate;", "", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto;", "screen", "<init>", "(Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILidenti/service/v1/models_workflow/v1/WorkflowScreenDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identi_v1_models_workflow_v1_externalRelease", "(Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto;", "getScreen", "()Lidenti/service/v1/models_workflow/v1/WorkflowScreenDto;", "getScreen$annotations", "()V", "Companion", "$serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final WorkflowScreenDto screen;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((WorkflowScreenDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && Intrinsics.areEqual(this.screen, ((Surrogate) other).screen);
            }

            public int hashCode() {
                WorkflowScreenDto workflowScreenDto = this.screen;
                if (workflowScreenDto == null) {
                    return 0;
                }
                return workflowScreenDto.hashCode();
            }

            public String toString() {
                return "Surrogate(screen=" + this.screen + ")";
            }

            /* compiled from: WorkflowRouteDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto$Surrogate;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return WorkflowRouteDto3.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, WorkflowScreenDto workflowScreenDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.screen = null;
                } else {
                    this.screen = workflowScreenDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$identi_v1_models_workflow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                WorkflowScreenDto workflowScreenDto = self.screen;
                if (workflowScreenDto != null) {
                    output.encodeNullableSerializableElement(serialDesc, 0, WorkflowScreenDto.Serializer.INSTANCE, workflowScreenDto);
                }
            }

            public Surrogate(WorkflowScreenDto workflowScreenDto) {
                this.screen = workflowScreenDto;
            }

            public /* synthetic */ Surrogate(WorkflowScreenDto workflowScreenDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : workflowScreenDto);
            }

            public final WorkflowScreenDto getScreen() {
                return this.screen;
            }
        }

        /* compiled from: WorkflowRouteDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Replace;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion implements Dto3.Creator<ReplaceDto, WorkflowRoute.Replace> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ReplaceDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ReplaceDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ReplaceDto> getBinaryBase64Serializer() {
                return (KSerializer) ReplaceDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<WorkflowRoute.Replace> getProtoAdapter() {
                return WorkflowRoute.Replace.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ReplaceDto getZeroValue() {
                return ReplaceDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ReplaceDto fromProto(WorkflowRoute.Replace proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                WorkflowScreen screen = proto.getScreen();
                return new ReplaceDto(new Surrogate(screen != null ? WorkflowScreenDto.INSTANCE.fromProto(screen) : null), null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.WorkflowRouteDto$ReplaceDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WorkflowRouteDto.ReplaceDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ReplaceDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: WorkflowRouteDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto;", "<init>", "()V", "surrogateSerializer", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Serializer implements KSerializer<ReplaceDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/identi.service.v1.models_workflow.v1.WorkflowRoute.Replace", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ReplaceDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ReplaceDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ReplaceDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: WorkflowRouteDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ReplaceDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4189_5)
            public final String provideIntoMap() {
                return "identi.service.v1.models_workflow.v1.WorkflowRouteDto$ReplaceDto";
            }
        }
    }

    /* compiled from: WorkflowRouteDto.kt */
    @Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005#\"$%&B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0013\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006'"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto;", "Lcom/robinhood/idl/MessageDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Exit;", "Landroid/os/Parcelable;", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$Surrogate;", "surrogate", "<init>", "(Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$Surrogate;)V", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$StatusDto;", "status", "(Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$StatusDto;)V", "toProto", "()Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Exit;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$Surrogate;", "getStatus", "()Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$StatusDto;", "Companion", "Surrogate", "StatusDto", "Serializer", "MultibindingModule", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ExitDto implements Dto3<WorkflowRoute.Exit>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<ExitDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ExitDto, WorkflowRoute.Exit>> binaryBase64Serializer$delegate;
        private static final ExitDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ ExitDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private ExitDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final StatusDto getStatus() {
            return this.surrogate.getStatus();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public ExitDto(StatusDto status) {
            this(new Surrogate(status));
            Intrinsics.checkNotNullParameter(status, "status");
        }

        public /* synthetic */ ExitDto(StatusDto statusDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? StatusDto.INSTANCE.getZeroValue() : statusDto);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public WorkflowRoute.Exit toProto() {
            return new WorkflowRoute.Exit((WorkflowRoute.Exit.Status) this.surrogate.getStatus().toProto(), null, 2, 0 == true ? 1 : 0);
        }

        public String toString() {
            return "[ExitDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof ExitDto) && Intrinsics.areEqual(((ExitDto) other).surrogate, this.surrogate);
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
        /* compiled from: WorkflowRouteDto.kt */
        @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$Surrogate;", "", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$StatusDto;", "status", "<init>", "(Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$StatusDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$StatusDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$identi_v1_models_workflow_v1_externalRelease", "(Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$StatusDto;", "getStatus", "()Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$StatusDto;", "getStatus$annotations", "()V", "Companion", "$serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final StatusDto status;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((StatusDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Surrogate) && this.status == ((Surrogate) other).status;
            }

            public int hashCode() {
                return this.status.hashCode();
            }

            public String toString() {
                return "Surrogate(status=" + this.status + ")";
            }

            /* compiled from: WorkflowRouteDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$Surrogate;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return WorkflowRouteDto2.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, StatusDto statusDto, SerializationConstructorMarker serializationConstructorMarker) {
                if ((i & 1) == 0) {
                    this.status = StatusDto.INSTANCE.getZeroValue();
                } else {
                    this.status = statusDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$identi_v1_models_workflow_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (self.status != StatusDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 0, StatusDto.Serializer.INSTANCE, self.status);
                }
            }

            public Surrogate(StatusDto status) {
                Intrinsics.checkNotNullParameter(status, "status");
                this.status = status;
            }

            public final StatusDto getStatus() {
                return this.status;
            }

            public /* synthetic */ Surrogate(StatusDto statusDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? StatusDto.INSTANCE.getZeroValue() : statusDto);
            }
        }

        /* compiled from: WorkflowRouteDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Exit;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<ExitDto, WorkflowRoute.Exit> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<ExitDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ExitDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ExitDto> getBinaryBase64Serializer() {
                return (KSerializer) ExitDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<WorkflowRoute.Exit> getProtoAdapter() {
                return WorkflowRoute.Exit.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ExitDto getZeroValue() {
                return ExitDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ExitDto fromProto(WorkflowRoute.Exit proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new ExitDto(new Surrogate(StatusDto.INSTANCE.fromProto(proto.getStatus())), null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.WorkflowRouteDto$ExitDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return WorkflowRouteDto.ExitDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new ExitDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: WorkflowRouteDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$StatusDto;", "Lcom/robinhood/idl/EnumDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Exit$Status;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "STATUS_UNSPECIFIED", "WORKFLOW_STATUS_APPROVED", "WORKFLOW_STATUS_USER_PENDING", "WORKFLOW_STATUS_INTERNAL_PENDING", "WORKFLOW_STATUS_DENIED", "WORKFLOW_STATUS_CANCELLED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class StatusDto implements Dto2<WorkflowRoute.Exit.Status>, Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ StatusDto[] $VALUES;

            @JvmField
            public static final Parcelable.Creator<StatusDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<StatusDto, WorkflowRoute.Exit.Status>> binaryBase64Serializer$delegate;
            public static final StatusDto STATUS_UNSPECIFIED = new STATUS_UNSPECIFIED("STATUS_UNSPECIFIED", 0);
            public static final StatusDto WORKFLOW_STATUS_APPROVED = new WORKFLOW_STATUS_APPROVED("WORKFLOW_STATUS_APPROVED", 1);
            public static final StatusDto WORKFLOW_STATUS_USER_PENDING = new WORKFLOW_STATUS_USER_PENDING("WORKFLOW_STATUS_USER_PENDING", 2);
            public static final StatusDto WORKFLOW_STATUS_INTERNAL_PENDING = new WORKFLOW_STATUS_INTERNAL_PENDING("WORKFLOW_STATUS_INTERNAL_PENDING", 3);
            public static final StatusDto WORKFLOW_STATUS_DENIED = new WORKFLOW_STATUS_DENIED("WORKFLOW_STATUS_DENIED", 4);
            public static final StatusDto WORKFLOW_STATUS_CANCELLED = new WORKFLOW_STATUS_CANCELLED("WORKFLOW_STATUS_CANCELLED", 5);

            private static final /* synthetic */ StatusDto[] $values() {
                return new StatusDto[]{STATUS_UNSPECIFIED, WORKFLOW_STATUS_APPROVED, WORKFLOW_STATUS_USER_PENDING, WORKFLOW_STATUS_INTERNAL_PENDING, WORKFLOW_STATUS_DENIED, WORKFLOW_STATUS_CANCELLED};
            }

            public /* synthetic */ StatusDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i);
            }

            public static EnumEntries<StatusDto> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            /* compiled from: WorkflowRouteDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowRouteDto.ExitDto.StatusDto.STATUS_UNSPECIFIED", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$StatusDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Exit$Status;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class STATUS_UNSPECIFIED extends StatusDto {
                STATUS_UNSPECIFIED(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public WorkflowRoute.Exit.Status toProto() {
                    return WorkflowRoute.Exit.Status.STATUS_UNSPECIFIED;
                }
            }

            private StatusDto(String str, int i) {
            }

            static {
                StatusDto[] statusDtoArr$values = $values();
                $VALUES = statusDtoArr$values;
                $ENTRIES = EnumEntries2.enumEntries(statusDtoArr$values);
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: identi.service.v1.models_workflow.v1.WorkflowRouteDto$ExitDto$StatusDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return WorkflowRouteDto.ExitDto.StatusDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* compiled from: WorkflowRouteDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowRouteDto.ExitDto.StatusDto.WORKFLOW_STATUS_APPROVED", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$StatusDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Exit$Status;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class WORKFLOW_STATUS_APPROVED extends StatusDto {
                WORKFLOW_STATUS_APPROVED(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public WorkflowRoute.Exit.Status toProto() {
                    return WorkflowRoute.Exit.Status.WORKFLOW_STATUS_APPROVED;
                }
            }

            /* compiled from: WorkflowRouteDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowRouteDto.ExitDto.StatusDto.WORKFLOW_STATUS_USER_PENDING", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$StatusDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Exit$Status;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class WORKFLOW_STATUS_USER_PENDING extends StatusDto {
                WORKFLOW_STATUS_USER_PENDING(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public WorkflowRoute.Exit.Status toProto() {
                    return WorkflowRoute.Exit.Status.WORKFLOW_STATUS_USER_PENDING;
                }
            }

            /* compiled from: WorkflowRouteDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowRouteDto.ExitDto.StatusDto.WORKFLOW_STATUS_INTERNAL_PENDING", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$StatusDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Exit$Status;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class WORKFLOW_STATUS_INTERNAL_PENDING extends StatusDto {
                WORKFLOW_STATUS_INTERNAL_PENDING(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public WorkflowRoute.Exit.Status toProto() {
                    return WorkflowRoute.Exit.Status.WORKFLOW_STATUS_INTERNAL_PENDING;
                }
            }

            /* compiled from: WorkflowRouteDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowRouteDto.ExitDto.StatusDto.WORKFLOW_STATUS_DENIED", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$StatusDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Exit$Status;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class WORKFLOW_STATUS_DENIED extends StatusDto {
                WORKFLOW_STATUS_DENIED(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public WorkflowRoute.Exit.Status toProto() {
                    return WorkflowRoute.Exit.Status.WORKFLOW_STATUS_DENIED;
                }
            }

            /* compiled from: WorkflowRouteDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"identi/service/v1/models_workflow/v1/WorkflowRouteDto.ExitDto.StatusDto.WORKFLOW_STATUS_CANCELLED", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$StatusDto;", "toProto", "Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Exit$Status;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class WORKFLOW_STATUS_CANCELLED extends StatusDto {
                WORKFLOW_STATUS_CANCELLED(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public WorkflowRoute.Exit.Status toProto() {
                    return WorkflowRoute.Exit.Status.WORKFLOW_STATUS_CANCELLED;
                }
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
            }

            /* compiled from: WorkflowRouteDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$StatusDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$StatusDto;", "Lidenti/service/v1/models_workflow/v1/WorkflowRoute$Exit$Status;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$StatusDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto2.Creator<StatusDto, WorkflowRoute.Exit.Status> {

                /* compiled from: WorkflowRouteDto.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* loaded from: classes14.dex */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[WorkflowRoute.Exit.Status.values().length];
                        try {
                            iArr[WorkflowRoute.Exit.Status.STATUS_UNSPECIFIED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[WorkflowRoute.Exit.Status.WORKFLOW_STATUS_APPROVED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[WorkflowRoute.Exit.Status.WORKFLOW_STATUS_USER_PENDING.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[WorkflowRoute.Exit.Status.WORKFLOW_STATUS_INTERNAL_PENDING.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[WorkflowRoute.Exit.Status.WORKFLOW_STATUS_DENIED.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[WorkflowRoute.Exit.Status.WORKFLOW_STATUS_CANCELLED.ordinal()] = 6;
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

                public final KSerializer<StatusDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<StatusDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<StatusDto> getBinaryBase64Serializer() {
                    return (KSerializer) StatusDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<WorkflowRoute.Exit.Status> getProtoAdapter() {
                    return WorkflowRoute.Exit.Status.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public StatusDto getZeroValue() {
                    return StatusDto.STATUS_UNSPECIFIED;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public StatusDto fromProto(WorkflowRoute.Exit.Status proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                        case 1:
                            return StatusDto.STATUS_UNSPECIFIED;
                        case 2:
                            return StatusDto.WORKFLOW_STATUS_APPROVED;
                        case 3:
                            return StatusDto.WORKFLOW_STATUS_USER_PENDING;
                        case 4:
                            return StatusDto.WORKFLOW_STATUS_INTERNAL_PENDING;
                        case 5:
                            return StatusDto.WORKFLOW_STATUS_DENIED;
                        case 6:
                            return StatusDto.WORKFLOW_STATUS_CANCELLED;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: WorkflowRouteDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$StatusDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$StatusDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes14.dex */
            public static final class Serializer implements KSerializer<StatusDto> {
                public static final Serializer INSTANCE = new Serializer();
                private final /* synthetic */ EnumDtoSerializer<StatusDto, WorkflowRoute.Exit.Status> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/identi.service.v1.models_workflow.v1.WorkflowRoute.Exit.Status", StatusDto.getEntries(), StatusDto.INSTANCE.getZeroValue());

                @Override // kotlinx.serialization.KSerializer2
                public StatusDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return (StatusDto) this.$$delegate_0.deserialize(decoder);
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return this.$$delegate_0.getDescriptor();
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, StatusDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.$$delegate_0.serialize(encoder, (Enum) value);
                }

                private Serializer() {
                }
            }

            public static StatusDto valueOf(String str) {
                return (StatusDto) Enum.valueOf(StatusDto.class, str);
            }

            public static StatusDto[] values() {
                return (StatusDto[]) $VALUES.clone();
            }
        }

        /* compiled from: WorkflowRouteDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto;", "<init>", "()V", "surrogateSerializer", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes14.dex */
        public static final class Serializer implements KSerializer<ExitDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/identi.service.v1.models_workflow.v1.WorkflowRoute.Exit", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ExitDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public ExitDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new ExitDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
            }
        }

        /* compiled from: WorkflowRouteDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$ExitDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4189_5)
            public final String provideIntoMap() {
                return "identi.service.v1.models_workflow.v1.WorkflowRouteDto$ExitDto";
            }
        }
    }

    /* compiled from: WorkflowRouteDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto;", "<init>", "()V", "surrogateSerializer", "Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class Serializer implements KSerializer<WorkflowRouteDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/identi.service.v1.models_workflow.v1.WorkflowRoute", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, WorkflowRouteDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public WorkflowRouteDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new WorkflowRouteDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: WorkflowRouteDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/WorkflowRouteDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "identi.service.v1.models_workflow.v1.WorkflowRouteDto";
        }
    }
}
