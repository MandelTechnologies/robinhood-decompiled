package crypto_portkey.service.p443v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import crypto_portkey.service.p443v1.BalanceRequestDataDto;
import crypto_portkey.service.p443v1.CheckEligibilityDataDto;
import crypto_portkey.service.p443v1.MigrationDataDto;
import crypto_portkey.service.p443v1.MigrationFinalizeAckDataDto;
import crypto_portkey.service.p443v1.MigrationInitiateAckDataDto;
import crypto_portkey.service.p443v1.MigrationKickoffAckDataDto;
import crypto_portkey.service.p443v1.MigrationPreInfoDto;
import crypto_portkey.service.p443v1.MigrationRequestDataDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
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
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: MigrationDataDto.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004.-/0B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007Be\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0006\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0096\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001f\u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\"H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\"H\u0016¢\u0006\u0004\b+\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,¨\u00061"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_portkey/service/v1/MigrationData;", "Landroid/os/Parcelable;", "Lcrypto_portkey/service/v1/MigrationDataDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_portkey/service/v1/MigrationDataDto$Surrogate;)V", "", "Lcrypto_portkey/service/v1/MigrationPreInfoDto;", "migration_pre_info", "Lcrypto_portkey/service/v1/MigrationInitiateAckDataDto;", "migration_initiate_ack", "Lcrypto_portkey/service/v1/MigrationRequestDataDto;", "migration_request", "Lcrypto_portkey/service/v1/BalanceRequestDataDto;", "balance_request", "Lcrypto_portkey/service/v1/MigrationKickoffAckDataDto;", "migration_kickoff_ack", "Lcrypto_portkey/service/v1/CheckEligibilityDataDto;", "check_eligibility", "Lcrypto_portkey/service/v1/MigrationFinalizeAckDataDto;", "migration_finalize_ack", "(Ljava/util/List;Lcrypto_portkey/service/v1/MigrationInitiateAckDataDto;Lcrypto_portkey/service/v1/MigrationRequestDataDto;Lcrypto_portkey/service/v1/BalanceRequestDataDto;Ljava/util/List;Lcrypto_portkey/service/v1/CheckEligibilityDataDto;Lcrypto_portkey/service/v1/MigrationFinalizeAckDataDto;)V", "toProto", "()Lcrypto_portkey/service/v1/MigrationData;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_portkey/service/v1/MigrationDataDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class MigrationDataDto implements Dto3<MigrationData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MigrationDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MigrationDataDto, MigrationData>> binaryBase64Serializer$delegate;
    private static final MigrationDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MigrationDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MigrationDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ MigrationDataDto(java.util.List r2, crypto_portkey.service.p443v1.MigrationInitiateAckDataDto r3, crypto_portkey.service.p443v1.MigrationRequestDataDto r4, crypto_portkey.service.p443v1.BalanceRequestDataDto r5, java.util.List r6, crypto_portkey.service.p443v1.CheckEligibilityDataDto r7, crypto_portkey.service.p443v1.MigrationFinalizeAckDataDto r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L8
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L8:
            r10 = r9 & 2
            r0 = 0
            if (r10 == 0) goto Le
            r3 = r0
        Le:
            r10 = r9 & 4
            if (r10 == 0) goto L13
            r4 = r0
        L13:
            r10 = r9 & 8
            if (r10 == 0) goto L18
            r5 = r0
        L18:
            r10 = r9 & 16
            if (r10 == 0) goto L20
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
        L20:
            r10 = r9 & 32
            if (r10 == 0) goto L25
            r7 = r0
        L25:
            r9 = r9 & 64
            if (r9 == 0) goto L32
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L3a
        L32:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L3a:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: crypto_portkey.service.p443v1.MigrationDataDto.<init>(java.util.List, crypto_portkey.service.v1.MigrationInitiateAckDataDto, crypto_portkey.service.v1.MigrationRequestDataDto, crypto_portkey.service.v1.BalanceRequestDataDto, java.util.List, crypto_portkey.service.v1.CheckEligibilityDataDto, crypto_portkey.service.v1.MigrationFinalizeAckDataDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MigrationDataDto(List<MigrationPreInfoDto> migration_pre_info, MigrationInitiateAckDataDto migrationInitiateAckDataDto, MigrationRequestDataDto migrationRequestDataDto, BalanceRequestDataDto balanceRequestDataDto, List<MigrationKickoffAckDataDto> migration_kickoff_ack, CheckEligibilityDataDto checkEligibilityDataDto, MigrationFinalizeAckDataDto migrationFinalizeAckDataDto) {
        this(new Surrogate(migration_pre_info, migrationInitiateAckDataDto, migrationRequestDataDto, balanceRequestDataDto, migration_kickoff_ack, checkEligibilityDataDto, migrationFinalizeAckDataDto));
        Intrinsics.checkNotNullParameter(migration_pre_info, "migration_pre_info");
        Intrinsics.checkNotNullParameter(migration_kickoff_ack, "migration_kickoff_ack");
    }

    @Override // com.robinhood.idl.Dto
    public MigrationData toProto() {
        List<MigrationPreInfoDto> migration_pre_info = this.surrogate.getMigration_pre_info();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(migration_pre_info, 10));
        Iterator<T> it = migration_pre_info.iterator();
        while (it.hasNext()) {
            arrayList.add(((MigrationPreInfoDto) it.next()).toProto());
        }
        MigrationInitiateAckDataDto migration_initiate_ack = this.surrogate.getMigration_initiate_ack();
        MigrationInitiateAckData proto = migration_initiate_ack != null ? migration_initiate_ack.toProto() : null;
        MigrationRequestDataDto migration_request = this.surrogate.getMigration_request();
        MigrationRequestData proto2 = migration_request != null ? migration_request.toProto() : null;
        BalanceRequestDataDto balance_request = this.surrogate.getBalance_request();
        BalanceRequestData proto3 = balance_request != null ? balance_request.toProto() : null;
        List<MigrationKickoffAckDataDto> migration_kickoff_ack = this.surrogate.getMigration_kickoff_ack();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(migration_kickoff_ack, 10));
        Iterator<T> it2 = migration_kickoff_ack.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((MigrationKickoffAckDataDto) it2.next()).toProto());
        }
        CheckEligibilityDataDto check_eligibility = this.surrogate.getCheck_eligibility();
        CheckEligibilityData proto4 = check_eligibility != null ? check_eligibility.toProto() : null;
        MigrationFinalizeAckDataDto migration_finalize_ack = this.surrogate.getMigration_finalize_ack();
        return new MigrationData(arrayList, proto, proto2, proto3, arrayList2, proto4, migration_finalize_ack != null ? migration_finalize_ack.toProto() : null, null, 128, null);
    }

    public String toString() {
        return "[MigrationDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MigrationDataDto) && Intrinsics.areEqual(((MigrationDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: MigrationDataDto.kt */
    @Metadata(m3635d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b \b\u0083\b\u0018\u0000 E2\u00020\u0001:\u0002FEBc\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bm\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010*\u0012\u0004\b-\u0010.\u001a\u0004\b+\u0010,R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010/\u0012\u0004\b2\u0010.\u001a\u0004\b0\u00101R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00103\u0012\u0004\b6\u0010.\u001a\u0004\b4\u00105R\"\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00107\u0012\u0004\b:\u0010.\u001a\u0004\b8\u00109R&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010*\u0012\u0004\b<\u0010.\u001a\u0004\b;\u0010,R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010=\u0012\u0004\b@\u0010.\u001a\u0004\b>\u0010?R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010A\u0012\u0004\bD\u0010.\u001a\u0004\bB\u0010C¨\u0006G"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationDataDto$Surrogate;", "", "", "Lcrypto_portkey/service/v1/MigrationPreInfoDto;", "migration_pre_info", "Lcrypto_portkey/service/v1/MigrationInitiateAckDataDto;", "migration_initiate_ack", "Lcrypto_portkey/service/v1/MigrationRequestDataDto;", "migration_request", "Lcrypto_portkey/service/v1/BalanceRequestDataDto;", "balance_request", "Lcrypto_portkey/service/v1/MigrationKickoffAckDataDto;", "migration_kickoff_ack", "Lcrypto_portkey/service/v1/CheckEligibilityDataDto;", "check_eligibility", "Lcrypto_portkey/service/v1/MigrationFinalizeAckDataDto;", "migration_finalize_ack", "<init>", "(Ljava/util/List;Lcrypto_portkey/service/v1/MigrationInitiateAckDataDto;Lcrypto_portkey/service/v1/MigrationRequestDataDto;Lcrypto_portkey/service/v1/BalanceRequestDataDto;Ljava/util/List;Lcrypto_portkey/service/v1/CheckEligibilityDataDto;Lcrypto_portkey/service/v1/MigrationFinalizeAckDataDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lcrypto_portkey/service/v1/MigrationInitiateAckDataDto;Lcrypto_portkey/service/v1/MigrationRequestDataDto;Lcrypto_portkey/service/v1/BalanceRequestDataDto;Ljava/util/List;Lcrypto_portkey/service/v1/CheckEligibilityDataDto;Lcrypto_portkey/service/v1/MigrationFinalizeAckDataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_portkey_service_v1_externalRelease", "(Lcrypto_portkey/service/v1/MigrationDataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getMigration_pre_info", "()Ljava/util/List;", "getMigration_pre_info$annotations", "()V", "Lcrypto_portkey/service/v1/MigrationInitiateAckDataDto;", "getMigration_initiate_ack", "()Lcrypto_portkey/service/v1/MigrationInitiateAckDataDto;", "getMigration_initiate_ack$annotations", "Lcrypto_portkey/service/v1/MigrationRequestDataDto;", "getMigration_request", "()Lcrypto_portkey/service/v1/MigrationRequestDataDto;", "getMigration_request$annotations", "Lcrypto_portkey/service/v1/BalanceRequestDataDto;", "getBalance_request", "()Lcrypto_portkey/service/v1/BalanceRequestDataDto;", "getBalance_request$annotations", "getMigration_kickoff_ack", "getMigration_kickoff_ack$annotations", "Lcrypto_portkey/service/v1/CheckEligibilityDataDto;", "getCheck_eligibility", "()Lcrypto_portkey/service/v1/CheckEligibilityDataDto;", "getCheck_eligibility$annotations", "Lcrypto_portkey/service/v1/MigrationFinalizeAckDataDto;", "getMigration_finalize_ack", "()Lcrypto_portkey/service/v1/MigrationFinalizeAckDataDto;", "getMigration_finalize_ack$annotations", "Companion", "$serializer", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final BalanceRequestDataDto balance_request;
        private final CheckEligibilityDataDto check_eligibility;
        private final MigrationFinalizeAckDataDto migration_finalize_ack;
        private final MigrationInitiateAckDataDto migration_initiate_ack;
        private final List<MigrationKickoffAckDataDto> migration_kickoff_ack;
        private final List<MigrationPreInfoDto> migration_pre_info;
        private final MigrationRequestDataDto migration_request;

        public Surrogate() {
            this((List) null, (MigrationInitiateAckDataDto) null, (MigrationRequestDataDto) null, (BalanceRequestDataDto) null, (List) null, (CheckEligibilityDataDto) null, (MigrationFinalizeAckDataDto) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(MigrationPreInfoDto.Serializer.INSTANCE);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_$0() {
            return new ArrayListSerializer(MigrationKickoffAckDataDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.migration_pre_info, surrogate.migration_pre_info) && Intrinsics.areEqual(this.migration_initiate_ack, surrogate.migration_initiate_ack) && Intrinsics.areEqual(this.migration_request, surrogate.migration_request) && Intrinsics.areEqual(this.balance_request, surrogate.balance_request) && Intrinsics.areEqual(this.migration_kickoff_ack, surrogate.migration_kickoff_ack) && Intrinsics.areEqual(this.check_eligibility, surrogate.check_eligibility) && Intrinsics.areEqual(this.migration_finalize_ack, surrogate.migration_finalize_ack);
        }

        public int hashCode() {
            int iHashCode = this.migration_pre_info.hashCode() * 31;
            MigrationInitiateAckDataDto migrationInitiateAckDataDto = this.migration_initiate_ack;
            int iHashCode2 = (iHashCode + (migrationInitiateAckDataDto == null ? 0 : migrationInitiateAckDataDto.hashCode())) * 31;
            MigrationRequestDataDto migrationRequestDataDto = this.migration_request;
            int iHashCode3 = (iHashCode2 + (migrationRequestDataDto == null ? 0 : migrationRequestDataDto.hashCode())) * 31;
            BalanceRequestDataDto balanceRequestDataDto = this.balance_request;
            int iHashCode4 = (((iHashCode3 + (balanceRequestDataDto == null ? 0 : balanceRequestDataDto.hashCode())) * 31) + this.migration_kickoff_ack.hashCode()) * 31;
            CheckEligibilityDataDto checkEligibilityDataDto = this.check_eligibility;
            int iHashCode5 = (iHashCode4 + (checkEligibilityDataDto == null ? 0 : checkEligibilityDataDto.hashCode())) * 31;
            MigrationFinalizeAckDataDto migrationFinalizeAckDataDto = this.migration_finalize_ack;
            return iHashCode5 + (migrationFinalizeAckDataDto != null ? migrationFinalizeAckDataDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(migration_pre_info=" + this.migration_pre_info + ", migration_initiate_ack=" + this.migration_initiate_ack + ", migration_request=" + this.migration_request + ", balance_request=" + this.balance_request + ", migration_kickoff_ack=" + this.migration_kickoff_ack + ", check_eligibility=" + this.check_eligibility + ", migration_finalize_ack=" + this.migration_finalize_ack + ")";
        }

        /* compiled from: MigrationDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_portkey/service/v1/MigrationDataDto$Surrogate;", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MigrationDataDto3.INSTANCE;
            }
        }

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            $childSerializers = new Lazy[]{LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: crypto_portkey.service.v1.MigrationDataDto$Surrogate$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MigrationDataDto.Surrogate._childSerializers$_anonymous_();
                }
            }), null, null, null, LazyKt.lazy(lazyThreadSafetyMode, new Function0() { // from class: crypto_portkey.service.v1.MigrationDataDto$Surrogate$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MigrationDataDto.Surrogate._childSerializers$_anonymous_$0();
                }
            }), null, null};
        }

        public /* synthetic */ Surrogate(int i, List list, MigrationInitiateAckDataDto migrationInitiateAckDataDto, MigrationRequestDataDto migrationRequestDataDto, BalanceRequestDataDto balanceRequestDataDto, List list2, CheckEligibilityDataDto checkEligibilityDataDto, MigrationFinalizeAckDataDto migrationFinalizeAckDataDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.migration_pre_info = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.migration_initiate_ack = null;
            } else {
                this.migration_initiate_ack = migrationInitiateAckDataDto;
            }
            if ((i & 4) == 0) {
                this.migration_request = null;
            } else {
                this.migration_request = migrationRequestDataDto;
            }
            if ((i & 8) == 0) {
                this.balance_request = null;
            } else {
                this.balance_request = balanceRequestDataDto;
            }
            if ((i & 16) == 0) {
                this.migration_kickoff_ack = CollectionsKt.emptyList();
            } else {
                this.migration_kickoff_ack = list2;
            }
            if ((i & 32) == 0) {
                this.check_eligibility = null;
            } else {
                this.check_eligibility = checkEligibilityDataDto;
            }
            if ((i & 64) == 0) {
                this.migration_finalize_ack = null;
            } else {
                this.migration_finalize_ack = migrationFinalizeAckDataDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_portkey_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.migration_pre_info, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.migration_pre_info);
            }
            MigrationInitiateAckDataDto migrationInitiateAckDataDto = self.migration_initiate_ack;
            if (migrationInitiateAckDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MigrationInitiateAckDataDto.Serializer.INSTANCE, migrationInitiateAckDataDto);
            }
            MigrationRequestDataDto migrationRequestDataDto = self.migration_request;
            if (migrationRequestDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, MigrationRequestDataDto.Serializer.INSTANCE, migrationRequestDataDto);
            }
            BalanceRequestDataDto balanceRequestDataDto = self.balance_request;
            if (balanceRequestDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, BalanceRequestDataDto.Serializer.INSTANCE, balanceRequestDataDto);
            }
            if (!Intrinsics.areEqual(self.migration_kickoff_ack, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 4, lazyArr[4].getValue(), self.migration_kickoff_ack);
            }
            CheckEligibilityDataDto checkEligibilityDataDto = self.check_eligibility;
            if (checkEligibilityDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, CheckEligibilityDataDto.Serializer.INSTANCE, checkEligibilityDataDto);
            }
            MigrationFinalizeAckDataDto migrationFinalizeAckDataDto = self.migration_finalize_ack;
            if (migrationFinalizeAckDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, MigrationFinalizeAckDataDto.Serializer.INSTANCE, migrationFinalizeAckDataDto);
            }
        }

        public Surrogate(List<MigrationPreInfoDto> migration_pre_info, MigrationInitiateAckDataDto migrationInitiateAckDataDto, MigrationRequestDataDto migrationRequestDataDto, BalanceRequestDataDto balanceRequestDataDto, List<MigrationKickoffAckDataDto> migration_kickoff_ack, CheckEligibilityDataDto checkEligibilityDataDto, MigrationFinalizeAckDataDto migrationFinalizeAckDataDto) {
            Intrinsics.checkNotNullParameter(migration_pre_info, "migration_pre_info");
            Intrinsics.checkNotNullParameter(migration_kickoff_ack, "migration_kickoff_ack");
            this.migration_pre_info = migration_pre_info;
            this.migration_initiate_ack = migrationInitiateAckDataDto;
            this.migration_request = migrationRequestDataDto;
            this.balance_request = balanceRequestDataDto;
            this.migration_kickoff_ack = migration_kickoff_ack;
            this.check_eligibility = checkEligibilityDataDto;
            this.migration_finalize_ack = migrationFinalizeAckDataDto;
        }

        public final List<MigrationPreInfoDto> getMigration_pre_info() {
            return this.migration_pre_info;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(java.util.List r2, crypto_portkey.service.p443v1.MigrationInitiateAckDataDto r3, crypto_portkey.service.p443v1.MigrationRequestDataDto r4, crypto_portkey.service.p443v1.BalanceRequestDataDto r5, java.util.List r6, crypto_portkey.service.p443v1.CheckEligibilityDataDto r7, crypto_portkey.service.p443v1.MigrationFinalizeAckDataDto r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto L8
                java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
            L8:
                r10 = r9 & 2
                r0 = 0
                if (r10 == 0) goto Le
                r3 = r0
            Le:
                r10 = r9 & 4
                if (r10 == 0) goto L13
                r4 = r0
            L13:
                r10 = r9 & 8
                if (r10 == 0) goto L18
                r5 = r0
            L18:
                r10 = r9 & 16
                if (r10 == 0) goto L20
                java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
            L20:
                r10 = r9 & 32
                if (r10 == 0) goto L25
                r7 = r0
            L25:
                r9 = r9 & 64
                if (r9 == 0) goto L32
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L3a
            L32:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L3a:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: crypto_portkey.service.p443v1.MigrationDataDto.Surrogate.<init>(java.util.List, crypto_portkey.service.v1.MigrationInitiateAckDataDto, crypto_portkey.service.v1.MigrationRequestDataDto, crypto_portkey.service.v1.BalanceRequestDataDto, java.util.List, crypto_portkey.service.v1.CheckEligibilityDataDto, crypto_portkey.service.v1.MigrationFinalizeAckDataDto, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final MigrationInitiateAckDataDto getMigration_initiate_ack() {
            return this.migration_initiate_ack;
        }

        public final MigrationRequestDataDto getMigration_request() {
            return this.migration_request;
        }

        public final BalanceRequestDataDto getBalance_request() {
            return this.balance_request;
        }

        public final List<MigrationKickoffAckDataDto> getMigration_kickoff_ack() {
            return this.migration_kickoff_ack;
        }

        public final CheckEligibilityDataDto getCheck_eligibility() {
            return this.check_eligibility;
        }

        public final MigrationFinalizeAckDataDto getMigration_finalize_ack() {
            return this.migration_finalize_ack;
        }
    }

    /* compiled from: MigrationDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_portkey/service/v1/MigrationDataDto;", "Lcrypto_portkey/service/v1/MigrationData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_portkey/service/v1/MigrationDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<MigrationDataDto, MigrationData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MigrationDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MigrationDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MigrationDataDto> getBinaryBase64Serializer() {
            return (KSerializer) MigrationDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MigrationData> getProtoAdapter() {
            return MigrationData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MigrationDataDto getZeroValue() {
            return MigrationDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MigrationDataDto fromProto(MigrationData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<MigrationPreInfo> migration_pre_info = proto.getMigration_pre_info();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(migration_pre_info, 10));
            Iterator<T> it = migration_pre_info.iterator();
            while (it.hasNext()) {
                arrayList.add(MigrationPreInfoDto.INSTANCE.fromProto((MigrationPreInfo) it.next()));
            }
            MigrationInitiateAckData migration_initiate_ack = proto.getMigration_initiate_ack();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MigrationInitiateAckDataDto migrationInitiateAckDataDtoFromProto = migration_initiate_ack != null ? MigrationInitiateAckDataDto.INSTANCE.fromProto(migration_initiate_ack) : null;
            MigrationRequestData migration_request = proto.getMigration_request();
            MigrationRequestDataDto migrationRequestDataDtoFromProto = migration_request != null ? MigrationRequestDataDto.INSTANCE.fromProto(migration_request) : null;
            BalanceRequestData balance_request = proto.getBalance_request();
            BalanceRequestDataDto balanceRequestDataDtoFromProto = balance_request != null ? BalanceRequestDataDto.INSTANCE.fromProto(balance_request) : null;
            List<MigrationKickoffAckData> migration_kickoff_ack = proto.getMigration_kickoff_ack();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(migration_kickoff_ack, 10));
            Iterator<T> it2 = migration_kickoff_ack.iterator();
            while (it2.hasNext()) {
                arrayList2.add(MigrationKickoffAckDataDto.INSTANCE.fromProto((MigrationKickoffAckData) it2.next()));
            }
            CheckEligibilityData check_eligibility = proto.getCheck_eligibility();
            CheckEligibilityDataDto checkEligibilityDataDtoFromProto = check_eligibility != null ? CheckEligibilityDataDto.INSTANCE.fromProto(check_eligibility) : null;
            MigrationFinalizeAckData migration_finalize_ack = proto.getMigration_finalize_ack();
            return new MigrationDataDto(new Surrogate(arrayList, migrationInitiateAckDataDtoFromProto, migrationRequestDataDtoFromProto, balanceRequestDataDtoFromProto, arrayList2, checkEligibilityDataDtoFromProto, migration_finalize_ack != null ? MigrationFinalizeAckDataDto.INSTANCE.fromProto(migration_finalize_ack) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_portkey.service.v1.MigrationDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MigrationDataDto.binaryBase64Serializer_delegate$lambda$2();
            }
        });
        zeroValue = new MigrationDataDto(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$2() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MigrationDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_portkey/service/v1/MigrationDataDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_portkey/service/v1/MigrationDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<MigrationDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_portkey.service.v1.MigrationData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MigrationDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MigrationDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MigrationDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MigrationDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "crypto_portkey.service.v1.MigrationDataDto";
        }
    }
}
