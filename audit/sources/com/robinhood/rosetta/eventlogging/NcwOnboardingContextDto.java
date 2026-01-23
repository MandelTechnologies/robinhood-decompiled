package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.NcwOnboardingContext;
import com.robinhood.rosetta.eventlogging.NcwOnboardingContextDto;
import com.squareup.wire.ProtoAdapter;
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

/* compiled from: NcwOnboardingContextDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007()*+,-.B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0010J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020!H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006/"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$Surrogate;)V", "session_id", "", "onboard_result", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardResultDto;", "wallet_onboard_type", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$WalletOnboardTypeDto;", "onboard_error", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardErrorDto;", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardResultDto;Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$WalletOnboardTypeDto;Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardErrorDto;)V", "getSession_id", "()Ljava/lang/String;", "getOnboard_result", "()Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardResultDto;", "getWallet_onboard_type", "()Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$WalletOnboardTypeDto;", "getOnboard_error", "()Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardErrorDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "OnboardResultDto", "WalletOnboardTypeDto", "OnboardErrorDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class NcwOnboardingContextDto implements Dto3<NcwOnboardingContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<NcwOnboardingContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<NcwOnboardingContextDto, NcwOnboardingContext>> binaryBase64Serializer$delegate;
    private static final NcwOnboardingContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ NcwOnboardingContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private NcwOnboardingContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getSession_id() {
        return this.surrogate.getSession_id();
    }

    public final OnboardResultDto getOnboard_result() {
        return this.surrogate.getOnboard_result();
    }

    public final WalletOnboardTypeDto getWallet_onboard_type() {
        return this.surrogate.getWallet_onboard_type();
    }

    public final OnboardErrorDto getOnboard_error() {
        return this.surrogate.getOnboard_error();
    }

    public /* synthetic */ NcwOnboardingContextDto(String str, OnboardResultDto onboardResultDto, WalletOnboardTypeDto walletOnboardTypeDto, OnboardErrorDto onboardErrorDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? OnboardResultDto.INSTANCE.getZeroValue() : onboardResultDto, (i & 4) != 0 ? WalletOnboardTypeDto.INSTANCE.getZeroValue() : walletOnboardTypeDto, (i & 8) != 0 ? OnboardErrorDto.INSTANCE.getZeroValue() : onboardErrorDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NcwOnboardingContextDto(String session_id, OnboardResultDto onboard_result, WalletOnboardTypeDto wallet_onboard_type, OnboardErrorDto onboard_error) {
        this(new Surrogate(session_id, onboard_result, wallet_onboard_type, onboard_error));
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(onboard_result, "onboard_result");
        Intrinsics.checkNotNullParameter(wallet_onboard_type, "wallet_onboard_type");
        Intrinsics.checkNotNullParameter(onboard_error, "onboard_error");
    }

    public static /* synthetic */ NcwOnboardingContextDto copy$default(NcwOnboardingContextDto ncwOnboardingContextDto, String str, OnboardResultDto onboardResultDto, WalletOnboardTypeDto walletOnboardTypeDto, OnboardErrorDto onboardErrorDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ncwOnboardingContextDto.surrogate.getSession_id();
        }
        if ((i & 2) != 0) {
            onboardResultDto = ncwOnboardingContextDto.surrogate.getOnboard_result();
        }
        if ((i & 4) != 0) {
            walletOnboardTypeDto = ncwOnboardingContextDto.surrogate.getWallet_onboard_type();
        }
        if ((i & 8) != 0) {
            onboardErrorDto = ncwOnboardingContextDto.surrogate.getOnboard_error();
        }
        return ncwOnboardingContextDto.copy(str, onboardResultDto, walletOnboardTypeDto, onboardErrorDto);
    }

    public final NcwOnboardingContextDto copy(String session_id, OnboardResultDto onboard_result, WalletOnboardTypeDto wallet_onboard_type, OnboardErrorDto onboard_error) {
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(onboard_result, "onboard_result");
        Intrinsics.checkNotNullParameter(wallet_onboard_type, "wallet_onboard_type");
        Intrinsics.checkNotNullParameter(onboard_error, "onboard_error");
        return new NcwOnboardingContextDto(new Surrogate(session_id, onboard_result, wallet_onboard_type, onboard_error));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public NcwOnboardingContext toProto() {
        return new NcwOnboardingContext(this.surrogate.getSession_id(), (NcwOnboardingContext.OnboardResult) this.surrogate.getOnboard_result().toProto(), (NcwOnboardingContext.WalletOnboardType) this.surrogate.getWallet_onboard_type().toProto(), (NcwOnboardingContext.OnboardError) this.surrogate.getOnboard_error().toProto(), null, 16, null);
    }

    public String toString() {
        return "[NcwOnboardingContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof NcwOnboardingContextDto) && Intrinsics.areEqual(((NcwOnboardingContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: NcwOnboardingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000201B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J1\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\rHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u001d¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$Surrogate;", "", "session_id", "", "onboard_result", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardResultDto;", "wallet_onboard_type", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$WalletOnboardTypeDto;", "onboard_error", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardErrorDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardResultDto;Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$WalletOnboardTypeDto;Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardErrorDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardResultDto;Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$WalletOnboardTypeDto;Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardErrorDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getSession_id$annotations", "()V", "getSession_id", "()Ljava/lang/String;", "getOnboard_result$annotations", "getOnboard_result", "()Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardResultDto;", "getWallet_onboard_type$annotations", "getWallet_onboard_type", "()Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$WalletOnboardTypeDto;", "getOnboard_error$annotations", "getOnboard_error", "()Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardErrorDto;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final OnboardErrorDto onboard_error;
        private final OnboardResultDto onboard_result;
        private final String session_id;
        private final WalletOnboardTypeDto wallet_onboard_type;

        public Surrogate() {
            this((String) null, (OnboardResultDto) null, (WalletOnboardTypeDto) null, (OnboardErrorDto) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, OnboardResultDto onboardResultDto, WalletOnboardTypeDto walletOnboardTypeDto, OnboardErrorDto onboardErrorDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.session_id;
            }
            if ((i & 2) != 0) {
                onboardResultDto = surrogate.onboard_result;
            }
            if ((i & 4) != 0) {
                walletOnboardTypeDto = surrogate.wallet_onboard_type;
            }
            if ((i & 8) != 0) {
                onboardErrorDto = surrogate.onboard_error;
            }
            return surrogate.copy(str, onboardResultDto, walletOnboardTypeDto, onboardErrorDto);
        }

        @SerialName("onboardError")
        @JsonAnnotations2(names = {"onboard_error"})
        public static /* synthetic */ void getOnboard_error$annotations() {
        }

        @SerialName("onboardResult")
        @JsonAnnotations2(names = {"onboard_result"})
        public static /* synthetic */ void getOnboard_result$annotations() {
        }

        @SerialName("sessionId")
        @JsonAnnotations2(names = {"session_id"})
        public static /* synthetic */ void getSession_id$annotations() {
        }

        @SerialName("walletOnboardType")
        @JsonAnnotations2(names = {"wallet_onboard_type"})
        public static /* synthetic */ void getWallet_onboard_type$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getSession_id() {
            return this.session_id;
        }

        /* renamed from: component2, reason: from getter */
        public final OnboardResultDto getOnboard_result() {
            return this.onboard_result;
        }

        /* renamed from: component3, reason: from getter */
        public final WalletOnboardTypeDto getWallet_onboard_type() {
            return this.wallet_onboard_type;
        }

        /* renamed from: component4, reason: from getter */
        public final OnboardErrorDto getOnboard_error() {
            return this.onboard_error;
        }

        public final Surrogate copy(String session_id, OnboardResultDto onboard_result, WalletOnboardTypeDto wallet_onboard_type, OnboardErrorDto onboard_error) {
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            Intrinsics.checkNotNullParameter(onboard_result, "onboard_result");
            Intrinsics.checkNotNullParameter(wallet_onboard_type, "wallet_onboard_type");
            Intrinsics.checkNotNullParameter(onboard_error, "onboard_error");
            return new Surrogate(session_id, onboard_result, wallet_onboard_type, onboard_error);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.session_id, surrogate.session_id) && this.onboard_result == surrogate.onboard_result && this.wallet_onboard_type == surrogate.wallet_onboard_type && this.onboard_error == surrogate.onboard_error;
        }

        public int hashCode() {
            return (((((this.session_id.hashCode() * 31) + this.onboard_result.hashCode()) * 31) + this.wallet_onboard_type.hashCode()) * 31) + this.onboard_error.hashCode();
        }

        public String toString() {
            return "Surrogate(session_id=" + this.session_id + ", onboard_result=" + this.onboard_result + ", wallet_onboard_type=" + this.wallet_onboard_type + ", onboard_error=" + this.onboard_error + ")";
        }

        /* compiled from: NcwOnboardingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return NcwOnboardingContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, OnboardResultDto onboardResultDto, WalletOnboardTypeDto walletOnboardTypeDto, OnboardErrorDto onboardErrorDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.session_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.onboard_result = OnboardResultDto.INSTANCE.getZeroValue();
            } else {
                this.onboard_result = onboardResultDto;
            }
            if ((i & 4) == 0) {
                this.wallet_onboard_type = WalletOnboardTypeDto.INSTANCE.getZeroValue();
            } else {
                this.wallet_onboard_type = walletOnboardTypeDto;
            }
            if ((i & 8) == 0) {
                this.onboard_error = OnboardErrorDto.INSTANCE.getZeroValue();
            } else {
                this.onboard_error = onboardErrorDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.session_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.session_id);
            }
            if (self.onboard_result != OnboardResultDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, OnboardResultDto.Serializer.INSTANCE, self.onboard_result);
            }
            if (self.wallet_onboard_type != WalletOnboardTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, WalletOnboardTypeDto.Serializer.INSTANCE, self.wallet_onboard_type);
            }
            if (self.onboard_error != OnboardErrorDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, OnboardErrorDto.Serializer.INSTANCE, self.onboard_error);
            }
        }

        public Surrogate(String session_id, OnboardResultDto onboard_result, WalletOnboardTypeDto wallet_onboard_type, OnboardErrorDto onboard_error) {
            Intrinsics.checkNotNullParameter(session_id, "session_id");
            Intrinsics.checkNotNullParameter(onboard_result, "onboard_result");
            Intrinsics.checkNotNullParameter(wallet_onboard_type, "wallet_onboard_type");
            Intrinsics.checkNotNullParameter(onboard_error, "onboard_error");
            this.session_id = session_id;
            this.onboard_result = onboard_result;
            this.wallet_onboard_type = wallet_onboard_type;
            this.onboard_error = onboard_error;
        }

        public final String getSession_id() {
            return this.session_id;
        }

        public /* synthetic */ Surrogate(String str, OnboardResultDto onboardResultDto, WalletOnboardTypeDto walletOnboardTypeDto, OnboardErrorDto onboardErrorDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? OnboardResultDto.INSTANCE.getZeroValue() : onboardResultDto, (i & 4) != 0 ? WalletOnboardTypeDto.INSTANCE.getZeroValue() : walletOnboardTypeDto, (i & 8) != 0 ? OnboardErrorDto.INSTANCE.getZeroValue() : onboardErrorDto);
        }

        public final OnboardResultDto getOnboard_result() {
            return this.onboard_result;
        }

        public final WalletOnboardTypeDto getWallet_onboard_type() {
            return this.wallet_onboard_type;
        }

        public final OnboardErrorDto getOnboard_error() {
            return this.onboard_error;
        }
    }

    /* compiled from: NcwOnboardingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto;", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<NcwOnboardingContextDto, NcwOnboardingContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NcwOnboardingContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NcwOnboardingContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NcwOnboardingContextDto> getBinaryBase64Serializer() {
            return (KSerializer) NcwOnboardingContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<NcwOnboardingContext> getProtoAdapter() {
            return NcwOnboardingContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NcwOnboardingContextDto getZeroValue() {
            return NcwOnboardingContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NcwOnboardingContextDto fromProto(NcwOnboardingContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new NcwOnboardingContextDto(new Surrogate(proto.getSession_id(), OnboardResultDto.INSTANCE.fromProto(proto.getOnboard_result()), WalletOnboardTypeDto.INSTANCE.fromProto(proto.getWallet_onboard_type()), OnboardErrorDto.INSTANCE.fromProto(proto.getOnboard_error())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NcwOnboardingContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NcwOnboardingContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new NcwOnboardingContextDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NcwOnboardingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardResultDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$OnboardResult;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "RESULT_UNSPECIFIED", "SUCCESS", "CANCELED_BY_USER", "ERROR", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OnboardResultDto implements Dto2<NcwOnboardingContext.OnboardResult>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OnboardResultDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<OnboardResultDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<OnboardResultDto, NcwOnboardingContext.OnboardResult>> binaryBase64Serializer$delegate;
        public static final OnboardResultDto RESULT_UNSPECIFIED = new RESULT_UNSPECIFIED("RESULT_UNSPECIFIED", 0);
        public static final OnboardResultDto SUCCESS = new SUCCESS("SUCCESS", 1);
        public static final OnboardResultDto CANCELED_BY_USER = new CANCELED_BY_USER("CANCELED_BY_USER", 2);
        public static final OnboardResultDto ERROR = new ERROR("ERROR", 3);

        private static final /* synthetic */ OnboardResultDto[] $values() {
            return new OnboardResultDto[]{RESULT_UNSPECIFIED, SUCCESS, CANCELED_BY_USER, ERROR};
        }

        public /* synthetic */ OnboardResultDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<OnboardResultDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: NcwOnboardingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwOnboardingContextDto.OnboardResultDto.RESULT_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardResultDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$OnboardResult;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RESULT_UNSPECIFIED extends OnboardResultDto {
            RESULT_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwOnboardingContext.OnboardResult toProto() {
                return NcwOnboardingContext.OnboardResult.RESULT_UNSPECIFIED;
            }
        }

        private OnboardResultDto(String str, int i) {
        }

        static {
            OnboardResultDto[] onboardResultDtoArr$values = $values();
            $VALUES = onboardResultDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(onboardResultDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NcwOnboardingContextDto$OnboardResultDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NcwOnboardingContextDto.OnboardResultDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: NcwOnboardingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwOnboardingContextDto.OnboardResultDto.SUCCESS", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardResultDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$OnboardResult;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SUCCESS extends OnboardResultDto {
            SUCCESS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwOnboardingContext.OnboardResult toProto() {
                return NcwOnboardingContext.OnboardResult.SUCCESS;
            }
        }

        /* compiled from: NcwOnboardingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwOnboardingContextDto.OnboardResultDto.CANCELED_BY_USER", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardResultDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$OnboardResult;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CANCELED_BY_USER extends OnboardResultDto {
            CANCELED_BY_USER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwOnboardingContext.OnboardResult toProto() {
                return NcwOnboardingContext.OnboardResult.CANCELED_BY_USER;
            }
        }

        /* compiled from: NcwOnboardingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwOnboardingContextDto.OnboardResultDto.ERROR", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardResultDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$OnboardResult;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ERROR extends OnboardResultDto {
            ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwOnboardingContext.OnboardResult toProto() {
                return NcwOnboardingContext.OnboardResult.ERROR;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: NcwOnboardingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardResultDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardResultDto;", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$OnboardResult;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardResultDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<OnboardResultDto, NcwOnboardingContext.OnboardResult> {

            /* compiled from: NcwOnboardingContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[NcwOnboardingContext.OnboardResult.values().length];
                    try {
                        iArr[NcwOnboardingContext.OnboardResult.RESULT_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[NcwOnboardingContext.OnboardResult.SUCCESS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[NcwOnboardingContext.OnboardResult.CANCELED_BY_USER.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[NcwOnboardingContext.OnboardResult.ERROR.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OnboardResultDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OnboardResultDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OnboardResultDto> getBinaryBase64Serializer() {
                return (KSerializer) OnboardResultDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<NcwOnboardingContext.OnboardResult> getProtoAdapter() {
                return NcwOnboardingContext.OnboardResult.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OnboardResultDto getZeroValue() {
                return OnboardResultDto.RESULT_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OnboardResultDto fromProto(NcwOnboardingContext.OnboardResult proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return OnboardResultDto.RESULT_UNSPECIFIED;
                }
                if (i == 2) {
                    return OnboardResultDto.SUCCESS;
                }
                if (i == 3) {
                    return OnboardResultDto.CANCELED_BY_USER;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return OnboardResultDto.ERROR;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: NcwOnboardingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardResultDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardResultDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<OnboardResultDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<OnboardResultDto, NcwOnboardingContext.OnboardResult> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.NcwOnboardingContext.OnboardResult", OnboardResultDto.getEntries(), OnboardResultDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public OnboardResultDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (OnboardResultDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OnboardResultDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static OnboardResultDto valueOf(String str) {
            return (OnboardResultDto) Enum.valueOf(OnboardResultDto.class, str);
        }

        public static OnboardResultDto[] values() {
            return (OnboardResultDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NcwOnboardingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$WalletOnboardTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$WalletOnboardType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_UNSPECIFIED", "IMPORT", "CREATE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class WalletOnboardTypeDto implements Dto2<NcwOnboardingContext.WalletOnboardType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ WalletOnboardTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<WalletOnboardTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<WalletOnboardTypeDto, NcwOnboardingContext.WalletOnboardType>> binaryBase64Serializer$delegate;
        public static final WalletOnboardTypeDto TYPE_UNSPECIFIED = new TYPE_UNSPECIFIED("TYPE_UNSPECIFIED", 0);
        public static final WalletOnboardTypeDto IMPORT = new IMPORT("IMPORT", 1);
        public static final WalletOnboardTypeDto CREATE = new CREATE("CREATE", 2);

        private static final /* synthetic */ WalletOnboardTypeDto[] $values() {
            return new WalletOnboardTypeDto[]{TYPE_UNSPECIFIED, IMPORT, CREATE};
        }

        public /* synthetic */ WalletOnboardTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<WalletOnboardTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private WalletOnboardTypeDto(String str, int i) {
        }

        /* compiled from: NcwOnboardingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwOnboardingContextDto.WalletOnboardTypeDto.TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$WalletOnboardTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$WalletOnboardType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class TYPE_UNSPECIFIED extends WalletOnboardTypeDto {
            TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwOnboardingContext.WalletOnboardType toProto() {
                return NcwOnboardingContext.WalletOnboardType.TYPE_UNSPECIFIED;
            }
        }

        static {
            WalletOnboardTypeDto[] walletOnboardTypeDtoArr$values = $values();
            $VALUES = walletOnboardTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(walletOnboardTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NcwOnboardingContextDto$WalletOnboardTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NcwOnboardingContextDto.WalletOnboardTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: NcwOnboardingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwOnboardingContextDto.WalletOnboardTypeDto.IMPORT", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$WalletOnboardTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$WalletOnboardType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class IMPORT extends WalletOnboardTypeDto {
            IMPORT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwOnboardingContext.WalletOnboardType toProto() {
                return NcwOnboardingContext.WalletOnboardType.IMPORT;
            }
        }

        /* compiled from: NcwOnboardingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwOnboardingContextDto.WalletOnboardTypeDto.CREATE", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$WalletOnboardTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$WalletOnboardType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CREATE extends WalletOnboardTypeDto {
            CREATE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwOnboardingContext.WalletOnboardType toProto() {
                return NcwOnboardingContext.WalletOnboardType.CREATE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: NcwOnboardingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$WalletOnboardTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$WalletOnboardTypeDto;", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$WalletOnboardType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$WalletOnboardTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<WalletOnboardTypeDto, NcwOnboardingContext.WalletOnboardType> {

            /* compiled from: NcwOnboardingContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[NcwOnboardingContext.WalletOnboardType.values().length];
                    try {
                        iArr[NcwOnboardingContext.WalletOnboardType.TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[NcwOnboardingContext.WalletOnboardType.IMPORT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[NcwOnboardingContext.WalletOnboardType.CREATE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<WalletOnboardTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<WalletOnboardTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<WalletOnboardTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) WalletOnboardTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<NcwOnboardingContext.WalletOnboardType> getProtoAdapter() {
                return NcwOnboardingContext.WalletOnboardType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public WalletOnboardTypeDto getZeroValue() {
                return WalletOnboardTypeDto.TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public WalletOnboardTypeDto fromProto(NcwOnboardingContext.WalletOnboardType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return WalletOnboardTypeDto.TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return WalletOnboardTypeDto.IMPORT;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return WalletOnboardTypeDto.CREATE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: NcwOnboardingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$WalletOnboardTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$WalletOnboardTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<WalletOnboardTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<WalletOnboardTypeDto, NcwOnboardingContext.WalletOnboardType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.NcwOnboardingContext.WalletOnboardType", WalletOnboardTypeDto.getEntries(), WalletOnboardTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public WalletOnboardTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (WalletOnboardTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, WalletOnboardTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static WalletOnboardTypeDto valueOf(String str) {
            return (WalletOnboardTypeDto) Enum.valueOf(WalletOnboardTypeDto.class, str);
        }

        public static WalletOnboardTypeDto[] values() {
            return (WalletOnboardTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NcwOnboardingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016j\u0002\b\u0007j\u0002\b\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardErrorDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$OnboardError;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ERROR_UNSPECIFIED", "INVALID_RECOVERY_PHRASE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class OnboardErrorDto implements Dto2<NcwOnboardingContext.OnboardError>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OnboardErrorDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<OnboardErrorDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final OnboardErrorDto ERROR_UNSPECIFIED = new ERROR_UNSPECIFIED("ERROR_UNSPECIFIED", 0);
        public static final OnboardErrorDto INVALID_RECOVERY_PHRASE = new INVALID_RECOVERY_PHRASE("INVALID_RECOVERY_PHRASE", 1);
        private static final Lazy<BinaryBase64DtoSerializer<OnboardErrorDto, NcwOnboardingContext.OnboardError>> binaryBase64Serializer$delegate;

        private static final /* synthetic */ OnboardErrorDto[] $values() {
            return new OnboardErrorDto[]{ERROR_UNSPECIFIED, INVALID_RECOVERY_PHRASE};
        }

        public /* synthetic */ OnboardErrorDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<OnboardErrorDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: NcwOnboardingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwOnboardingContextDto.OnboardErrorDto.ERROR_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardErrorDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$OnboardError;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ERROR_UNSPECIFIED extends OnboardErrorDto {
            ERROR_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwOnboardingContext.OnboardError toProto() {
                return NcwOnboardingContext.OnboardError.ERROR_UNSPECIFIED;
            }
        }

        private OnboardErrorDto(String str, int i) {
        }

        static {
            OnboardErrorDto[] onboardErrorDtoArr$values = $values();
            $VALUES = onboardErrorDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(onboardErrorDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.NcwOnboardingContextDto$OnboardErrorDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return NcwOnboardingContextDto.OnboardErrorDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: NcwOnboardingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/NcwOnboardingContextDto.OnboardErrorDto.INVALID_RECOVERY_PHRASE", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardErrorDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$OnboardError;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INVALID_RECOVERY_PHRASE extends OnboardErrorDto {
            INVALID_RECOVERY_PHRASE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public NcwOnboardingContext.OnboardError toProto() {
                return NcwOnboardingContext.OnboardError.INVALID_RECOVERY_PHRASE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: NcwOnboardingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardErrorDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardErrorDto;", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContext$OnboardError;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardErrorDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<OnboardErrorDto, NcwOnboardingContext.OnboardError> {

            /* compiled from: NcwOnboardingContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[NcwOnboardingContext.OnboardError.values().length];
                    try {
                        iArr[NcwOnboardingContext.OnboardError.ERROR_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[NcwOnboardingContext.OnboardError.INVALID_RECOVERY_PHRASE.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<OnboardErrorDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OnboardErrorDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<OnboardErrorDto> getBinaryBase64Serializer() {
                return (KSerializer) OnboardErrorDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<NcwOnboardingContext.OnboardError> getProtoAdapter() {
                return NcwOnboardingContext.OnboardError.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OnboardErrorDto getZeroValue() {
                return OnboardErrorDto.ERROR_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public OnboardErrorDto fromProto(NcwOnboardingContext.OnboardError proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return OnboardErrorDto.ERROR_UNSPECIFIED;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                return OnboardErrorDto.INVALID_RECOVERY_PHRASE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: NcwOnboardingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardErrorDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$OnboardErrorDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<OnboardErrorDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<OnboardErrorDto, NcwOnboardingContext.OnboardError> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.NcwOnboardingContext.OnboardError", OnboardErrorDto.getEntries(), OnboardErrorDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public OnboardErrorDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (OnboardErrorDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, OnboardErrorDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static OnboardErrorDto valueOf(String str) {
            return (OnboardErrorDto) Enum.valueOf(OnboardErrorDto.class, str);
        }

        public static OnboardErrorDto[] values() {
            return (OnboardErrorDto[]) $VALUES.clone();
        }
    }

    /* compiled from: NcwOnboardingContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<NcwOnboardingContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.NcwOnboardingContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, NcwOnboardingContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public NcwOnboardingContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new NcwOnboardingContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: NcwOnboardingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/NcwOnboardingContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.NcwOnboardingContextDto";
        }
    }
}
