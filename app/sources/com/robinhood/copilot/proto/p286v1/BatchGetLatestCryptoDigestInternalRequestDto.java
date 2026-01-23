package com.robinhood.copilot.proto.p286v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
import com.robinhood.copilot.proto.p286v1.BatchGetLatestCryptoDigestInternalRequestDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.i18n.Locality;
import com.robinhood.rosetta.i18n.LocalityDto;
import com.squareup.wire.ProtoAdapter;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: BatchGetLatestCryptoDigestInternalRequestDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004'()*B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B7\b\u0016\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0006\u0010\u0010J4\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\b\u0010\u001a\u001a\u00020\u0002H\u0016J\b\u0010\u001b\u001a\u00020\nH\u0016J\u0013\u0010\u001c\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020 H\u0016J\b\u0010&\u001a\u00020 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006+"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalRequestDto$Surrogate;)V", "crypto_currency_ids", "", "", MatchaQrCodeDuxo6.USER_ID_KEY, "force_get_agreement", "", "locality", "Lcom/robinhood/rosetta/i18n/LocalityDto;", "(Ljava/util/List;Ljava/lang/String;ZLcom/robinhood/rosetta/i18n/LocalityDto;)V", "getCrypto_currency_ids", "()Ljava/util/List;", "getUser_id", "()Ljava/lang/String;", "getForce_get_agreement", "()Z", "getLocality", "()Lcom/robinhood/rosetta/i18n/LocalityDto;", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class BatchGetLatestCryptoDigestInternalRequestDto implements Dto3<BatchGetLatestCryptoDigestInternalRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<BatchGetLatestCryptoDigestInternalRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<BatchGetLatestCryptoDigestInternalRequestDto, BatchGetLatestCryptoDigestInternalRequest>> binaryBase64Serializer$delegate;
    private static final BatchGetLatestCryptoDigestInternalRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ BatchGetLatestCryptoDigestInternalRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private BatchGetLatestCryptoDigestInternalRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<String> getCrypto_currency_ids() {
        return this.surrogate.getCrypto_currency_ids();
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

    public /* synthetic */ BatchGetLatestCryptoDigestInternalRequestDto(List list, String str, boolean z, LocalityDto localityDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? LocalityDto.INSTANCE.getZeroValue() : localityDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BatchGetLatestCryptoDigestInternalRequestDto(List<String> crypto_currency_ids, String user_id, boolean z, LocalityDto locality) {
        this(new Surrogate(crypto_currency_ids, user_id, z, locality));
        Intrinsics.checkNotNullParameter(crypto_currency_ids, "crypto_currency_ids");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(locality, "locality");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BatchGetLatestCryptoDigestInternalRequestDto copy$default(BatchGetLatestCryptoDigestInternalRequestDto batchGetLatestCryptoDigestInternalRequestDto, List list, String str, boolean z, LocalityDto localityDto, int i, Object obj) {
        if ((i & 1) != 0) {
            list = batchGetLatestCryptoDigestInternalRequestDto.surrogate.getCrypto_currency_ids();
        }
        if ((i & 2) != 0) {
            str = batchGetLatestCryptoDigestInternalRequestDto.surrogate.getUser_id();
        }
        if ((i & 4) != 0) {
            z = batchGetLatestCryptoDigestInternalRequestDto.surrogate.getForce_get_agreement();
        }
        if ((i & 8) != 0) {
            localityDto = batchGetLatestCryptoDigestInternalRequestDto.surrogate.getLocality();
        }
        return batchGetLatestCryptoDigestInternalRequestDto.copy(list, str, z, localityDto);
    }

    public final BatchGetLatestCryptoDigestInternalRequestDto copy(List<String> crypto_currency_ids, String user_id, boolean force_get_agreement, LocalityDto locality) {
        Intrinsics.checkNotNullParameter(crypto_currency_ids, "crypto_currency_ids");
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(locality, "locality");
        return new BatchGetLatestCryptoDigestInternalRequestDto(new Surrogate(crypto_currency_ids, user_id, force_get_agreement, locality));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public BatchGetLatestCryptoDigestInternalRequest toProto() {
        List<String> crypto_currency_ids = this.surrogate.getCrypto_currency_ids();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(crypto_currency_ids, 10));
        Iterator<T> it = crypto_currency_ids.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return new BatchGetLatestCryptoDigestInternalRequest(arrayList, this.surrogate.getUser_id(), this.surrogate.getForce_get_agreement(), (Locality) this.surrogate.getLocality().toProto(), null, 16, null);
    }

    public String toString() {
        return "[BatchGetLatestCryptoDigestInternalRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof BatchGetLatestCryptoDigestInternalRequestDto) && Intrinsics.areEqual(((BatchGetLatestCryptoDigestInternalRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: BatchGetLatestCryptoDigestInternalRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 02\u00020\u0001:\u0002/0B5\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0004HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J7\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010#\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\rHÖ\u0001J\t\u0010&\u001a\u00020\u0004HÖ\u0001J%\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0001¢\u0006\u0002\b.R\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0012\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u001d¨\u00061"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalRequestDto$Surrogate;", "", "crypto_currency_ids", "", "", MatchaQrCodeDuxo6.USER_ID_KEY, "force_get_agreement", "", "locality", "Lcom/robinhood/rosetta/i18n/LocalityDto;", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLcom/robinhood/rosetta/i18n/LocalityDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/lang/String;ZLcom/robinhood/rosetta/i18n/LocalityDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCrypto_currency_ids$annotations", "()V", "getCrypto_currency_ids", "()Ljava/util/List;", "getUser_id$annotations", "getUser_id", "()Ljava/lang/String;", "getForce_get_agreement$annotations", "getForce_get_agreement", "()Z", "getLocality$annotations", "getLocality", "()Lcom/robinhood/rosetta/i18n/LocalityDto;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$copilot_service_v1_externalRelease", "$serializer", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final List<String> crypto_currency_ids;
        private final boolean force_get_agreement;
        private final LocalityDto locality;
        private final String user_id;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.copilot.proto.v1.BatchGetLatestCryptoDigestInternalRequestDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BatchGetLatestCryptoDigestInternalRequestDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null, null};

        public Surrogate() {
            this((List) null, (String) null, false, (LocalityDto) null, 15, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(StringSerializer.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, List list, String str, boolean z, LocalityDto localityDto, int i, Object obj) {
            if ((i & 1) != 0) {
                list = surrogate.crypto_currency_ids;
            }
            if ((i & 2) != 0) {
                str = surrogate.user_id;
            }
            if ((i & 4) != 0) {
                z = surrogate.force_get_agreement;
            }
            if ((i & 8) != 0) {
                localityDto = surrogate.locality;
            }
            return surrogate.copy(list, str, z, localityDto);
        }

        @SerialName("cryptoCurrencyIds")
        @JsonAnnotations2(names = {"crypto_currency_ids"})
        public static /* synthetic */ void getCrypto_currency_ids$annotations() {
        }

        @SerialName("forceGetAgreement")
        @JsonAnnotations2(names = {"force_get_agreement"})
        public static /* synthetic */ void getForce_get_agreement$annotations() {
        }

        @SerialName("locality")
        @JsonAnnotations2(names = {"locality"})
        public static /* synthetic */ void getLocality$annotations() {
        }

        @SerialName("userId")
        @JsonAnnotations2(names = {MatchaQrCodeDuxo6.USER_ID_KEY})
        public static /* synthetic */ void getUser_id$annotations() {
        }

        public final List<String> component1() {
            return this.crypto_currency_ids;
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

        public final Surrogate copy(List<String> crypto_currency_ids, String user_id, boolean force_get_agreement, LocalityDto locality) {
            Intrinsics.checkNotNullParameter(crypto_currency_ids, "crypto_currency_ids");
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            Intrinsics.checkNotNullParameter(locality, "locality");
            return new Surrogate(crypto_currency_ids, user_id, force_get_agreement, locality);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.crypto_currency_ids, surrogate.crypto_currency_ids) && Intrinsics.areEqual(this.user_id, surrogate.user_id) && this.force_get_agreement == surrogate.force_get_agreement && this.locality == surrogate.locality;
        }

        public int hashCode() {
            return (((((this.crypto_currency_ids.hashCode() * 31) + this.user_id.hashCode()) * 31) + Boolean.hashCode(this.force_get_agreement)) * 31) + this.locality.hashCode();
        }

        public String toString() {
            return "Surrogate(crypto_currency_ids=" + this.crypto_currency_ids + ", user_id=" + this.user_id + ", force_get_agreement=" + this.force_get_agreement + ", locality=" + this.locality + ")";
        }

        /* compiled from: BatchGetLatestCryptoDigestInternalRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalRequestDto$Surrogate;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return BatchGetLatestCryptoDigestInternalRequestDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, List list, String str, boolean z, LocalityDto localityDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.crypto_currency_ids = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.user_id = "";
            } else {
                this.user_id = str;
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
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$copilot_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.crypto_currency_ids, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.crypto_currency_ids);
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
        }

        public Surrogate(List<String> crypto_currency_ids, String user_id, boolean z, LocalityDto locality) {
            Intrinsics.checkNotNullParameter(crypto_currency_ids, "crypto_currency_ids");
            Intrinsics.checkNotNullParameter(user_id, "user_id");
            Intrinsics.checkNotNullParameter(locality, "locality");
            this.crypto_currency_ids = crypto_currency_ids;
            this.user_id = user_id;
            this.force_get_agreement = z;
            this.locality = locality;
        }

        public final List<String> getCrypto_currency_ids() {
            return this.crypto_currency_ids;
        }

        public /* synthetic */ Surrogate(List list, String str, boolean z, LocalityDto localityDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? LocalityDto.INSTANCE.getZeroValue() : localityDto);
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
    }

    /* compiled from: BatchGetLatestCryptoDigestInternalRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalRequestDto;", "Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<BatchGetLatestCryptoDigestInternalRequestDto, BatchGetLatestCryptoDigestInternalRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BatchGetLatestCryptoDigestInternalRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BatchGetLatestCryptoDigestInternalRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<BatchGetLatestCryptoDigestInternalRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) BatchGetLatestCryptoDigestInternalRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<BatchGetLatestCryptoDigestInternalRequest> getProtoAdapter() {
            return BatchGetLatestCryptoDigestInternalRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BatchGetLatestCryptoDigestInternalRequestDto getZeroValue() {
            return BatchGetLatestCryptoDigestInternalRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public BatchGetLatestCryptoDigestInternalRequestDto fromProto(BatchGetLatestCryptoDigestInternalRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<String> crypto_currency_ids = proto.getCrypto_currency_ids();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(crypto_currency_ids, 10));
            Iterator<T> it = crypto_currency_ids.iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            return new BatchGetLatestCryptoDigestInternalRequestDto(new Surrogate(arrayList, proto.getUser_id(), proto.getForce_get_agreement(), LocalityDto.INSTANCE.fromProto(proto.getLocality())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.copilot.proto.v1.BatchGetLatestCryptoDigestInternalRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BatchGetLatestCryptoDigestInternalRequestDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new BatchGetLatestCryptoDigestInternalRequestDto(null, null, false, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: BatchGetLatestCryptoDigestInternalRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<BatchGetLatestCryptoDigestInternalRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/copilot.service.v1.BatchGetLatestCryptoDigestInternalRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, BatchGetLatestCryptoDigestInternalRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public BatchGetLatestCryptoDigestInternalRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new BatchGetLatestCryptoDigestInternalRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: BatchGetLatestCryptoDigestInternalRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/BatchGetLatestCryptoDigestInternalRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "com.robinhood.copilot.proto.v1.BatchGetLatestCryptoDigestInternalRequestDto";
        }
    }
}
