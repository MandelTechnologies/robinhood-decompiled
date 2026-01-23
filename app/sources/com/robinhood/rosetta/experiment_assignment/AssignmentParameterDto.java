package com.robinhood.rosetta.experiment_assignment;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.libtradingtrends.contracts.TradingTrendsType;
import com.robinhood.rosetta.experiment_assignment.AssignmentParameter;
import com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: AssignmentParameterDto.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 :2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00079:;<=>?B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B}\b\u0016\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0006\u0010\u0019Jz\u0010+\u001a\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u0018J\b\u0010,\u001a\u00020\u0002H\u0016J\b\u0010-\u001a\u00020\nH\u0016J\u0013\u0010.\u001a\u00020\u00132\b\u0010/\u001a\u0004\u0018\u000100H\u0096\u0002J\b\u00101\u001a\u000202H\u0016J\u0018\u00103\u001a\u0002042\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000202H\u0016J\b\u00108\u001a\u000202H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b \u0010\u001fR\u0011\u0010\u000f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\u0014\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b&\u0010%R\u0011\u0010\u0015\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0011\u0010\u0016\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010\u001fR\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006@"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$Surrogate;)V", "experiment_names", "", "", "entity_type", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$EntityTypeDto;", "platform", "app_version", "os_version", "origin", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "assignment_logging", "", "whitelist_lookup", "trigger", InstantCashConstants.ACCOUNT_TYPE_KEY, "application", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$ApplicationDto;", "(Ljava/util/List;Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$EntityTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;ZZZLjava/lang/String;Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$ApplicationDto;)V", "getExperiment_names", "()Ljava/util/List;", "getEntity_type", "()Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$EntityTypeDto;", "getPlatform", "()Ljava/lang/String;", "getApp_version", "getOs_version", "getOrigin", "()Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "getAssignment_logging", "()Z", "getWhitelist_lookup", "getTrigger", "getAccount_type", "getApplication", "()Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$ApplicationDto;", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "EntityTypeDto", "UserOriginDto", "ApplicationDto", "Serializer", "MultibindingModule", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes26.dex */
public final class AssignmentParameterDto implements Dto3<AssignmentParameter>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AssignmentParameterDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AssignmentParameterDto, AssignmentParameter>> binaryBase64Serializer$delegate;
    private static final AssignmentParameterDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AssignmentParameterDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AssignmentParameterDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<String> getExperiment_names() {
        return this.surrogate.getExperiment_names();
    }

    public final EntityTypeDto getEntity_type() {
        return this.surrogate.getEntity_type();
    }

    public final String getPlatform() {
        return this.surrogate.getPlatform();
    }

    public final String getApp_version() {
        return this.surrogate.getApp_version();
    }

    public final String getOs_version() {
        return this.surrogate.getOs_version();
    }

    public final UserOriginDto getOrigin() {
        return this.surrogate.getOrigin();
    }

    public final boolean getAssignment_logging() {
        return this.surrogate.getAssignment_logging();
    }

    public final boolean getWhitelist_lookup() {
        return this.surrogate.getWhitelist_lookup();
    }

    public final boolean getTrigger() {
        return this.surrogate.getTrigger();
    }

    public final String getAccount_type() {
        return this.surrogate.getAccount_type();
    }

    public final ApplicationDto getApplication() {
        return this.surrogate.getApplication();
    }

    public /* synthetic */ AssignmentParameterDto(List list, EntityTypeDto entityTypeDto, String str, String str2, String str3, UserOriginDto userOriginDto, boolean z, boolean z2, boolean z3, String str4, ApplicationDto applicationDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? EntityTypeDto.INSTANCE.getZeroValue() : entityTypeDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? UserOriginDto.INSTANCE.getZeroValue() : userOriginDto, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? "" : str4, (i & 1024) != 0 ? ApplicationDto.INSTANCE.getZeroValue() : applicationDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AssignmentParameterDto(List<String> experiment_names, EntityTypeDto entity_type, String platform, String app_version, String os_version, UserOriginDto origin, boolean z, boolean z2, boolean z3, String account_type, ApplicationDto application) {
        this(new Surrogate(experiment_names, entity_type, platform, app_version, os_version, origin, z, z2, z3, account_type, application));
        Intrinsics.checkNotNullParameter(experiment_names, "experiment_names");
        Intrinsics.checkNotNullParameter(entity_type, "entity_type");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(os_version, "os_version");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(application, "application");
    }

    public static /* synthetic */ AssignmentParameterDto copy$default(AssignmentParameterDto assignmentParameterDto, List list, EntityTypeDto entityTypeDto, String str, String str2, String str3, UserOriginDto userOriginDto, boolean z, boolean z2, boolean z3, String str4, ApplicationDto applicationDto, int i, Object obj) {
        if ((i & 1) != 0) {
            list = assignmentParameterDto.surrogate.getExperiment_names();
        }
        if ((i & 2) != 0) {
            entityTypeDto = assignmentParameterDto.surrogate.getEntity_type();
        }
        if ((i & 4) != 0) {
            str = assignmentParameterDto.surrogate.getPlatform();
        }
        if ((i & 8) != 0) {
            str2 = assignmentParameterDto.surrogate.getApp_version();
        }
        if ((i & 16) != 0) {
            str3 = assignmentParameterDto.surrogate.getOs_version();
        }
        if ((i & 32) != 0) {
            userOriginDto = assignmentParameterDto.surrogate.getOrigin();
        }
        if ((i & 64) != 0) {
            z = assignmentParameterDto.surrogate.getAssignment_logging();
        }
        if ((i & 128) != 0) {
            z2 = assignmentParameterDto.surrogate.getWhitelist_lookup();
        }
        if ((i & 256) != 0) {
            z3 = assignmentParameterDto.surrogate.getTrigger();
        }
        if ((i & 512) != 0) {
            str4 = assignmentParameterDto.surrogate.getAccount_type();
        }
        if ((i & 1024) != 0) {
            applicationDto = assignmentParameterDto.surrogate.getApplication();
        }
        String str5 = str4;
        ApplicationDto applicationDto2 = applicationDto;
        boolean z4 = z2;
        boolean z5 = z3;
        UserOriginDto userOriginDto2 = userOriginDto;
        boolean z6 = z;
        String str6 = str3;
        String str7 = str;
        return assignmentParameterDto.copy(list, entityTypeDto, str7, str2, str6, userOriginDto2, z6, z4, z5, str5, applicationDto2);
    }

    public final AssignmentParameterDto copy(List<String> experiment_names, EntityTypeDto entity_type, String platform, String app_version, String os_version, UserOriginDto origin, boolean assignment_logging, boolean whitelist_lookup, boolean trigger, String account_type, ApplicationDto application) {
        Intrinsics.checkNotNullParameter(experiment_names, "experiment_names");
        Intrinsics.checkNotNullParameter(entity_type, "entity_type");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(os_version, "os_version");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(application, "application");
        return new AssignmentParameterDto(new Surrogate(experiment_names, entity_type, platform, app_version, os_version, origin, assignment_logging, whitelist_lookup, trigger, account_type, application));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public AssignmentParameter toProto() {
        List<String> experiment_names = this.surrogate.getExperiment_names();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(experiment_names, 10));
        Iterator<T> it = experiment_names.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new AssignmentParameter(arrayList, (AssignmentParameter.EntityType) this.surrogate.getEntity_type().toProto(), this.surrogate.getPlatform(), this.surrogate.getApp_version(), this.surrogate.getOs_version(), (AssignmentParameter.UserOrigin) this.surrogate.getOrigin().toProto(), this.surrogate.getAssignment_logging(), this.surrogate.getWhitelist_lookup(), this.surrogate.getTrigger(), this.surrogate.getAccount_type(), (AssignmentParameter.Application) this.surrogate.getApplication().toProto(), null, 2048, null);
    }

    public String toString() {
        return "[AssignmentParameterDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AssignmentParameterDto) && Intrinsics.areEqual(((AssignmentParameterDto) other).surrogate, this.surrogate);
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
    /* compiled from: AssignmentParameterDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 P2\u00020\u0001:\u0002OPB{\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0013\u0010\u0019J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0006HÆ\u0003J\t\u00109\u001a\u00020\u0004HÆ\u0003J\t\u0010:\u001a\u00020\u0004HÆ\u0003J\t\u0010;\u001a\u00020\u0004HÆ\u0003J\t\u0010<\u001a\u00020\u000bHÆ\u0003J\t\u0010=\u001a\u00020\rHÆ\u0003J\t\u0010>\u001a\u00020\rHÆ\u0003J\t\u0010?\u001a\u00020\rHÆ\u0003J\t\u0010@\u001a\u00020\u0004HÆ\u0003J\t\u0010A\u001a\u00020\u0012HÆ\u0003J}\u0010B\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u0012HÆ\u0001J\u0013\u0010C\u001a\u00020\r2\b\u0010D\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010E\u001a\u00020\u0016HÖ\u0001J\t\u0010F\u001a\u00020\u0004HÖ\u0001J%\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u00002\u0006\u0010J\u001a\u00020K2\u0006\u0010L\u001a\u00020MH\u0001¢\u0006\u0002\bNR\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010#R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u001b\u001a\u0004\b%\u0010#R\u001c\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b&\u0010\u001b\u001a\u0004\b'\u0010#R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u001b\u001a\u0004\b)\u0010*R\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001b\u001a\u0004\b,\u0010-R\u001c\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b.\u0010\u001b\u001a\u0004\b/\u0010-R\u001c\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b0\u0010\u001b\u001a\u0004\b1\u0010-R\u001c\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b2\u0010\u001b\u001a\u0004\b3\u0010#R\u001c\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b4\u0010\u001b\u001a\u0004\b5\u00106¨\u0006Q"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$Surrogate;", "", "experiment_names", "", "", "entity_type", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$EntityTypeDto;", "platform", "app_version", "os_version", "origin", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "assignment_logging", "", "whitelist_lookup", "trigger", InstantCashConstants.ACCOUNT_TYPE_KEY, "application", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$ApplicationDto;", "<init>", "(Ljava/util/List;Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$EntityTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;ZZZLjava/lang/String;Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$ApplicationDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$EntityTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;ZZZLjava/lang/String;Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$ApplicationDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getExperiment_names$annotations", "()V", "getExperiment_names", "()Ljava/util/List;", "getEntity_type$annotations", "getEntity_type", "()Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$EntityTypeDto;", "getPlatform$annotations", "getPlatform", "()Ljava/lang/String;", "getApp_version$annotations", "getApp_version", "getOs_version$annotations", "getOs_version", "getOrigin$annotations", "getOrigin", "()Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "getAssignment_logging$annotations", "getAssignment_logging", "()Z", "getWhitelist_lookup$annotations", "getWhitelist_lookup", "getTrigger$annotations", "getTrigger", "getAccount_type$annotations", "getAccount_type", "getApplication$annotations", "getApplication", "()Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$ApplicationDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$experiment_assignment_service_externalRelease", "$serializer", "Companion", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String account_type;
        private final String app_version;
        private final ApplicationDto application;
        private final boolean assignment_logging;
        private final EntityTypeDto entity_type;
        private final List<String> experiment_names;
        private final UserOriginDto origin;
        private final String os_version;
        private final String platform;
        private final boolean trigger;
        private final boolean whitelist_lookup;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssignmentParameterDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null, null, null, null, null, null, null, null};

        public Surrogate() {
            this((List) null, (EntityTypeDto) null, (String) null, (String) null, (String) null, (UserOriginDto) null, false, false, false, (String) null, (ApplicationDto) null, 2047, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, List list, EntityTypeDto entityTypeDto, String str, String str2, String str3, UserOriginDto userOriginDto, boolean z, boolean z2, boolean z3, String str4, ApplicationDto applicationDto, int i, Object obj) {
            if ((i & 1) != 0) {
                list = surrogate.experiment_names;
            }
            if ((i & 2) != 0) {
                entityTypeDto = surrogate.entity_type;
            }
            if ((i & 4) != 0) {
                str = surrogate.platform;
            }
            if ((i & 8) != 0) {
                str2 = surrogate.app_version;
            }
            if ((i & 16) != 0) {
                str3 = surrogate.os_version;
            }
            if ((i & 32) != 0) {
                userOriginDto = surrogate.origin;
            }
            if ((i & 64) != 0) {
                z = surrogate.assignment_logging;
            }
            if ((i & 128) != 0) {
                z2 = surrogate.whitelist_lookup;
            }
            if ((i & 256) != 0) {
                z3 = surrogate.trigger;
            }
            if ((i & 512) != 0) {
                str4 = surrogate.account_type;
            }
            if ((i & 1024) != 0) {
                applicationDto = surrogate.application;
            }
            String str5 = str4;
            ApplicationDto applicationDto2 = applicationDto;
            boolean z4 = z2;
            boolean z5 = z3;
            UserOriginDto userOriginDto2 = userOriginDto;
            boolean z6 = z;
            String str6 = str3;
            String str7 = str;
            return surrogate.copy(list, entityTypeDto, str7, str2, str6, userOriginDto2, z6, z4, z5, str5, applicationDto2);
        }

        @SerialName("accountType")
        @JsonAnnotations2(names = {InstantCashConstants.ACCOUNT_TYPE_KEY})
        public static /* synthetic */ void getAccount_type$annotations() {
        }

        @SerialName("appVersion")
        @JsonAnnotations2(names = {"app_version"})
        public static /* synthetic */ void getApp_version$annotations() {
        }

        @SerialName("application")
        @JsonAnnotations2(names = {"application"})
        public static /* synthetic */ void getApplication$annotations() {
        }

        @SerialName("assignmentLogging")
        @JsonAnnotations2(names = {"assignment_logging"})
        public static /* synthetic */ void getAssignment_logging$annotations() {
        }

        @SerialName("entityType")
        @JsonAnnotations2(names = {"entity_type"})
        public static /* synthetic */ void getEntity_type$annotations() {
        }

        @SerialName("experimentNames")
        @JsonAnnotations2(names = {"experiment_names"})
        public static /* synthetic */ void getExperiment_names$annotations() {
        }

        @SerialName("origin")
        @JsonAnnotations2(names = {"origin"})
        public static /* synthetic */ void getOrigin$annotations() {
        }

        @SerialName("osVersion")
        @JsonAnnotations2(names = {"os_version"})
        public static /* synthetic */ void getOs_version$annotations() {
        }

        @SerialName("platform")
        @JsonAnnotations2(names = {"platform"})
        public static /* synthetic */ void getPlatform$annotations() {
        }

        @SerialName("trigger")
        @JsonAnnotations2(names = {"trigger"})
        public static /* synthetic */ void getTrigger$annotations() {
        }

        @SerialName("whitelistLookup")
        @JsonAnnotations2(names = {"whitelist_lookup"})
        public static /* synthetic */ void getWhitelist_lookup$annotations() {
        }

        public final List<String> component1() {
            return this.experiment_names;
        }

        /* renamed from: component10, reason: from getter */
        public final String getAccount_type() {
            return this.account_type;
        }

        /* renamed from: component11, reason: from getter */
        public final ApplicationDto getApplication() {
            return this.application;
        }

        /* renamed from: component2, reason: from getter */
        public final EntityTypeDto getEntity_type() {
            return this.entity_type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getPlatform() {
            return this.platform;
        }

        /* renamed from: component4, reason: from getter */
        public final String getApp_version() {
            return this.app_version;
        }

        /* renamed from: component5, reason: from getter */
        public final String getOs_version() {
            return this.os_version;
        }

        /* renamed from: component6, reason: from getter */
        public final UserOriginDto getOrigin() {
            return this.origin;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getAssignment_logging() {
            return this.assignment_logging;
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getWhitelist_lookup() {
            return this.whitelist_lookup;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getTrigger() {
            return this.trigger;
        }

        public final Surrogate copy(List<String> experiment_names, EntityTypeDto entity_type, String platform, String app_version, String os_version, UserOriginDto origin, boolean assignment_logging, boolean whitelist_lookup, boolean trigger, String account_type, ApplicationDto application) {
            Intrinsics.checkNotNullParameter(experiment_names, "experiment_names");
            Intrinsics.checkNotNullParameter(entity_type, "entity_type");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(app_version, "app_version");
            Intrinsics.checkNotNullParameter(os_version, "os_version");
            Intrinsics.checkNotNullParameter(origin, "origin");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(application, "application");
            return new Surrogate(experiment_names, entity_type, platform, app_version, os_version, origin, assignment_logging, whitelist_lookup, trigger, account_type, application);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.experiment_names, surrogate.experiment_names) && this.entity_type == surrogate.entity_type && Intrinsics.areEqual(this.platform, surrogate.platform) && Intrinsics.areEqual(this.app_version, surrogate.app_version) && Intrinsics.areEqual(this.os_version, surrogate.os_version) && this.origin == surrogate.origin && this.assignment_logging == surrogate.assignment_logging && this.whitelist_lookup == surrogate.whitelist_lookup && this.trigger == surrogate.trigger && Intrinsics.areEqual(this.account_type, surrogate.account_type) && this.application == surrogate.application;
        }

        public int hashCode() {
            return (((((((((((((((((((this.experiment_names.hashCode() * 31) + this.entity_type.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.app_version.hashCode()) * 31) + this.os_version.hashCode()) * 31) + this.origin.hashCode()) * 31) + Boolean.hashCode(this.assignment_logging)) * 31) + Boolean.hashCode(this.whitelist_lookup)) * 31) + Boolean.hashCode(this.trigger)) * 31) + this.account_type.hashCode()) * 31) + this.application.hashCode();
        }

        public String toString() {
            return "Surrogate(experiment_names=" + this.experiment_names + ", entity_type=" + this.entity_type + ", platform=" + this.platform + ", app_version=" + this.app_version + ", os_version=" + this.os_version + ", origin=" + this.origin + ", assignment_logging=" + this.assignment_logging + ", whitelist_lookup=" + this.whitelist_lookup + ", trigger=" + this.trigger + ", account_type=" + this.account_type + ", application=" + this.application + ")";
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$Surrogate;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AssignmentParameterDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, List list, EntityTypeDto entityTypeDto, String str, String str2, String str3, UserOriginDto userOriginDto, boolean z, boolean z2, boolean z3, String str4, ApplicationDto applicationDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.experiment_names = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.entity_type = EntityTypeDto.INSTANCE.getZeroValue();
            } else {
                this.entity_type = entityTypeDto;
            }
            if ((i & 4) == 0) {
                this.platform = "";
            } else {
                this.platform = str;
            }
            if ((i & 8) == 0) {
                this.app_version = "";
            } else {
                this.app_version = str2;
            }
            if ((i & 16) == 0) {
                this.os_version = "";
            } else {
                this.os_version = str3;
            }
            if ((i & 32) == 0) {
                this.origin = UserOriginDto.INSTANCE.getZeroValue();
            } else {
                this.origin = userOriginDto;
            }
            if ((i & 64) == 0) {
                this.assignment_logging = false;
            } else {
                this.assignment_logging = z;
            }
            if ((i & 128) == 0) {
                this.whitelist_lookup = false;
            } else {
                this.whitelist_lookup = z2;
            }
            if ((i & 256) == 0) {
                this.trigger = false;
            } else {
                this.trigger = z3;
            }
            if ((i & 512) == 0) {
                this.account_type = "";
            } else {
                this.account_type = str4;
            }
            if ((i & 1024) == 0) {
                this.application = ApplicationDto.INSTANCE.getZeroValue();
            } else {
                this.application = applicationDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$experiment_assignment_service_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.experiment_names, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.experiment_names);
            }
            if (self.entity_type != EntityTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, EntityTypeDto.Serializer.INSTANCE, self.entity_type);
            }
            if (!Intrinsics.areEqual(self.platform, "")) {
                output.encodeStringElement(serialDesc, 2, self.platform);
            }
            if (!Intrinsics.areEqual(self.app_version, "")) {
                output.encodeStringElement(serialDesc, 3, self.app_version);
            }
            if (!Intrinsics.areEqual(self.os_version, "")) {
                output.encodeStringElement(serialDesc, 4, self.os_version);
            }
            if (self.origin != UserOriginDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, UserOriginDto.Serializer.INSTANCE, self.origin);
            }
            boolean z = self.assignment_logging;
            if (z) {
                output.encodeBooleanElement(serialDesc, 6, z);
            }
            boolean z2 = self.whitelist_lookup;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 7, z2);
            }
            boolean z3 = self.trigger;
            if (z3) {
                output.encodeBooleanElement(serialDesc, 8, z3);
            }
            if (!Intrinsics.areEqual(self.account_type, "")) {
                output.encodeStringElement(serialDesc, 9, self.account_type);
            }
            if (self.application != ApplicationDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 10, ApplicationDto.Serializer.INSTANCE, self.application);
            }
        }

        public Surrogate(List<String> experiment_names, EntityTypeDto entity_type, String platform, String app_version, String os_version, UserOriginDto origin, boolean z, boolean z2, boolean z3, String account_type, ApplicationDto application) {
            Intrinsics.checkNotNullParameter(experiment_names, "experiment_names");
            Intrinsics.checkNotNullParameter(entity_type, "entity_type");
            Intrinsics.checkNotNullParameter(platform, "platform");
            Intrinsics.checkNotNullParameter(app_version, "app_version");
            Intrinsics.checkNotNullParameter(os_version, "os_version");
            Intrinsics.checkNotNullParameter(origin, "origin");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            Intrinsics.checkNotNullParameter(application, "application");
            this.experiment_names = experiment_names;
            this.entity_type = entity_type;
            this.platform = platform;
            this.app_version = app_version;
            this.os_version = os_version;
            this.origin = origin;
            this.assignment_logging = z;
            this.whitelist_lookup = z2;
            this.trigger = z3;
            this.account_type = account_type;
            this.application = application;
        }

        public final List<String> getExperiment_names() {
            return this.experiment_names;
        }

        public /* synthetic */ Surrogate(List list, EntityTypeDto entityTypeDto, String str, String str2, String str3, UserOriginDto userOriginDto, boolean z, boolean z2, boolean z3, String str4, ApplicationDto applicationDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? EntityTypeDto.INSTANCE.getZeroValue() : entityTypeDto, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? UserOriginDto.INSTANCE.getZeroValue() : userOriginDto, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? "" : str4, (i & 1024) != 0 ? ApplicationDto.INSTANCE.getZeroValue() : applicationDto);
        }

        public final EntityTypeDto getEntity_type() {
            return this.entity_type;
        }

        public final String getPlatform() {
            return this.platform;
        }

        public final String getApp_version() {
            return this.app_version;
        }

        public final String getOs_version() {
            return this.os_version;
        }

        public final UserOriginDto getOrigin() {
            return this.origin;
        }

        public final boolean getAssignment_logging() {
            return this.assignment_logging;
        }

        public final boolean getWhitelist_lookup() {
            return this.whitelist_lookup;
        }

        public final boolean getTrigger() {
            return this.trigger;
        }

        public final String getAccount_type() {
            return this.account_type;
        }

        public final ApplicationDto getApplication() {
            return this.application;
        }
    }

    /* compiled from: AssignmentParameterDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AssignmentParameterDto, AssignmentParameter> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AssignmentParameterDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AssignmentParameterDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AssignmentParameterDto> getBinaryBase64Serializer() {
            return (KSerializer) AssignmentParameterDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AssignmentParameter> getProtoAdapter() {
            return AssignmentParameter.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AssignmentParameterDto getZeroValue() {
            return AssignmentParameterDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AssignmentParameterDto fromProto(AssignmentParameter proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<String> experiment_names = proto.getExperiment_names();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(experiment_names, 10));
            Iterator<T> it = experiment_names.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new AssignmentParameterDto(new Surrogate(arrayList, EntityTypeDto.INSTANCE.fromProto(proto.getEntity_type()), proto.getPlatform(), proto.getApp_version(), proto.getOs_version(), UserOriginDto.INSTANCE.fromProto(proto.getOrigin()), proto.getAssignment_logging(), proto.getWhitelist_lookup(), proto.getTrigger(), proto.getAccount_type(), ApplicationDto.INSTANCE.fromProto(proto.getApplication())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssignmentParameterDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new AssignmentParameterDto(null, null, null, null, null, null, false, false, false, null, null, 2047, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AssignmentParameterDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$EntityTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$EntityType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "USER_UUID", "DEVICE_ID", "EMAIL", "MO_USER_UUID", "NCW_ID", "ACCOUNT_NUMBER", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EntityTypeDto implements Dto2<AssignmentParameter.EntityType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntityTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EntityTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EntityTypeDto, AssignmentParameter.EntityType>> binaryBase64Serializer$delegate;
        public static final EntityTypeDto USER_UUID = new USER_UUID("USER_UUID", 0);
        public static final EntityTypeDto DEVICE_ID = new DEVICE_ID("DEVICE_ID", 1);
        public static final EntityTypeDto EMAIL = new EMAIL("EMAIL", 2);
        public static final EntityTypeDto MO_USER_UUID = new MO_USER_UUID("MO_USER_UUID", 3);
        public static final EntityTypeDto NCW_ID = new NCW_ID("NCW_ID", 4);
        public static final EntityTypeDto ACCOUNT_NUMBER = new ACCOUNT_NUMBER("ACCOUNT_NUMBER", 5);

        private static final /* synthetic */ EntityTypeDto[] $values() {
            return new EntityTypeDto[]{USER_UUID, DEVICE_ID, EMAIL, MO_USER_UUID, NCW_ID, ACCOUNT_NUMBER};
        }

        public /* synthetic */ EntityTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<EntityTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.EntityTypeDto.USER_UUID", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$EntityTypeDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$EntityType;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class USER_UUID extends EntityTypeDto {
            USER_UUID(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.EntityType toProto() {
                return AssignmentParameter.EntityType.USER_UUID;
            }
        }

        private EntityTypeDto(String str, int i) {
        }

        static {
            EntityTypeDto[] entityTypeDtoArr$values = $values();
            $VALUES = entityTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entityTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$EntityTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssignmentParameterDto.EntityTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.EntityTypeDto.DEVICE_ID", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$EntityTypeDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$EntityType;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEVICE_ID extends EntityTypeDto {
            DEVICE_ID(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.EntityType toProto() {
                return AssignmentParameter.EntityType.DEVICE_ID;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.EntityTypeDto.EMAIL", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$EntityTypeDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$EntityType;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EMAIL extends EntityTypeDto {
            EMAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.EntityType toProto() {
                return AssignmentParameter.EntityType.EMAIL;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.EntityTypeDto.MO_USER_UUID", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$EntityTypeDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$EntityType;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MO_USER_UUID extends EntityTypeDto {
            MO_USER_UUID(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.EntityType toProto() {
                return AssignmentParameter.EntityType.MO_USER_UUID;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.EntityTypeDto.NCW_ID", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$EntityTypeDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$EntityType;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NCW_ID extends EntityTypeDto {
            NCW_ID(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.EntityType toProto() {
                return AssignmentParameter.EntityType.NCW_ID;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.EntityTypeDto.ACCOUNT_NUMBER", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$EntityTypeDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$EntityType;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ACCOUNT_NUMBER extends EntityTypeDto {
            ACCOUNT_NUMBER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.EntityType toProto() {
                return AssignmentParameter.EntityType.ACCOUNT_NUMBER;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$EntityTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$EntityTypeDto;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$EntityType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$EntityTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EntityTypeDto, AssignmentParameter.EntityType> {

            /* compiled from: AssignmentParameterDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AssignmentParameter.EntityType.values().length];
                    try {
                        iArr[AssignmentParameter.EntityType.USER_UUID.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AssignmentParameter.EntityType.DEVICE_ID.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[AssignmentParameter.EntityType.EMAIL.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[AssignmentParameter.EntityType.MO_USER_UUID.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[AssignmentParameter.EntityType.NCW_ID.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[AssignmentParameter.EntityType.ACCOUNT_NUMBER.ordinal()] = 6;
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

            public final KSerializer<EntityTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EntityTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EntityTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) EntityTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<AssignmentParameter.EntityType> getProtoAdapter() {
                return AssignmentParameter.EntityType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntityTypeDto getZeroValue() {
                return EntityTypeDto.USER_UUID;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntityTypeDto fromProto(AssignmentParameter.EntityType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return EntityTypeDto.USER_UUID;
                    case 2:
                        return EntityTypeDto.DEVICE_ID;
                    case 3:
                        return EntityTypeDto.EMAIL;
                    case 4:
                        return EntityTypeDto.MO_USER_UUID;
                    case 5:
                        return EntityTypeDto.NCW_ID;
                    case 6:
                        return EntityTypeDto.ACCOUNT_NUMBER;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$EntityTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$EntityTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<EntityTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EntityTypeDto, AssignmentParameter.EntityType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.experiment_assignment.service.AssignmentParameter.EntityType", EntityTypeDto.getEntries(), EntityTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public EntityTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (EntityTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, EntityTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static EntityTypeDto valueOf(String str) {
            return (EntityTypeDto) Enum.valueOf(EntityTypeDto.class, str);
        }

        public static EntityTypeDto[] values() {
            return (EntityTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AssignmentParameterDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b-\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 82\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u000289B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J\b\u00107\u001a\u000206H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0¨\u0006:"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", CountryCode.COUNTRY_CODE_US, CountryCode.COUNTRY_CODE_GB, "EU", CountryCode.COUNTRY_CODE_AT, CountryCode.COUNTRY_CODE_BE, CountryCode.COUNTRY_CODE_BG, CountryCode.COUNTRY_CODE_HR, CountryCode.COUNTRY_CODE_CY, CountryCode.COUNTRY_CODE_CZ, CountryCode.COUNTRY_CODE_DK, CountryCode.COUNTRY_CODE_EE, CountryCode.COUNTRY_CODE_FI, CountryCode.COUNTRY_CODE_FR, CountryCode.COUNTRY_CODE_DE, CountryCode.COUNTRY_CODE_GR, CountryCode.COUNTRY_CODE_HU, CountryCode.COUNTRY_CODE_IE, CountryCode.COUNTRY_CODE_IT, CountryCode.COUNTRY_CODE_LV, CountryCode.COUNTRY_CODE_LT, CountryCode.COUNTRY_CODE_LU, CountryCode.COUNTRY_CODE_MT, CountryCode.COUNTRY_CODE_NL, CountryCode.COUNTRY_CODE_PL, CountryCode.COUNTRY_CODE_PT, CountryCode.COUNTRY_CODE_RO, CountryCode.COUNTRY_CODE_SK, CountryCode.COUNTRY_CODE_SI, CountryCode.COUNTRY_CODE_ES, CountryCode.COUNTRY_CODE_SE, CountryCode.COUNTRY_CODE_SG, "APAC", CountryCode.COUNTRY_CODE_HK, CountryCode.COUNTRY_CODE_ID, CountryCode.COUNTRY_CODE_MY, CountryCode.COUNTRY_CODE_TH, CountryCode.COUNTRY_CODE_TW, CountryCode.COUNTRY_CODE_VN, CountryCode.COUNTRY_CODE_LI, CountryCode.COUNTRY_CODE_NO, CountryCode.COUNTRY_CODE_IS, CountryCode.COUNTRY_CODE_IN, "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class UserOriginDto implements Dto2<AssignmentParameter.UserOrigin>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UserOriginDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<UserOriginDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<UserOriginDto, AssignmentParameter.UserOrigin>> binaryBase64Serializer$delegate;

        /* renamed from: US */
        public static final UserOriginDto f6066US = new C37106US(CountryCode.COUNTRY_CODE_US, 0);

        /* renamed from: GB */
        public static final UserOriginDto f6039GB = new C37079GB(CountryCode.COUNTRY_CODE_GB, 1);

        /* renamed from: EU */
        public static final UserOriginDto f6036EU = new C37076EU("EU", 2);

        /* renamed from: AT */
        public static final UserOriginDto f6027AT = new C37067AT(CountryCode.COUNTRY_CODE_AT, 3);

        /* renamed from: BE */
        public static final UserOriginDto f6028BE = new C37068BE(CountryCode.COUNTRY_CODE_BE, 4);

        /* renamed from: BG */
        public static final UserOriginDto f6029BG = new C37069BG(CountryCode.COUNTRY_CODE_BG, 5);

        /* renamed from: HR */
        public static final UserOriginDto f6042HR = new C37082HR(CountryCode.COUNTRY_CODE_HR, 6);

        /* renamed from: CY */
        public static final UserOriginDto f6030CY = new C37070CY(CountryCode.COUNTRY_CODE_CY, 7);

        /* renamed from: CZ */
        public static final UserOriginDto f6031CZ = new C37071CZ(CountryCode.COUNTRY_CODE_CZ, 8);

        /* renamed from: DK */
        public static final UserOriginDto f6033DK = new C37073DK(CountryCode.COUNTRY_CODE_DK, 9);

        /* renamed from: EE */
        public static final UserOriginDto f6034EE = new C37074EE(CountryCode.COUNTRY_CODE_EE, 10);

        /* renamed from: FI */
        public static final UserOriginDto f6037FI = new C37077FI(CountryCode.COUNTRY_CODE_FI, 11);

        /* renamed from: FR */
        public static final UserOriginDto f6038FR = new C37078FR(CountryCode.COUNTRY_CODE_FR, 12);

        /* renamed from: DE */
        public static final UserOriginDto f6032DE = new C37072DE(CountryCode.COUNTRY_CODE_DE, 13);

        /* renamed from: GR */
        public static final UserOriginDto f6040GR = new C37080GR(CountryCode.COUNTRY_CODE_GR, 14);

        /* renamed from: HU */
        public static final UserOriginDto f6043HU = new C37083HU(CountryCode.COUNTRY_CODE_HU, 15);

        /* renamed from: IE */
        public static final UserOriginDto f6045IE = new C37085IE(CountryCode.COUNTRY_CODE_IE, 16);

        /* renamed from: IT */
        public static final UserOriginDto f6048IT = new C37088IT(CountryCode.COUNTRY_CODE_IT, 17);

        /* renamed from: LV */
        public static final UserOriginDto f6052LV = new C37092LV(CountryCode.COUNTRY_CODE_LV, 18);

        /* renamed from: LT */
        public static final UserOriginDto f6050LT = new C37090LT(CountryCode.COUNTRY_CODE_LT, 19);

        /* renamed from: LU */
        public static final UserOriginDto f6051LU = new C37091LU(CountryCode.COUNTRY_CODE_LU, 20);

        /* renamed from: MT */
        public static final UserOriginDto f6053MT = new C37093MT(CountryCode.COUNTRY_CODE_MT, 21);

        /* renamed from: NL */
        public static final UserOriginDto f6055NL = new C37095NL(CountryCode.COUNTRY_CODE_NL, 22);

        /* renamed from: PL */
        public static final UserOriginDto f6057PL = new C37097PL(CountryCode.COUNTRY_CODE_PL, 23);

        /* renamed from: PT */
        public static final UserOriginDto f6058PT = new C37098PT(CountryCode.COUNTRY_CODE_PT, 24);

        /* renamed from: RO */
        public static final UserOriginDto f6059RO = new C37099RO(CountryCode.COUNTRY_CODE_RO, 25);

        /* renamed from: SK */
        public static final UserOriginDto f6063SK = new C37103SK(CountryCode.COUNTRY_CODE_SK, 26);

        /* renamed from: SI */
        public static final UserOriginDto f6062SI = new C37102SI(CountryCode.COUNTRY_CODE_SI, 27);

        /* renamed from: ES */
        public static final UserOriginDto f6035ES = new C37075ES(CountryCode.COUNTRY_CODE_ES, 28);

        /* renamed from: SE */
        public static final UserOriginDto f6060SE = new C37100SE(CountryCode.COUNTRY_CODE_SE, 29);

        /* renamed from: SG */
        public static final UserOriginDto f6061SG = new C37101SG(CountryCode.COUNTRY_CODE_SG, 30);
        public static final UserOriginDto APAC = new APAC("APAC", 31);

        /* renamed from: HK */
        public static final UserOriginDto f6041HK = new C37081HK(CountryCode.COUNTRY_CODE_HK, 32);

        /* renamed from: ID */
        public static final UserOriginDto f6044ID = new C37084ID(CountryCode.COUNTRY_CODE_ID, 33);

        /* renamed from: MY */
        public static final UserOriginDto f6054MY = new C37094MY(CountryCode.COUNTRY_CODE_MY, 34);

        /* renamed from: TH */
        public static final UserOriginDto f6064TH = new C37104TH(CountryCode.COUNTRY_CODE_TH, 35);

        /* renamed from: TW */
        public static final UserOriginDto f6065TW = new C37105TW(CountryCode.COUNTRY_CODE_TW, 36);

        /* renamed from: VN */
        public static final UserOriginDto f6067VN = new C37107VN(CountryCode.COUNTRY_CODE_VN, 37);

        /* renamed from: LI */
        public static final UserOriginDto f6049LI = new C37089LI(CountryCode.COUNTRY_CODE_LI, 38);

        /* renamed from: NO */
        public static final UserOriginDto f6056NO = new C37096NO(CountryCode.COUNTRY_CODE_NO, 39);

        /* renamed from: IS */
        public static final UserOriginDto f6047IS = new C37087IS(CountryCode.COUNTRY_CODE_IS, 40);

        /* renamed from: IN */
        public static final UserOriginDto f6046IN = new C37086IN(CountryCode.COUNTRY_CODE_IN, 41);

        private static final /* synthetic */ UserOriginDto[] $values() {
            return new UserOriginDto[]{f6066US, f6039GB, f6036EU, f6027AT, f6028BE, f6029BG, f6042HR, f6030CY, f6031CZ, f6033DK, f6034EE, f6037FI, f6038FR, f6032DE, f6040GR, f6043HU, f6045IE, f6048IT, f6052LV, f6050LT, f6051LU, f6053MT, f6055NL, f6057PL, f6058PT, f6059RO, f6063SK, f6062SI, f6035ES, f6060SE, f6061SG, APAC, f6041HK, f6044ID, f6054MY, f6064TH, f6065TW, f6067VN, f6049LI, f6056NO, f6047IS, f6046IN};
        }

        public /* synthetic */ UserOriginDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<UserOriginDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.US", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$US */
        static final class C37106US extends UserOriginDto {
            C37106US(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6025US;
            }
        }

        private UserOriginDto(String str, int i) {
        }

        static {
            UserOriginDto[] userOriginDtoArr$values = $values();
            $VALUES = userOriginDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(userOriginDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssignmentParameterDto.UserOriginDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.GB", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$GB */
        static final class C37079GB extends UserOriginDto {
            C37079GB(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f5998GB;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.EU", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$EU */
        static final class C37076EU extends UserOriginDto {
            C37076EU(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f5995EU;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.AT", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$AT */
        static final class C37067AT extends UserOriginDto {
            C37067AT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f5986AT;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.BE", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$BE */
        static final class C37068BE extends UserOriginDto {
            C37068BE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f5987BE;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.BG", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$BG */
        static final class C37069BG extends UserOriginDto {
            C37069BG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f5988BG;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.HR", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$HR */
        static final class C37082HR extends UserOriginDto {
            C37082HR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6001HR;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.CY", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$CY */
        static final class C37070CY extends UserOriginDto {
            C37070CY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f5989CY;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.CZ", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$CZ */
        static final class C37071CZ extends UserOriginDto {
            C37071CZ(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f5990CZ;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.DK", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$DK */
        static final class C37073DK extends UserOriginDto {
            C37073DK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f5992DK;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.EE", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$EE */
        static final class C37074EE extends UserOriginDto {
            C37074EE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f5993EE;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.FI", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$FI */
        static final class C37077FI extends UserOriginDto {
            C37077FI(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f5996FI;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.FR", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$FR */
        static final class C37078FR extends UserOriginDto {
            C37078FR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f5997FR;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.DE", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$DE */
        static final class C37072DE extends UserOriginDto {
            C37072DE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f5991DE;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.GR", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$GR */
        static final class C37080GR extends UserOriginDto {
            C37080GR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f5999GR;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.HU", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$HU */
        static final class C37083HU extends UserOriginDto {
            C37083HU(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6002HU;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.IE", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$IE */
        static final class C37085IE extends UserOriginDto {
            C37085IE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6004IE;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.IT", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$IT */
        static final class C37088IT extends UserOriginDto {
            C37088IT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6007IT;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.LV", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$LV */
        static final class C37092LV extends UserOriginDto {
            C37092LV(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6011LV;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.LT", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$LT */
        static final class C37090LT extends UserOriginDto {
            C37090LT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6009LT;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.LU", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$LU */
        static final class C37091LU extends UserOriginDto {
            C37091LU(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6010LU;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.MT", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$MT */
        static final class C37093MT extends UserOriginDto {
            C37093MT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6012MT;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.NL", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$NL */
        static final class C37095NL extends UserOriginDto {
            C37095NL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6014NL;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.PL", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$PL */
        static final class C37097PL extends UserOriginDto {
            C37097PL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6016PL;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.PT", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$PT */
        static final class C37098PT extends UserOriginDto {
            C37098PT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6017PT;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.RO", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$RO */
        static final class C37099RO extends UserOriginDto {
            C37099RO(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6018RO;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.SK", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$SK */
        static final class C37103SK extends UserOriginDto {
            C37103SK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6022SK;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.SI", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$SI */
        static final class C37102SI extends UserOriginDto {
            C37102SI(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6021SI;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.ES", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$ES */
        static final class C37075ES extends UserOriginDto {
            C37075ES(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f5994ES;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.SE", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$SE */
        static final class C37100SE extends UserOriginDto {
            C37100SE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6019SE;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.SG", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$SG */
        static final class C37101SG extends UserOriginDto {
            C37101SG(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6020SG;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.APAC", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class APAC extends UserOriginDto {
            APAC(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.APAC;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.HK", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$HK */
        static final class C37081HK extends UserOriginDto {
            C37081HK(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6000HK;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.ID", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$ID */
        static final class C37084ID extends UserOriginDto {
            C37084ID(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6003ID;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.MY", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$MY */
        static final class C37094MY extends UserOriginDto {
            C37094MY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6013MY;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.TH", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$TH */
        static final class C37104TH extends UserOriginDto {
            C37104TH(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6023TH;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.TW", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$TW */
        static final class C37105TW extends UserOriginDto {
            C37105TW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6024TW;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.VN", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$VN */
        static final class C37107VN extends UserOriginDto {
            C37107VN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6026VN;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.LI", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$LI */
        static final class C37089LI extends UserOriginDto {
            C37089LI(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6008LI;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.NO", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$NO */
        static final class C37096NO extends UserOriginDto {
            C37096NO(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6015NO;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.IS", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$IS */
        static final class C37087IS extends UserOriginDto {
            C37087IS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6006IS;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.UserOriginDto.IN", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$UserOriginDto$IN */
        static final class C37086IN extends UserOriginDto {
            C37086IN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.UserOrigin toProto() {
                return AssignmentParameter.UserOrigin.f6005IN;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<UserOriginDto, AssignmentParameter.UserOrigin> {

            /* compiled from: AssignmentParameterDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AssignmentParameter.UserOrigin.values().length];
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6025US.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f5998GB.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f5995EU.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f5986AT.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f5987BE.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f5988BG.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6001HR.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f5989CY.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f5990CZ.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f5992DK.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f5993EE.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f5996FI.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f5997FR.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f5991DE.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f5999GR.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6002HU.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6004IE.ordinal()] = 17;
                    } catch (NoSuchFieldError unused17) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6007IT.ordinal()] = 18;
                    } catch (NoSuchFieldError unused18) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6011LV.ordinal()] = 19;
                    } catch (NoSuchFieldError unused19) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6009LT.ordinal()] = 20;
                    } catch (NoSuchFieldError unused20) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6010LU.ordinal()] = 21;
                    } catch (NoSuchFieldError unused21) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6012MT.ordinal()] = 22;
                    } catch (NoSuchFieldError unused22) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6014NL.ordinal()] = 23;
                    } catch (NoSuchFieldError unused23) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6016PL.ordinal()] = 24;
                    } catch (NoSuchFieldError unused24) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6017PT.ordinal()] = 25;
                    } catch (NoSuchFieldError unused25) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6018RO.ordinal()] = 26;
                    } catch (NoSuchFieldError unused26) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6022SK.ordinal()] = 27;
                    } catch (NoSuchFieldError unused27) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6021SI.ordinal()] = 28;
                    } catch (NoSuchFieldError unused28) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f5994ES.ordinal()] = 29;
                    } catch (NoSuchFieldError unused29) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6019SE.ordinal()] = 30;
                    } catch (NoSuchFieldError unused30) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6020SG.ordinal()] = 31;
                    } catch (NoSuchFieldError unused31) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.APAC.ordinal()] = 32;
                    } catch (NoSuchFieldError unused32) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6000HK.ordinal()] = 33;
                    } catch (NoSuchFieldError unused33) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6003ID.ordinal()] = 34;
                    } catch (NoSuchFieldError unused34) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6013MY.ordinal()] = 35;
                    } catch (NoSuchFieldError unused35) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6023TH.ordinal()] = 36;
                    } catch (NoSuchFieldError unused36) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6024TW.ordinal()] = 37;
                    } catch (NoSuchFieldError unused37) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6026VN.ordinal()] = 38;
                    } catch (NoSuchFieldError unused38) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6008LI.ordinal()] = 39;
                    } catch (NoSuchFieldError unused39) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6015NO.ordinal()] = 40;
                    } catch (NoSuchFieldError unused40) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6006IS.ordinal()] = 41;
                    } catch (NoSuchFieldError unused41) {
                    }
                    try {
                        iArr[AssignmentParameter.UserOrigin.f6005IN.ordinal()] = 42;
                    } catch (NoSuchFieldError unused42) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<UserOriginDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<UserOriginDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<UserOriginDto> getBinaryBase64Serializer() {
                return (KSerializer) UserOriginDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<AssignmentParameter.UserOrigin> getProtoAdapter() {
                return AssignmentParameter.UserOrigin.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public UserOriginDto getZeroValue() {
                return UserOriginDto.f6066US;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public UserOriginDto fromProto(AssignmentParameter.UserOrigin proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return UserOriginDto.f6066US;
                    case 2:
                        return UserOriginDto.f6039GB;
                    case 3:
                        return UserOriginDto.f6036EU;
                    case 4:
                        return UserOriginDto.f6027AT;
                    case 5:
                        return UserOriginDto.f6028BE;
                    case 6:
                        return UserOriginDto.f6029BG;
                    case 7:
                        return UserOriginDto.f6042HR;
                    case 8:
                        return UserOriginDto.f6030CY;
                    case 9:
                        return UserOriginDto.f6031CZ;
                    case 10:
                        return UserOriginDto.f6033DK;
                    case 11:
                        return UserOriginDto.f6034EE;
                    case 12:
                        return UserOriginDto.f6037FI;
                    case 13:
                        return UserOriginDto.f6038FR;
                    case 14:
                        return UserOriginDto.f6032DE;
                    case 15:
                        return UserOriginDto.f6040GR;
                    case 16:
                        return UserOriginDto.f6043HU;
                    case 17:
                        return UserOriginDto.f6045IE;
                    case 18:
                        return UserOriginDto.f6048IT;
                    case 19:
                        return UserOriginDto.f6052LV;
                    case 20:
                        return UserOriginDto.f6050LT;
                    case 21:
                        return UserOriginDto.f6051LU;
                    case 22:
                        return UserOriginDto.f6053MT;
                    case 23:
                        return UserOriginDto.f6055NL;
                    case 24:
                        return UserOriginDto.f6057PL;
                    case 25:
                        return UserOriginDto.f6058PT;
                    case 26:
                        return UserOriginDto.f6059RO;
                    case 27:
                        return UserOriginDto.f6063SK;
                    case 28:
                        return UserOriginDto.f6062SI;
                    case 29:
                        return UserOriginDto.f6035ES;
                    case 30:
                        return UserOriginDto.f6060SE;
                    case 31:
                        return UserOriginDto.f6061SG;
                    case 32:
                        return UserOriginDto.APAC;
                    case 33:
                        return UserOriginDto.f6041HK;
                    case 34:
                        return UserOriginDto.f6044ID;
                    case 35:
                        return UserOriginDto.f6054MY;
                    case 36:
                        return UserOriginDto.f6064TH;
                    case 37:
                        return UserOriginDto.f6065TW;
                    case 38:
                        return UserOriginDto.f6067VN;
                    case 39:
                        return UserOriginDto.f6049LI;
                    case 40:
                        return UserOriginDto.f6056NO;
                    case 41:
                        return UserOriginDto.f6047IS;
                    case 42:
                        return UserOriginDto.f6046IN;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$UserOriginDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<UserOriginDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<UserOriginDto, AssignmentParameter.UserOrigin> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.experiment_assignment.service.AssignmentParameter.UserOrigin", UserOriginDto.getEntries(), UserOriginDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public UserOriginDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (UserOriginDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, UserOriginDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static UserOriginDto valueOf(String str) {
            return (UserOriginDto) Enum.valueOf(UserOriginDto.class, str);
        }

        public static UserOriginDto[] values() {
            return (UserOriginDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AssignmentParameterDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0014\u0015B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$ApplicationDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$Application;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "UNKNOWN", TradingTrendsType.ROBINHOOD, "ROBINHOOD_CREDIT_CARD", "ROBINHOOD_GLOBAL", "ROBINHOOD_WALLET", "ROBINHOOD_BANKING", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class ApplicationDto implements Dto2<AssignmentParameter.Application>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ApplicationDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<ApplicationDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<ApplicationDto, AssignmentParameter.Application>> binaryBase64Serializer$delegate;
        public static final ApplicationDto UNKNOWN = new UNKNOWN("UNKNOWN", 0);
        public static final ApplicationDto ROBINHOOD = new ROBINHOOD(TradingTrendsType.ROBINHOOD, 1);
        public static final ApplicationDto ROBINHOOD_CREDIT_CARD = new ROBINHOOD_CREDIT_CARD("ROBINHOOD_CREDIT_CARD", 2);
        public static final ApplicationDto ROBINHOOD_GLOBAL = new ROBINHOOD_GLOBAL("ROBINHOOD_GLOBAL", 3);
        public static final ApplicationDto ROBINHOOD_WALLET = new ROBINHOOD_WALLET("ROBINHOOD_WALLET", 4);
        public static final ApplicationDto ROBINHOOD_BANKING = new ROBINHOOD_BANKING("ROBINHOOD_BANKING", 5);

        private static final /* synthetic */ ApplicationDto[] $values() {
            return new ApplicationDto[]{UNKNOWN, ROBINHOOD, ROBINHOOD_CREDIT_CARD, ROBINHOOD_GLOBAL, ROBINHOOD_WALLET, ROBINHOOD_BANKING};
        }

        public /* synthetic */ ApplicationDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<ApplicationDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.ApplicationDto.UNKNOWN", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$ApplicationDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$Application;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNKNOWN extends ApplicationDto {
            UNKNOWN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.Application toProto() {
                return AssignmentParameter.Application.UNKNOWN;
            }
        }

        private ApplicationDto(String str, int i) {
        }

        static {
            ApplicationDto[] applicationDtoArr$values = $values();
            $VALUES = applicationDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(applicationDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto$ApplicationDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AssignmentParameterDto.ApplicationDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.ApplicationDto.ROBINHOOD", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$ApplicationDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$Application;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ROBINHOOD extends ApplicationDto {
            ROBINHOOD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.Application toProto() {
                return AssignmentParameter.Application.ROBINHOOD;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.ApplicationDto.ROBINHOOD_CREDIT_CARD", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$ApplicationDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$Application;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ROBINHOOD_CREDIT_CARD extends ApplicationDto {
            ROBINHOOD_CREDIT_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.Application toProto() {
                return AssignmentParameter.Application.ROBINHOOD_CREDIT_CARD;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.ApplicationDto.ROBINHOOD_GLOBAL", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$ApplicationDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$Application;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ROBINHOOD_GLOBAL extends ApplicationDto {
            ROBINHOOD_GLOBAL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.Application toProto() {
                return AssignmentParameter.Application.ROBINHOOD_GLOBAL;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.ApplicationDto.ROBINHOOD_WALLET", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$ApplicationDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$Application;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ROBINHOOD_WALLET extends ApplicationDto {
            ROBINHOOD_WALLET(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.Application toProto() {
                return AssignmentParameter.Application.ROBINHOOD_WALLET;
            }
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/experiment_assignment/AssignmentParameterDto.ApplicationDto.ROBINHOOD_BANKING", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$ApplicationDto;", "toProto", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$Application;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ROBINHOOD_BANKING extends ApplicationDto {
            ROBINHOOD_BANKING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public AssignmentParameter.Application toProto() {
                return AssignmentParameter.Application.ROBINHOOD_BANKING;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$ApplicationDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$ApplicationDto;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$Application;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$ApplicationDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<ApplicationDto, AssignmentParameter.Application> {

            /* compiled from: AssignmentParameterDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[AssignmentParameter.Application.values().length];
                    try {
                        iArr[AssignmentParameter.Application.UNKNOWN.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AssignmentParameter.Application.ROBINHOOD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[AssignmentParameter.Application.ROBINHOOD_CREDIT_CARD.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[AssignmentParameter.Application.ROBINHOOD_GLOBAL.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[AssignmentParameter.Application.ROBINHOOD_WALLET.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[AssignmentParameter.Application.ROBINHOOD_BANKING.ordinal()] = 6;
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

            public final KSerializer<ApplicationDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ApplicationDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<ApplicationDto> getBinaryBase64Serializer() {
                return (KSerializer) ApplicationDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<AssignmentParameter.Application> getProtoAdapter() {
                return AssignmentParameter.Application.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ApplicationDto getZeroValue() {
                return ApplicationDto.UNKNOWN;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ApplicationDto fromProto(AssignmentParameter.Application proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return ApplicationDto.UNKNOWN;
                    case 2:
                        return ApplicationDto.ROBINHOOD;
                    case 3:
                        return ApplicationDto.ROBINHOOD_CREDIT_CARD;
                    case 4:
                        return ApplicationDto.ROBINHOOD_GLOBAL;
                    case 5:
                        return ApplicationDto.ROBINHOOD_WALLET;
                    case 6:
                        return ApplicationDto.ROBINHOOD_BANKING;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: AssignmentParameterDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$ApplicationDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$ApplicationDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<ApplicationDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<ApplicationDto, AssignmentParameter.Application> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.experiment_assignment.service.AssignmentParameter.Application", ApplicationDto.getEntries(), ApplicationDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public ApplicationDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (ApplicationDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, ApplicationDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static ApplicationDto valueOf(String str) {
            return (ApplicationDto) Enum.valueOf(ApplicationDto.class, str);
        }

        public static ApplicationDto[] values() {
            return (ApplicationDto[]) $VALUES.clone();
        }
    }

    /* compiled from: AssignmentParameterDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AssignmentParameterDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.experiment_assignment.service.AssignmentParameter", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AssignmentParameterDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AssignmentParameterDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AssignmentParameterDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AssignmentParameterDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameterDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.experiment_assignment.AssignmentParameterDto";
        }
    }
}
