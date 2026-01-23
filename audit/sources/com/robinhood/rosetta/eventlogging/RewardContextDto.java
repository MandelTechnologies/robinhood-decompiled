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
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.BooleanDto;
import com.robinhood.rosetta.eventlogging.MoneyDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: RewardContextDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004./01B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BS\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0013JP\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\tJ\b\u0010 \u001a\u00020\u0002H\u0016J\b\u0010!\u001a\u00020\tH\u0016J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H\u0096\u0002J\b\u0010&\u001a\u00020'H\u0016J\u0018\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020'H\u0016J\b\u0010-\u001a\u00020'H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0015¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RewardContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/RewardContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/RewardContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/RewardContextDto$Surrogate;)V", "reward_id", "", "reward_amount", "Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "reward_quantity", "", "instrument_price", "button_text", "instrument_disabled", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "reward_type", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MoneyDto;DLcom/robinhood/rosetta/eventlogging/MoneyDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Ljava/lang/String;)V", "getReward_id", "()Ljava/lang/String;", "getReward_amount", "()Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "getReward_quantity", "()D", "getInstrument_price", "getButton_text", "getInstrument_disabled", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getReward_type", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class RewardContextDto implements Dto3<RewardContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<RewardContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<RewardContextDto, RewardContext>> binaryBase64Serializer$delegate;
    private static final RewardContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ RewardContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private RewardContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getReward_id() {
        return this.surrogate.getReward_id();
    }

    public final MoneyDto getReward_amount() {
        return this.surrogate.getReward_amount();
    }

    public final double getReward_quantity() {
        return this.surrogate.getReward_quantity();
    }

    public final MoneyDto getInstrument_price() {
        return this.surrogate.getInstrument_price();
    }

    public final String getButton_text() {
        return this.surrogate.getButton_text();
    }

    public final BooleanDto getInstrument_disabled() {
        return this.surrogate.getInstrument_disabled();
    }

    public final String getReward_type() {
        return this.surrogate.getReward_type();
    }

    public /* synthetic */ RewardContextDto(String str, MoneyDto moneyDto, double d, MoneyDto moneyDto2, String str2, BooleanDto booleanDto, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : moneyDto, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? null : moneyDto2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 64) != 0 ? "" : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RewardContextDto(String reward_id, MoneyDto moneyDto, double d, MoneyDto moneyDto2, String button_text, BooleanDto instrument_disabled, String reward_type) {
        this(new Surrogate(reward_id, moneyDto, d, moneyDto2, button_text, instrument_disabled, reward_type));
        Intrinsics.checkNotNullParameter(reward_id, "reward_id");
        Intrinsics.checkNotNullParameter(button_text, "button_text");
        Intrinsics.checkNotNullParameter(instrument_disabled, "instrument_disabled");
        Intrinsics.checkNotNullParameter(reward_type, "reward_type");
    }

    public static /* synthetic */ RewardContextDto copy$default(RewardContextDto rewardContextDto, String str, MoneyDto moneyDto, double d, MoneyDto moneyDto2, String str2, BooleanDto booleanDto, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardContextDto.surrogate.getReward_id();
        }
        if ((i & 2) != 0) {
            moneyDto = rewardContextDto.surrogate.getReward_amount();
        }
        if ((i & 4) != 0) {
            d = rewardContextDto.surrogate.getReward_quantity();
        }
        if ((i & 8) != 0) {
            moneyDto2 = rewardContextDto.surrogate.getInstrument_price();
        }
        if ((i & 16) != 0) {
            str2 = rewardContextDto.surrogate.getButton_text();
        }
        if ((i & 32) != 0) {
            booleanDto = rewardContextDto.surrogate.getInstrument_disabled();
        }
        if ((i & 64) != 0) {
            str3 = rewardContextDto.surrogate.getReward_type();
        }
        double d2 = d;
        return rewardContextDto.copy(str, moneyDto, d2, moneyDto2, str2, booleanDto, str3);
    }

    public final RewardContextDto copy(String reward_id, MoneyDto reward_amount, double reward_quantity, MoneyDto instrument_price, String button_text, BooleanDto instrument_disabled, String reward_type) {
        Intrinsics.checkNotNullParameter(reward_id, "reward_id");
        Intrinsics.checkNotNullParameter(button_text, "button_text");
        Intrinsics.checkNotNullParameter(instrument_disabled, "instrument_disabled");
        Intrinsics.checkNotNullParameter(reward_type, "reward_type");
        return new RewardContextDto(new Surrogate(reward_id, reward_amount, reward_quantity, instrument_price, button_text, instrument_disabled, reward_type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public RewardContext toProto() {
        String reward_id = this.surrogate.getReward_id();
        MoneyDto reward_amount = this.surrogate.getReward_amount();
        Money proto = reward_amount != null ? reward_amount.toProto() : null;
        double reward_quantity = this.surrogate.getReward_quantity();
        MoneyDto instrument_price = this.surrogate.getInstrument_price();
        return new RewardContext(reward_id, proto, reward_quantity, instrument_price != null ? instrument_price.toProto() : null, this.surrogate.getButton_text(), (Boolean) this.surrogate.getInstrument_disabled().toProto(), this.surrogate.getReward_type(), null, 128, null);
    }

    public String toString() {
        return "[RewardContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof RewardContextDto) && Intrinsics.areEqual(((RewardContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: RewardContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 @2\u00020\u0001:\u0002?@B`\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011B_\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0010\u0010\u0016J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0018\u0010,\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\t\u0010/\u001a\u00020\u000eHÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003Jb\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0017\b\u0002\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0003HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0013HÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001J%\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u00002\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0001¢\u0006\u0002\b>R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001dR+\u0010\u0006\u001a\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\t0\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010 R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0018\u001a\u0004\b\"\u0010\u001dR\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0018\u001a\u0004\b$\u0010\u001aR\u001c\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010'R\u001c\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u001a¨\u0006A"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RewardContextDto$Surrogate;", "", "reward_id", "", "reward_amount", "Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "reward_quantity", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "instrument_price", "button_text", "instrument_disabled", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "reward_type", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/MoneyDto;DLcom/robinhood/rosetta/eventlogging/MoneyDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/MoneyDto;DLcom/robinhood/rosetta/eventlogging/MoneyDto;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getReward_id$annotations", "()V", "getReward_id", "()Ljava/lang/String;", "getReward_amount$annotations", "getReward_amount", "()Lcom/robinhood/rosetta/eventlogging/MoneyDto;", "getReward_quantity$annotations", "getReward_quantity", "()D", "getInstrument_price$annotations", "getInstrument_price", "getButton_text$annotations", "getButton_text", "getInstrument_disabled$annotations", "getInstrument_disabled", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getReward_type$annotations", "getReward_type", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String button_text;
        private final BooleanDto instrument_disabled;
        private final MoneyDto instrument_price;
        private final MoneyDto reward_amount;
        private final String reward_id;
        private final double reward_quantity;
        private final String reward_type;

        public Surrogate() {
            this((String) null, (MoneyDto) null, 0.0d, (MoneyDto) null, (String) null, (BooleanDto) null, (String) null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, MoneyDto moneyDto, double d, MoneyDto moneyDto2, String str2, BooleanDto booleanDto, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.reward_id;
            }
            if ((i & 2) != 0) {
                moneyDto = surrogate.reward_amount;
            }
            if ((i & 4) != 0) {
                d = surrogate.reward_quantity;
            }
            if ((i & 8) != 0) {
                moneyDto2 = surrogate.instrument_price;
            }
            if ((i & 16) != 0) {
                str2 = surrogate.button_text;
            }
            if ((i & 32) != 0) {
                booleanDto = surrogate.instrument_disabled;
            }
            if ((i & 64) != 0) {
                str3 = surrogate.reward_type;
            }
            double d2 = d;
            return surrogate.copy(str, moneyDto, d2, moneyDto2, str2, booleanDto, str3);
        }

        @SerialName("buttonText")
        @JsonAnnotations2(names = {"button_text"})
        public static /* synthetic */ void getButton_text$annotations() {
        }

        @SerialName("instrumentDisabled")
        @JsonAnnotations2(names = {"instrument_disabled"})
        public static /* synthetic */ void getInstrument_disabled$annotations() {
        }

        @SerialName("instrumentPrice")
        @JsonAnnotations2(names = {"instrument_price"})
        public static /* synthetic */ void getInstrument_price$annotations() {
        }

        @SerialName("rewardAmount")
        @JsonAnnotations2(names = {"reward_amount"})
        public static /* synthetic */ void getReward_amount$annotations() {
        }

        @SerialName("rewardId")
        @JsonAnnotations2(names = {"reward_id"})
        public static /* synthetic */ void getReward_id$annotations() {
        }

        @SerialName("rewardQuantity")
        @JsonAnnotations2(names = {"reward_quantity"})
        public static /* synthetic */ void getReward_quantity$annotations() {
        }

        @SerialName("rewardType")
        @JsonAnnotations2(names = {"reward_type"})
        public static /* synthetic */ void getReward_type$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getReward_id() {
            return this.reward_id;
        }

        /* renamed from: component2, reason: from getter */
        public final MoneyDto getReward_amount() {
            return this.reward_amount;
        }

        /* renamed from: component3, reason: from getter */
        public final double getReward_quantity() {
            return this.reward_quantity;
        }

        /* renamed from: component4, reason: from getter */
        public final MoneyDto getInstrument_price() {
            return this.instrument_price;
        }

        /* renamed from: component5, reason: from getter */
        public final String getButton_text() {
            return this.button_text;
        }

        /* renamed from: component6, reason: from getter */
        public final BooleanDto getInstrument_disabled() {
            return this.instrument_disabled;
        }

        /* renamed from: component7, reason: from getter */
        public final String getReward_type() {
            return this.reward_type;
        }

        public final Surrogate copy(String reward_id, MoneyDto reward_amount, double reward_quantity, MoneyDto instrument_price, String button_text, BooleanDto instrument_disabled, String reward_type) {
            Intrinsics.checkNotNullParameter(reward_id, "reward_id");
            Intrinsics.checkNotNullParameter(button_text, "button_text");
            Intrinsics.checkNotNullParameter(instrument_disabled, "instrument_disabled");
            Intrinsics.checkNotNullParameter(reward_type, "reward_type");
            return new Surrogate(reward_id, reward_amount, reward_quantity, instrument_price, button_text, instrument_disabled, reward_type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.reward_id, surrogate.reward_id) && Intrinsics.areEqual(this.reward_amount, surrogate.reward_amount) && Double.compare(this.reward_quantity, surrogate.reward_quantity) == 0 && Intrinsics.areEqual(this.instrument_price, surrogate.instrument_price) && Intrinsics.areEqual(this.button_text, surrogate.button_text) && this.instrument_disabled == surrogate.instrument_disabled && Intrinsics.areEqual(this.reward_type, surrogate.reward_type);
        }

        public int hashCode() {
            int iHashCode = this.reward_id.hashCode() * 31;
            MoneyDto moneyDto = this.reward_amount;
            int iHashCode2 = (((iHashCode + (moneyDto == null ? 0 : moneyDto.hashCode())) * 31) + Double.hashCode(this.reward_quantity)) * 31;
            MoneyDto moneyDto2 = this.instrument_price;
            return ((((((iHashCode2 + (moneyDto2 != null ? moneyDto2.hashCode() : 0)) * 31) + this.button_text.hashCode()) * 31) + this.instrument_disabled.hashCode()) * 31) + this.reward_type.hashCode();
        }

        public String toString() {
            return "Surrogate(reward_id=" + this.reward_id + ", reward_amount=" + this.reward_amount + ", reward_quantity=" + this.reward_quantity + ", instrument_price=" + this.instrument_price + ", button_text=" + this.button_text + ", instrument_disabled=" + this.instrument_disabled + ", reward_type=" + this.reward_type + ")";
        }

        /* compiled from: RewardContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RewardContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RewardContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return RewardContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, MoneyDto moneyDto, double d, MoneyDto moneyDto2, String str2, BooleanDto booleanDto, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.reward_id = "";
            } else {
                this.reward_id = str;
            }
            if ((i & 2) == 0) {
                this.reward_amount = null;
            } else {
                this.reward_amount = moneyDto;
            }
            if ((i & 4) == 0) {
                this.reward_quantity = 0.0d;
            } else {
                this.reward_quantity = d;
            }
            if ((i & 8) == 0) {
                this.instrument_price = null;
            } else {
                this.instrument_price = moneyDto2;
            }
            if ((i & 16) == 0) {
                this.button_text = "";
            } else {
                this.button_text = str2;
            }
            if ((i & 32) == 0) {
                this.instrument_disabled = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.instrument_disabled = booleanDto;
            }
            if ((i & 64) == 0) {
                this.reward_type = "";
            } else {
                this.reward_type = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.reward_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.reward_id);
            }
            MoneyDto moneyDto = self.reward_amount;
            if (moneyDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, MoneyDto.Serializer.INSTANCE, moneyDto);
            }
            if (Double.compare(self.reward_quantity, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 2, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.reward_quantity));
            }
            MoneyDto moneyDto2 = self.instrument_price;
            if (moneyDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, MoneyDto.Serializer.INSTANCE, moneyDto2);
            }
            if (!Intrinsics.areEqual(self.button_text, "")) {
                output.encodeStringElement(serialDesc, 4, self.button_text);
            }
            if (self.instrument_disabled != BooleanDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, BooleanDto.Serializer.INSTANCE, self.instrument_disabled);
            }
            if (Intrinsics.areEqual(self.reward_type, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 6, self.reward_type);
        }

        public Surrogate(String reward_id, MoneyDto moneyDto, double d, MoneyDto moneyDto2, String button_text, BooleanDto instrument_disabled, String reward_type) {
            Intrinsics.checkNotNullParameter(reward_id, "reward_id");
            Intrinsics.checkNotNullParameter(button_text, "button_text");
            Intrinsics.checkNotNullParameter(instrument_disabled, "instrument_disabled");
            Intrinsics.checkNotNullParameter(reward_type, "reward_type");
            this.reward_id = reward_id;
            this.reward_amount = moneyDto;
            this.reward_quantity = d;
            this.instrument_price = moneyDto2;
            this.button_text = button_text;
            this.instrument_disabled = instrument_disabled;
            this.reward_type = reward_type;
        }

        public /* synthetic */ Surrogate(String str, MoneyDto moneyDto, double d, MoneyDto moneyDto2, String str2, BooleanDto booleanDto, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : moneyDto, (i & 4) != 0 ? 0.0d : d, (i & 8) != 0 ? null : moneyDto2, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 64) != 0 ? "" : str3);
        }

        public final String getReward_id() {
            return this.reward_id;
        }

        public final MoneyDto getReward_amount() {
            return this.reward_amount;
        }

        public final double getReward_quantity() {
            return this.reward_quantity;
        }

        public final MoneyDto getInstrument_price() {
            return this.instrument_price;
        }

        public final String getButton_text() {
            return this.button_text;
        }

        public final BooleanDto getInstrument_disabled() {
            return this.instrument_disabled;
        }

        public final String getReward_type() {
            return this.reward_type;
        }
    }

    /* compiled from: RewardContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RewardContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/RewardContextDto;", "Lcom/robinhood/rosetta/eventlogging/RewardContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/RewardContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<RewardContextDto, RewardContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RewardContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RewardContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RewardContextDto> getBinaryBase64Serializer() {
            return (KSerializer) RewardContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<RewardContext> getProtoAdapter() {
            return RewardContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RewardContextDto getZeroValue() {
            return RewardContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RewardContextDto fromProto(RewardContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String reward_id = proto.getReward_id();
            Money reward_amount = proto.getReward_amount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            MoneyDto moneyDtoFromProto = reward_amount != null ? MoneyDto.INSTANCE.fromProto(reward_amount) : null;
            double reward_quantity = proto.getReward_quantity();
            Money instrument_price = proto.getInstrument_price();
            return new RewardContextDto(new Surrogate(reward_id, moneyDtoFromProto, reward_quantity, instrument_price != null ? MoneyDto.INSTANCE.fromProto(instrument_price) : null, proto.getButton_text(), BooleanDto.INSTANCE.fromProto(proto.getInstrument_disabled()), proto.getReward_type()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.RewardContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RewardContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new RewardContextDto(null, null, 0.0d, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: RewardContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RewardContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RewardContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/RewardContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<RewardContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.RewardContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, RewardContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public RewardContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new RewardContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: RewardContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RewardContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.RewardContextDto";
        }
    }
}
