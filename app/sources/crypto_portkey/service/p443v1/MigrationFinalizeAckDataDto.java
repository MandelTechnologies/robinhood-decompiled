package crypto_portkey.service.p443v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import crypto_portkey.service.p443v1.MigrationFinalizeAckDataDto;
import crypto_portkey.service.p443v1.MigrationFinalizeTransactionDto;
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

/* compiled from: MigrationFinalizeAckDataDto.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'&()B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BK\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%¨\u0006*"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationFinalizeAckDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcrypto_portkey/service/v1/MigrationFinalizeAckData;", "Landroid/os/Parcelable;", "Lcrypto_portkey/service/v1/MigrationFinalizeAckDataDto$Surrogate;", "surrogate", "<init>", "(Lcrypto_portkey/service/v1/MigrationFinalizeAckDataDto$Surrogate;)V", "", "partner_migration_code", "rh_migration_code", "status", "", "Lcrypto_portkey/service/v1/MigrationFinalizeTransactionDto;", "transactions", "failure_code", "failure_reason", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "toProto", "()Lcrypto_portkey/service/v1/MigrationFinalizeAckData;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcrypto_portkey/service/v1/MigrationFinalizeAckDataDto$Surrogate;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes18.dex */
public final class MigrationFinalizeAckDataDto implements Dto3<MigrationFinalizeAckData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<MigrationFinalizeAckDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MigrationFinalizeAckDataDto, MigrationFinalizeAckData>> binaryBase64Serializer$delegate;
    private static final MigrationFinalizeAckDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ MigrationFinalizeAckDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MigrationFinalizeAckDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public /* synthetic */ MigrationFinalizeAckDataDto(String str, String str2, String str3, List list, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MigrationFinalizeAckDataDto(String partner_migration_code, String rh_migration_code, String status, List<MigrationFinalizeTransactionDto> transactions, String failure_code, String failure_reason) {
        this(new Surrogate(partner_migration_code, rh_migration_code, status, transactions, failure_code, failure_reason));
        Intrinsics.checkNotNullParameter(partner_migration_code, "partner_migration_code");
        Intrinsics.checkNotNullParameter(rh_migration_code, "rh_migration_code");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(failure_code, "failure_code");
        Intrinsics.checkNotNullParameter(failure_reason, "failure_reason");
    }

    @Override // com.robinhood.idl.Dto
    public MigrationFinalizeAckData toProto() {
        String partner_migration_code = this.surrogate.getPartner_migration_code();
        String rh_migration_code = this.surrogate.getRh_migration_code();
        String status = this.surrogate.getStatus();
        List<MigrationFinalizeTransactionDto> transactions = this.surrogate.getTransactions();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(transactions, 10));
        Iterator<T> it = transactions.iterator();
        while (it.hasNext()) {
            arrayList.add(((MigrationFinalizeTransactionDto) it.next()).toProto());
        }
        return new MigrationFinalizeAckData(partner_migration_code, rh_migration_code, status, arrayList, this.surrogate.getFailure_code(), this.surrogate.getFailure_reason(), null, 64, null);
    }

    public String toString() {
        return "[MigrationFinalizeAckDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof MigrationFinalizeAckDataDto) && Intrinsics.areEqual(((MigrationFinalizeAckDataDto) other).surrogate, this.surrogate);
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
    /* compiled from: MigrationFinalizeAckDataDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0083\b\u0018\u0000 32\u00020\u0001:\u000243BI\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b%\u0010&\u001a\u0004\b$\u0010\u001cR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010#\u0012\u0004\b(\u0010&\u001a\u0004\b'\u0010\u001cR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010#\u0012\u0004\b*\u0010&\u001a\u0004\b)\u0010\u001cR&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b.\u0010&\u001a\u0004\b,\u0010-R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010#\u0012\u0004\b0\u0010&\u001a\u0004\b/\u0010\u001cR \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010#\u0012\u0004\b2\u0010&\u001a\u0004\b1\u0010\u001c¨\u00065"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationFinalizeAckDataDto$Surrogate;", "", "", "partner_migration_code", "rh_migration_code", "status", "", "Lcrypto_portkey/service/v1/MigrationFinalizeTransactionDto;", "transactions", "failure_code", "failure_reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$crypto_portkey_service_v1_externalRelease", "(Lcrypto_portkey/service/v1/MigrationFinalizeAckDataDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPartner_migration_code", "getPartner_migration_code$annotations", "()V", "getRh_migration_code", "getRh_migration_code$annotations", "getStatus", "getStatus$annotations", "Ljava/util/List;", "getTransactions", "()Ljava/util/List;", "getTransactions$annotations", "getFailure_code", "getFailure_code$annotations", "getFailure_reason", "getFailure_reason$annotations", "Companion", "$serializer", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final String failure_code;
        private final String failure_reason;
        private final String partner_migration_code;
        private final String rh_migration_code;
        private final String status;
        private final List<MigrationFinalizeTransactionDto> transactions;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, null, null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: crypto_portkey.service.v1.MigrationFinalizeAckDataDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MigrationFinalizeAckDataDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null};

        public Surrogate() {
            this((String) null, (String) null, (String) null, (List) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(MigrationFinalizeTransactionDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.partner_migration_code, surrogate.partner_migration_code) && Intrinsics.areEqual(this.rh_migration_code, surrogate.rh_migration_code) && Intrinsics.areEqual(this.status, surrogate.status) && Intrinsics.areEqual(this.transactions, surrogate.transactions) && Intrinsics.areEqual(this.failure_code, surrogate.failure_code) && Intrinsics.areEqual(this.failure_reason, surrogate.failure_reason);
        }

        public int hashCode() {
            return (((((((((this.partner_migration_code.hashCode() * 31) + this.rh_migration_code.hashCode()) * 31) + this.status.hashCode()) * 31) + this.transactions.hashCode()) * 31) + this.failure_code.hashCode()) * 31) + this.failure_reason.hashCode();
        }

        public String toString() {
            return "Surrogate(partner_migration_code=" + this.partner_migration_code + ", rh_migration_code=" + this.rh_migration_code + ", status=" + this.status + ", transactions=" + this.transactions + ", failure_code=" + this.failure_code + ", failure_reason=" + this.failure_reason + ")";
        }

        /* compiled from: MigrationFinalizeAckDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationFinalizeAckDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcrypto_portkey/service/v1/MigrationFinalizeAckDataDto$Surrogate;", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return MigrationFinalizeAckDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, String str3, List list, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.partner_migration_code = "";
            } else {
                this.partner_migration_code = str;
            }
            if ((i & 2) == 0) {
                this.rh_migration_code = "";
            } else {
                this.rh_migration_code = str2;
            }
            if ((i & 4) == 0) {
                this.status = "";
            } else {
                this.status = str3;
            }
            if ((i & 8) == 0) {
                this.transactions = CollectionsKt.emptyList();
            } else {
                this.transactions = list;
            }
            if ((i & 16) == 0) {
                this.failure_code = "";
            } else {
                this.failure_code = str4;
            }
            if ((i & 32) == 0) {
                this.failure_reason = "";
            } else {
                this.failure_reason = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$crypto_portkey_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.partner_migration_code, "")) {
                output.encodeStringElement(serialDesc, 0, self.partner_migration_code);
            }
            if (!Intrinsics.areEqual(self.rh_migration_code, "")) {
                output.encodeStringElement(serialDesc, 1, self.rh_migration_code);
            }
            if (!Intrinsics.areEqual(self.status, "")) {
                output.encodeStringElement(serialDesc, 2, self.status);
            }
            if (!Intrinsics.areEqual(self.transactions, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 3, lazyArr[3].getValue(), self.transactions);
            }
            if (!Intrinsics.areEqual(self.failure_code, "")) {
                output.encodeStringElement(serialDesc, 4, self.failure_code);
            }
            if (Intrinsics.areEqual(self.failure_reason, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 5, self.failure_reason);
        }

        public Surrogate(String partner_migration_code, String rh_migration_code, String status, List<MigrationFinalizeTransactionDto> transactions, String failure_code, String failure_reason) {
            Intrinsics.checkNotNullParameter(partner_migration_code, "partner_migration_code");
            Intrinsics.checkNotNullParameter(rh_migration_code, "rh_migration_code");
            Intrinsics.checkNotNullParameter(status, "status");
            Intrinsics.checkNotNullParameter(transactions, "transactions");
            Intrinsics.checkNotNullParameter(failure_code, "failure_code");
            Intrinsics.checkNotNullParameter(failure_reason, "failure_reason");
            this.partner_migration_code = partner_migration_code;
            this.rh_migration_code = rh_migration_code;
            this.status = status;
            this.transactions = transactions;
            this.failure_code = failure_code;
            this.failure_reason = failure_reason;
        }

        public /* synthetic */ Surrogate(String str, String str2, String str3, List list, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? CollectionsKt.emptyList() : list, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5);
        }

        public final String getPartner_migration_code() {
            return this.partner_migration_code;
        }

        public final String getRh_migration_code() {
            return this.rh_migration_code;
        }

        public final String getStatus() {
            return this.status;
        }

        public final List<MigrationFinalizeTransactionDto> getTransactions() {
            return this.transactions;
        }

        public final String getFailure_code() {
            return this.failure_code;
        }

        public final String getFailure_reason() {
            return this.failure_reason;
        }
    }

    /* compiled from: MigrationFinalizeAckDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationFinalizeAckDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcrypto_portkey/service/v1/MigrationFinalizeAckDataDto;", "Lcrypto_portkey/service/v1/MigrationFinalizeAckData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcrypto_portkey/service/v1/MigrationFinalizeAckDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<MigrationFinalizeAckDataDto, MigrationFinalizeAckData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<MigrationFinalizeAckDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MigrationFinalizeAckDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MigrationFinalizeAckDataDto> getBinaryBase64Serializer() {
            return (KSerializer) MigrationFinalizeAckDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MigrationFinalizeAckData> getProtoAdapter() {
            return MigrationFinalizeAckData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MigrationFinalizeAckDataDto getZeroValue() {
            return MigrationFinalizeAckDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MigrationFinalizeAckDataDto fromProto(MigrationFinalizeAckData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String partner_migration_code = proto.getPartner_migration_code();
            String rh_migration_code = proto.getRh_migration_code();
            String status = proto.getStatus();
            List<MigrationFinalizeTransaction> transactions = proto.getTransactions();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(transactions, 10));
            Iterator<T> it = transactions.iterator();
            while (it.hasNext()) {
                arrayList.add(MigrationFinalizeTransactionDto.INSTANCE.fromProto((MigrationFinalizeTransaction) it.next()));
            }
            return new MigrationFinalizeAckDataDto(new Surrogate(partner_migration_code, rh_migration_code, status, arrayList, proto.getFailure_code(), proto.getFailure_reason()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: crypto_portkey.service.v1.MigrationFinalizeAckDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MigrationFinalizeAckDataDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new MigrationFinalizeAckDataDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MigrationFinalizeAckDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationFinalizeAckDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcrypto_portkey/service/v1/MigrationFinalizeAckDataDto;", "<init>", "()V", "surrogateSerializer", "Lcrypto_portkey/service/v1/MigrationFinalizeAckDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<MigrationFinalizeAckDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/crypto_portkey.service.v1.MigrationFinalizeAckData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MigrationFinalizeAckDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public MigrationFinalizeAckDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new MigrationFinalizeAckDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: MigrationFinalizeAckDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcrypto_portkey/service/v1/MigrationFinalizeAckDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "crypto_portkey.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "crypto_portkey.service.v1.MigrationFinalizeAckDataDto";
        }
    }
}
