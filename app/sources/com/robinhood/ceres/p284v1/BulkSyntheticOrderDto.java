package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.FuturesContractTypeDto;
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
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: BulkSyntheticOrderDto.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 22\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00041234B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007Bs\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u0015Jp\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\tJ\b\u0010$\u001a\u00020\u0002H\u0016J\b\u0010%\u001a\u00020\tH\u0016J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020\u0011H\u0016J\u0018\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0011H\u0016J\b\u00100\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u000b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0017R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\r\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0017R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0013\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0017R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u0017¨\u00065"}, m3636d2 = {"Lcom/robinhood/ceres/v1/BulkSyntheticOrderDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/BulkSyntheticOrder;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/BulkSyntheticOrderDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/BulkSyntheticOrderDto$Surrogate;)V", "id", "", "file_id", "employee_alias", "ref_id", "notes", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "num_failed_orders", "", "num_successful_orders", "detailed_report_file_url", "last_generated_at", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;IILjava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getFile_id", "getEmployee_alias", "getRef_id", "getNotes", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "getNum_failed_orders", "()I", "getNum_successful_orders", "getDetailed_report_file_url", "getLast_generated_at", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class BulkSyntheticOrderDto implements Dto3<BulkSyntheticOrder>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BulkSyntheticOrderDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BulkSyntheticOrderDto, BulkSyntheticOrder>> binaryBase64Serializer$delegate;
    private static final BulkSyntheticOrderDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BulkSyntheticOrderDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BulkSyntheticOrderDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final String getFile_id() {
        return this.surrogate.getFile_id();
    }

    public final String getEmployee_alias() {
        return this.surrogate.getEmployee_alias();
    }

    public final String getRef_id() {
        return this.surrogate.getRef_id();
    }

    public final String getNotes() {
        return this.surrogate.getNotes();
    }

    public final FuturesContractTypeDto getContract_type() {
        return this.surrogate.getContract_type();
    }

    public final int getNum_failed_orders() {
        return this.surrogate.getNum_failed_orders();
    }

    public final int getNum_successful_orders() {
        return this.surrogate.getNum_successful_orders();
    }

    public final String getDetailed_report_file_url() {
        return this.surrogate.getDetailed_report_file_url();
    }

    public final String getLast_generated_at() {
        return this.surrogate.getLast_generated_at();
    }

    public /* synthetic */ BulkSyntheticOrderDto(String str, String str2, String str3, String str4, String str5, FuturesContractTypeDto futuresContractTypeDto, int i, int i2, String str6, String str7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? null : str5, (i3 & 32) != 0 ? FuturesContractTypeDto.INSTANCE.getZeroValue() : futuresContractTypeDto, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? 0 : i2, (i3 & 256) != 0 ? null : str6, (i3 & 512) != 0 ? null : str7);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BulkSyntheticOrderDto(String id, String file_id, String employee_alias, String ref_id, String str, FuturesContractTypeDto contract_type, int i, int i2, String str2, String str3) {
        this(new Surrogate(id, file_id, employee_alias, ref_id, str, contract_type, i, i2, str2, str3));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(file_id, "file_id");
        Intrinsics.checkNotNullParameter(employee_alias, "employee_alias");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
    }

    public static /* synthetic */ BulkSyntheticOrderDto copy$default(BulkSyntheticOrderDto bulkSyntheticOrderDto, String str, String str2, String str3, String str4, String str5, FuturesContractTypeDto futuresContractTypeDto, int i, int i2, String str6, String str7, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = bulkSyntheticOrderDto.surrogate.getId();
        }
        if ((i3 & 2) != 0) {
            str2 = bulkSyntheticOrderDto.surrogate.getFile_id();
        }
        if ((i3 & 4) != 0) {
            str3 = bulkSyntheticOrderDto.surrogate.getEmployee_alias();
        }
        if ((i3 & 8) != 0) {
            str4 = bulkSyntheticOrderDto.surrogate.getRef_id();
        }
        if ((i3 & 16) != 0) {
            str5 = bulkSyntheticOrderDto.surrogate.getNotes();
        }
        if ((i3 & 32) != 0) {
            futuresContractTypeDto = bulkSyntheticOrderDto.surrogate.getContract_type();
        }
        if ((i3 & 64) != 0) {
            i = bulkSyntheticOrderDto.surrogate.getNum_failed_orders();
        }
        if ((i3 & 128) != 0) {
            i2 = bulkSyntheticOrderDto.surrogate.getNum_successful_orders();
        }
        if ((i3 & 256) != 0) {
            str6 = bulkSyntheticOrderDto.surrogate.getDetailed_report_file_url();
        }
        if ((i3 & 512) != 0) {
            str7 = bulkSyntheticOrderDto.surrogate.getLast_generated_at();
        }
        String str8 = str6;
        String str9 = str7;
        int i4 = i;
        int i5 = i2;
        String str10 = str5;
        FuturesContractTypeDto futuresContractTypeDto2 = futuresContractTypeDto;
        return bulkSyntheticOrderDto.copy(str, str2, str3, str4, str10, futuresContractTypeDto2, i4, i5, str8, str9);
    }

    public final BulkSyntheticOrderDto copy(String id, String file_id, String employee_alias, String ref_id, String notes, FuturesContractTypeDto contract_type, int num_failed_orders, int num_successful_orders, String detailed_report_file_url, String last_generated_at) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(file_id, "file_id");
        Intrinsics.checkNotNullParameter(employee_alias, "employee_alias");
        Intrinsics.checkNotNullParameter(ref_id, "ref_id");
        Intrinsics.checkNotNullParameter(contract_type, "contract_type");
        return new BulkSyntheticOrderDto(new Surrogate(id, file_id, employee_alias, ref_id, notes, contract_type, num_failed_orders, num_successful_orders, detailed_report_file_url, last_generated_at));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public BulkSyntheticOrder toProto() {
        return new BulkSyntheticOrder(this.surrogate.getId(), this.surrogate.getFile_id(), this.surrogate.getEmployee_alias(), this.surrogate.getRef_id(), this.surrogate.getNotes(), (FuturesContractType) this.surrogate.getContract_type().toProto(), this.surrogate.getNum_failed_orders(), this.surrogate.getNum_successful_orders(), this.surrogate.getDetailed_report_file_url(), this.surrogate.getLast_generated_at(), null, 1024, null);
    }

    public String toString() {
        return "[BulkSyntheticOrderDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BulkSyntheticOrderDto) && Intrinsics.areEqual(((BulkSyntheticOrderDto) other).surrogate, this.surrogate);
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
    /* compiled from: BulkSyntheticOrderDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 I2\u00020\u0001:\u0002HIB\u008f\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0017\b\u0002\u0010\n\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\u0017\b\u0002\u0010\u000f\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013B{\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0012\u0010\u0017J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0003HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\tHÆ\u0003J\u0018\u00106\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\u0018\u00107\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000eHÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0091\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0017\b\u0002\u0010\n\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\u0017\b\u0002\u0010\u000f\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010;\u001a\u00020<2\b\u0010=\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010>\u001a\u00020\u000bHÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001J%\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u00002\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0001¢\u0006\u0002\bGR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001c\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010\u001bR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010&R+\u0010\n\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u0019\u001a\u0004\b(\u0010)R+\u0010\u000f\u001a\u00110\u000b¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\t0\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b*\u0010\u0019\u001a\u0004\b+\u0010)R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b,\u0010\u0019\u001a\u0004\b-\u0010\u001bR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u0019\u001a\u0004\b/\u0010\u001b¨\u0006J"}, m3636d2 = {"Lcom/robinhood/ceres/v1/BulkSyntheticOrderDto$Surrogate;", "", "id", "", "file_id", "employee_alias", "ref_id", "notes", "contract_type", "Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "num_failed_orders", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/Int32Serializer;", "num_successful_orders", "detailed_report_file_url", "last_generated_at", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;IILjava/lang/String;Ljava/lang/String;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/ceres/v1/FuturesContractTypeDto;IILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getFile_id$annotations", "getFile_id", "getEmployee_alias$annotations", "getEmployee_alias", "getRef_id$annotations", "getRef_id", "getNotes$annotations", "getNotes", "getContract_type$annotations", "getContract_type", "()Lcom/robinhood/ceres/v1/FuturesContractTypeDto;", "getNum_failed_orders$annotations", "getNum_failed_orders", "()I", "getNum_successful_orders$annotations", "getNum_successful_orders", "getDetailed_report_file_url$annotations", "getDetailed_report_file_url", "getLast_generated_at$annotations", "getLast_generated_at", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_entity_v1_externalRelease", "$serializer", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final FuturesContractTypeDto contract_type;
        private final String detailed_report_file_url;
        private final String employee_alias;
        private final String file_id;
        private final String id;
        private final String last_generated_at;
        private final String notes;
        private final int num_failed_orders;
        private final int num_successful_orders;
        private final String ref_id;

        public Surrogate() {
            this((String) null, (String) null, (String) null, (String) null, (String) null, (FuturesContractTypeDto) null, 0, 0, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, String str3, String str4, String str5, FuturesContractTypeDto futuresContractTypeDto, int i, int i2, String str6, String str7, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                str = surrogate.id;
            }
            if ((i3 & 2) != 0) {
                str2 = surrogate.file_id;
            }
            if ((i3 & 4) != 0) {
                str3 = surrogate.employee_alias;
            }
            if ((i3 & 8) != 0) {
                str4 = surrogate.ref_id;
            }
            if ((i3 & 16) != 0) {
                str5 = surrogate.notes;
            }
            if ((i3 & 32) != 0) {
                futuresContractTypeDto = surrogate.contract_type;
            }
            if ((i3 & 64) != 0) {
                i = surrogate.num_failed_orders;
            }
            if ((i3 & 128) != 0) {
                i2 = surrogate.num_successful_orders;
            }
            if ((i3 & 256) != 0) {
                str6 = surrogate.detailed_report_file_url;
            }
            if ((i3 & 512) != 0) {
                str7 = surrogate.last_generated_at;
            }
            String str8 = str6;
            String str9 = str7;
            int i4 = i;
            int i5 = i2;
            String str10 = str5;
            FuturesContractTypeDto futuresContractTypeDto2 = futuresContractTypeDto;
            return surrogate.copy(str, str2, str3, str4, str10, futuresContractTypeDto2, i4, i5, str8, str9);
        }

        @SerialName("contractType")
        @JsonAnnotations2(names = {"contract_type"})
        public static /* synthetic */ void getContract_type$annotations() {
        }

        @SerialName("detailedReportFileUrl")
        @JsonAnnotations2(names = {"detailed_report_file_url"})
        public static /* synthetic */ void getDetailed_report_file_url$annotations() {
        }

        @SerialName("employeeAlias")
        @JsonAnnotations2(names = {"employee_alias"})
        public static /* synthetic */ void getEmployee_alias$annotations() {
        }

        @SerialName("fileId")
        @JsonAnnotations2(names = {"file_id"})
        public static /* synthetic */ void getFile_id$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("lastGeneratedAt")
        @JsonAnnotations2(names = {"last_generated_at"})
        public static /* synthetic */ void getLast_generated_at$annotations() {
        }

        @SerialName("notes")
        @JsonAnnotations2(names = {"notes"})
        public static /* synthetic */ void getNotes$annotations() {
        }

        @SerialName("numFailedOrders")
        @JsonAnnotations2(names = {"num_failed_orders"})
        public static /* synthetic */ void getNum_failed_orders$annotations() {
        }

        @SerialName("numSuccessfulOrders")
        @JsonAnnotations2(names = {"num_successful_orders"})
        public static /* synthetic */ void getNum_successful_orders$annotations() {
        }

        @SerialName("refId")
        @JsonAnnotations2(names = {"ref_id"})
        public static /* synthetic */ void getRef_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component10, reason: from getter */
        public final String getLast_generated_at() {
            return this.last_generated_at;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFile_id() {
            return this.file_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEmployee_alias() {
            return this.employee_alias;
        }

        /* renamed from: component4, reason: from getter */
        public final String getRef_id() {
            return this.ref_id;
        }

        /* renamed from: component5, reason: from getter */
        public final String getNotes() {
            return this.notes;
        }

        /* renamed from: component6, reason: from getter */
        public final FuturesContractTypeDto getContract_type() {
            return this.contract_type;
        }

        /* renamed from: component7, reason: from getter */
        public final int getNum_failed_orders() {
            return this.num_failed_orders;
        }

        /* renamed from: component8, reason: from getter */
        public final int getNum_successful_orders() {
            return this.num_successful_orders;
        }

        /* renamed from: component9, reason: from getter */
        public final String getDetailed_report_file_url() {
            return this.detailed_report_file_url;
        }

        public final Surrogate copy(String id, String file_id, String employee_alias, String ref_id, String notes, FuturesContractTypeDto contract_type, int num_failed_orders, int num_successful_orders, String detailed_report_file_url, String last_generated_at) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(file_id, "file_id");
            Intrinsics.checkNotNullParameter(employee_alias, "employee_alias");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(contract_type, "contract_type");
            return new Surrogate(id, file_id, employee_alias, ref_id, notes, contract_type, num_failed_orders, num_successful_orders, detailed_report_file_url, last_generated_at);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.file_id, surrogate.file_id) && Intrinsics.areEqual(this.employee_alias, surrogate.employee_alias) && Intrinsics.areEqual(this.ref_id, surrogate.ref_id) && Intrinsics.areEqual(this.notes, surrogate.notes) && this.contract_type == surrogate.contract_type && this.num_failed_orders == surrogate.num_failed_orders && this.num_successful_orders == surrogate.num_successful_orders && Intrinsics.areEqual(this.detailed_report_file_url, surrogate.detailed_report_file_url) && Intrinsics.areEqual(this.last_generated_at, surrogate.last_generated_at);
        }

        public int hashCode() {
            int iHashCode = ((((((this.id.hashCode() * 31) + this.file_id.hashCode()) * 31) + this.employee_alias.hashCode()) * 31) + this.ref_id.hashCode()) * 31;
            String str = this.notes;
            int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.contract_type.hashCode()) * 31) + Integer.hashCode(this.num_failed_orders)) * 31) + Integer.hashCode(this.num_successful_orders)) * 31;
            String str2 = this.detailed_report_file_url;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.last_generated_at;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", file_id=" + this.file_id + ", employee_alias=" + this.employee_alias + ", ref_id=" + this.ref_id + ", notes=" + this.notes + ", contract_type=" + this.contract_type + ", num_failed_orders=" + this.num_failed_orders + ", num_successful_orders=" + this.num_successful_orders + ", detailed_report_file_url=" + this.detailed_report_file_url + ", last_generated_at=" + this.last_generated_at + ")";
        }

        /* compiled from: BulkSyntheticOrderDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/BulkSyntheticOrderDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/BulkSyntheticOrderDto$Surrogate;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BulkSyntheticOrderDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, String str4, String str5, FuturesContractTypeDto futuresContractTypeDto, int i2, int i3, String str6, String str7, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.file_id = "";
            } else {
                this.file_id = str2;
            }
            if ((i & 4) == 0) {
                this.employee_alias = "";
            } else {
                this.employee_alias = str3;
            }
            if ((i & 8) == 0) {
                this.ref_id = "";
            } else {
                this.ref_id = str4;
            }
            if ((i & 16) == 0) {
                this.notes = null;
            } else {
                this.notes = str5;
            }
            if ((i & 32) == 0) {
                this.contract_type = FuturesContractTypeDto.INSTANCE.getZeroValue();
            } else {
                this.contract_type = futuresContractTypeDto;
            }
            if ((i & 64) == 0) {
                this.num_failed_orders = 0;
            } else {
                this.num_failed_orders = i2;
            }
            if ((i & 128) == 0) {
                this.num_successful_orders = 0;
            } else {
                this.num_successful_orders = i3;
            }
            if ((i & 256) == 0) {
                this.detailed_report_file_url = null;
            } else {
                this.detailed_report_file_url = str6;
            }
            if ((i & 512) == 0) {
                this.last_generated_at = null;
            } else {
                this.last_generated_at = str7;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_entity_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            if (!Intrinsics.areEqual(self.file_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.file_id);
            }
            if (!Intrinsics.areEqual(self.employee_alias, "")) {
                output.encodeStringElement(serialDesc, 2, self.employee_alias);
            }
            if (!Intrinsics.areEqual(self.ref_id, "")) {
                output.encodeStringElement(serialDesc, 3, self.ref_id);
            }
            String str = self.notes;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, str);
            }
            if (self.contract_type != FuturesContractTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, FuturesContractTypeDto.Serializer.INSTANCE, self.contract_type);
            }
            int i = self.num_failed_orders;
            if (i != 0) {
                output.encodeSerializableElement(serialDesc, 6, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i));
            }
            int i2 = self.num_successful_orders;
            if (i2 != 0) {
                output.encodeSerializableElement(serialDesc, 7, SignedIntAsNumberSerializer.INSTANCE, Integer.valueOf(i2));
            }
            String str2 = self.detailed_report_file_url;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, str2);
            }
            String str3 = self.last_generated_at;
            if (str3 != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, str3);
            }
        }

        public Surrogate(String id, String file_id, String employee_alias, String ref_id, String str, FuturesContractTypeDto contract_type, int i, int i2, String str2, String str3) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(file_id, "file_id");
            Intrinsics.checkNotNullParameter(employee_alias, "employee_alias");
            Intrinsics.checkNotNullParameter(ref_id, "ref_id");
            Intrinsics.checkNotNullParameter(contract_type, "contract_type");
            this.id = id;
            this.file_id = file_id;
            this.employee_alias = employee_alias;
            this.ref_id = ref_id;
            this.notes = str;
            this.contract_type = contract_type;
            this.num_failed_orders = i;
            this.num_successful_orders = i2;
            this.detailed_report_file_url = str2;
            this.last_generated_at = str3;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, String str4, String str5, FuturesContractTypeDto futuresContractTypeDto, int i, int i2, String str6, String str7, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? null : str5, (i3 & 32) != 0 ? FuturesContractTypeDto.INSTANCE.getZeroValue() : futuresContractTypeDto, (i3 & 64) != 0 ? 0 : i, (i3 & 128) != 0 ? 0 : i2, (i3 & 256) != 0 ? null : str6, (i3 & 512) != 0 ? null : str7);
        }

        public final String getId() {
            return this.id;
        }

        public final String getFile_id() {
            return this.file_id;
        }

        public final String getEmployee_alias() {
            return this.employee_alias;
        }

        public final String getRef_id() {
            return this.ref_id;
        }

        public final String getNotes() {
            return this.notes;
        }

        public final FuturesContractTypeDto getContract_type() {
            return this.contract_type;
        }

        public final int getNum_failed_orders() {
            return this.num_failed_orders;
        }

        public final int getNum_successful_orders() {
            return this.num_successful_orders;
        }

        public final String getDetailed_report_file_url() {
            return this.detailed_report_file_url;
        }

        public final String getLast_generated_at() {
            return this.last_generated_at;
        }
    }

    /* compiled from: BulkSyntheticOrderDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/BulkSyntheticOrderDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/BulkSyntheticOrderDto;", "Lcom/robinhood/ceres/v1/BulkSyntheticOrder;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/BulkSyntheticOrderDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<BulkSyntheticOrderDto, BulkSyntheticOrder> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BulkSyntheticOrderDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BulkSyntheticOrderDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BulkSyntheticOrderDto> getBinaryBase64Serializer() {
            return (KSerializer) BulkSyntheticOrderDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BulkSyntheticOrder> getProtoAdapter() {
            return BulkSyntheticOrder.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BulkSyntheticOrderDto getZeroValue() {
            return BulkSyntheticOrderDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BulkSyntheticOrderDto fromProto(BulkSyntheticOrder proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new BulkSyntheticOrderDto(new Surrogate(proto.getId(), proto.getFile_id(), proto.getEmployee_alias(), proto.getRef_id(), proto.getNotes(), FuturesContractTypeDto.INSTANCE.fromProto(proto.getContract_type()), proto.getNum_failed_orders(), proto.getNum_successful_orders(), proto.getDetailed_report_file_url(), proto.getLast_generated_at()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.BulkSyntheticOrderDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BulkSyntheticOrderDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new BulkSyntheticOrderDto(null, null, null, null, null, null, 0, 0, null, null, 1023, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BulkSyntheticOrderDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/BulkSyntheticOrderDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/BulkSyntheticOrderDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/BulkSyntheticOrderDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<BulkSyntheticOrderDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.entity.BulkSyntheticOrder", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BulkSyntheticOrderDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BulkSyntheticOrderDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BulkSyntheticOrderDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: BulkSyntheticOrderDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/BulkSyntheticOrderDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.BulkSyntheticOrderDto";
        }
    }
}
