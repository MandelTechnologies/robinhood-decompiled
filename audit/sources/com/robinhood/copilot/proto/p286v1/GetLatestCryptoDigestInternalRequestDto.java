package com.robinhood.copilot.proto.p286v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.i18n.Locality;
import com.robinhood.rosetta.i18n.LocalityDto;
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

/* compiled from: GetLatestCryptoDigestInternalRequestDto.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0010J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\tJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\tH\u0016J\u0013\u0010\u001c\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0012¨\u0006+"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestCryptoDigestInternalRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/copilot/proto/v1/GetLatestCryptoDigestInternalRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/copilot/proto/v1/GetLatestCryptoDigestInternalRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/copilot/proto/v1/GetLatestCryptoDigestInternalRequestDto$Surrogate;)V", "crypto_currency_id", "", MatchaQrCodeDuxo6.USER_ID_KEY, "force_get_agreement", "", "locality", "Lcom/robinhood/rosetta/i18n/LocalityDto;", "timezone_id", "(Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/rosetta/i18n/LocalityDto;Ljava/lang/String;)V", "getCrypto_currency_id", "()Ljava/lang/String;", "getUser_id", "getForce_get_agreement", "()Z", "getLocality", "()Lcom/robinhood/rosetta/i18n/LocalityDto;", "getTimezone_id", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class GetLatestCryptoDigestInternalRequestDto implements Dto3<GetLatestCryptoDigestInternalRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetLatestCryptoDigestInternalRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetLatestCryptoDigestInternalRequestDto, GetLatestCryptoDigestInternalRequest>> binaryBase64Serializer$delegate;
    private static final GetLatestCryptoDigestInternalRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetLatestCryptoDigestInternalRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetLatestCryptoDigestInternalRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getCrypto_currency_id() {
        return this.surrogate.getCrypto_currency_id();
    }

    public final String getUser_id() {
        return this.surrogate.getUser_id();
    }

    public final boolean getForce_get_agreement() {
        return this.surrogate.getForce_get_agreement();
    }

    public final LocalityDto getLocality() {
        return this.surrogate.getLocality();
    }

    public final String getTimezone_id() {
        return this.surrogate.getTimezone_id();
    }

    public /* synthetic */ GetLatestCryptoDigestInternalRequestDto(String str, String str2, boolean z, LocalityDto localityDto, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? LocalityDto.INSTANCE.getZeroValue() : localityDto, (i & 16) != 0 ? "" : str3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetLatestCryptoDigestInternalRequestDto(String crypto_currency_id, String user_id, boolean z, LocalityDto locality, String timezone_id) {
        this(new Surrogate(crypto_currency_id, user_id, z, locality, timezone_id));
        Intrinsics.checkNotNullParameter(crypto_currency_id, "crypto_currency_id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(timezone_id, "timezone_id");
    }

    public static /* synthetic */ GetLatestCryptoDigestInternalRequestDto copy$default(GetLatestCryptoDigestInternalRequestDto getLatestCryptoDigestInternalRequestDto, String str, String str2, boolean z, LocalityDto localityDto, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getLatestCryptoDigestInternalRequestDto.surrogate.getCrypto_currency_id();
        }
        if ((i & 2) != 0) {
            str2 = getLatestCryptoDigestInternalRequestDto.surrogate.getUser_id();
        }
        if ((i & 4) != 0) {
            z = getLatestCryptoDigestInternalRequestDto.surrogate.getForce_get_agreement();
        }
        if ((i & 8) != 0) {
            localityDto = getLatestCryptoDigestInternalRequestDto.surrogate.getLocality();
        }
        if ((i & 16) != 0) {
            str3 = getLatestCryptoDigestInternalRequestDto.surrogate.getTimezone_id();
        }
        String str4 = str3;
        boolean z2 = z;
        return getLatestCryptoDigestInternalRequestDto.copy(str, str2, z2, localityDto, str4);
    }

    public final GetLatestCryptoDigestInternalRequestDto copy(String crypto_currency_id, String user_id, boolean force_get_agreement, LocalityDto locality, String timezone_id) {
        Intrinsics.checkNotNullParameter(crypto_currency_id, "crypto_currency_id");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(locality, "locality");
        Intrinsics.checkNotNullParameter(timezone_id, "timezone_id");
        return new GetLatestCryptoDigestInternalRequestDto(new Surrogate(crypto_currency_id, user_id, force_get_agreement, locality, timezone_id));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public GetLatestCryptoDigestInternalRequest toProto() {
        return new GetLatestCryptoDigestInternalRequest(this.surrogate.getCrypto_currency_id(), this.surrogate.getUser_id(), this.surrogate.getForce_get_agreement(), (Locality) this.surrogate.getLocality().toProto(), this.surrogate.getTimezone_id(), null, 32, null);
    }

    public String toString() {
        return "[GetLatestCryptoDigestInternalRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetLatestCryptoDigestInternalRequestDto) && Intrinsics.areEqual(((GetLatestCryptoDigestInternalRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetLatestCryptoDigestInternalRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 22\u00020\u0001:\u000212B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bBK\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J;\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\rHÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001J%\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u00002\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/H\u0001¢\u0006\u0002\b0R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0012\u001a\u0004\b\u001e\u0010\u0014¨\u00063"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestCryptoDigestInternalRequestDto$Surrogate;", "", "crypto_currency_id", "", MatchaQrCodeDuxo6.USER_ID_KEY, "force_get_agreement", "", "locality", "Lcom/robinhood/rosetta/i18n/LocalityDto;", "timezone_id", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/rosetta/i18n/LocalityDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ZLcom/robinhood/rosetta/i18n/LocalityDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCrypto_currency_id$annotations", "()V", "getCrypto_currency_id", "()Ljava/lang/String;", "getUser_id$annotations", "getUser_id", "getForce_get_agreement$annotations", "getForce_get_agreement", "()Z", "getLocality$annotations", "getLocality", "()Lcom/robinhood/rosetta/i18n/LocalityDto;", "getTimezone_id$annotations", "getTimezone_id", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$copilot_service_v1_externalRelease", "$serializer", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String crypto_currency_id;
        private final boolean force_get_agreement;
        private final LocalityDto locality;
        private final String timezone_id;
        private final String user_id;

        public Surrogate() {
            this((String) null, (String) null, false, (LocalityDto) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, String str2, boolean z, LocalityDto localityDto, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.crypto_currency_id;
            }
            if ((i & 2) != 0) {
                str2 = surrogate.user_id;
            }
            if ((i & 4) != 0) {
                z = surrogate.force_get_agreement;
            }
            if ((i & 8) != 0) {
                localityDto = surrogate.locality;
            }
            if ((i & 16) != 0) {
                str3 = surrogate.timezone_id;
            }
            String str4 = str3;
            boolean z2 = z;
            return surrogate.copy(str, str2, z2, localityDto, str4);
        }

        @SerialName("cryptoCurrencyId")
        @JsonAnnotations2(names = {"crypto_currency_id"})
        public static /* synthetic */ void getCrypto_currency_id$annotations() {
        }

        @SerialName("forceGetAgreement")
        @JsonAnnotations2(names = {"force_get_agreement"})
        public static /* synthetic */ void getForce_get_agreement$annotations() {
        }

        @SerialName("locality")
        @JsonAnnotations2(names = {"locality"})
        public static /* synthetic */ void getLocality$annotations() {
        }

        @SerialName("timezoneId")
        @JsonAnnotations2(names = {"timezone_id"})
        public static /* synthetic */ void getTimezone_id$annotations() {
        }

        @SerialName("userId")
        @JsonAnnotations2(names = {MatchaQrCodeDuxo6.USER_ID_KEY})
        public static /* synthetic */ void getUser_id$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getCrypto_currency_id() {
            return this.crypto_currency_id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getUser_id() {
            return this.user_id;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getForce_get_agreement() {
            return this.force_get_agreement;
        }

        /* renamed from: component4, reason: from getter */
        public final LocalityDto getLocality() {
            return this.locality;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTimezone_id() {
            return this.timezone_id;
        }

        public final Surrogate copy(String crypto_currency_id, String user_id, boolean force_get_agreement, LocalityDto locality, String timezone_id) {
            Intrinsics.checkNotNullParameter(crypto_currency_id, "crypto_currency_id");
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            Intrinsics.checkNotNullParameter(locality, "locality");
            Intrinsics.checkNotNullParameter(timezone_id, "timezone_id");
            return new Surrogate(crypto_currency_id, user_id, force_get_agreement, locality, timezone_id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.crypto_currency_id, surrogate.crypto_currency_id) && Intrinsics.areEqual(this.user_id, surrogate.user_id) && this.force_get_agreement == surrogate.force_get_agreement && this.locality == surrogate.locality && Intrinsics.areEqual(this.timezone_id, surrogate.timezone_id);
        }

        public int hashCode() {
            return (((((((this.crypto_currency_id.hashCode() * 31) + this.user_id.hashCode()) * 31) + Boolean.hashCode(this.force_get_agreement)) * 31) + this.locality.hashCode()) * 31) + this.timezone_id.hashCode();
        }

        public String toString() {
            return "Surrogate(crypto_currency_id=" + this.crypto_currency_id + ", user_id=" + this.user_id + ", force_get_agreement=" + this.force_get_agreement + ", locality=" + this.locality + ", timezone_id=" + this.timezone_id + ")";
        }

        /* compiled from: GetLatestCryptoDigestInternalRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestCryptoDigestInternalRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/GetLatestCryptoDigestInternalRequestDto$Surrogate;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetLatestCryptoDigestInternalRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, boolean z, LocalityDto localityDto, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.crypto_currency_id = "";
            } else {
                this.crypto_currency_id = str;
            }
            if ((i & 2) == 0) {
                this.user_id = "";
            } else {
                this.user_id = str2;
            }
            if ((i & 4) == 0) {
                this.force_get_agreement = false;
            } else {
                this.force_get_agreement = z;
            }
            if ((i & 8) == 0) {
                this.locality = LocalityDto.INSTANCE.getZeroValue();
            } else {
                this.locality = localityDto;
            }
            if ((i & 16) == 0) {
                this.timezone_id = "";
            } else {
                this.timezone_id = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.crypto_currency_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.crypto_currency_id);
            }
            if (!Intrinsics.areEqual(self.user_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.user_id);
            }
            boolean z = self.force_get_agreement;
            if (z) {
                output.encodeBooleanElement(serialDesc, 2, z);
            }
            if (self.locality != LocalityDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, LocalityDto.Serializer.INSTANCE, self.locality);
            }
            if (Intrinsics.areEqual(self.timezone_id, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 4, self.timezone_id);
        }

        public Surrogate(String crypto_currency_id, String user_id, boolean z, LocalityDto locality, String timezone_id) {
            Intrinsics.checkNotNullParameter(crypto_currency_id, "crypto_currency_id");
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            Intrinsics.checkNotNullParameter(locality, "locality");
            Intrinsics.checkNotNullParameter(timezone_id, "timezone_id");
            this.crypto_currency_id = crypto_currency_id;
            this.user_id = user_id;
            this.force_get_agreement = z;
            this.locality = locality;
            this.timezone_id = timezone_id;
        }

        public /* synthetic */ Surrogate(String str, String str2, boolean z, LocalityDto localityDto, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? LocalityDto.INSTANCE.getZeroValue() : localityDto, (i & 16) != 0 ? "" : str3);
        }

        public final String getCrypto_currency_id() {
            return this.crypto_currency_id;
        }

        public final String getUser_id() {
            return this.user_id;
        }

        public final boolean getForce_get_agreement() {
            return this.force_get_agreement;
        }

        public final LocalityDto getLocality() {
            return this.locality;
        }

        public final String getTimezone_id() {
            return this.timezone_id;
        }
    }

    /* compiled from: GetLatestCryptoDigestInternalRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestCryptoDigestInternalRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/copilot/proto/v1/GetLatestCryptoDigestInternalRequestDto;", "Lcom/robinhood/copilot/proto/v1/GetLatestCryptoDigestInternalRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/GetLatestCryptoDigestInternalRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<GetLatestCryptoDigestInternalRequestDto, GetLatestCryptoDigestInternalRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetLatestCryptoDigestInternalRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetLatestCryptoDigestInternalRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetLatestCryptoDigestInternalRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetLatestCryptoDigestInternalRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetLatestCryptoDigestInternalRequest> getProtoAdapter() {
            return GetLatestCryptoDigestInternalRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetLatestCryptoDigestInternalRequestDto getZeroValue() {
            return GetLatestCryptoDigestInternalRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetLatestCryptoDigestInternalRequestDto fromProto(GetLatestCryptoDigestInternalRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new GetLatestCryptoDigestInternalRequestDto(new Surrogate(proto.getCrypto_currency_id(), proto.getUser_id(), proto.getForce_get_agreement(), LocalityDto.INSTANCE.fromProto(proto.getLocality()), proto.getTimezone_id()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.GetLatestCryptoDigestInternalRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetLatestCryptoDigestInternalRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetLatestCryptoDigestInternalRequestDto(null, null, false, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetLatestCryptoDigestInternalRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestCryptoDigestInternalRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/GetLatestCryptoDigestInternalRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/copilot/proto/v1/GetLatestCryptoDigestInternalRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetLatestCryptoDigestInternalRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/copilot.service.v1.GetLatestCryptoDigestInternalRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetLatestCryptoDigestInternalRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetLatestCryptoDigestInternalRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetLatestCryptoDigestInternalRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetLatestCryptoDigestInternalRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/GetLatestCryptoDigestInternalRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "com.robinhood.copilot.proto.v1.GetLatestCryptoDigestInternalRequestDto";
        }
    }
}
