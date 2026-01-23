package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import bff_money_movement.service.p019v1.GetNonOriginatedTransferInfoResponseDto;
import bff_money_movement.service.p019v1.GetNonOriginatedTransferInfoSectionDto;
import bff_money_movement.service.p019v1.StandardScreenDataDto;
import com.robinhood.android.idl.common.MultibindingShard;
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
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: GetNonOriginatedTransferInfoResponseDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004*)+,B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B1\b\u0016\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010'¨\u0006-"}, m3636d2 = {"Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponse;", "Landroid/os/Parcelable;", "Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponseDto$Surrogate;", "surrogate", "<init>", "(Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponseDto$Surrogate;)V", "", "Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoSectionDto;", "sections", "Lbff_money_movement/service/v1/StandardScreenDataDto;", "screen_data", "confirmation_screen_data", "(Ljava/util/List;Lbff_money_movement/service/v1/StandardScreenDataDto;Lbff_money_movement/service/v1/StandardScreenDataDto;)V", "toProto", "()Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponse;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponseDto$Surrogate;", "getSections", "()Ljava/util/List;", "getScreen_data", "()Lbff_money_movement/service/v1/StandardScreenDataDto;", "getConfirmation_screen_data", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
@SourceDebugExtension
/* loaded from: classes.dex */
public final class GetNonOriginatedTransferInfoResponseDto implements Dto3<GetNonOriginatedTransferInfoResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<GetNonOriginatedTransferInfoResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GetNonOriginatedTransferInfoResponseDto, GetNonOriginatedTransferInfoResponse>> binaryBase64Serializer$delegate;
    private static final GetNonOriginatedTransferInfoResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ GetNonOriginatedTransferInfoResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GetNonOriginatedTransferInfoResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final List<GetNonOriginatedTransferInfoSectionDto> getSections() {
        return this.surrogate.getSections();
    }

    public final StandardScreenDataDto getScreen_data() {
        return this.surrogate.getScreen_data();
    }

    public final StandardScreenDataDto getConfirmation_screen_data() {
        return this.surrogate.getConfirmation_screen_data();
    }

    public /* synthetic */ GetNonOriginatedTransferInfoResponseDto(List list, StandardScreenDataDto standardScreenDataDto, StandardScreenDataDto standardScreenDataDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : standardScreenDataDto, (i & 4) != 0 ? null : standardScreenDataDto2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GetNonOriginatedTransferInfoResponseDto(List<GetNonOriginatedTransferInfoSectionDto> sections, StandardScreenDataDto standardScreenDataDto, StandardScreenDataDto standardScreenDataDto2) {
        this(new Surrogate(sections, standardScreenDataDto, standardScreenDataDto2));
        Intrinsics.checkNotNullParameter(sections, "sections");
    }

    @Override // com.robinhood.idl.Dto
    public GetNonOriginatedTransferInfoResponse toProto() {
        List<GetNonOriginatedTransferInfoSectionDto> sections = this.surrogate.getSections();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sections, 10));
        Iterator<T> it = sections.iterator();
        while (it.hasNext()) {
            arrayList.add(((GetNonOriginatedTransferInfoSectionDto) it.next()).toProto());
        }
        StandardScreenDataDto screen_data = this.surrogate.getScreen_data();
        StandardScreenData proto = screen_data != null ? screen_data.toProto() : null;
        StandardScreenDataDto confirmation_screen_data = this.surrogate.getConfirmation_screen_data();
        return new GetNonOriginatedTransferInfoResponse(arrayList, proto, confirmation_screen_data != null ? confirmation_screen_data.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[GetNonOriginatedTransferInfoResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof GetNonOriginatedTransferInfoResponseDto) && Intrinsics.areEqual(((GetNonOriginatedTransferInfoResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: GetNonOriginatedTransferInfoResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0083\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B/\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b)\u0010%\u001a\u0004\b'\u0010(R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b+\u0010%\u001a\u0004\b*\u0010(¨\u0006."}, m3636d2 = {"Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponseDto$Surrogate;", "", "", "Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoSectionDto;", "sections", "Lbff_money_movement/service/v1/StandardScreenDataDto;", "screen_data", "confirmation_screen_data", "<init>", "(Ljava/util/List;Lbff_money_movement/service/v1/StandardScreenDataDto;Lbff_money_movement/service/v1/StandardScreenDataDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lbff_money_movement/service/v1/StandardScreenDataDto;Lbff_money_movement/service/v1/StandardScreenDataDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bff_money_movement_service_v1_externalRelease", "(Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getSections", "()Ljava/util/List;", "getSections$annotations", "()V", "Lbff_money_movement/service/v1/StandardScreenDataDto;", "getScreen_data", "()Lbff_money_movement/service/v1/StandardScreenDataDto;", "getScreen_data$annotations", "getConfirmation_screen_data", "getConfirmation_screen_data$annotations", "Companion", "$serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {
        private final StandardScreenDataDto confirmation_screen_data;
        private final StandardScreenDataDto screen_data;
        private final List<GetNonOriginatedTransferInfoSectionDto> sections;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        @JvmField
        private static final Lazy<KSerializer<Object>>[] $childSerializers = {LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: bff_money_movement.service.v1.GetNonOriginatedTransferInfoResponseDto$Surrogate$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetNonOriginatedTransferInfoResponseDto.Surrogate._childSerializers$_anonymous_();
            }
        }), null, null};

        public Surrogate() {
            this((List) null, (StandardScreenDataDto) null, (StandardScreenDataDto) null, 7, (DefaultConstructorMarker) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer _childSerializers$_anonymous_() {
            return new ArrayListSerializer(GetNonOriginatedTransferInfoSectionDto.Serializer.INSTANCE);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.sections, surrogate.sections) && Intrinsics.areEqual(this.screen_data, surrogate.screen_data) && Intrinsics.areEqual(this.confirmation_screen_data, surrogate.confirmation_screen_data);
        }

        public int hashCode() {
            int iHashCode = this.sections.hashCode() * 31;
            StandardScreenDataDto standardScreenDataDto = this.screen_data;
            int iHashCode2 = (iHashCode + (standardScreenDataDto == null ? 0 : standardScreenDataDto.hashCode())) * 31;
            StandardScreenDataDto standardScreenDataDto2 = this.confirmation_screen_data;
            return iHashCode2 + (standardScreenDataDto2 != null ? standardScreenDataDto2.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(sections=" + this.sections + ", screen_data=" + this.screen_data + ", confirmation_screen_data=" + this.confirmation_screen_data + ")";
        }

        /* compiled from: GetNonOriginatedTransferInfoResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponseDto$Surrogate;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return GetNonOriginatedTransferInfoResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, List list, StandardScreenDataDto standardScreenDataDto, StandardScreenDataDto standardScreenDataDto2, SerializationConstructorMarker serializationConstructorMarker) {
            this.sections = (i & 1) == 0 ? CollectionsKt.emptyList() : list;
            if ((i & 2) == 0) {
                this.screen_data = null;
            } else {
                this.screen_data = standardScreenDataDto;
            }
            if ((i & 4) == 0) {
                this.confirmation_screen_data = null;
            } else {
                this.confirmation_screen_data = standardScreenDataDto2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bff_money_movement_service_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            Lazy<KSerializer<Object>>[] lazyArr = $childSerializers;
            if (!Intrinsics.areEqual(self.sections, CollectionsKt.emptyList())) {
                output.encodeSerializableElement(serialDesc, 0, lazyArr[0].getValue(), self.sections);
            }
            StandardScreenDataDto standardScreenDataDto = self.screen_data;
            if (standardScreenDataDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StandardScreenDataDto.Serializer.INSTANCE, standardScreenDataDto);
            }
            StandardScreenDataDto standardScreenDataDto2 = self.confirmation_screen_data;
            if (standardScreenDataDto2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, StandardScreenDataDto.Serializer.INSTANCE, standardScreenDataDto2);
            }
        }

        public Surrogate(List<GetNonOriginatedTransferInfoSectionDto> sections, StandardScreenDataDto standardScreenDataDto, StandardScreenDataDto standardScreenDataDto2) {
            Intrinsics.checkNotNullParameter(sections, "sections");
            this.sections = sections;
            this.screen_data = standardScreenDataDto;
            this.confirmation_screen_data = standardScreenDataDto2;
        }

        public final List<GetNonOriginatedTransferInfoSectionDto> getSections() {
            return this.sections;
        }

        public /* synthetic */ Surrogate(List list, StandardScreenDataDto standardScreenDataDto, StandardScreenDataDto standardScreenDataDto2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : standardScreenDataDto, (i & 4) != 0 ? null : standardScreenDataDto2);
        }

        public final StandardScreenDataDto getScreen_data() {
            return this.screen_data;
        }

        public final StandardScreenDataDto getConfirmation_screen_data() {
            return this.confirmation_screen_data;
        }
    }

    /* compiled from: GetNonOriginatedTransferInfoResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponseDto;", "Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<GetNonOriginatedTransferInfoResponseDto, GetNonOriginatedTransferInfoResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<GetNonOriginatedTransferInfoResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetNonOriginatedTransferInfoResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GetNonOriginatedTransferInfoResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) GetNonOriginatedTransferInfoResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GetNonOriginatedTransferInfoResponse> getProtoAdapter() {
            return GetNonOriginatedTransferInfoResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetNonOriginatedTransferInfoResponseDto getZeroValue() {
            return GetNonOriginatedTransferInfoResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GetNonOriginatedTransferInfoResponseDto fromProto(GetNonOriginatedTransferInfoResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            List<GetNonOriginatedTransferInfoSection> sections = proto.getSections();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sections, 10));
            Iterator<T> it = sections.iterator();
            while (it.hasNext()) {
                arrayList.add(GetNonOriginatedTransferInfoSectionDto.INSTANCE.fromProto((GetNonOriginatedTransferInfoSection) it.next()));
            }
            StandardScreenData screen_data = proto.getScreen_data();
            DefaultConstructorMarker defaultConstructorMarker = null;
            StandardScreenDataDto standardScreenDataDtoFromProto = screen_data != null ? StandardScreenDataDto.INSTANCE.fromProto(screen_data) : null;
            StandardScreenData confirmation_screen_data = proto.getConfirmation_screen_data();
            return new GetNonOriginatedTransferInfoResponseDto(new Surrogate(arrayList, standardScreenDataDtoFromProto, confirmation_screen_data != null ? StandardScreenDataDto.INSTANCE.fromProto(confirmation_screen_data) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.GetNonOriginatedTransferInfoResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GetNonOriginatedTransferInfoResponseDto.binaryBase64Serializer_delegate$lambda$1();
            }
        });
        zeroValue = new GetNonOriginatedTransferInfoResponseDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$1() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GetNonOriginatedTransferInfoResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<GetNonOriginatedTransferInfoResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bff_money_movement.service.v1.GetNonOriginatedTransferInfoResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GetNonOriginatedTransferInfoResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public GetNonOriginatedTransferInfoResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new GetNonOriginatedTransferInfoResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: GetNonOriginatedTransferInfoResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbff_money_movement/service/v1/GetNonOriginatedTransferInfoResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "bff_money_movement.service.v1.GetNonOriginatedTransferInfoResponseDto";
        }
    }
}
