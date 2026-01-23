package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.rosetta.eventlogging.CountryGateErrorTypeDto;
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

/* compiled from: CountryGatingContextDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004&'()B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000fJ8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\tJ\b\u0010\u0018\u001a\u00020\u0002H\u0016J\b\u0010\u0019\u001a\u00020\tH\u0016J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u001fH\u0016J\b\u0010%\u001a\u00020\u001fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\u000e\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011¨\u0006*"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CountryGatingContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/CountryGatingContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/CountryGatingContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CountryGatingContextDto$Surrogate;)V", "feature_identifier", "", "error_type", "Lcom/robinhood/rosetta/eventlogging/CountryGateErrorTypeDto;", "deeplink_url", "routing_destination", "endpoint", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CountryGateErrorTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFeature_identifier", "()Ljava/lang/String;", "getError_type", "()Lcom/robinhood/rosetta/eventlogging/CountryGateErrorTypeDto;", "getDeeplink_url", "getRouting_destination", "getEndpoint", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class CountryGatingContextDto implements Dto3<CountryGatingContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<CountryGatingContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<CountryGatingContextDto, CountryGatingContext>> binaryBase64Serializer$delegate;
    private static final CountryGatingContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ CountryGatingContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private CountryGatingContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getFeature_identifier() {
        return this.surrogate.getFeature_identifier();
    }

    public final CountryGateErrorTypeDto getError_type() {
        return this.surrogate.getError_type();
    }

    public final String getDeeplink_url() {
        return this.surrogate.getDeeplink_url();
    }

    public final String getRouting_destination() {
        return this.surrogate.getRouting_destination();
    }

    public final String getEndpoint() {
        return this.surrogate.getEndpoint();
    }

    public /* synthetic */ CountryGatingContextDto(String str, CountryGateErrorTypeDto countryGateErrorTypeDto, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CountryGateErrorTypeDto.INSTANCE.getZeroValue() : countryGateErrorTypeDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountryGatingContextDto(String feature_identifier, CountryGateErrorTypeDto error_type, String deeplink_url, String routing_destination, String endpoint) {
        this(new Surrogate(feature_identifier, error_type, deeplink_url, routing_destination, endpoint));
        Intrinsics.checkNotNullParameter(feature_identifier, "feature_identifier");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(deeplink_url, "deeplink_url");
        Intrinsics.checkNotNullParameter(routing_destination, "routing_destination");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
    }

    public static /* synthetic */ CountryGatingContextDto copy$default(CountryGatingContextDto countryGatingContextDto, String str, CountryGateErrorTypeDto countryGateErrorTypeDto, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = countryGatingContextDto.surrogate.getFeature_identifier();
        }
        if ((i & 2) != 0) {
            countryGateErrorTypeDto = countryGatingContextDto.surrogate.getError_type();
        }
        if ((i & 4) != 0) {
            str2 = countryGatingContextDto.surrogate.getDeeplink_url();
        }
        if ((i & 8) != 0) {
            str3 = countryGatingContextDto.surrogate.getRouting_destination();
        }
        if ((i & 16) != 0) {
            str4 = countryGatingContextDto.surrogate.getEndpoint();
        }
        String str5 = str4;
        String str6 = str2;
        return countryGatingContextDto.copy(str, countryGateErrorTypeDto, str6, str3, str5);
    }

    public final CountryGatingContextDto copy(String feature_identifier, CountryGateErrorTypeDto error_type, String deeplink_url, String routing_destination, String endpoint) {
        Intrinsics.checkNotNullParameter(feature_identifier, "feature_identifier");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(deeplink_url, "deeplink_url");
        Intrinsics.checkNotNullParameter(routing_destination, "routing_destination");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        return new CountryGatingContextDto(new Surrogate(feature_identifier, error_type, deeplink_url, routing_destination, endpoint));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public CountryGatingContext toProto() {
        return new CountryGatingContext(this.surrogate.getFeature_identifier(), (CountryGateErrorType) this.surrogate.getError_type().toProto(), this.surrogate.getDeeplink_url(), this.surrogate.getRouting_destination(), this.surrogate.getEndpoint(), null, 32, null);
    }

    public String toString() {
        return "[CountryGatingContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof CountryGatingContextDto) && Intrinsics.areEqual(((CountryGatingContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: CountryGatingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 12\u00020\u0001:\u000201B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\t\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J;\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\fHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u001a\u0010\u0013R\u001c\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0011\u001a\u0004\b\u001c\u0010\u0013¨\u00062"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CountryGatingContextDto$Surrogate;", "", "feature_identifier", "", "error_type", "Lcom/robinhood/rosetta/eventlogging/CountryGateErrorTypeDto;", "deeplink_url", "routing_destination", "endpoint", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CountryGateErrorTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/CountryGateErrorTypeDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getFeature_identifier$annotations", "()V", "getFeature_identifier", "()Ljava/lang/String;", "getError_type$annotations", "getError_type", "()Lcom/robinhood/rosetta/eventlogging/CountryGateErrorTypeDto;", "getDeeplink_url$annotations", "getDeeplink_url", "getRouting_destination$annotations", "getRouting_destination", "getEndpoint$annotations", "getEndpoint", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String deeplink_url;
        private final String endpoint;
        private final CountryGateErrorTypeDto error_type;
        private final String feature_identifier;
        private final String routing_destination;

        public Surrogate() {
            this((String) null, (CountryGateErrorTypeDto) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, CountryGateErrorTypeDto countryGateErrorTypeDto, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.feature_identifier;
            }
            if ((i & 2) != 0) {
                countryGateErrorTypeDto = surrogate.error_type;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.deeplink_url;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.routing_destination;
            }
            if ((i & 16) != 0) {
                str4 = surrogate.endpoint;
            }
            String str5 = str4;
            String str6 = str2;
            return surrogate.copy(str, countryGateErrorTypeDto, str6, str3, str5);
        }

        @SerialName("deeplinkUrl")
        @JsonAnnotations2(names = {"deeplink_url"})
        public static /* synthetic */ void getDeeplink_url$annotations() {
        }

        @SerialName("endpoint")
        @JsonAnnotations2(names = {"endpoint"})
        public static /* synthetic */ void getEndpoint$annotations() {
        }

        @SerialName("errorType")
        @JsonAnnotations2(names = {"error_type"})
        public static /* synthetic */ void getError_type$annotations() {
        }

        @SerialName("featureIdentifier")
        @JsonAnnotations2(names = {"feature_identifier"})
        public static /* synthetic */ void getFeature_identifier$annotations() {
        }

        @SerialName("routingDestination")
        @JsonAnnotations2(names = {"routing_destination"})
        public static /* synthetic */ void getRouting_destination$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getFeature_identifier() {
            return this.feature_identifier;
        }

        /* renamed from: component2, reason: from getter */
        public final CountryGateErrorTypeDto getError_type() {
            return this.error_type;
        }

        /* renamed from: component3, reason: from getter */
        public final String getDeeplink_url() {
            return this.deeplink_url;
        }

        /* renamed from: component4, reason: from getter */
        public final String getRouting_destination() {
            return this.routing_destination;
        }

        /* renamed from: component5, reason: from getter */
        public final String getEndpoint() {
            return this.endpoint;
        }

        public final Surrogate copy(String feature_identifier, CountryGateErrorTypeDto error_type, String deeplink_url, String routing_destination, String endpoint) {
            Intrinsics.checkNotNullParameter(feature_identifier, "feature_identifier");
            Intrinsics.checkNotNullParameter(error_type, "error_type");
            Intrinsics.checkNotNullParameter(deeplink_url, "deeplink_url");
            Intrinsics.checkNotNullParameter(routing_destination, "routing_destination");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            return new Surrogate(feature_identifier, error_type, deeplink_url, routing_destination, endpoint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.feature_identifier, surrogate.feature_identifier) && this.error_type == surrogate.error_type && Intrinsics.areEqual(this.deeplink_url, surrogate.deeplink_url) && Intrinsics.areEqual(this.routing_destination, surrogate.routing_destination) && Intrinsics.areEqual(this.endpoint, surrogate.endpoint);
        }

        public int hashCode() {
            return (((((((this.feature_identifier.hashCode() * 31) + this.error_type.hashCode()) * 31) + this.deeplink_url.hashCode()) * 31) + this.routing_destination.hashCode()) * 31) + this.endpoint.hashCode();
        }

        public String toString() {
            return "Surrogate(feature_identifier=" + this.feature_identifier + ", error_type=" + this.error_type + ", deeplink_url=" + this.deeplink_url + ", routing_destination=" + this.routing_destination + ", endpoint=" + this.endpoint + ")";
        }

        /* compiled from: CountryGatingContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CountryGatingContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CountryGatingContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return CountryGatingContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, CountryGateErrorTypeDto countryGateErrorTypeDto, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.feature_identifier = "";
            } else {
                this.feature_identifier = str;
            }
            if ((i & 2) == 0) {
                this.error_type = CountryGateErrorTypeDto.INSTANCE.getZeroValue();
            } else {
                this.error_type = countryGateErrorTypeDto;
            }
            if ((i & 4) == 0) {
                this.deeplink_url = "";
            } else {
                this.deeplink_url = str2;
            }
            if ((i & 8) == 0) {
                this.routing_destination = "";
            } else {
                this.routing_destination = str3;
            }
            if ((i & 16) == 0) {
                this.endpoint = "";
            } else {
                this.endpoint = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.feature_identifier, "")) {
                output.encodeStringElement(serialDesc, 0, self.feature_identifier);
            }
            if (self.error_type != CountryGateErrorTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, CountryGateErrorTypeDto.Serializer.INSTANCE, self.error_type);
            }
            if (!Intrinsics.areEqual(self.deeplink_url, "")) {
                output.encodeStringElement(serialDesc, 2, self.deeplink_url);
            }
            if (!Intrinsics.areEqual(self.routing_destination, "")) {
                output.encodeStringElement(serialDesc, 3, self.routing_destination);
            }
            if (Intrinsics.areEqual(self.endpoint, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 4, self.endpoint);
        }

        public Surrogate(String feature_identifier, CountryGateErrorTypeDto error_type, String deeplink_url, String routing_destination, String endpoint) {
            Intrinsics.checkNotNullParameter(feature_identifier, "feature_identifier");
            Intrinsics.checkNotNullParameter(error_type, "error_type");
            Intrinsics.checkNotNullParameter(deeplink_url, "deeplink_url");
            Intrinsics.checkNotNullParameter(routing_destination, "routing_destination");
            Intrinsics.checkNotNullParameter(endpoint, "endpoint");
            this.feature_identifier = feature_identifier;
            this.error_type = error_type;
            this.deeplink_url = deeplink_url;
            this.routing_destination = routing_destination;
            this.endpoint = endpoint;
        }

        public /* synthetic */ Surrogate(String str, CountryGateErrorTypeDto countryGateErrorTypeDto, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CountryGateErrorTypeDto.INSTANCE.getZeroValue() : countryGateErrorTypeDto, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
        }

        public final String getFeature_identifier() {
            return this.feature_identifier;
        }

        public final CountryGateErrorTypeDto getError_type() {
            return this.error_type;
        }

        public final String getDeeplink_url() {
            return this.deeplink_url;
        }

        public final String getRouting_destination() {
            return this.routing_destination;
        }

        public final String getEndpoint() {
            return this.endpoint;
        }
    }

    /* compiled from: CountryGatingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CountryGatingContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/CountryGatingContextDto;", "Lcom/robinhood/rosetta/eventlogging/CountryGatingContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/CountryGatingContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<CountryGatingContextDto, CountryGatingContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<CountryGatingContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CountryGatingContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<CountryGatingContextDto> getBinaryBase64Serializer() {
            return (KSerializer) CountryGatingContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<CountryGatingContext> getProtoAdapter() {
            return CountryGatingContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CountryGatingContextDto getZeroValue() {
            return CountryGatingContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public CountryGatingContextDto fromProto(CountryGatingContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new CountryGatingContextDto(new Surrogate(proto.getFeature_identifier(), CountryGateErrorTypeDto.INSTANCE.fromProto(proto.getError_type()), proto.getDeeplink_url(), proto.getRouting_destination(), proto.getEndpoint()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.CountryGatingContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CountryGatingContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new CountryGatingContextDto(null, null, null, null, null, 31, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: CountryGatingContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CountryGatingContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/CountryGatingContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/CountryGatingContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<CountryGatingContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.CountryGatingContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, CountryGatingContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public CountryGatingContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new CountryGatingContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: CountryGatingContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CountryGatingContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.CountryGatingContextDto";
        }
    }
}
