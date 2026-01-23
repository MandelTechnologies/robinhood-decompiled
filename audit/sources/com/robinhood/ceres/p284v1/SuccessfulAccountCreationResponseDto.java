package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.ceres.p284v1.FuturesAccountDto;
import com.robinhood.ceres.p284v1.SuccessfulAccountCreationResponseDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
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
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: SuccessfulAccountCreationResponseDto.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004!\"#$B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u0006\u0010\fJ\"\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bJ\b\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aH\u0016J\b\u0010 \u001a\u00020\u001aH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, m3636d2 = {"Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponse;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponseDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponseDto$Surrogate;)V", "account", "Lcom/robinhood/ceres/v1/FuturesAccountDto;", "sub_accounts", "", "(Lcom/robinhood/ceres/v1/FuturesAccountDto;Ljava/util/List;)V", "getAccount", "()Lcom/robinhood/ceres/v1/FuturesAccountDto;", "getSub_accounts", "()Ljava/util/List;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class SuccessfulAccountCreationResponseDto implements Dto3<SuccessfulAccountCreationResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<SuccessfulAccountCreationResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<SuccessfulAccountCreationResponseDto, SuccessfulAccountCreationResponse>> binaryBase64Serializer$delegate;
    private static final SuccessfulAccountCreationResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ SuccessfulAccountCreationResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private SuccessfulAccountCreationResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final FuturesAccountDto getAccount() {
        return this.surrogate.getAccount();
    }

    public final List<FuturesAccountDto> getSub_accounts() {
        return this.surrogate.getSub_accounts();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SuccessfulAccountCreationResponseDto(FuturesAccountDto futuresAccountDto, List<FuturesAccountDto> sub_accounts) {
        this(new Surrogate(futuresAccountDto, sub_accounts));
        Intrinsics.checkNotNullParameter(sub_accounts, "sub_accounts");
    }

    public /* synthetic */ SuccessfulAccountCreationResponseDto(FuturesAccountDto futuresAccountDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : futuresAccountDto, (List<FuturesAccountDto>) ((i & 2) != 0 ? CollectionsKt.emptyList() : list));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuccessfulAccountCreationResponseDto copy$default(SuccessfulAccountCreationResponseDto successfulAccountCreationResponseDto, FuturesAccountDto futuresAccountDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            futuresAccountDto = successfulAccountCreationResponseDto.surrogate.getAccount();
        }
        if ((i & 2) != 0) {
            list = successfulAccountCreationResponseDto.surrogate.getSub_accounts();
        }
        return successfulAccountCreationResponseDto.copy(futuresAccountDto, list);
    }

    public final SuccessfulAccountCreationResponseDto copy(FuturesAccountDto account, List<FuturesAccountDto> sub_accounts) {
        Intrinsics.checkNotNullParameter(sub_accounts, "sub_accounts");
        return new SuccessfulAccountCreationResponseDto(new Surrogate(account, sub_accounts));
    }

    @Override // com.robinhood.idl.Dto
    public SuccessfulAccountCreationResponse toProto() {
        FuturesAccountDto account = this.surrogate.getAccount();
        FuturesAccount proto = account != null ? account.toProto() : null;
        List<FuturesAccountDto> sub_accounts = this.surrogate.getSub_accounts();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sub_accounts, 10));
        Iterator<T> it = sub_accounts.iterator();
        while (it.hasNext()) {
            arrayList.add(((FuturesAccountDto) it.next()).toProto());
        }
        return new SuccessfulAccountCreationResponse(proto, arrayList, null, 4, null);
    }

    public String toString() {
        return "[SuccessfulAccountCreationResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof SuccessfulAccountCreationResponseDto) && Intrinsics.areEqual(((SuccessfulAccountCreationResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: SuccessfulAccountCreationResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002%&B#\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J%\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\tHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponseDto$Surrogate;", "", "account", "Lcom/robinhood/ceres/v1/FuturesAccountDto;", "sub_accounts", "", "<init>", "(Lcom/robinhood/ceres/v1/FuturesAccountDto;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/ceres/v1/FuturesAccountDto;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getAccount$annotations", "()V", "getAccount", "()Lcom/robinhood/ceres/v1/FuturesAccountDto;", "getSub_accounts$annotations", "getSub_accounts", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_v1_externalRelease", "$serializer", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final FuturesAccountDto account;
        private final List<FuturesAccountDto> sub_accounts;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {null, LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: com.robinhood.ceres.v1.SuccessfulAccountCreationResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SuccessfulAccountCreationResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        })};

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((FuturesAccountDto) null, (List) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(FuturesAccountDto.Serializer.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, FuturesAccountDto futuresAccountDto, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                futuresAccountDto = surrogate.account;
            }
            if ((i & 2) != 0) {
                list = surrogate.sub_accounts;
            }
            return surrogate.copy(futuresAccountDto, list);
        }

        @SerialName("account")
        @JsonAnnotations2(names = {"account"})
        public static /* synthetic */ void getAccount$annotations() {
        }

        @SerialName("subAccounts")
        @JsonAnnotations2(names = {"sub_accounts"})
        public static /* synthetic */ void getSub_accounts$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final FuturesAccountDto getAccount() {
            return this.account;
        }

        public final List<FuturesAccountDto> component2() {
            return this.sub_accounts;
        }

        public final Surrogate copy(FuturesAccountDto account, List<FuturesAccountDto> sub_accounts) {
            Intrinsics.checkNotNullParameter(sub_accounts, "sub_accounts");
            return new Surrogate(account, sub_accounts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account, surrogate.account) && Intrinsics.areEqual(this.sub_accounts, surrogate.sub_accounts);
        }

        public int hashCode() {
            FuturesAccountDto futuresAccountDto = this.account;
            return ((futuresAccountDto == null ? 0 : futuresAccountDto.hashCode()) * 31) + this.sub_accounts.hashCode();
        }

        public String toString() {
            return "Surrogate(account=" + this.account + ", sub_accounts=" + this.sub_accounts + ")";
        }

        /* compiled from: SuccessfulAccountCreationResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponseDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return SuccessfulAccountCreationResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, FuturesAccountDto futuresAccountDto, List list, SerializationConstructorMarker serializationConstructorMarker) {
            this.account = (i & 1) == 0 ? null : futuresAccountDto;
            if ((i & 2) == 0) {
                this.sub_accounts = CollectionsKt.emptyList();
            } else {
                this.sub_accounts = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            FuturesAccountDto futuresAccountDto = self.account;
            if (futuresAccountDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, FuturesAccountDto.Serializer.INSTANCE, futuresAccountDto);
            }
            if (Intrinsics.areEqual(self.sub_accounts, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 1, lazyArr[1].getValue(), self.sub_accounts);
        }

        public Surrogate(FuturesAccountDto futuresAccountDto, List<FuturesAccountDto> sub_accounts) {
            Intrinsics.checkNotNullParameter(sub_accounts, "sub_accounts");
            this.account = futuresAccountDto;
            this.sub_accounts = sub_accounts;
        }

        public final FuturesAccountDto getAccount() {
            return this.account;
        }

        public final List<FuturesAccountDto> getSub_accounts() {
            return this.sub_accounts;
        }

        public /* synthetic */ Surrogate(FuturesAccountDto futuresAccountDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : futuresAccountDto, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
        }
    }

    /* compiled from: SuccessfulAccountCreationResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponseDto;", "Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<SuccessfulAccountCreationResponseDto, SuccessfulAccountCreationResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<SuccessfulAccountCreationResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SuccessfulAccountCreationResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<SuccessfulAccountCreationResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) SuccessfulAccountCreationResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<SuccessfulAccountCreationResponse> getProtoAdapter() {
            return SuccessfulAccountCreationResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SuccessfulAccountCreationResponseDto getZeroValue() {
            return SuccessfulAccountCreationResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public SuccessfulAccountCreationResponseDto fromProto(SuccessfulAccountCreationResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            FuturesAccount account = proto.getAccount();
            DefaultConstructorMarker defaultConstructorMarker = null;
            FuturesAccountDto futuresAccountDtoFromProto = account != null ? FuturesAccountDto.INSTANCE.fromProto(account) : null;
            List<FuturesAccount> sub_accounts = proto.getSub_accounts();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sub_accounts, 10));
            Iterator<T> it = sub_accounts.iterator();
            while (it.hasNext()) {
                arrayList.add(FuturesAccountDto.INSTANCE.fromProto((FuturesAccount) it.next()));
            }
            return new SuccessfulAccountCreationResponseDto(new Surrogate(futuresAccountDtoFromProto, arrayList), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.SuccessfulAccountCreationResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SuccessfulAccountCreationResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new SuccessfulAccountCreationResponseDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: SuccessfulAccountCreationResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<SuccessfulAccountCreationResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.SuccessfulAccountCreationResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, SuccessfulAccountCreationResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public SuccessfulAccountCreationResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new SuccessfulAccountCreationResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: SuccessfulAccountCreationResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4193_9)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.SuccessfulAccountCreationResponseDto";
        }
    }
}
