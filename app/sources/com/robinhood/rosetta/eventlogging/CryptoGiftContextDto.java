package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.DoubleAsNumberSerializer;
import com.robinhood.rosetta.eventlogging.BooleanDto;
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

/* compiled from: CryptoGiftContextDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*+,-B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0011JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\tJ\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\tH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0013R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0013¨\u0006."}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoGiftContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoGiftContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CryptoGiftContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoGiftContextDto$Surrogate;)V", "card_id", "", "amount", "", "currency_id", "has_message", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "alert_button_title", "gift_id", "(Ljava/lang/String;DLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Ljava/lang/String;Ljava/lang/String;)V", "getCard_id", "()Ljava/lang/String;", "getAmount", "()D", "getCurrency_id", "getHas_message", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getAlert_button_title", "getGift_id", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CryptoGiftContextDto implements Dto3<CryptoGiftContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CryptoGiftContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CryptoGiftContextDto, CryptoGiftContext>> binaryBase64Serializer$delegate;
    private static final CryptoGiftContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CryptoGiftContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CryptoGiftContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getCard_id() {
        return this.surrogate.getCard_id();
    }

    public final double getAmount() {
        return this.surrogate.getAmount();
    }

    public final String getCurrency_id() {
        return this.surrogate.getCurrency_id();
    }

    public final BooleanDto getHas_message() {
        return this.surrogate.getHas_message();
    }

    public final String getAlert_button_title() {
        return this.surrogate.getAlert_button_title();
    }

    public final String getGift_id() {
        return this.surrogate.getGift_id();
    }

    public /* synthetic */ CryptoGiftContextDto(String str, double d, String str2, BooleanDto booleanDto, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CryptoGiftContextDto(String card_id, double d, String currency_id, BooleanDto has_message, String alert_button_title, String gift_id) {
        this(new Surrogate(card_id, d, currency_id, has_message, alert_button_title, gift_id));
        Intrinsics.checkNotNullParameter(card_id, "card_id");
        Intrinsics.checkNotNullParameter(currency_id, "currency_id");
        Intrinsics.checkNotNullParameter(has_message, "has_message");
        Intrinsics.checkNotNullParameter(alert_button_title, "alert_button_title");
        Intrinsics.checkNotNullParameter(gift_id, "gift_id");
    }

    public static /* synthetic */ CryptoGiftContextDto copy$default(CryptoGiftContextDto cryptoGiftContextDto, String str, double d, String str2, BooleanDto booleanDto, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cryptoGiftContextDto.surrogate.getCard_id();
        }
        if ((i & 2) != 0) {
            d = cryptoGiftContextDto.surrogate.getAmount();
        }
        if ((i & 4) != 0) {
            str2 = cryptoGiftContextDto.surrogate.getCurrency_id();
        }
        if ((i & 8) != 0) {
            booleanDto = cryptoGiftContextDto.surrogate.getHas_message();
        }
        if ((i & 16) != 0) {
            str3 = cryptoGiftContextDto.surrogate.getAlert_button_title();
        }
        if ((i & 32) != 0) {
            str4 = cryptoGiftContextDto.surrogate.getGift_id();
        }
        return cryptoGiftContextDto.copy(str, d, str2, booleanDto, str3, str4);
    }

    public final CryptoGiftContextDto copy(String card_id, double amount, String currency_id, BooleanDto has_message, String alert_button_title, String gift_id) {
        Intrinsics.checkNotNullParameter(card_id, "card_id");
        Intrinsics.checkNotNullParameter(currency_id, "currency_id");
        Intrinsics.checkNotNullParameter(has_message, "has_message");
        Intrinsics.checkNotNullParameter(alert_button_title, "alert_button_title");
        Intrinsics.checkNotNullParameter(gift_id, "gift_id");
        return new CryptoGiftContextDto(new Surrogate(card_id, amount, currency_id, has_message, alert_button_title, gift_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CryptoGiftContext toProto() {
        return new CryptoGiftContext(this.surrogate.getCard_id(), this.surrogate.getAmount(), this.surrogate.getCurrency_id(), (Boolean) this.surrogate.getHas_message().toProto(), this.surrogate.getAlert_button_title(), this.surrogate.getGift_id(), null, 64, null);
    }

    public String toString() {
        return "[CryptoGiftContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CryptoGiftContextDto) && Intrinsics.areEqual(((CryptoGiftContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: CryptoGiftContextDto.kt */
    @Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 :2\u00020\u0001:\u00029:BR\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fBU\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0014J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\u0018\u0010&\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\bHÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003JT\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0017\b\u0002\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010/\u001a\u00020\u0011HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001J%\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0001¢\u0006\u0002\b8R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R+\u0010\u0004\u001a\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010 R\u001c\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018¨\u0006;"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoGiftContextDto$Surrogate;", "", "card_id", "", "amount", "", "Lkotlinx/serialization/Serializable;", "with", "Lcom/robinhood/idl/serialization/DoubleSerializer;", "currency_id", "has_message", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "alert_button_title", "gift_id", "<init>", "(Ljava/lang/String;DLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;DLjava/lang/String;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCard_id$annotations", "()V", "getCard_id", "()Ljava/lang/String;", "getAmount$annotations", "getAmount", "()D", "getCurrency_id$annotations", "getCurrency_id", "getHas_message$annotations", "getHas_message", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getAlert_button_title$annotations", "getAlert_button_title", "getGift_id$annotations", "getGift_id", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String alert_button_title;
        private final double amount;
        private final String card_id;
        private final String currency_id;
        private final String gift_id;
        private final BooleanDto has_message;

        public Surrogate() {
            this((String) null, 0.0d, (String) null, (BooleanDto) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, double d, String str2, BooleanDto booleanDto, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.card_id;
            }
            if ((i & 2) != 0) {
                d = surrogate.amount;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.currency_id;
            }
            if ((i & 8) != 0) {
                booleanDto = surrogate.has_message;
            }
            if ((i & 16) != 0) {
                str3 = surrogate.alert_button_title;
            }
            if ((i & 32) != 0) {
                str4 = surrogate.gift_id;
            }
            return surrogate.copy(str, d, str2, booleanDto, str3, str4);
        }

        @SerialName("alertButtonTitle")
        @JsonAnnotations2(names = {"alert_button_title"})
        public static /* synthetic */ void getAlert_button_title$annotations() {
        }

        @SerialName("amount")
        @JsonAnnotations2(names = {"amount"})
        public static /* synthetic */ void getAmount$annotations() {
        }

        @SerialName("cardId")
        @JsonAnnotations2(names = {"card_id"})
        public static /* synthetic */ void getCard_id$annotations() {
        }

        @SerialName("currencyId")
        @JsonAnnotations2(names = {"currency_id"})
        public static /* synthetic */ void getCurrency_id$annotations() {
        }

        @SerialName("giftId")
        @JsonAnnotations2(names = {"gift_id"})
        public static /* synthetic */ void getGift_id$annotations() {
        }

        @SerialName("hasMessage")
        @JsonAnnotations2(names = {"has_message"})
        public static /* synthetic */ void getHas_message$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getCard_id() {
            return this.card_id;
        }

        /* renamed from: component2, reason: from getter */
        public final double getAmount() {
            return this.amount;
        }

        /* renamed from: component3, reason: from getter */
        public final String getCurrency_id() {
            return this.currency_id;
        }

        /* renamed from: component4, reason: from getter */
        public final BooleanDto getHas_message() {
            return this.has_message;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAlert_button_title() {
            return this.alert_button_title;
        }

        /* renamed from: component6, reason: from getter */
        public final String getGift_id() {
            return this.gift_id;
        }

        public final Surrogate copy(String card_id, double amount, String currency_id, BooleanDto has_message, String alert_button_title, String gift_id) {
            Intrinsics.checkNotNullParameter(card_id, "card_id");
            Intrinsics.checkNotNullParameter(currency_id, "currency_id");
            Intrinsics.checkNotNullParameter(has_message, "has_message");
            Intrinsics.checkNotNullParameter(alert_button_title, "alert_button_title");
            Intrinsics.checkNotNullParameter(gift_id, "gift_id");
            return new Surrogate(card_id, amount, currency_id, has_message, alert_button_title, gift_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.card_id, surrogate.card_id) && Double.compare(this.amount, surrogate.amount) == 0 && Intrinsics.areEqual(this.currency_id, surrogate.currency_id) && this.has_message == surrogate.has_message && Intrinsics.areEqual(this.alert_button_title, surrogate.alert_button_title) && Intrinsics.areEqual(this.gift_id, surrogate.gift_id);
        }

        public int hashCode() {
            return (((((((((this.card_id.hashCode() * 31) + Double.hashCode(this.amount)) * 31) + this.currency_id.hashCode()) * 31) + this.has_message.hashCode()) * 31) + this.alert_button_title.hashCode()) * 31) + this.gift_id.hashCode();
        }

        public String toString() {
            return "Surrogate(card_id=" + this.card_id + ", amount=" + this.amount + ", currency_id=" + this.currency_id + ", has_message=" + this.has_message + ", alert_button_title=" + this.alert_button_title + ", gift_id=" + this.gift_id + ")";
        }

        /* compiled from: CryptoGiftContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoGiftContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoGiftContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CryptoGiftContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, double d, String str2, BooleanDto booleanDto, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.card_id = "";
            } else {
                this.card_id = str;
            }
            if ((i & 2) == 0) {
                this.amount = 0.0d;
            } else {
                this.amount = d;
            }
            if ((i & 4) == 0) {
                this.currency_id = "";
            } else {
                this.currency_id = str2;
            }
            if ((i & 8) == 0) {
                this.has_message = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.has_message = booleanDto;
            }
            if ((i & 16) == 0) {
                this.alert_button_title = "";
            } else {
                this.alert_button_title = str3;
            }
            if ((i & 32) == 0) {
                this.gift_id = "";
            } else {
                this.gift_id = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.card_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.card_id);
            }
            if (Double.compare(self.amount, 0.0d) != 0) {
                output.encodeSerializableElement(serialDesc, 1, DoubleAsNumberSerializer.INSTANCE, Double.valueOf(self.amount));
            }
            if (!Intrinsics.areEqual(self.currency_id, "")) {
                output.encodeStringElement(serialDesc, 2, self.currency_id);
            }
            if (self.has_message != BooleanDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, BooleanDto.Serializer.INSTANCE, self.has_message);
            }
            if (!Intrinsics.areEqual(self.alert_button_title, "")) {
                output.encodeStringElement(serialDesc, 4, self.alert_button_title);
            }
            if (Intrinsics.areEqual(self.gift_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 5, self.gift_id);
        }

        public Surrogate(String card_id, double d, String currency_id, BooleanDto has_message, String alert_button_title, String gift_id) {
            Intrinsics.checkNotNullParameter(card_id, "card_id");
            Intrinsics.checkNotNullParameter(currency_id, "currency_id");
            Intrinsics.checkNotNullParameter(has_message, "has_message");
            Intrinsics.checkNotNullParameter(alert_button_title, "alert_button_title");
            Intrinsics.checkNotNullParameter(gift_id, "gift_id");
            this.card_id = card_id;
            this.amount = d;
            this.currency_id = currency_id;
            this.has_message = has_message;
            this.alert_button_title = alert_button_title;
            this.gift_id = gift_id;
        }

        public /* synthetic */ Surrogate(String str, double d, String str2, BooleanDto booleanDto, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0d : d, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4);
        }

        public final String getCard_id() {
            return this.card_id;
        }

        public final double getAmount() {
            return this.amount;
        }

        public final String getCurrency_id() {
            return this.currency_id;
        }

        public final BooleanDto getHas_message() {
            return this.has_message;
        }

        public final String getAlert_button_title() {
            return this.alert_button_title;
        }

        public final String getGift_id() {
            return this.gift_id;
        }
    }

    /* compiled from: CryptoGiftContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoGiftContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CryptoGiftContextDto;", "Lcom/robinhood/rosetta/eventlogging/CryptoGiftContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CryptoGiftContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CryptoGiftContextDto, CryptoGiftContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CryptoGiftContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoGiftContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CryptoGiftContextDto> getBinaryBase64Serializer() {
            return (KSerializer) CryptoGiftContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CryptoGiftContext> getProtoAdapter() {
            return CryptoGiftContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoGiftContextDto getZeroValue() {
            return CryptoGiftContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CryptoGiftContextDto fromProto(CryptoGiftContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CryptoGiftContextDto(new Surrogate(proto.getCard_id(), proto.getAmount(), proto.getCurrency_id(), BooleanDto.INSTANCE.fromProto(proto.getHas_message()), proto.getAlert_button_title(), proto.getGift_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CryptoGiftContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoGiftContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CryptoGiftContextDto(null, 0.0d, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CryptoGiftContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoGiftContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CryptoGiftContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CryptoGiftContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CryptoGiftContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CryptoGiftContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CryptoGiftContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CryptoGiftContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CryptoGiftContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CryptoGiftContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoGiftContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CryptoGiftContextDto";
        }
    }
}
