package com.robinhood.prediction_markets.proto.p361v1.idl;

import android.os.Parcel;
import android.os.Parcelable;
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
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: GetEventRequestDto.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004#$%&B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u000eJ.\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\tJ\b\u0010\u0016\u001a\u00020\u0002H\u0016J\b\u0010\u0017\u001a\u00020\tH\u0016J\u0013\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001cH\u0016J\b\u0010\"\u001a\u00020\u001cH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\r\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010¨\u0006'"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequestDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequest;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequestDto$Surrogate;", "<init>", "(Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequestDto$Surrogate;)V", "id", "", "include_nondiscoverable_contracts", "", "hydrate_contract_groups", "url_slug", "(Ljava/lang/String;ZZLjava/lang/String;)V", "getId", "()Ljava/lang/String;", "getInclude_nondiscoverable_contracts", "()Z", "getHydrate_contract_groups", "getUrl_slug", "copy", "toProto", "toString", "equals", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes26.dex */
public final class GetEventRequestDto implements Dto3<GetEventRequest>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetEventRequestDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetEventRequestDto, GetEventRequest>> binaryBase64Serializer$delegate;
    private static final GetEventRequestDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetEventRequestDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetEventRequestDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getId() {
        return this.surrogate.getId();
    }

    public final boolean getInclude_nondiscoverable_contracts() {
        return this.surrogate.getInclude_nondiscoverable_contracts();
    }

    public final boolean getHydrate_contract_groups() {
        return this.surrogate.getHydrate_contract_groups();
    }

    public final String getUrl_slug() {
        return this.surrogate.getUrl_slug();
    }

    public /* synthetic */ GetEventRequestDto(String str, boolean z, boolean z2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? "" : str2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetEventRequestDto(String id, boolean z, boolean z2, String url_slug) {
        this(new Surrogate(id, z, z2, url_slug));
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(url_slug, "url_slug");
    }

    public static /* synthetic */ GetEventRequestDto copy$default(GetEventRequestDto getEventRequestDto, String str, boolean z, boolean z2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getEventRequestDto.surrogate.getId();
        }
        if ((i & 2) != 0) {
            z = getEventRequestDto.surrogate.getInclude_nondiscoverable_contracts();
        }
        if ((i & 4) != 0) {
            z2 = getEventRequestDto.surrogate.getHydrate_contract_groups();
        }
        if ((i & 8) != 0) {
            str2 = getEventRequestDto.surrogate.getUrl_slug();
        }
        return getEventRequestDto.copy(str, z, z2, str2);
    }

    public final GetEventRequestDto copy(String id, boolean include_nondiscoverable_contracts, boolean hydrate_contract_groups, String url_slug) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(url_slug, "url_slug");
        return new GetEventRequestDto(new Surrogate(id, include_nondiscoverable_contracts, hydrate_contract_groups, url_slug));
    }

    @Override // com.robinhood.idl.Dto
    public GetEventRequest toProto() {
        return new GetEventRequest(this.surrogate.getId(), this.surrogate.getInclude_nondiscoverable_contracts(), this.surrogate.getHydrate_contract_groups(), this.surrogate.getUrl_slug(), null, 16, null);
    }

    public String toString() {
        return "[GetEventRequestDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetEventRequestDto) && Intrinsics.areEqual(((GetEventRequestDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetEventRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002+,B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J1\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u000bHÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J%\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0001¢\u0006\u0002\b*R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0017\u0010\u0015R\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012¨\u0006-"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequestDto$Surrogate;", "", "id", "", "include_nondiscoverable_contracts", "", "hydrate_contract_groups", "url_slug", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZZLjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId$annotations", "()V", "getId", "()Ljava/lang/String;", "getInclude_nondiscoverable_contracts$annotations", "getInclude_nondiscoverable_contracts", "()Z", "getHydrate_contract_groups$annotations", "getHydrate_contract_groups", "getUrl_slug$annotations", "getUrl_slug", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$prediction_markets_v1_externalRelease", "$serializer", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final boolean hydrate_contract_groups;
        private final String id;
        private final boolean include_nondiscoverable_contracts;
        private final String url_slug;

        public Surrogate() {
            this((String) null, false, false, (String) null, 15, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, boolean z, boolean z2, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.id;
            }
            if ((i & 2) != 0) {
                z = surrogate.include_nondiscoverable_contracts;
            }
            if ((i & 4) != 0) {
                z2 = surrogate.hydrate_contract_groups;
            }
            if ((i & 8) != 0) {
                str2 = surrogate.url_slug;
            }
            return surrogate.copy(str, z, z2, str2);
        }

        @SerialName("hydrateContractGroups")
        @JsonAnnotations2(names = {"hydrate_contract_groups"})
        public static /* synthetic */ void getHydrate_contract_groups$annotations() {
        }

        @SerialName("id")
        @JsonAnnotations2(names = {"id"})
        public static /* synthetic */ void getId$annotations() {
        }

        @SerialName("includeNondiscoverableContracts")
        @JsonAnnotations2(names = {"include_nondiscoverable_contracts"})
        public static /* synthetic */ void getInclude_nondiscoverable_contracts$annotations() {
        }

        @SerialName("urlSlug")
        @JsonAnnotations2(names = {"url_slug"})
        public static /* synthetic */ void getUrl_slug$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getInclude_nondiscoverable_contracts() {
            return this.include_nondiscoverable_contracts;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHydrate_contract_groups() {
            return this.hydrate_contract_groups;
        }

        /* renamed from: component4, reason: from getter */
        public final String getUrl_slug() {
            return this.url_slug;
        }

        public final Surrogate copy(String id, boolean include_nondiscoverable_contracts, boolean hydrate_contract_groups, String url_slug) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(url_slug, "url_slug");
            return new Surrogate(id, include_nondiscoverable_contracts, hydrate_contract_groups, url_slug);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.id, surrogate.id) && this.include_nondiscoverable_contracts == surrogate.include_nondiscoverable_contracts && this.hydrate_contract_groups == surrogate.hydrate_contract_groups && Intrinsics.areEqual(this.url_slug, surrogate.url_slug);
        }

        public int hashCode() {
            return (((((this.id.hashCode() * 31) + Boolean.hashCode(this.include_nondiscoverable_contracts)) * 31) + Boolean.hashCode(this.hydrate_contract_groups)) * 31) + this.url_slug.hashCode();
        }

        public String toString() {
            return "Surrogate(id=" + this.id + ", include_nondiscoverable_contracts=" + this.include_nondiscoverable_contracts + ", hydrate_contract_groups=" + this.hydrate_contract_groups + ", url_slug=" + this.url_slug + ")";
        }

        /* compiled from: GetEventRequestDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequestDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequestDto$Surrogate;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetEventRequestDto4.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, boolean z, boolean z2, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.id = "";
            } else {
                this.id = str;
            }
            if ((i & 2) == 0) {
                this.include_nondiscoverable_contracts = false;
            } else {
                this.include_nondiscoverable_contracts = z;
            }
            if ((i & 4) == 0) {
                this.hydrate_contract_groups = false;
            } else {
                this.hydrate_contract_groups = z2;
            }
            if ((i & 8) == 0) {
                this.url_slug = "";
            } else {
                this.url_slug = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$prediction_markets_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.id, "")) {
                output.encodeStringElement(serialDesc, 0, self.id);
            }
            boolean z = self.include_nondiscoverable_contracts;
            if (z) {
                output.encodeBooleanElement(serialDesc, 1, z);
            }
            boolean z2 = self.hydrate_contract_groups;
            if (z2) {
                output.encodeBooleanElement(serialDesc, 2, z2);
            }
            if (Intrinsics.areEqual(self.url_slug, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 3, self.url_slug);
        }

        public Surrogate(String id, boolean z, boolean z2, String url_slug) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(url_slug, "url_slug");
            this.id = id;
            this.include_nondiscoverable_contracts = z;
            this.hydrate_contract_groups = z2;
            this.url_slug = url_slug;
        }

        public /* synthetic */ Surrogate(String str, boolean z, boolean z2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? "" : str2);
        }

        public final String getId() {
            return this.id;
        }

        public final boolean getInclude_nondiscoverable_contracts() {
            return this.include_nondiscoverable_contracts;
        }

        public final boolean getHydrate_contract_groups() {
            return this.hydrate_contract_groups;
        }

        public final String getUrl_slug() {
            return this.url_slug;
        }
    }

    /* compiled from: GetEventRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequestDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequestDto;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequest;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequestDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<GetEventRequestDto, GetEventRequest> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetEventRequestDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetEventRequestDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetEventRequestDto> getBinaryBase64Serializer() {
            return (KSerializer) GetEventRequestDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetEventRequest> getProtoAdapter() {
            return GetEventRequest.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetEventRequestDto getZeroValue() {
            return GetEventRequestDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetEventRequestDto fromProto(GetEventRequest proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new GetEventRequestDto(new Surrogate(proto.getId(), proto.getInclude_nondiscoverable_contracts(), proto.getHydrate_contract_groups(), proto.getUrl_slug()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.prediction_markets.proto.v1.idl.GetEventRequestDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetEventRequestDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new GetEventRequestDto(null, false, false, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetEventRequestDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequestDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequestDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequestDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<GetEventRequestDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/prediction_markets.v1.GetEventRequest", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetEventRequestDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetEventRequestDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetEventRequestDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetEventRequestDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GetEventRequestDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.prediction_markets.proto.v1.idl.GetEventRequestDto";
        }
    }
}
