package bonfire.proto.idl.accounts.p028v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.accounts.p028v1.ValidateNicknameResponse;
import bonfire.proto.idl.accounts.p028v1.ValidateNicknameResponseDto;
import bonfire.proto.idl.accounts.p028v1.WarningTypeDto;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: ValidateNicknameResponseDto.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 '2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005(')*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b&\u0010\u0013¨\u0006,"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$Surrogate;)V", "", "Lbonfire/proto/idl/accounts/v1/WarningTypeDto;", "warnings", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto;", "message", "", "nickname", "(Ljava/util/List;Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto;Ljava/lang/String;)V", "toProto", "()Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$Surrogate;", "getMessage", "()Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto;", "getNickname", "Companion", "Surrogate", "WarningDto", "Serializer", "MultibindingModule", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes16.dex */
public final class ValidateNicknameResponseDto implements Dto3<ValidateNicknameResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ValidateNicknameResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ValidateNicknameResponseDto, ValidateNicknameResponse>> binaryBase64Serializer$delegate;
    private static final ValidateNicknameResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ValidateNicknameResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ValidateNicknameResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final WarningDto getMessage() {
        return this.surrogate.getMessage();
    }

    public final String getNickname() {
        return this.surrogate.getNickname();
    }

    public /* synthetic */ ValidateNicknameResponseDto(List list, WarningDto warningDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : warningDto, (i & 4) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ValidateNicknameResponseDto(List<? extends WarningTypeDto> warnings, WarningDto warningDto, String str) {
        this(new Surrogate(warnings, warningDto, str));
        Intrinsics.checkNotNullParameter(warnings, "warnings");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ValidateNicknameResponse toProto() {
        List<WarningTypeDto> warnings = this.surrogate.getWarnings();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(warnings, 10));
        Iterator<T> it = warnings.iterator();
        while (it.hasNext()) {
            arrayList.add((WarningType) ((WarningTypeDto) it.next()).toProto());
        }
        WarningDto message = this.surrogate.getMessage();
        return new ValidateNicknameResponse(arrayList, message != null ? message.toProto() : null, this.surrogate.getNickname(), null, 8, null);
    }

    public String toString() {
        return "[ValidateNicknameResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ValidateNicknameResponseDto) && Intrinsics.areEqual(((ValidateNicknameResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: ValidateNicknameResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0083\b\u0018\u0000 -2\u00020\u0001:\u0002.-B/\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b,\u0010%\u001a\u0004\b+\u0010\u001a¨\u0006/"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$Surrogate;", "", "", "Lbonfire/proto/idl/accounts/v1/WarningTypeDto;", "warnings", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto;", "message", "", "nickname", "<init>", "(Ljava/util/List;Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_accounts_v1_externalRelease", "(Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getWarnings", "()Ljava/util/List;", "getWarnings$annotations", "()V", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto;", "getMessage", "()Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto;", "getMessage$annotations", "Ljava/lang/String;", "getNickname", "getNickname$annotations", "Companion", "$serializer", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final WarningDto message;
        private final String nickname;
        private final List<WarningTypeDto> warnings;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bonfire.proto.idl.accounts.v1.ValidateNicknameResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ValidateNicknameResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null};

        public Surrogate() {
            this((List) null, (WarningDto) null, (String) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(WarningTypeDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.warnings, surrogate.warnings) && Intrinsics.areEqual(this.message, surrogate.message) && Intrinsics.areEqual(this.nickname, surrogate.nickname);
        }

        public int hashCode() {
            int iHashCode = this.warnings.hashCode() * 31;
            WarningDto warningDto = this.message;
            int iHashCode2 = (iHashCode + (warningDto == null ? 0 : warningDto.hashCode())) * 31;
            String str = this.nickname;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(warnings=" + this.warnings + ", message=" + this.message + ", nickname=" + this.nickname + ")";
        }

        /* compiled from: ValidateNicknameResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$Surrogate;", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ValidateNicknameResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, List list, WarningDto warningDto, String str, SerializationConstructorMarker serializationConstructorMarker) {
            this.warnings = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.message = null;
            } else {
                this.message = warningDto;
            }
            if ((i & 4) == 0) {
                this.nickname = null;
            } else {
                this.nickname = str;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_proto_idl_accounts_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.warnings, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.warnings);
            }
            WarningDto warningDto = self.message;
            if (warningDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, WarningDto.Serializer.INSTANCE, warningDto);
            }
            String str = self.nickname;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, str);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate(List<? extends WarningTypeDto> warnings, WarningDto warningDto, String str) {
            Intrinsics.checkNotNullParameter(warnings, "warnings");
            this.warnings = warnings;
            this.message = warningDto;
            this.nickname = str;
        }

        public final List<WarningTypeDto> getWarnings() {
            return this.warnings;
        }

        public /* synthetic */ Surrogate(List list, WarningDto warningDto, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : warningDto, (i & 4) != 0 ? null : str);
        }

        public final WarningDto getMessage() {
            return this.message;
        }

        public final String getNickname() {
            return this.nickname;
        }
    }

    /* compiled from: ValidateNicknameResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto;", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ValidateNicknameResponseDto, ValidateNicknameResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ValidateNicknameResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ValidateNicknameResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ValidateNicknameResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) ValidateNicknameResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ValidateNicknameResponse> getProtoAdapter() {
            return ValidateNicknameResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ValidateNicknameResponseDto getZeroValue() {
            return ValidateNicknameResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ValidateNicknameResponseDto fromProto(ValidateNicknameResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<WarningType> warnings = proto.getWarnings();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(warnings, 10));
            Iterator<T> it = warnings.iterator();
            while (it.hasNext()) {
                arrayList.add(WarningTypeDto.INSTANCE.fromProto((WarningType) it.next()));
            }
            ValidateNicknameResponse.Warning message = proto.getMessage();
            return new ValidateNicknameResponseDto(new Surrogate(arrayList, message != null ? WarningDto.INSTANCE.fromProto(message) : null, proto.getNickname()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.accounts.v1.ValidateNicknameResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ValidateNicknameResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new ValidateNicknameResponseDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ValidateNicknameResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005%$&'(B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u001d\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b!\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006)"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse$Warning;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$Surrogate;)V", "", "message", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$SeverityDto;", "severity", "(Ljava/lang/String;Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$SeverityDto;)V", "toProto", "()Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse$Warning;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$Surrogate;", "getMessage", "getSeverity", "()Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$SeverityDto;", "Companion", "Surrogate", "SeverityDto", "Serializer", "MultibindingModule", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class WarningDto implements Dto3<ValidateNicknameResponse.Warning>, Parcelable {

        @JvmField
        public static final Parcelable.Creator<WarningDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<WarningDto, ValidateNicknameResponse.Warning>> binaryBase64Serializer$delegate;
        private static final WarningDto zeroValue;
        private final Surrogate surrogate;

        public /* synthetic */ WarningDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
            this(surrogate);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private WarningDto(Surrogate surrogate) {
            this.surrogate = surrogate;
        }

        public final String getMessage() {
            return this.surrogate.getMessage();
        }

        public final SeverityDto getSeverity() {
            return this.surrogate.getSeverity();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public WarningDto(String message, SeverityDto severity) {
            this(new Surrogate(message, severity));
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(severity, "severity");
        }

        public /* synthetic */ WarningDto(String str, SeverityDto severityDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SeverityDto.INSTANCE.getZeroValue() : severityDto);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.robinhood.idl.Dto
        public ValidateNicknameResponse.Warning toProto() {
            return new ValidateNicknameResponse.Warning(this.surrogate.getMessage(), (ValidateNicknameResponse.Warning.Severity) this.surrogate.getSeverity().toProto(), null, 4, null);
        }

        public String toString() {
            return "[WarningDto]:" + toProto();
        }

        public boolean equals(Object other) {
            if (other != this) {
                return (other instanceof WarningDto) && Intrinsics.areEqual(((WarningDto) other).surrogate, this.surrogate);
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
        /* compiled from: ValidateNicknameResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\r\b\u0083\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\u0017R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\"\u0012\u0004\b%\u0010!\u001a\u0004\b#\u0010$¨\u0006("}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$Surrogate;", "", "", "message", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$SeverityDto;", "severity", "<init>", "(Ljava/lang/String;Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$SeverityDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$SeverityDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_proto_idl_accounts_v1_externalRelease", "(Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessage", "getMessage$annotations", "()V", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$SeverityDto;", "getSeverity", "()Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$SeverityDto;", "getSeverity$annotations", "Companion", "$serializer", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable
        static final /* data */ class Surrogate {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion(null);
            private final String message;
            private final SeverityDto severity;

            /* JADX WARN: Multi-variable type inference failed */
            public Surrogate() {
                this((String) null, (SeverityDto) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Surrogate)) {
                    return false;
                }
                Surrogate surrogate = (Surrogate) other;
                return Intrinsics.areEqual(this.message, surrogate.message) && this.severity == surrogate.severity;
            }

            public int hashCode() {
                return (this.message.hashCode() * 31) + this.severity.hashCode();
            }

            public String toString() {
                return "Surrogate(message=" + this.message + ", severity=" + this.severity + ")";
            }

            /* compiled from: ValidateNicknameResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$Surrogate;", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion {
                private Companion() {
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final KSerializer<Surrogate> serializer() {
                    return ValidateNicknameResponseDto4.INSTANCE;
                }
            }

            public /* synthetic */ Surrogate(int i, String str, SeverityDto severityDto, SerializationConstructorMarker serializationConstructorMarker) {
                this.message = (i & 1) == 0 ? "" : str;
                if ((i & 2) == 0) {
                    this.severity = SeverityDto.INSTANCE.getZeroValue();
                } else {
                    this.severity = severityDto;
                }
            }

            @JvmStatic
            public static final /* synthetic */ void write$Self$bonfire_proto_idl_accounts_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
                if (!Intrinsics.areEqual(self.message, "")) {
                    output.encodeStringElement(serialDesc, 0, self.message);
                }
                if (self.severity != SeverityDto.INSTANCE.getZeroValue()) {
                    output.encodeSerializableElement(serialDesc, 1, SeverityDto.Serializer.INSTANCE, self.severity);
                }
            }

            public Surrogate(String message, SeverityDto severity) {
                Intrinsics.checkNotNullParameter(message, "message");
                Intrinsics.checkNotNullParameter(severity, "severity");
                this.message = message;
                this.severity = severity;
            }

            public final String getMessage() {
                return this.message;
            }

            public /* synthetic */ Surrogate(String str, SeverityDto severityDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SeverityDto.INSTANCE.getZeroValue() : severityDto);
            }

            public final SeverityDto getSeverity() {
                return this.severity;
            }
        }

        /* compiled from: ValidateNicknameResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto;", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse$Warning;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto3.Creator<WarningDto, ValidateNicknameResponse.Warning> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<WarningDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<WarningDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<WarningDto> getBinaryBase64Serializer() {
                return (KSerializer) WarningDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ValidateNicknameResponse.Warning> getProtoAdapter() {
                return ValidateNicknameResponse.Warning.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public WarningDto getZeroValue() {
                return WarningDto.zeroValue;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public WarningDto fromProto(ValidateNicknameResponse.Warning proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                return new WarningDto(new Surrogate(proto.getMessage(), SeverityDto.INSTANCE.fromProto(proto.getSeverity())), (DefaultConstructorMarker) null);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.accounts.v1.ValidateNicknameResponseDto$WarningDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ValidateNicknameResponseDto.WarningDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            zeroValue = new WarningDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ValidateNicknameResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$SeverityDto;", "Lcom/robinhood/idl/EnumDto;", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse$Warning$Severity;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SEVERITY_UNSPECIFIED", "SEVERITY_ERROR", "SEVERITY_WARNING", "SEVERITY_INFO", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @Serializable(with = Serializer.class)
        @RhGenerated
        public static final class SeverityDto implements Dto2<ValidateNicknameResponse.Warning.Severity>, Parcelable {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ SeverityDto[] $VALUES;

            @JvmField
            public static final Parcelable.Creator<SeverityDto> CREATOR;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private static final Lazy<BinaryBase64DtoSerializer<SeverityDto, ValidateNicknameResponse.Warning.Severity>> binaryBase64Serializer$delegate;
            public static final SeverityDto SEVERITY_UNSPECIFIED = new SEVERITY_UNSPECIFIED("SEVERITY_UNSPECIFIED", 0);
            public static final SeverityDto SEVERITY_ERROR = new SEVERITY_ERROR("SEVERITY_ERROR", 1);
            public static final SeverityDto SEVERITY_WARNING = new SEVERITY_WARNING("SEVERITY_WARNING", 2);
            public static final SeverityDto SEVERITY_INFO = new SEVERITY_INFO("SEVERITY_INFO", 3);

            private static final /* synthetic */ SeverityDto[] $values() {
                return new SeverityDto[]{SEVERITY_UNSPECIFIED, SEVERITY_ERROR, SEVERITY_WARNING, SEVERITY_INFO};
            }

            public /* synthetic */ SeverityDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, i);
            }

            public static EnumEntries<SeverityDto> getEntries() {
                return $ENTRIES;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            private SeverityDto(String str, int i) {
            }

            /* compiled from: ValidateNicknameResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto.WarningDto.SeverityDto.SEVERITY_UNSPECIFIED", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$SeverityDto;", "toProto", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse$Warning$Severity;", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class SEVERITY_UNSPECIFIED extends SeverityDto {
                SEVERITY_UNSPECIFIED(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public ValidateNicknameResponse.Warning.Severity toProto() {
                    return ValidateNicknameResponse.Warning.Severity.SEVERITY_UNSPECIFIED;
                }
            }

            static {
                SeverityDto[] severityDtoArr$values = $values();
                $VALUES = severityDtoArr$values;
                $ENTRIES = EnumEntries2.enumEntries(severityDtoArr$values);
                Companion companion = new Companion(null);
                INSTANCE = companion;
                binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.accounts.v1.ValidateNicknameResponseDto$WarningDto$SeverityDto$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ValidateNicknameResponseDto.WarningDto.SeverityDto.binaryBase64Serializer_delegate$lambda$0();
                    }
                });
                CREATOR = new DtoParcelableCreator(companion);
            }

            /* compiled from: ValidateNicknameResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto.WarningDto.SeverityDto.SEVERITY_ERROR", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$SeverityDto;", "toProto", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse$Warning$Severity;", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class SEVERITY_ERROR extends SeverityDto {
                SEVERITY_ERROR(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public ValidateNicknameResponse.Warning.Severity toProto() {
                    return ValidateNicknameResponse.Warning.Severity.SEVERITY_ERROR;
                }
            }

            /* compiled from: ValidateNicknameResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto.WarningDto.SeverityDto.SEVERITY_WARNING", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$SeverityDto;", "toProto", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse$Warning$Severity;", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class SEVERITY_WARNING extends SeverityDto {
                SEVERITY_WARNING(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public ValidateNicknameResponse.Warning.Severity toProto() {
                    return ValidateNicknameResponse.Warning.Severity.SEVERITY_WARNING;
                }
            }

            /* compiled from: ValidateNicknameResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"bonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto.WarningDto.SeverityDto.SEVERITY_INFO", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$SeverityDto;", "toProto", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse$Warning$Severity;", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            static final class SEVERITY_INFO extends SeverityDto {
                SEVERITY_INFO(String str, int i) {
                    super(str, i, null);
                }

                @Override // com.robinhood.idl.Dto
                public ValidateNicknameResponse.Warning.Severity toProto() {
                    return ValidateNicknameResponse.Warning.Severity.SEVERITY_INFO;
                }
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel dest, int flags) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
            }

            /* compiled from: ValidateNicknameResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$SeverityDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$SeverityDto;", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponse$Warning$Severity;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$SeverityDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion implements Dto2.Creator<SeverityDto, ValidateNicknameResponse.Warning.Severity> {

                /* compiled from: ValidateNicknameResponseDto.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[ValidateNicknameResponse.Warning.Severity.values().length];
                        try {
                            iArr[ValidateNicknameResponse.Warning.Severity.SEVERITY_UNSPECIFIED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[ValidateNicknameResponse.Warning.Severity.SEVERITY_ERROR.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[ValidateNicknameResponse.Warning.Severity.SEVERITY_WARNING.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[ValidateNicknameResponse.Warning.Severity.SEVERITY_INFO.ordinal()] = 4;
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

                public final KSerializer<SeverityDto> serializer() {
                    return Serializer.INSTANCE;
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<SeverityDto> getDefaultSerializer() {
                    return serializer();
                }

                @Override // com.robinhood.idl.Dto.SerializableCreator
                public KSerializer<SeverityDto> getBinaryBase64Serializer() {
                    return (KSerializer) SeverityDto.binaryBase64Serializer$delegate.getValue();
                }

                @Override // com.robinhood.idl.Dto.Creator
                public ProtoAdapter<ValidateNicknameResponse.Warning.Severity> getProtoAdapter() {
                    return ValidateNicknameResponse.Warning.Severity.ADAPTER;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public SeverityDto getZeroValue() {
                    return SeverityDto.SEVERITY_UNSPECIFIED;
                }

                @Override // com.robinhood.idl.Dto.Creator
                public SeverityDto fromProto(ValidateNicknameResponse.Warning.Severity proto) {
                    Intrinsics.checkNotNullParameter(proto, "proto");
                    int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                    if (i == 1) {
                        return SeverityDto.SEVERITY_UNSPECIFIED;
                    }
                    if (i == 2) {
                        return SeverityDto.SEVERITY_ERROR;
                    }
                    if (i == 3) {
                        return SeverityDto.SEVERITY_WARNING;
                    }
                    if (i != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    return SeverityDto.SEVERITY_INFO;
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
                return new BinaryBase64DtoSerializer(INSTANCE);
            }

            /* compiled from: ValidateNicknameResponseDto.kt */
            @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$SeverityDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$SeverityDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Serializer implements KSerializer<SeverityDto> {
                public static final Serializer INSTANCE = new Serializer();
                private final /* synthetic */ EnumDtoSerializer<SeverityDto, ValidateNicknameResponse.Warning.Severity> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/bonfire.proto.idl.accounts.v1.ValidateNicknameResponse.Warning.Severity", SeverityDto.getEntries(), SeverityDto.INSTANCE.getZeroValue());

                @Override // kotlinx.serialization.KSerializer2
                public SeverityDto deserialize(Decoding2 decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    return (SeverityDto) this.$$delegate_0.deserialize(decoder);
                }

                @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
                public SerialDescriptor getDescriptor() {
                    return this.$$delegate_0.getDescriptor();
                }

                @Override // kotlinx.serialization.KSerializer3
                public void serialize(Encoding4 encoder, SeverityDto value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    this.$$delegate_0.serialize(encoder, (Enum) value);
                }

                private Serializer() {
                }
            }

            public static SeverityDto valueOf(String str) {
                return (SeverityDto) Enum.valueOf(SeverityDto.class, str);
            }

            public static SeverityDto[] values() {
                return (SeverityDto[]) $VALUES.clone();
            }
        }

        /* compiled from: ValidateNicknameResponseDto.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<WarningDto> {
            public static final Serializer INSTANCE = new Serializer();
            private static final SerialDescriptor descriptor;
            private static final KSerializer<Surrogate> surrogateSerializer;

            private Serializer() {
            }

            static {
                KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
                surrogateSerializer = kSerializerSerializer;
                descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.accounts.v1.ValidateNicknameResponse.Warning", kSerializerSerializer.getDescriptor());
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, WarningDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
            }

            @Override // kotlinx.serialization.KSerializer2
            public WarningDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return new WarningDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
            }
        }

        /* compiled from: ValidateNicknameResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$WarningDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class MultibindingModule {
            public static final MultibindingModule INSTANCE = new MultibindingModule();

            private MultibindingModule() {
            }

            @MultibindingShard(number = MultibindingShard.Number.f4187_3)
            public final String provideIntoMap() {
                return "bonfire.proto.idl.accounts.v1.ValidateNicknameResponseDto$WarningDto";
            }
        }
    }

    /* compiled from: ValidateNicknameResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ValidateNicknameResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.accounts.v1.ValidateNicknameResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ValidateNicknameResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ValidateNicknameResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ValidateNicknameResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ValidateNicknameResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/ValidateNicknameResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.proto.idl.accounts.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4186_2)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.accounts.v1.ValidateNicknameResponseDto";
        }
    }
}
