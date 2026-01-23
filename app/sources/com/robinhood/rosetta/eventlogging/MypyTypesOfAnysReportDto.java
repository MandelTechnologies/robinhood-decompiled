package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
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

/* compiled from: MypyTypesOfAnysReportDto.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004()*+B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0010JL\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\tJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\tH\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\tH\u0016J\b\u0010'\u001a\u00020\tH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReport;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto$Surrogate;)V", "total_unannotated", "", "total_explicit", "total_unimported", "total_omitted_generics", "total_error", "total_special_form", "total_implementation_artifact", "(IIIIIII)V", "getTotal_unannotated", "()I", "getTotal_explicit", "getTotal_unimported", "getTotal_omitted_generics", "getTotal_error", "getTotal_special_form", "getTotal_implementation_artifact", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class MypyTypesOfAnysReportDto implements Dto3<MypyTypesOfAnysReport>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MypyTypesOfAnysReportDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MypyTypesOfAnysReportDto, MypyTypesOfAnysReport>> binaryBase64Serializer$delegate;
    private static final MypyTypesOfAnysReportDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MypyTypesOfAnysReportDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MypyTypesOfAnysReportDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final int getTotal_unannotated() {
        return this.surrogate.getTotal_unannotated();
    }

    public final int getTotal_explicit() {
        return this.surrogate.getTotal_explicit();
    }

    public final int getTotal_unimported() {
        return this.surrogate.getTotal_unimported();
    }

    public final int getTotal_omitted_generics() {
        return this.surrogate.getTotal_omitted_generics();
    }

    public final int getTotal_error() {
        return this.surrogate.getTotal_error();
    }

    public final int getTotal_special_form() {
        return this.surrogate.getTotal_special_form();
    }

    public final int getTotal_implementation_artifact() {
        return this.surrogate.getTotal_implementation_artifact();
    }

    public /* synthetic */ MypyTypesOfAnysReportDto(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? 0 : i3, (i8 & 8) != 0 ? 0 : i4, (i8 & 16) != 0 ? 0 : i5, (i8 & 32) != 0 ? 0 : i6, (i8 & 64) != 0 ? 0 : i7);
    }

    public MypyTypesOfAnysReportDto(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this(new Surrogate(i, i2, i3, i4, i5, i6, i7));
    }

    public static /* synthetic */ MypyTypesOfAnysReportDto copy$default(MypyTypesOfAnysReportDto mypyTypesOfAnysReportDto, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            i = mypyTypesOfAnysReportDto.surrogate.getTotal_unannotated();
        }
        if ((i8 & 2) != 0) {
            i2 = mypyTypesOfAnysReportDto.surrogate.getTotal_explicit();
        }
        if ((i8 & 4) != 0) {
            i3 = mypyTypesOfAnysReportDto.surrogate.getTotal_unimported();
        }
        if ((i8 & 8) != 0) {
            i4 = mypyTypesOfAnysReportDto.surrogate.getTotal_omitted_generics();
        }
        if ((i8 & 16) != 0) {
            i5 = mypyTypesOfAnysReportDto.surrogate.getTotal_error();
        }
        if ((i8 & 32) != 0) {
            i6 = mypyTypesOfAnysReportDto.surrogate.getTotal_special_form();
        }
        if ((i8 & 64) != 0) {
            i7 = mypyTypesOfAnysReportDto.surrogate.getTotal_implementation_artifact();
        }
        int i9 = i6;
        int i10 = i7;
        int i11 = i5;
        int i12 = i3;
        return mypyTypesOfAnysReportDto.copy(i, i2, i12, i4, i11, i9, i10);
    }

    public final MypyTypesOfAnysReportDto copy(int total_unannotated, int total_explicit, int total_unimported, int total_omitted_generics, int total_error, int total_special_form, int total_implementation_artifact) {
        return new MypyTypesOfAnysReportDto(new Surrogate(total_unannotated, total_explicit, total_unimported, total_omitted_generics, total_error, total_special_form, total_implementation_artifact));
    }

    @Override // com.robinhood.idl.Dto
    public MypyTypesOfAnysReport toProto() {
        return new MypyTypesOfAnysReport(this.surrogate.getTotal_unannotated(), this.surrogate.getTotal_explicit(), this.surrogate.getTotal_unimported(), this.surrogate.getTotal_omitted_generics(), this.surrogate.getTotal_error(), this.surrogate.getTotal_special_form(), this.surrogate.getTotal_implementation_artifact(), null, 128, null);
    }

    public String toString() {
        return "[MypyTypesOfAnysReportDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MypyTypesOfAnysReportDto) && Intrinsics.areEqual(((MypyTypesOfAnysReportDto) other).surrogate, this.surrogate);
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
    /* compiled from: MypyTypesOfAnysReportDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 :2\u00020\u0001:\u00029:B¶\u0001\u0012\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\u000b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006\u0012\u0017\b\u0002\u0010\f\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0012J\u0018\u0010#\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010$\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010%\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010&\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010'\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010(\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J\u0018\u0010)\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0003J¸\u0001\u0010*\u001a\u00020\u00002\u0017\b\u0002\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\n\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\u000b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00062\u0017\b\u0002\u0010\f\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u0006HÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010.\u001a\u00020\u0003HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001J%\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0001¢\u0006\u0002\b8R+\u0010\u0002\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R+\u0010\u0007\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R+\u0010\b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016R+\u0010\t\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R+\u0010\n\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R+\u0010\u000b\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0014\u001a\u0004\b \u0010\u0016R+\u0010\f\u001a\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\t0\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0016¨\u0006;"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto$Surrogate;", "", "total_unannotated", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "total_explicit", "total_unimported", "total_omitted_generics", "total_error", "total_special_form", "total_implementation_artifact", "<init>", "(IIIIIII)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIIIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTotal_unannotated$annotations", "()V", "getTotal_unannotated", "()I", "getTotal_explicit$annotations", "getTotal_explicit", "getTotal_unimported$annotations", "getTotal_unimported", "getTotal_omitted_generics$annotations", "getTotal_omitted_generics", "getTotal_error$annotations", "getTotal_error", "getTotal_special_form$annotations", "getTotal_special_form", "getTotal_implementation_artifact$annotations", "getTotal_implementation_artifact", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final int total_error;
        private final int total_explicit;
        private final int total_implementation_artifact;
        private final int total_omitted_generics;
        private final int total_special_form;
        private final int total_unannotated;
        private final int total_unimported;

        public Surrogate() {
            this(0, 0, 0, 0, 0, 0, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                i = surrogate.total_unannotated;
            }
            if ((i8 & 2) != 0) {
                i2 = surrogate.total_explicit;
            }
            if ((i8 & 4) != 0) {
                i3 = surrogate.total_unimported;
            }
            if ((i8 & 8) != 0) {
                i4 = surrogate.total_omitted_generics;
            }
            if ((i8 & 16) != 0) {
                i5 = surrogate.total_error;
            }
            if ((i8 & 32) != 0) {
                i6 = surrogate.total_special_form;
            }
            if ((i8 & 64) != 0) {
                i7 = surrogate.total_implementation_artifact;
            }
            int i9 = i6;
            int i10 = i7;
            int i11 = i5;
            int i12 = i3;
            return surrogate.copy(i, i2, i12, i4, i11, i9, i10);
        }

        @SerialName("totalError")
        @JsonAnnotations2(names = {"total_error"})
        public static /* synthetic */ void getTotal_error$annotations() {
        }

        @SerialName("totalExplicit")
        @JsonAnnotations2(names = {"total_explicit"})
        public static /* synthetic */ void getTotal_explicit$annotations() {
        }

        @SerialName("totalImplementationArtifact")
        @JsonAnnotations2(names = {"total_implementation_artifact"})
        public static /* synthetic */ void getTotal_implementation_artifact$annotations() {
        }

        @SerialName("totalOmittedGenerics")
        @JsonAnnotations2(names = {"total_omitted_generics"})
        public static /* synthetic */ void getTotal_omitted_generics$annotations() {
        }

        @SerialName("totalSpecialForm")
        @JsonAnnotations2(names = {"total_special_form"})
        public static /* synthetic */ void getTotal_special_form$annotations() {
        }

        @SerialName("totalUnannotated")
        @JsonAnnotations2(names = {"total_unannotated"})
        public static /* synthetic */ void getTotal_unannotated$annotations() {
        }

        @SerialName("totalUnimported")
        @JsonAnnotations2(names = {"total_unimported"})
        public static /* synthetic */ void getTotal_unimported$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final int getTotal_unannotated() {
            return this.total_unannotated;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTotal_explicit() {
            return this.total_explicit;
        }

        /* renamed from: component3, reason: from getter */
        public final int getTotal_unimported() {
            return this.total_unimported;
        }

        /* renamed from: component4, reason: from getter */
        public final int getTotal_omitted_generics() {
            return this.total_omitted_generics;
        }

        /* renamed from: component5, reason: from getter */
        public final int getTotal_error() {
            return this.total_error;
        }

        /* renamed from: component6, reason: from getter */
        public final int getTotal_special_form() {
            return this.total_special_form;
        }

        /* renamed from: component7, reason: from getter */
        public final int getTotal_implementation_artifact() {
            return this.total_implementation_artifact;
        }

        public final Surrogate copy(int total_unannotated, int total_explicit, int total_unimported, int total_omitted_generics, int total_error, int total_special_form, int total_implementation_artifact) {
            return new Surrogate(total_unannotated, total_explicit, total_unimported, total_omitted_generics, total_error, total_special_form, total_implementation_artifact);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.total_unannotated == surrogate.total_unannotated && this.total_explicit == surrogate.total_explicit && this.total_unimported == surrogate.total_unimported && this.total_omitted_generics == surrogate.total_omitted_generics && this.total_error == surrogate.total_error && this.total_special_form == surrogate.total_special_form && this.total_implementation_artifact == surrogate.total_implementation_artifact;
        }

        public int hashCode() {
            return (((((((((((Integer.hashCode(this.total_unannotated) * 31) + Integer.hashCode(this.total_explicit)) * 31) + Integer.hashCode(this.total_unimported)) * 31) + Integer.hashCode(this.total_omitted_generics)) * 31) + Integer.hashCode(this.total_error)) * 31) + Integer.hashCode(this.total_special_form)) * 31) + Integer.hashCode(this.total_implementation_artifact);
        }

        public String toString() {
            return "Surrogate(total_unannotated=" + this.total_unannotated + ", total_explicit=" + this.total_explicit + ", total_unimported=" + this.total_unimported + ", total_omitted_generics=" + this.total_omitted_generics + ", total_error=" + this.total_error + ", total_special_form=" + this.total_special_form + ", total_implementation_artifact=" + this.total_implementation_artifact + ")";
        }

        /* compiled from: MypyTypesOfAnysReportDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MypyTypesOfAnysReportDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.total_unannotated = 0;
            } else {
                this.total_unannotated = i2;
            }
            if ((i & 2) == 0) {
                this.total_explicit = 0;
            } else {
                this.total_explicit = i3;
            }
            if ((i & 4) == 0) {
                this.total_unimported = 0;
            } else {
                this.total_unimported = i4;
            }
            if ((i & 8) == 0) {
                this.total_omitted_generics = 0;
            } else {
                this.total_omitted_generics = i5;
            }
            if ((i & 16) == 0) {
                this.total_error = 0;
            } else {
                this.total_error = i6;
            }
            if ((i & 32) == 0) {
                this.total_special_form = 0;
            } else {
                this.total_special_form = i7;
            }
            if ((i & 64) == 0) {
                this.total_implementation_artifact = 0;
            } else {
                this.total_implementation_artifact = i8;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            int i = self.total_unannotated;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 0, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.total_explicit;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 1, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            int i3 = self.total_unimported;
            if (i3 != 0) {
                output.encodeSerializableElement(serialDesc, 2, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i3));
            }
            int i4 = self.total_omitted_generics;
            if (i4 != 0) {
                output.encodeSerializableElement(serialDesc, 3, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i4));
            }
            int i5 = self.total_error;
            if (i5 != 0) {
                output.encodeSerializableElement(serialDesc, 4, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i5));
            }
            int i6 = self.total_special_form;
            if (i6 != 0) {
                output.encodeSerializableElement(serialDesc, 5, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i6));
            }
            int i7 = self.total_implementation_artifact;
            if (i7 != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i7));
            }
        }

        public Surrogate(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
            this.total_unannotated = i;
            this.total_explicit = i2;
            this.total_unimported = i3;
            this.total_omitted_generics = i4;
            this.total_error = i5;
            this.total_special_form = i6;
            this.total_implementation_artifact = i7;
        }

        public /* synthetic */ Surrogate(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
            this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? 0 : i2, (i8 & 4) != 0 ? 0 : i3, (i8 & 8) != 0 ? 0 : i4, (i8 & 16) != 0 ? 0 : i5, (i8 & 32) != 0 ? 0 : i6, (i8 & 64) != 0 ? 0 : i7);
        }

        public final int getTotal_unannotated() {
            return this.total_unannotated;
        }

        public final int getTotal_explicit() {
            return this.total_explicit;
        }

        public final int getTotal_unimported() {
            return this.total_unimported;
        }

        public final int getTotal_omitted_generics() {
            return this.total_omitted_generics;
        }

        public final int getTotal_error() {
            return this.total_error;
        }

        public final int getTotal_special_form() {
            return this.total_special_form;
        }

        public final int getTotal_implementation_artifact() {
            return this.total_implementation_artifact;
        }
    }

    /* compiled from: MypyTypesOfAnysReportDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto;", "Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReport;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<MypyTypesOfAnysReportDto, MypyTypesOfAnysReport> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MypyTypesOfAnysReportDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MypyTypesOfAnysReportDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MypyTypesOfAnysReportDto> getBinaryBase64Serializer() {
            return (KSerializer) MypyTypesOfAnysReportDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MypyTypesOfAnysReport> getProtoAdapter() {
            return MypyTypesOfAnysReport.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MypyTypesOfAnysReportDto getZeroValue() {
            return MypyTypesOfAnysReportDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MypyTypesOfAnysReportDto fromProto(MypyTypesOfAnysReport proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new MypyTypesOfAnysReportDto(new Surrogate(proto.getTotal_unannotated(), proto.getTotal_explicit(), proto.getTotal_unimported(), proto.getTotal_omitted_generics(), proto.getTotal_error(), proto.getTotal_special_form(), proto.getTotal_implementation_artifact()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.MypyTypesOfAnysReportDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MypyTypesOfAnysReportDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new MypyTypesOfAnysReportDto(0, 0, 0, 0, 0, 0, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MypyTypesOfAnysReportDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<MypyTypesOfAnysReportDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.MypyTypesOfAnysReport", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MypyTypesOfAnysReportDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MypyTypesOfAnysReportDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MypyTypesOfAnysReportDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MypyTypesOfAnysReportDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MypyTypesOfAnysReportDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.MypyTypesOfAnysReportDto";
        }
    }
}
