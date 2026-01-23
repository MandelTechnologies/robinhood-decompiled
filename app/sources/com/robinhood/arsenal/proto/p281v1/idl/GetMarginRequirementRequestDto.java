package com.robinhood.arsenal.proto.p281v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.arsenal.proto.p281v1.idl.AccountTypeDto;
import com.robinhood.arsenal.proto.p281v1.idl.MarginTypeDto;
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

/* compiled from: GetMarginRequirementRequestDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004$%&'B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B'\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000eJ$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001dH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006("}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto$Surrogate;)V", "contract_id", "", "margin_type", "Lcom/robinhood/arsenal/proto/v1/idl/MarginTypeDto;", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lcom/robinhood/arsenal/proto/v1/idl/AccountTypeDto;", "(Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/MarginTypeDto;Lcom/robinhood/arsenal/proto/v1/idl/AccountTypeDto;)V", "getContract_id", "()Ljava/lang/String;", "getMargin_type", "()Lcom/robinhood/arsenal/proto/v1/idl/MarginTypeDto;", "getAccount_type", "()Lcom/robinhood/arsenal/proto/v1/idl/AccountTypeDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes20.dex */
public final class GetMarginRequirementRequestDto implements Dto3<GetMarginRequirementRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetMarginRequirementRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetMarginRequirementRequestDto, GetMarginRequirementRequest>> binaryBase64Serializer$delegate;
    private static final GetMarginRequirementRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetMarginRequirementRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetMarginRequirementRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getContract_id() {
        return this.surrogate.getContract_id();
    }

    public final MarginTypeDto getMargin_type() {
        return this.surrogate.getMargin_type();
    }

    public final AccountTypeDto getAccount_type() {
        return this.surrogate.getAccount_type();
    }

    public /* synthetic */ GetMarginRequirementRequestDto(String str, MarginTypeDto marginTypeDto, AccountTypeDto accountTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? MarginTypeDto.INSTANCE.getZeroValue() : marginTypeDto, (i & 4) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetMarginRequirementRequestDto(String contract_id, MarginTypeDto margin_type, AccountTypeDto account_type) {
        this(new Surrogate(contract_id, margin_type, account_type));
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(margin_type, "margin_type");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
    }

    public static /* synthetic */ GetMarginRequirementRequestDto copy$default(GetMarginRequirementRequestDto getMarginRequirementRequestDto, String str, MarginTypeDto marginTypeDto, AccountTypeDto accountTypeDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getMarginRequirementRequestDto.surrogate.getContract_id();
        }
        if ((i & 2) != 0) {
            marginTypeDto = getMarginRequirementRequestDto.surrogate.getMargin_type();
        }
        if ((i & 4) != 0) {
            accountTypeDto = getMarginRequirementRequestDto.surrogate.getAccount_type();
        }
        return getMarginRequirementRequestDto.copy(str, marginTypeDto, accountTypeDto);
    }

    public final GetMarginRequirementRequestDto copy(String contract_id, MarginTypeDto margin_type, AccountTypeDto account_type) {
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(margin_type, "margin_type");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        return new GetMarginRequirementRequestDto(new Surrogate(contract_id, margin_type, account_type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetMarginRequirementRequest toProto() {
        return new GetMarginRequirementRequest(this.surrogate.getContract_id(), (MarginType) this.surrogate.getMargin_type().toProto(), (AccountType) this.surrogate.getAccount_type().toProto(), null, 8, null);
    }

    public String toString() {
        return "[GetMarginRequirementRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetMarginRequirementRequestDto) && Intrinsics.areEqual(((GetMarginRequirementRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetMarginRequirementRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 +2\u00020\u0001:\u0002*+B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J'\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u000bHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J%\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u0001¢\u0006\u0002\b)R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018¨\u0006,"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto$Surrogate;", "", "contract_id", "", "margin_type", "Lcom/robinhood/arsenal/proto/v1/idl/MarginTypeDto;", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lcom/robinhood/arsenal/proto/v1/idl/AccountTypeDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/MarginTypeDto;Lcom/robinhood/arsenal/proto/v1/idl/AccountTypeDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/arsenal/proto/v1/idl/MarginTypeDto;Lcom/robinhood/arsenal/proto/v1/idl/AccountTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getContract_id$annotations", "()V", "getContract_id", "()Ljava/lang/String;", "getMargin_type$annotations", "getMargin_type", "()Lcom/robinhood/arsenal/proto/v1/idl/MarginTypeDto;", "getAccount_type$annotations", "getAccount_type", "()Lcom/robinhood/arsenal/proto/v1/idl/AccountTypeDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$arsenal_v1_public_externalRelease", "$serializer", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AccountTypeDto account_type;
        private final String contract_id;
        private final MarginTypeDto margin_type;

        public Surrogate() {
            this((String) null, (MarginTypeDto) null, (AccountTypeDto) null, 7, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, MarginTypeDto marginTypeDto, AccountTypeDto accountTypeDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.contract_id;
            }
            if ((i & 2) != 0) {
                marginTypeDto = surrogate.margin_type;
            }
            if ((i & 4) != 0) {
                accountTypeDto = surrogate.account_type;
            }
            return surrogate.copy(str, marginTypeDto, accountTypeDto);
        }

        @SerialName("accountType")
        @JsonAnnotations2(names = {InstantCashConstants.ACCOUNT_TYPE_KEY})
        public static /* synthetic */ void getAccount_type$annotations() {
        }

        @SerialName("contractId")
        @JsonAnnotations2(names = {"contract_id"})
        public static /* synthetic */ void getContract_id$annotations() {
        }

        @SerialName("marginType")
        @JsonAnnotations2(names = {"margin_type"})
        public static /* synthetic */ void getMargin_type$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getContract_id() {
            return this.contract_id;
        }

        /* renamed from: component2, reason: from getter */
        public final MarginTypeDto getMargin_type() {
            return this.margin_type;
        }

        /* renamed from: component3, reason: from getter */
        public final AccountTypeDto getAccount_type() {
            return this.account_type;
        }

        public final Surrogate copy(String contract_id, MarginTypeDto margin_type, AccountTypeDto account_type) {
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(margin_type, "margin_type");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            return new Surrogate(contract_id, margin_type, account_type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.contract_id, surrogate.contract_id) && this.margin_type == surrogate.margin_type && this.account_type == surrogate.account_type;
        }

        public int hashCode() {
            return (((this.contract_id.hashCode() * 31) + this.margin_type.hashCode()) * 31) + this.account_type.hashCode();
        }

        public String toString() {
            return "Surrogate(contract_id=" + this.contract_id + ", margin_type=" + this.margin_type + ", account_type=" + this.account_type + ")";
        }

        /* compiled from: GetMarginRequirementRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto$Surrogate;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetMarginRequirementRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, MarginTypeDto marginTypeDto, AccountTypeDto accountTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.contract_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.margin_type = MarginTypeDto.INSTANCE.getZeroValue();
            } else {
                this.margin_type = marginTypeDto;
            }
            if ((i & 4) == 0) {
                this.account_type = AccountTypeDto.INSTANCE.getZeroValue();
            } else {
                this.account_type = accountTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$arsenal_v1_public_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.contract_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.contract_id);
            }
            if (self.margin_type != MarginTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, MarginTypeDto.Serializer.INSTANCE, self.margin_type);
            }
            if (self.account_type != AccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, AccountTypeDto.Serializer.INSTANCE, self.account_type);
            }
        }

        public Surrogate(String contract_id, MarginTypeDto margin_type, AccountTypeDto account_type) {
            Intrinsics.checkNotNullParameter(contract_id, "contract_id");
            Intrinsics.checkNotNullParameter(margin_type, "margin_type");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            this.contract_id = contract_id;
            this.margin_type = margin_type;
            this.account_type = account_type;
        }

        public final String getContract_id() {
            return this.contract_id;
        }

        public /* synthetic */ Surrogate(String str, MarginTypeDto marginTypeDto, AccountTypeDto accountTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? MarginTypeDto.INSTANCE.getZeroValue() : marginTypeDto, (i & 4) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto);
        }

        public final MarginTypeDto getMargin_type() {
            return this.margin_type;
        }

        public final AccountTypeDto getAccount_type() {
            return this.account_type;
        }
    }

    /* compiled from: GetMarginRequirementRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto;", "Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<GetMarginRequirementRequestDto, GetMarginRequirementRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetMarginRequirementRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetMarginRequirementRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetMarginRequirementRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetMarginRequirementRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetMarginRequirementRequest> getProtoAdapter() {
            return GetMarginRequirementRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetMarginRequirementRequestDto getZeroValue() {
            return GetMarginRequirementRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetMarginRequirementRequestDto fromProto(GetMarginRequirementRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new GetMarginRequirementRequestDto(new Surrogate(proto.getContract_id(), MarginTypeDto.INSTANCE.fromProto(proto.getMargin_type()), AccountTypeDto.INSTANCE.fromProto(proto.getAccount_type())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.GetMarginRequirementRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetMarginRequirementRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetMarginRequirementRequestDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetMarginRequirementRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Serializer implements KSerializer<GetMarginRequirementRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/arsenal.public.GetMarginRequirementRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetMarginRequirementRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetMarginRequirementRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetMarginRequirementRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetMarginRequirementRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/GetMarginRequirementRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.arsenal.proto.v1.idl.GetMarginRequirementRequestDto";
        }
    }
}
