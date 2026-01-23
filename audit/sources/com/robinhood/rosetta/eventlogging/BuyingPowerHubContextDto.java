package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.eventlogging.AccountTypeDto;
import com.robinhood.rosetta.eventlogging.MarginHealthStateDto;
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

/* compiled from: BuyingPowerHubContextDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004$%&'B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0006\u0010\u000fJ.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0013\u0010\u0019\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001dH\u0016J\b\u0010#\u001a\u00020\u001dH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0014¨\u0006("}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BuyingPowerHubContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerHubContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerHubContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/BuyingPowerHubContextDto$Surrogate;)V", "margin_health_state", "Lcom/robinhood/rosetta/eventlogging/MarginHealthStateDto;", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lcom/robinhood/rosetta/eventlogging/AccountTypeDto;", "is_margin_enabled", "", "is_in_deficit", "(Lcom/robinhood/rosetta/eventlogging/MarginHealthStateDto;Lcom/robinhood/rosetta/eventlogging/AccountTypeDto;ZZ)V", "getMargin_health_state", "()Lcom/robinhood/rosetta/eventlogging/MarginHealthStateDto;", "getAccount_type", "()Lcom/robinhood/rosetta/eventlogging/AccountTypeDto;", "()Z", "copy", "toProto", "toString", "", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class BuyingPowerHubContextDto implements Dto3<BuyingPowerHubContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BuyingPowerHubContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BuyingPowerHubContextDto, BuyingPowerHubContext>> binaryBase64Serializer$delegate;
    private static final BuyingPowerHubContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BuyingPowerHubContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BuyingPowerHubContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final MarginHealthStateDto getMargin_health_state() {
        return this.surrogate.getMargin_health_state();
    }

    public final AccountTypeDto getAccount_type() {
        return this.surrogate.getAccount_type();
    }

    public final boolean is_margin_enabled() {
        return this.surrogate.is_margin_enabled();
    }

    public final boolean is_in_deficit() {
        return this.surrogate.is_in_deficit();
    }

    public /* synthetic */ BuyingPowerHubContextDto(MarginHealthStateDto marginHealthStateDto, AccountTypeDto accountTypeDto, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MarginHealthStateDto.INSTANCE.getZeroValue() : marginHealthStateDto, (i & 2) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuyingPowerHubContextDto(MarginHealthStateDto margin_health_state, AccountTypeDto account_type, boolean z, boolean z2) {
        this(new Surrogate(margin_health_state, account_type, z, z2));
        Intrinsics.checkNotNullParameter(margin_health_state, "margin_health_state");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
    }

    public static /* synthetic */ BuyingPowerHubContextDto copy$default(BuyingPowerHubContextDto buyingPowerHubContextDto, MarginHealthStateDto marginHealthStateDto, AccountTypeDto accountTypeDto, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            marginHealthStateDto = buyingPowerHubContextDto.surrogate.getMargin_health_state();
        }
        if ((i & 2) != 0) {
            accountTypeDto = buyingPowerHubContextDto.surrogate.getAccount_type();
        }
        if ((i & 4) != 0) {
            z = buyingPowerHubContextDto.surrogate.is_margin_enabled();
        }
        if ((i & 8) != 0) {
            z2 = buyingPowerHubContextDto.surrogate.is_in_deficit();
        }
        return buyingPowerHubContextDto.copy(marginHealthStateDto, accountTypeDto, z, z2);
    }

    public final BuyingPowerHubContextDto copy(MarginHealthStateDto margin_health_state, AccountTypeDto account_type, boolean is_margin_enabled, boolean is_in_deficit) {
        Intrinsics.checkNotNullParameter(margin_health_state, "margin_health_state");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        return new BuyingPowerHubContextDto(new Surrogate(margin_health_state, account_type, is_margin_enabled, is_in_deficit));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public BuyingPowerHubContext toProto() {
        return new BuyingPowerHubContext((MarginHealthState) this.surrogate.getMargin_health_state().toProto(), (AccountType) this.surrogate.getAccount_type().toProto(), this.surrogate.is_margin_enabled(), this.surrogate.is_in_deficit(), null, 16, null);
    }

    public String toString() {
        return "[BuyingPowerHubContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BuyingPowerHubContextDto) && Intrinsics.areEqual(((BuyingPowerHubContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: BuyingPowerHubContextDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 -2\u00020\u0001:\u0002,-B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\fHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001J%\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00002\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0001¢\u0006\u0002\b+R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0006\u0010\u0018R\u001c\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0011\u001a\u0004\b\b\u0010\u0018¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BuyingPowerHubContextDto$Surrogate;", "", "margin_health_state", "Lcom/robinhood/rosetta/eventlogging/MarginHealthStateDto;", InstantCashConstants.ACCOUNT_TYPE_KEY, "Lcom/robinhood/rosetta/eventlogging/AccountTypeDto;", "is_margin_enabled", "", "is_in_deficit", "<init>", "(Lcom/robinhood/rosetta/eventlogging/MarginHealthStateDto;Lcom/robinhood/rosetta/eventlogging/AccountTypeDto;ZZ)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/MarginHealthStateDto;Lcom/robinhood/rosetta/eventlogging/AccountTypeDto;ZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMargin_health_state$annotations", "()V", "getMargin_health_state", "()Lcom/robinhood/rosetta/eventlogging/MarginHealthStateDto;", "getAccount_type$annotations", "getAccount_type", "()Lcom/robinhood/rosetta/eventlogging/AccountTypeDto;", "is_margin_enabled$annotations", "()Z", "is_in_deficit$annotations", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final AccountTypeDto account_type;
        private final boolean is_in_deficit;
        private final boolean is_margin_enabled;
        private final MarginHealthStateDto margin_health_state;

        public Surrogate() {
            this((MarginHealthStateDto) null, (AccountTypeDto) null, false, false, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, MarginHealthStateDto marginHealthStateDto, AccountTypeDto accountTypeDto, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                marginHealthStateDto = surrogate.margin_health_state;
            }
            if ((i & 2) != 0) {
                accountTypeDto = surrogate.account_type;
            }
            if ((i & 4) != 0) {
                z = surrogate.is_margin_enabled;
            }
            if ((i & 8) != 0) {
                z2 = surrogate.is_in_deficit;
            }
            return surrogate.copy(marginHealthStateDto, accountTypeDto, z, z2);
        }

        @SerialName("accountType")
        @JsonAnnotations2(names = {InstantCashConstants.ACCOUNT_TYPE_KEY})
        public static /* synthetic */ void getAccount_type$annotations() {
        }

        @SerialName("marginHealthState")
        @JsonAnnotations2(names = {"margin_health_state"})
        public static /* synthetic */ void getMargin_health_state$annotations() {
        }

        @SerialName("isInDeficit")
        @JsonAnnotations2(names = {"is_in_deficit"})
        public static /* synthetic */ void is_in_deficit$annotations() {
        }

        @SerialName("isMarginEnabled")
        @JsonAnnotations2(names = {"is_margin_enabled"})
        public static /* synthetic */ void is_margin_enabled$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final MarginHealthStateDto getMargin_health_state() {
            return this.margin_health_state;
        }

        /* renamed from: component2, reason: from getter */
        public final AccountTypeDto getAccount_type() {
            return this.account_type;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIs_margin_enabled() {
            return this.is_margin_enabled;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIs_in_deficit() {
            return this.is_in_deficit;
        }

        public final Surrogate copy(MarginHealthStateDto margin_health_state, AccountTypeDto account_type, boolean is_margin_enabled, boolean is_in_deficit) {
            Intrinsics.checkNotNullParameter(margin_health_state, "margin_health_state");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            return new Surrogate(margin_health_state, account_type, is_margin_enabled, is_in_deficit);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.margin_health_state == surrogate.margin_health_state && this.account_type == surrogate.account_type && this.is_margin_enabled == surrogate.is_margin_enabled && this.is_in_deficit == surrogate.is_in_deficit;
        }

        public int hashCode() {
            return (((((this.margin_health_state.hashCode() * 31) + this.account_type.hashCode()) * 31) + java.lang.Boolean.hashCode(this.is_margin_enabled)) * 31) + java.lang.Boolean.hashCode(this.is_in_deficit);
        }

        public String toString() {
            return "Surrogate(margin_health_state=" + this.margin_health_state + ", account_type=" + this.account_type + ", is_margin_enabled=" + this.is_margin_enabled + ", is_in_deficit=" + this.is_in_deficit + ")";
        }

        /* compiled from: BuyingPowerHubContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BuyingPowerHubContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerHubContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BuyingPowerHubContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, MarginHealthStateDto marginHealthStateDto, AccountTypeDto accountTypeDto, boolean z, boolean z2, SerializationConstructorMarker serializationConstructorMarker) {
            this.margin_health_state = (i & 1) == 0 ? MarginHealthStateDto.INSTANCE.getZeroValue() : marginHealthStateDto;
            if ((i & 2) == 0) {
                this.account_type = AccountTypeDto.INSTANCE.getZeroValue();
            } else {
                this.account_type = accountTypeDto;
            }
            if ((i & 4) == 0) {
                this.is_margin_enabled = false;
            } else {
                this.is_margin_enabled = z;
            }
            if ((i & 8) == 0) {
                this.is_in_deficit = false;
            } else {
                this.is_in_deficit = z2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.margin_health_state != MarginHealthStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, MarginHealthStateDto.Serializer.INSTANCE, self.margin_health_state);
            }
            if (self.account_type != AccountTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, AccountTypeDto.Serializer.INSTANCE, self.account_type);
            }
            boolean z = self.is_margin_enabled;
            if (z) {
                output.encodeBooleanElement(serialDesc, 2, z);
            }
            boolean z2 = self.is_in_deficit;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 3, z2);
            }
        }

        public Surrogate(MarginHealthStateDto margin_health_state, AccountTypeDto account_type, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(margin_health_state, "margin_health_state");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            this.margin_health_state = margin_health_state;
            this.account_type = account_type;
            this.is_margin_enabled = z;
            this.is_in_deficit = z2;
        }

        public final MarginHealthStateDto getMargin_health_state() {
            return this.margin_health_state;
        }

        public /* synthetic */ Surrogate(MarginHealthStateDto marginHealthStateDto, AccountTypeDto accountTypeDto, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? MarginHealthStateDto.INSTANCE.getZeroValue() : marginHealthStateDto, (i & 2) != 0 ? AccountTypeDto.INSTANCE.getZeroValue() : accountTypeDto, (i & 4) != 0 ? false : z, (i & 8) != 0 ? false : z2);
        }

        public final AccountTypeDto getAccount_type() {
            return this.account_type;
        }

        public final boolean is_margin_enabled() {
            return this.is_margin_enabled;
        }

        public final boolean is_in_deficit() {
            return this.is_in_deficit;
        }
    }

    /* compiled from: BuyingPowerHubContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BuyingPowerHubContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerHubContextDto;", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerHubContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/BuyingPowerHubContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<BuyingPowerHubContextDto, BuyingPowerHubContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BuyingPowerHubContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BuyingPowerHubContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BuyingPowerHubContextDto> getBinaryBase64Serializer() {
            return (KSerializer) BuyingPowerHubContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BuyingPowerHubContext> getProtoAdapter() {
            return BuyingPowerHubContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BuyingPowerHubContextDto getZeroValue() {
            return BuyingPowerHubContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BuyingPowerHubContextDto fromProto(BuyingPowerHubContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new BuyingPowerHubContextDto(new Surrogate(MarginHealthStateDto.INSTANCE.fromProto(proto.getMargin_health_state()), AccountTypeDto.INSTANCE.fromProto(proto.getAccount_type()), proto.getIs_margin_enabled(), proto.getIs_in_deficit()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.BuyingPowerHubContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BuyingPowerHubContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new BuyingPowerHubContextDto(null, null, false, false, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BuyingPowerHubContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BuyingPowerHubContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerHubContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/BuyingPowerHubContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<BuyingPowerHubContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.BuyingPowerHubContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BuyingPowerHubContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BuyingPowerHubContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BuyingPowerHubContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: BuyingPowerHubContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/BuyingPowerHubContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.BuyingPowerHubContextDto";
        }
    }
}
