package nummus.p512v1;

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
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import rosetta.nummus.MonetizationModel;
import rosetta.nummus.MonetizationModelDto;

/* compiled from: AccountPreferenceRetrieveResponseDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004,+-.B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BO\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006/"}, m3636d2 = {"Lnummus/v1/AccountPreferenceRetrieveResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lnummus/v1/AccountPreferenceRetrieveResponse;", "Landroid/os/Parcelable;", "Lnummus/v1/AccountPreferenceRetrieveResponseDto$Surrogate;", "surrogate", "<init>", "(Lnummus/v1/AccountPreferenceRetrieveResponseDto$Surrogate;)V", "Lrosetta/nummus/MonetizationModelDto;", "monetization_model", "", "id", "account_id", "created_at", "updated_at", "", "ineligible_for_monetization", "has_ever_enabled_fee_monetization", "(Lrosetta/nummus/MonetizationModelDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "toProto", "()Lnummus/v1/AccountPreferenceRetrieveResponse;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lnummus/v1/AccountPreferenceRetrieveResponseDto$Surrogate;", "getMonetization_model", "()Lrosetta/nummus/MonetizationModelDto;", "getId", "getIneligible_for_monetization", "()Z", "Companion", "Surrogate", "Serializer", "MultibindingModule", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public final class AccountPreferenceRetrieveResponseDto implements Dto3<AccountPreferenceRetrieveResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AccountPreferenceRetrieveResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AccountPreferenceRetrieveResponseDto, AccountPreferenceRetrieveResponse>> binaryBase64Serializer$delegate;
    private static final AccountPreferenceRetrieveResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AccountPreferenceRetrieveResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AccountPreferenceRetrieveResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MonetizationModelDto getMonetization_model() {
        return this.surrogate.getMonetization_model();
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final boolean getIneligible_for_monetization() {
        return this.surrogate.getIneligible_for_monetization();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ AccountPreferenceRetrieveResponseDto(rosetta.nummus.MonetizationModelDto r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto La
            rosetta.nummus.MonetizationModelDto$Companion r2 = rosetta.nummus.MonetizationModelDto.INSTANCE
            rosetta.nummus.MonetizationModelDto r2 = r2.getZeroValue()
        La:
            r10 = r9 & 2
            java.lang.String r0 = ""
            if (r10 == 0) goto L11
            r3 = r0
        L11:
            r10 = r9 & 4
            if (r10 == 0) goto L16
            r4 = r0
        L16:
            r10 = r9 & 8
            if (r10 == 0) goto L1b
            r5 = r0
        L1b:
            r10 = r9 & 16
            if (r10 == 0) goto L20
            r6 = r0
        L20:
            r10 = r9 & 32
            r0 = 0
            if (r10 == 0) goto L26
            r7 = r0
        L26:
            r9 = r9 & 64
            if (r9 == 0) goto L33
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L3b
        L33:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L3b:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nummus.p512v1.AccountPreferenceRetrieveResponseDto.<init>(rosetta.nummus.MonetizationModelDto, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccountPreferenceRetrieveResponseDto(MonetizationModelDto monetization_model, String id, String account_id, String created_at, String updated_at, boolean z, boolean z2) {
        this(new Surrogate(monetization_model, id, account_id, created_at, updated_at, z, z2));
        Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public AccountPreferenceRetrieveResponse toProto() {
        return new AccountPreferenceRetrieveResponse((MonetizationModel) this.surrogate.getMonetization_model().toProto(), this.surrogate.getId(), this.surrogate.getAccount_id(), this.surrogate.getCreated_at(), this.surrogate.getUpdated_at(), this.surrogate.getIneligible_for_monetization(), this.surrogate.getHas_ever_enabled_fee_monetization(), null, 128, null);
    }

    public String toString() {
        return "[AccountPreferenceRetrieveResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AccountPreferenceRetrieveResponseDto) && Intrinsics.areEqual(((AccountPreferenceRetrieveResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: AccountPreferenceRetrieveResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b!\b\u0083\b\u0018\u0000 72\u00020\u0001:\u000287BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rB]\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\t2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u001dR \u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010(\u0012\u0004\b,\u0010'\u001a\u0004\b+\u0010\u001dR \u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010(\u0012\u0004\b.\u0010'\u001a\u0004\b-\u0010\u001dR \u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010(\u0012\u0004\b0\u0010'\u001a\u0004\b/\u0010\u001dR \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\b4\u0010'\u001a\u0004\b2\u00103R \u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00101\u0012\u0004\b6\u0010'\u001a\u0004\b5\u00103¨\u00069"}, m3636d2 = {"Lnummus/v1/AccountPreferenceRetrieveResponseDto$Surrogate;", "", "Lrosetta/nummus/MonetizationModelDto;", "monetization_model", "", "id", "account_id", "created_at", "updated_at", "", "ineligible_for_monetization", "has_ever_enabled_fee_monetization", "<init>", "(Lrosetta/nummus/MonetizationModelDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILrosetta/nummus/MonetizationModelDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$nummus_v1_externalRelease", "(Lnummus/v1/AccountPreferenceRetrieveResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lrosetta/nummus/MonetizationModelDto;", "getMonetization_model", "()Lrosetta/nummus/MonetizationModelDto;", "getMonetization_model$annotations", "()V", "Ljava/lang/String;", "getId", "getId$annotations", "getAccount_id", "getAccount_id$annotations", "getCreated_at", "getCreated_at$annotations", "getUpdated_at", "getUpdated_at$annotations", "Z", "getIneligible_for_monetization", "()Z", "getIneligible_for_monetization$annotations", "getHas_ever_enabled_fee_monetization", "getHas_ever_enabled_fee_monetization$annotations", "Companion", "$serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_id;
        private final String created_at;
        private final boolean has_ever_enabled_fee_monetization;
        private final String id;
        private final boolean ineligible_for_monetization;
        private final MonetizationModelDto monetization_model;
        private final String updated_at;

        public Surrogate() {
            this((MonetizationModelDto) null, (String) null, (String) null, (String) null, (String) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.monetization_model == surrogate.monetization_model && Intrinsics.areEqual(this.id, surrogate.id) && Intrinsics.areEqual(this.account_id, surrogate.account_id) && Intrinsics.areEqual(this.created_at, surrogate.created_at) && Intrinsics.areEqual(this.updated_at, surrogate.updated_at) && this.ineligible_for_monetization == surrogate.ineligible_for_monetization && this.has_ever_enabled_fee_monetization == surrogate.has_ever_enabled_fee_monetization;
        }

        public int hashCode() {
            return (((((((((((this.monetization_model.hashCode() * 31) + this.id.hashCode()) * 31) + this.account_id.hashCode()) * 31) + this.created_at.hashCode()) * 31) + this.updated_at.hashCode()) * 31) + Boolean.hashCode(this.ineligible_for_monetization)) * 31) + Boolean.hashCode(this.has_ever_enabled_fee_monetization);
        }

        public String toString() {
            return "Surrogate(monetization_model=" + this.monetization_model + ", id=" + this.id + ", account_id=" + this.account_id + ", created_at=" + this.created_at + ", updated_at=" + this.updated_at + ", ineligible_for_monetization=" + this.ineligible_for_monetization + ", has_ever_enabled_fee_monetization=" + this.has_ever_enabled_fee_monetization + ")";
        }

        /* compiled from: AccountPreferenceRetrieveResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lnummus/v1/AccountPreferenceRetrieveResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/AccountPreferenceRetrieveResponseDto$Surrogate;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AccountPreferenceRetrieveResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MonetizationModelDto monetizationModelDto, String str, String str2, String str3, String str4, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
            this.monetization_model = (i & 1) == 0 ? MonetizationModelDto.INSTANCE.getZeroValue() : monetizationModelDto;
            if ((i & 2) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 4) == 0) {
                this.account_id = "";
            } else {
                this.account_id = str2;
            }
            if ((i & 8) == 0) {
                this.created_at = "";
            } else {
                this.created_at = str3;
            }
            if ((i & 16) == 0) {
                this.updated_at = "";
            } else {
                this.updated_at = str4;
            }
            if ((i & 32) == 0) {
                this.ineligible_for_monetization = false;
            } else {
                this.ineligible_for_monetization = z;
            }
            if ((i & 64) == 0) {
                this.has_ever_enabled_fee_monetization = false;
            } else {
                this.has_ever_enabled_fee_monetization = z2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$nummus_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.monetization_model != MonetizationModelDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, MonetizationModelDto.Serializer.INSTANCE, self.monetization_model);
            }
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 1, self.id);
            }
            if (!Intrinsics.areEqual(self.account_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.account_id);
            }
            if (!Intrinsics.areEqual(self.created_at, "")) {
                output.encodeStringElement(serialDesc, 3, self.created_at);
            }
            if (!Intrinsics.areEqual(self.updated_at, "")) {
                output.encodeStringElement(serialDesc, 4, self.updated_at);
            }
            boolean z = self.ineligible_for_monetization;
            if (z) {
                output.encodeBooleanElement(serialDesc, 5, z);
            }
            boolean z2 = self.has_ever_enabled_fee_monetization;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 6, z2);
            }
        }

        public Surrogate(MonetizationModelDto monetization_model, String id, String account_id, String created_at, String updated_at, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(monetization_model, "monetization_model");
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(account_id, "account_id");
            Intrinsics.checkNotNullParameter(created_at, "created_at");
            Intrinsics.checkNotNullParameter(updated_at, "updated_at");
            this.monetization_model = monetization_model;
            this.id = id;
            this.account_id = account_id;
            this.created_at = created_at;
            this.updated_at = updated_at;
            this.ineligible_for_monetization = z;
            this.has_ever_enabled_fee_monetization = z2;
        }

        public final MonetizationModelDto getMonetization_model() {
            return this.monetization_model;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(rosetta.nummus.MonetizationModelDto r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
            /*
                r1 = this;
                r10 = r9 & 1
                if (r10 == 0) goto La
                rosetta.nummus.MonetizationModelDto$Companion r2 = rosetta.nummus.MonetizationModelDto.INSTANCE
                rosetta.nummus.MonetizationModelDto r2 = r2.getZeroValue()
            La:
                r10 = r9 & 2
                java.lang.String r0 = ""
                if (r10 == 0) goto L11
                r3 = r0
            L11:
                r10 = r9 & 4
                if (r10 == 0) goto L16
                r4 = r0
            L16:
                r10 = r9 & 8
                if (r10 == 0) goto L1b
                r5 = r0
            L1b:
                r10 = r9 & 16
                if (r10 == 0) goto L20
                r6 = r0
            L20:
                r10 = r9 & 32
                r0 = 0
                if (r10 == 0) goto L26
                r7 = r0
            L26:
                r9 = r9 & 64
                if (r9 == 0) goto L33
                r10 = r0
                r8 = r6
                r9 = r7
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
                goto L3b
            L33:
                r10 = r8
                r9 = r7
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
            L3b:
                r3.<init>(r4, r5, r6, r7, r8, r9, r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: nummus.p512v1.AccountPreferenceRetrieveResponseDto.Surrogate.<init>(rosetta.nummus.MonetizationModelDto, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getId() {
            return this.id;
        }

        public final String getAccount_id() {
            return this.account_id;
        }

        public final String getCreated_at() {
            return this.created_at;
        }

        public final String getUpdated_at() {
            return this.updated_at;
        }

        public final boolean getIneligible_for_monetization() {
            return this.ineligible_for_monetization;
        }

        public final boolean getHas_ever_enabled_fee_monetization() {
            return this.has_ever_enabled_fee_monetization;
        }
    }

    /* compiled from: AccountPreferenceRetrieveResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lnummus/v1/AccountPreferenceRetrieveResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lnummus/v1/AccountPreferenceRetrieveResponseDto;", "Lnummus/v1/AccountPreferenceRetrieveResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lnummus/v1/AccountPreferenceRetrieveResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<AccountPreferenceRetrieveResponseDto, AccountPreferenceRetrieveResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AccountPreferenceRetrieveResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AccountPreferenceRetrieveResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AccountPreferenceRetrieveResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) AccountPreferenceRetrieveResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AccountPreferenceRetrieveResponse> getProtoAdapter() {
            return AccountPreferenceRetrieveResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AccountPreferenceRetrieveResponseDto getZeroValue() {
            return AccountPreferenceRetrieveResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AccountPreferenceRetrieveResponseDto fromProto(AccountPreferenceRetrieveResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new AccountPreferenceRetrieveResponseDto(new Surrogate(MonetizationModelDto.INSTANCE.fromProto(proto.getMonetization_model()), proto.getId(), proto.getAccount_id(), proto.getCreated_at(), proto.getUpdated_at(), proto.getIneligible_for_monetization(), proto.getHas_ever_enabled_fee_monetization()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: nummus.v1.AccountPreferenceRetrieveResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountPreferenceRetrieveResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AccountPreferenceRetrieveResponseDto(null, null, null, null, null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AccountPreferenceRetrieveResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lnummus/v1/AccountPreferenceRetrieveResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lnummus/v1/AccountPreferenceRetrieveResponseDto;", "<init>", "()V", "surrogateSerializer", "Lnummus/v1/AccountPreferenceRetrieveResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<AccountPreferenceRetrieveResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/nummus.v1.AccountPreferenceRetrieveResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AccountPreferenceRetrieveResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AccountPreferenceRetrieveResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AccountPreferenceRetrieveResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AccountPreferenceRetrieveResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lnummus/v1/AccountPreferenceRetrieveResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4191_7)
        public final String provideIntoMap() {
            return "nummus.v1.AccountPreferenceRetrieveResponseDto";
        }
    }
}
