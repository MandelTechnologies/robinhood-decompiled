package com.robinhood.rosetta.cashier;

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
import com.robinhood.rosetta.cashier.CheckoutCardRelationshipDetails;
import com.robinhood.rosetta.cashier.CheckoutCardRelationshipDetailsDto;
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

/* compiled from: CheckoutCardRelationshipDetailsDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005()*+,B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0010JB\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\b\b\u0002\u0010\u000f\u001a\u00020\tJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020!H\u0016J\b\u0010'\u001a\u00020!H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006-"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$Surrogate;)V", "relationship_id", "", "user_uuid", "state", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$CheckoutCardRelationshipStateDto;", "card_fingerprint", "card_number_last_four", "card_nickname", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$CheckoutCardRelationshipStateDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRelationship_id", "()Ljava/lang/String;", "getUser_uuid", "getState", "()Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$CheckoutCardRelationshipStateDto;", "getCard_fingerprint", "getCard_number_last_four", "getCard_nickname", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "CheckoutCardRelationshipStateDto", "Serializer", "MultibindingModule", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class CheckoutCardRelationshipDetailsDto implements Dto3<CheckoutCardRelationshipDetails>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CheckoutCardRelationshipDetailsDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CheckoutCardRelationshipDetailsDto, CheckoutCardRelationshipDetails>> binaryBase64Serializer$delegate;
    private static final CheckoutCardRelationshipDetailsDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CheckoutCardRelationshipDetailsDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CheckoutCardRelationshipDetailsDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getRelationship_id() {
        return this.surrogate.getRelationship_id();
    }

    public final String getUser_uuid() {
        return this.surrogate.getUser_uuid();
    }

    public final CheckoutCardRelationshipStateDto getState() {
        return this.surrogate.getState();
    }

    public final String getCard_fingerprint() {
        return this.surrogate.getCard_fingerprint();
    }

    public final String getCard_number_last_four() {
        return this.surrogate.getCard_number_last_four();
    }

    public final String getCard_nickname() {
        return this.surrogate.getCard_nickname();
    }

    public /* synthetic */ CheckoutCardRelationshipDetailsDto(String str, String str2, CheckoutCardRelationshipStateDto checkoutCardRelationshipStateDto, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CheckoutCardRelationshipStateDto.INSTANCE.getZeroValue() : checkoutCardRelationshipStateDto, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CheckoutCardRelationshipDetailsDto(String relationship_id, String user_uuid, CheckoutCardRelationshipStateDto state, String card_fingerprint, String card_number_last_four, String card_nickname) {
        this(new Surrogate(relationship_id, user_uuid, state, card_fingerprint, card_number_last_four, card_nickname));
        Intrinsics.checkNotNullParameter(relationship_id, "relationship_id");
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(card_fingerprint, "card_fingerprint");
        Intrinsics.checkNotNullParameter(card_number_last_four, "card_number_last_four");
        Intrinsics.checkNotNullParameter(card_nickname, "card_nickname");
    }

    public static /* synthetic */ CheckoutCardRelationshipDetailsDto copy$default(CheckoutCardRelationshipDetailsDto checkoutCardRelationshipDetailsDto, String str, String str2, CheckoutCardRelationshipStateDto checkoutCardRelationshipStateDto, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = checkoutCardRelationshipDetailsDto.surrogate.getRelationship_id();
        }
        if ((i & 2) != 0) {
            str2 = checkoutCardRelationshipDetailsDto.surrogate.getUser_uuid();
        }
        if ((i & 4) != 0) {
            checkoutCardRelationshipStateDto = checkoutCardRelationshipDetailsDto.surrogate.getState();
        }
        if ((i & 8) != 0) {
            str3 = checkoutCardRelationshipDetailsDto.surrogate.getCard_fingerprint();
        }
        if ((i & 16) != 0) {
            str4 = checkoutCardRelationshipDetailsDto.surrogate.getCard_number_last_four();
        }
        if ((i & 32) != 0) {
            str5 = checkoutCardRelationshipDetailsDto.surrogate.getCard_nickname();
        }
        String str6 = str4;
        String str7 = str5;
        return checkoutCardRelationshipDetailsDto.copy(str, str2, checkoutCardRelationshipStateDto, str3, str6, str7);
    }

    public final CheckoutCardRelationshipDetailsDto copy(String relationship_id, String user_uuid, CheckoutCardRelationshipStateDto state, String card_fingerprint, String card_number_last_four, String card_nickname) {
        Intrinsics.checkNotNullParameter(relationship_id, "relationship_id");
        Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(card_fingerprint, "card_fingerprint");
        Intrinsics.checkNotNullParameter(card_number_last_four, "card_number_last_four");
        Intrinsics.checkNotNullParameter(card_nickname, "card_nickname");
        return new CheckoutCardRelationshipDetailsDto(new Surrogate(relationship_id, user_uuid, state, card_fingerprint, card_number_last_four, card_nickname));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CheckoutCardRelationshipDetails toProto() {
        return new CheckoutCardRelationshipDetails(this.surrogate.getRelationship_id(), this.surrogate.getUser_uuid(), (CheckoutCardRelationshipDetails.CheckoutCardRelationshipState) this.surrogate.getState().toProto(), this.surrogate.getCard_fingerprint(), this.surrogate.getCard_number_last_four(), this.surrogate.getCard_nickname(), null, 64, null);
    }

    public String toString() {
        return "[CheckoutCardRelationshipDetailsDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CheckoutCardRelationshipDetailsDto) && Intrinsics.areEqual(((CheckoutCardRelationshipDetailsDto) other).surrogate, this.surrogate);
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
    /* compiled from: CheckoutCardRelationshipDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 52\u00020\u0001:\u000245BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003JE\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\rHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001J%\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u0001¢\u0006\u0002\b3R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u0014R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014R\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001f\u0010\u0014¨\u00066"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$Surrogate;", "", "relationship_id", "", "user_uuid", "state", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$CheckoutCardRelationshipStateDto;", "card_fingerprint", "card_number_last_four", "card_nickname", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$CheckoutCardRelationshipStateDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$CheckoutCardRelationshipStateDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRelationship_id$annotations", "()V", "getRelationship_id", "()Ljava/lang/String;", "getUser_uuid$annotations", "getUser_uuid", "getState$annotations", "getState", "()Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$CheckoutCardRelationshipStateDto;", "getCard_fingerprint$annotations", "getCard_fingerprint", "getCard_number_last_four$annotations", "getCard_number_last_four", "getCard_nickname$annotations", "getCard_nickname", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$rosetta_cashier_externalRelease", "$serializer", "Companion", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String card_fingerprint;
        private final String card_nickname;
        private final String card_number_last_four;
        private final String relationship_id;
        private final CheckoutCardRelationshipStateDto state;
        private final String user_uuid;

        public Surrogate() {
            this((String) null, (String) null, (CheckoutCardRelationshipStateDto) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, CheckoutCardRelationshipStateDto checkoutCardRelationshipStateDto, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.relationship_id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.user_uuid;
            }
            if ((i & 4) != 0) {
                checkoutCardRelationshipStateDto = surrogate.state;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.card_fingerprint;
            }
            if ((i & 16) != 0) {
                str4 = surrogate.card_number_last_four;
            }
            if ((i & 32) != 0) {
                str5 = surrogate.card_nickname;
            }
            String str6 = str4;
            String str7 = str5;
            return surrogate.copy(str, str2, checkoutCardRelationshipStateDto, str3, str6, str7);
        }

        @SerialName("cardFingerprint")
        @JsonAnnotations2(names = {"card_fingerprint"})
        public static /* synthetic */ void getCard_fingerprint$annotations() {
        }

        @SerialName("cardNickname")
        @JsonAnnotations2(names = {"card_nickname"})
        public static /* synthetic */ void getCard_nickname$annotations() {
        }

        @SerialName("cardNumberLastFour")
        @JsonAnnotations2(names = {"card_number_last_four"})
        public static /* synthetic */ void getCard_number_last_four$annotations() {
        }

        @SerialName("relationshipId")
        @JsonAnnotations2(names = {"relationship_id"})
        public static /* synthetic */ void getRelationship_id$annotations() {
        }

        @SerialName("state")
        @JsonAnnotations2(names = {"state"})
        public static /* synthetic */ void getState$annotations() {
        }

        @SerialName("userUuid")
        @JsonAnnotations2(names = {"user_uuid"})
        public static /* synthetic */ void getUser_uuid$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getRelationship_id() {
            return this.relationship_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUser_uuid() {
            return this.user_uuid;
        }

        /* renamed from: component3, reason: from getter */
        public final CheckoutCardRelationshipStateDto getState() {
            return this.state;
        }

        /* renamed from: component4, reason: from getter */
        public final String getCard_fingerprint() {
            return this.card_fingerprint;
        }

        /* renamed from: component5, reason: from getter */
        public final String getCard_number_last_four() {
            return this.card_number_last_four;
        }

        /* renamed from: component6, reason: from getter */
        public final String getCard_nickname() {
            return this.card_nickname;
        }

        public final Surrogate copy(String relationship_id, String user_uuid, CheckoutCardRelationshipStateDto state, String card_fingerprint, String card_number_last_four, String card_nickname) {
            Intrinsics.checkNotNullParameter(relationship_id, "relationship_id");
            Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(card_fingerprint, "card_fingerprint");
            Intrinsics.checkNotNullParameter(card_number_last_four, "card_number_last_four");
            Intrinsics.checkNotNullParameter(card_nickname, "card_nickname");
            return new Surrogate(relationship_id, user_uuid, state, card_fingerprint, card_number_last_four, card_nickname);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.relationship_id, surrogate.relationship_id) && Intrinsics.areEqual(this.user_uuid, surrogate.user_uuid) && this.state == surrogate.state && Intrinsics.areEqual(this.card_fingerprint, surrogate.card_fingerprint) && Intrinsics.areEqual(this.card_number_last_four, surrogate.card_number_last_four) && Intrinsics.areEqual(this.card_nickname, surrogate.card_nickname);
        }

        public int hashCode() {
            return (((((((((this.relationship_id.hashCode() * 31) + this.user_uuid.hashCode()) * 31) + this.state.hashCode()) * 31) + this.card_fingerprint.hashCode()) * 31) + this.card_number_last_four.hashCode()) * 31) + this.card_nickname.hashCode();
        }

        public String toString() {
            return "Surrogate(relationship_id=" + this.relationship_id + ", user_uuid=" + this.user_uuid + ", state=" + this.state + ", card_fingerprint=" + this.card_fingerprint + ", card_number_last_four=" + this.card_number_last_four + ", card_nickname=" + this.card_nickname + ")";
        }

        /* compiled from: CheckoutCardRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$Surrogate;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CheckoutCardRelationshipDetailsDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, CheckoutCardRelationshipStateDto checkoutCardRelationshipStateDto, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.relationship_id = "";
            } else {
                this.relationship_id = str;
            }
            if ((i & 2) == 0) {
                this.user_uuid = "";
            } else {
                this.user_uuid = str2;
            }
            if ((i & 4) == 0) {
                this.state = CheckoutCardRelationshipStateDto.INSTANCE.getZeroValue();
            } else {
                this.state = checkoutCardRelationshipStateDto;
            }
            if ((i & 8) == 0) {
                this.card_fingerprint = "";
            } else {
                this.card_fingerprint = str3;
            }
            if ((i & 16) == 0) {
                this.card_number_last_four = "";
            } else {
                this.card_number_last_four = str4;
            }
            if ((i & 32) == 0) {
                this.card_nickname = "";
            } else {
                this.card_nickname = str5;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$rosetta_cashier_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.relationship_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.relationship_id);
            }
            if (!Intrinsics.areEqual(self.user_uuid, "")) {
                output.encodeStringElement(serialDesc, 1, self.user_uuid);
            }
            if (self.state != CheckoutCardRelationshipStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, CheckoutCardRelationshipStateDto.Serializer.INSTANCE, self.state);
            }
            if (!Intrinsics.areEqual(self.card_fingerprint, "")) {
                output.encodeStringElement(serialDesc, 3, self.card_fingerprint);
            }
            if (!Intrinsics.areEqual(self.card_number_last_four, "")) {
                output.encodeStringElement(serialDesc, 4, self.card_number_last_four);
            }
            if (Intrinsics.areEqual(self.card_nickname, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 5, self.card_nickname);
        }

        public Surrogate(String relationship_id, String user_uuid, CheckoutCardRelationshipStateDto state, String card_fingerprint, String card_number_last_four, String card_nickname) {
            Intrinsics.checkNotNullParameter(relationship_id, "relationship_id");
            Intrinsics.checkNotNullParameter(user_uuid, "user_uuid");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(card_fingerprint, "card_fingerprint");
            Intrinsics.checkNotNullParameter(card_number_last_four, "card_number_last_four");
            Intrinsics.checkNotNullParameter(card_nickname, "card_nickname");
            this.relationship_id = relationship_id;
            this.user_uuid = user_uuid;
            this.state = state;
            this.card_fingerprint = card_fingerprint;
            this.card_number_last_four = card_number_last_four;
            this.card_nickname = card_nickname;
        }

        public /* synthetic */ Surrogate(String str, String str2, CheckoutCardRelationshipStateDto checkoutCardRelationshipStateDto, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CheckoutCardRelationshipStateDto.INSTANCE.getZeroValue() : checkoutCardRelationshipStateDto, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5);
        }

        public final String getRelationship_id() {
            return this.relationship_id;
        }

        public final String getUser_uuid() {
            return this.user_uuid;
        }

        public final CheckoutCardRelationshipStateDto getState() {
            return this.state;
        }

        public final String getCard_fingerprint() {
            return this.card_fingerprint;
        }

        public final String getCard_number_last_four() {
            return this.card_number_last_four;
        }

        public final String getCard_nickname() {
            return this.card_nickname;
        }
    }

    /* compiled from: CheckoutCardRelationshipDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto;", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CheckoutCardRelationshipDetailsDto, CheckoutCardRelationshipDetails> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CheckoutCardRelationshipDetailsDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CheckoutCardRelationshipDetailsDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CheckoutCardRelationshipDetailsDto> getBinaryBase64Serializer() {
            return (KSerializer) CheckoutCardRelationshipDetailsDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CheckoutCardRelationshipDetails> getProtoAdapter() {
            return CheckoutCardRelationshipDetails.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CheckoutCardRelationshipDetailsDto getZeroValue() {
            return CheckoutCardRelationshipDetailsDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CheckoutCardRelationshipDetailsDto fromProto(CheckoutCardRelationshipDetails proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CheckoutCardRelationshipDetailsDto(new Surrogate(proto.getRelationship_id(), proto.getUser_uuid(), CheckoutCardRelationshipStateDto.INSTANCE.fromProto(proto.getState()), proto.getCard_fingerprint(), proto.getCard_number_last_four(), proto.getCard_nickname()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.CheckoutCardRelationshipDetailsDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CheckoutCardRelationshipDetailsDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CheckoutCardRelationshipDetailsDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CheckoutCardRelationshipDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$CheckoutCardRelationshipStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails$CheckoutCardRelationshipState;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED", "NEW", "PENDING_SCA", "LINKED", "UNLINKED", "REJECTED", "PENDING_ERROR", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class CheckoutCardRelationshipStateDto implements Dto2<CheckoutCardRelationshipDetails.CheckoutCardRelationshipState>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CheckoutCardRelationshipStateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<CheckoutCardRelationshipStateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<CheckoutCardRelationshipStateDto, CheckoutCardRelationshipDetails.CheckoutCardRelationshipState>> binaryBase64Serializer$delegate;
        public static final CheckoutCardRelationshipStateDto CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED = new CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED("CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED", 0);
        public static final CheckoutCardRelationshipStateDto NEW = new NEW("NEW", 1);
        public static final CheckoutCardRelationshipStateDto PENDING_SCA = new PENDING_SCA("PENDING_SCA", 2);
        public static final CheckoutCardRelationshipStateDto LINKED = new LINKED("LINKED", 3);
        public static final CheckoutCardRelationshipStateDto UNLINKED = new UNLINKED("UNLINKED", 4);
        public static final CheckoutCardRelationshipStateDto REJECTED = new REJECTED("REJECTED", 5);
        public static final CheckoutCardRelationshipStateDto PENDING_ERROR = new PENDING_ERROR("PENDING_ERROR", 6);

        private static final /* synthetic */ CheckoutCardRelationshipStateDto[] $values() {
            return new CheckoutCardRelationshipStateDto[]{CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED, NEW, PENDING_SCA, LINKED, UNLINKED, REJECTED, PENDING_ERROR};
        }

        public /* synthetic */ CheckoutCardRelationshipStateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<CheckoutCardRelationshipStateDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private CheckoutCardRelationshipStateDto(String str, int i) {
        }

        /* compiled from: CheckoutCardRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto.CheckoutCardRelationshipStateDto.CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$CheckoutCardRelationshipStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails$CheckoutCardRelationshipState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED extends CheckoutCardRelationshipStateDto {
            CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardRelationshipDetails.CheckoutCardRelationshipState toProto() {
                return CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED;
            }
        }

        static {
            CheckoutCardRelationshipStateDto[] checkoutCardRelationshipStateDtoArr$values = $values();
            $VALUES = checkoutCardRelationshipStateDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(checkoutCardRelationshipStateDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.cashier.CheckoutCardRelationshipDetailsDto$CheckoutCardRelationshipStateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CheckoutCardRelationshipDetailsDto.CheckoutCardRelationshipStateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: CheckoutCardRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto.CheckoutCardRelationshipStateDto.NEW", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$CheckoutCardRelationshipStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails$CheckoutCardRelationshipState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class NEW extends CheckoutCardRelationshipStateDto {
            NEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardRelationshipDetails.CheckoutCardRelationshipState toProto() {
                return CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.NEW;
            }
        }

        /* compiled from: CheckoutCardRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto.CheckoutCardRelationshipStateDto.PENDING_SCA", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$CheckoutCardRelationshipStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails$CheckoutCardRelationshipState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PENDING_SCA extends CheckoutCardRelationshipStateDto {
            PENDING_SCA(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardRelationshipDetails.CheckoutCardRelationshipState toProto() {
                return CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.PENDING_SCA;
            }
        }

        /* compiled from: CheckoutCardRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto.CheckoutCardRelationshipStateDto.LINKED", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$CheckoutCardRelationshipStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails$CheckoutCardRelationshipState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class LINKED extends CheckoutCardRelationshipStateDto {
            LINKED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardRelationshipDetails.CheckoutCardRelationshipState toProto() {
                return CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.LINKED;
            }
        }

        /* compiled from: CheckoutCardRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto.CheckoutCardRelationshipStateDto.UNLINKED", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$CheckoutCardRelationshipStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails$CheckoutCardRelationshipState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UNLINKED extends CheckoutCardRelationshipStateDto {
            UNLINKED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardRelationshipDetails.CheckoutCardRelationshipState toProto() {
                return CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.UNLINKED;
            }
        }

        /* compiled from: CheckoutCardRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto.CheckoutCardRelationshipStateDto.REJECTED", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$CheckoutCardRelationshipStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails$CheckoutCardRelationshipState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class REJECTED extends CheckoutCardRelationshipStateDto {
            REJECTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardRelationshipDetails.CheckoutCardRelationshipState toProto() {
                return CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.REJECTED;
            }
        }

        /* compiled from: CheckoutCardRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto.CheckoutCardRelationshipStateDto.PENDING_ERROR", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$CheckoutCardRelationshipStateDto;", "toProto", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails$CheckoutCardRelationshipState;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PENDING_ERROR extends CheckoutCardRelationshipStateDto {
            PENDING_ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public CheckoutCardRelationshipDetails.CheckoutCardRelationshipState toProto() {
                return CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.PENDING_ERROR;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: CheckoutCardRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$CheckoutCardRelationshipStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$CheckoutCardRelationshipStateDto;", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetails$CheckoutCardRelationshipState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$CheckoutCardRelationshipStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<CheckoutCardRelationshipStateDto, CheckoutCardRelationshipDetails.CheckoutCardRelationshipState> {

            /* compiled from: CheckoutCardRelationshipDetailsDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.values().length];
                    try {
                        iArr[CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.NEW.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.PENDING_SCA.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.LINKED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.UNLINKED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.REJECTED.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.PENDING_ERROR.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<CheckoutCardRelationshipStateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CheckoutCardRelationshipStateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<CheckoutCardRelationshipStateDto> getBinaryBase64Serializer() {
                return (KSerializer) CheckoutCardRelationshipStateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<CheckoutCardRelationshipDetails.CheckoutCardRelationshipState> getProtoAdapter() {
                return CheckoutCardRelationshipDetails.CheckoutCardRelationshipState.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CheckoutCardRelationshipStateDto getZeroValue() {
                return CheckoutCardRelationshipStateDto.CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public CheckoutCardRelationshipStateDto fromProto(CheckoutCardRelationshipDetails.CheckoutCardRelationshipState proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return CheckoutCardRelationshipStateDto.CHECKOUT_CARD_RELATIONSHIP_STATE_UNSPECIFIED;
                    case 2:
                        return CheckoutCardRelationshipStateDto.NEW;
                    case 3:
                        return CheckoutCardRelationshipStateDto.PENDING_SCA;
                    case 4:
                        return CheckoutCardRelationshipStateDto.LINKED;
                    case 5:
                        return CheckoutCardRelationshipStateDto.UNLINKED;
                    case 6:
                        return CheckoutCardRelationshipStateDto.REJECTED;
                    case 7:
                        return CheckoutCardRelationshipStateDto.PENDING_ERROR;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: CheckoutCardRelationshipDetailsDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$CheckoutCardRelationshipStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$CheckoutCardRelationshipStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<CheckoutCardRelationshipStateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<CheckoutCardRelationshipStateDto, CheckoutCardRelationshipDetails.CheckoutCardRelationshipState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.cashier.CheckoutCardRelationshipDetails.CheckoutCardRelationshipState", CheckoutCardRelationshipStateDto.getEntries(), CheckoutCardRelationshipStateDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public CheckoutCardRelationshipStateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (CheckoutCardRelationshipStateDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, CheckoutCardRelationshipStateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static CheckoutCardRelationshipStateDto valueOf(String str) {
            return (CheckoutCardRelationshipStateDto) Enum.valueOf(CheckoutCardRelationshipStateDto.class, str);
        }

        public static CheckoutCardRelationshipStateDto[] values() {
            return (CheckoutCardRelationshipStateDto[]) $VALUES.clone();
        }
    }

    /* compiled from: CheckoutCardRelationshipDetailsDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<CheckoutCardRelationshipDetailsDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.cashier.CheckoutCardRelationshipDetails", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CheckoutCardRelationshipDetailsDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CheckoutCardRelationshipDetailsDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CheckoutCardRelationshipDetailsDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CheckoutCardRelationshipDetailsDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/cashier/CheckoutCardRelationshipDetailsDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "rosetta.cashier_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.cashier.CheckoutCardRelationshipDetailsDto";
        }
    }
}
