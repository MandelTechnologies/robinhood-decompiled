package deeplinks.money_movement.p453v1;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.DeeplinkMessage;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoDeeplinkCreator;
import com.robinhood.idl.DtoDeeplinkCreator2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDeeplink;
import com.robinhood.idl.RhDeeplinkSupportedUri;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.shared.app.type.AppType;
import com.squareup.wire.ProtoAdapter;
import deeplinks.money_movement.p453v1.RecurringTransfersHubDeeplink;
import deeplinks.money_movement.p453v1.RecurringTransfersHubDeeplinkDto;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: RecurringTransfersHubDeeplinkDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0005'&()*B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0015\b\u0016\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001f\u0010\u0018J\u0017\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010%¨\u0006+"}, m3636d2 = {"Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto;", "Lcom/robinhood/idl/MessageDto;", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink;", "Landroid/os/Parcelable;", "Lcom/robinhood/idl/DeeplinkMessage;", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$Surrogate;", "surrogate", "<init>", "(Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$Surrogate;)V", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "entry_point", "(Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;)V", "toProto", "()Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink;", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/idl/RhDeeplinkSupportedUri;", "rhDeeplinkSupportedUri", "Landroid/net/Uri;", "encodeToUri", "(Lcom/robinhood/idl/RhDeeplinkSupportedUri;)Landroid/net/Uri;", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$Surrogate;", "Companion", "Surrogate", "EntryPointDto", "Serializer", "MultibindingModule", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@IdlDeeplink
@RhGenerated
/* loaded from: classes18.dex */
public final class RecurringTransfersHubDeeplinkDto implements Dto3<RecurringTransfersHubDeeplink>, Parcelable, DeeplinkMessage {

    @JvmField
    public static final Parcelable.Creator<RecurringTransfersHubDeeplinkDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<RecurringTransfersHubDeeplinkDto, RecurringTransfersHubDeeplink>> binaryBase64Serializer$delegate;
    private static final boolean deeplinkDeprecated = false;
    private static final boolean deeplinkRequireAuthentication;
    private static final String deeplinkRoute;
    private static final List<AppType> deeplinkSupportedAppTypes;
    private static final RecurringTransfersHubDeeplinkDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ RecurringTransfersHubDeeplinkDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private RecurringTransfersHubDeeplinkDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public RecurringTransfersHubDeeplinkDto(EntryPointDto entryPointDto) {
        this(new Surrogate(entryPointDto));
    }

    public /* synthetic */ RecurringTransfersHubDeeplinkDto(EntryPointDto entryPointDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : entryPointDto);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public RecurringTransfersHubDeeplink toProto() {
        EntryPointDto entry_point = this.surrogate.getEntry_point();
        return new RecurringTransfersHubDeeplink(entry_point != null ? (RecurringTransfersHubDeeplink.EntryPoint) entry_point.toProto() : null, null, 2, 0 == true ? 1 : 0);
    }

    public String toString() {
        return "[RecurringTransfersHubDeeplinkDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof RecurringTransfersHubDeeplinkDto) && Intrinsics.areEqual(((RecurringTransfersHubDeeplinkDto) other).surrogate, this.surrogate);
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
    /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0083\b\u0018\u0000 \"2\u00020\u0001:\u0002#\"B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f¨\u0006$"}, m3636d2 = {"Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$Surrogate;", "", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "entry_point", "<init>", "(Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILdeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$deeplinks_money_movement_externalRelease", "(Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "getEntry_point", "()Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "getEntry_point$annotations", "()V", "Companion", "$serializer", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final EntryPointDto entry_point;

        /* JADX WARN: Multi-variable type inference failed */
        public Surrogate() {
            this((EntryPointDto) null, 1, (DefaultConstructorMarker) (0 == true ? 1 : 0));
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Surrogate) && this.entry_point == ((Surrogate) other).entry_point;
        }

        public int hashCode() {
            EntryPointDto entryPointDto = this.entry_point;
            if (entryPointDto == null) {
                return 0;
            }
            return entryPointDto.hashCode();
        }

        public String toString() {
            return "Surrogate(entry_point=" + this.entry_point + ")";
        }

        /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$Surrogate;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return RecurringTransfersHubDeeplinkDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, EntryPointDto entryPointDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.entry_point = null;
            } else {
                this.entry_point = entryPointDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$deeplinks_money_movement_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            EntryPointDto entryPointDto = self.entry_point;
            if (entryPointDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, EntryPointDto.Serializer.INSTANCE, entryPointDto);
            }
        }

        public Surrogate(EntryPointDto entryPointDto) {
            this.entry_point = entryPointDto;
        }

        public /* synthetic */ Surrogate(EntryPointDto entryPointDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : entryPointDto);
        }

        public final EntryPointDto getEntry_point() {
            return this.entry_point;
        }
    }

    @Override // com.robinhood.idl.DeeplinkMessage
    public Uri encodeToUri(RhDeeplinkSupportedUri rhDeeplinkSupportedUri) {
        Intrinsics.checkNotNullParameter(rhDeeplinkSupportedUri, "rhDeeplinkSupportedUri");
        return DtoDeeplinkCreator2.encodeToUri(INSTANCE, this, rhDeeplinkSupportedUri);
    }

    /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0016J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001dX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto;", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink;", "Lcom/robinhood/idl/DtoDeeplinkCreator;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "deeplinkRoute", "", "getDeeplinkRoute", "()Ljava/lang/String;", "deeplinkRequireAuthentication", "", "getDeeplinkRequireAuthentication", "()Z", "deeplinkDeprecated", "getDeeplinkDeprecated", "deeplinkSupportedAppTypes", "", "Lcom/robinhood/shared/app/type/AppType;", "getDeeplinkSupportedAppTypes", "()Ljava/util/List;", "fromProto", "proto", "serializer", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<RecurringTransfersHubDeeplinkDto, RecurringTransfersHubDeeplink>, DtoDeeplinkCreator<RecurringTransfersHubDeeplinkDto> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public RecurringTransfersHubDeeplinkDto decodeFromUri(Uri uri) {
            return (RecurringTransfersHubDeeplinkDto) DtoDeeplinkCreator.DefaultImpls.decodeFromUri(this, uri);
        }

        public final KSerializer<RecurringTransfersHubDeeplinkDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RecurringTransfersHubDeeplinkDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RecurringTransfersHubDeeplinkDto> getBinaryBase64Serializer() {
            return (KSerializer) RecurringTransfersHubDeeplinkDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<RecurringTransfersHubDeeplink> getProtoAdapter() {
            return RecurringTransfersHubDeeplink.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RecurringTransfersHubDeeplinkDto getZeroValue() {
            return RecurringTransfersHubDeeplinkDto.zeroValue;
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public String getDeeplinkRoute() {
            return RecurringTransfersHubDeeplinkDto.deeplinkRoute;
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public boolean getDeeplinkRequireAuthentication() {
            return RecurringTransfersHubDeeplinkDto.deeplinkRequireAuthentication;
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public boolean getDeeplinkDeprecated() {
            return RecurringTransfersHubDeeplinkDto.deeplinkDeprecated;
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public List<AppType> getDeeplinkSupportedAppTypes() {
            return RecurringTransfersHubDeeplinkDto.deeplinkSupportedAppTypes;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RecurringTransfersHubDeeplinkDto fromProto(RecurringTransfersHubDeeplink proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            RecurringTransfersHubDeeplink.EntryPoint entry_point = proto.getEntry_point();
            return new RecurringTransfersHubDeeplinkDto(new Surrogate(entry_point != null ? EntryPointDto.INSTANCE.fromProto(entry_point) : null), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: deeplinks.money_movement.v1.RecurringTransfersHubDeeplinkDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecurringTransfersHubDeeplinkDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new RecurringTransfersHubDeeplinkDto(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
        deeplinkRoute = "recurring_transfers_hub";
        deeplinkRequireAuthentication = true;
        deeplinkSupportedAppTypes = CollectionsKt.listOf(AppType.TRADER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001e\u001fB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006 "}, m3636d2 = {"Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "Lcom/robinhood/idl/EnumDto;", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ENTRY_POINT_UNSPECIFIED", "EMAIL", "INBOX", "PUSH_NOTIFICATION", "EMAIL_EXTRA_CASH_CREATED", "EMAIL_EXTRA_CASH_CANCELLED", "EMAIL_EXTRA_CASH_PAUSED", "PUSH_NOTIFICATION_EXTRA_CASH_CREATED", "INBOX_EXTRA_CASH_CREATED", "EMAIL_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE", "PUSH_NOTIFICATION_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE", "INBOX_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE", "EMAIL_EXTRA_CASH_SCHEDULED", "PUSH_NOTIFICATION_EXTRA_CASH_SCHEDULED", "INBOX_EXTRA_CASH_SCHEDULED", "EMAIL_EXTRA_CASH_FAILED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EntryPointDto implements Dto2<RecurringTransfersHubDeeplink.EntryPoint>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPointDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EntryPointDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EntryPointDto, RecurringTransfersHubDeeplink.EntryPoint>> binaryBase64Serializer$delegate;
        public static final EntryPointDto ENTRY_POINT_UNSPECIFIED = new ENTRY_POINT_UNSPECIFIED("ENTRY_POINT_UNSPECIFIED", 0);
        public static final EntryPointDto EMAIL = new EMAIL("EMAIL", 1);
        public static final EntryPointDto INBOX = new INBOX("INBOX", 2);
        public static final EntryPointDto PUSH_NOTIFICATION = new PUSH_NOTIFICATION("PUSH_NOTIFICATION", 3);
        public static final EntryPointDto EMAIL_EXTRA_CASH_CREATED = new EMAIL_EXTRA_CASH_CREATED("EMAIL_EXTRA_CASH_CREATED", 4);
        public static final EntryPointDto EMAIL_EXTRA_CASH_CANCELLED = new EMAIL_EXTRA_CASH_CANCELLED("EMAIL_EXTRA_CASH_CANCELLED", 5);
        public static final EntryPointDto EMAIL_EXTRA_CASH_PAUSED = new EMAIL_EXTRA_CASH_PAUSED("EMAIL_EXTRA_CASH_PAUSED", 6);
        public static final EntryPointDto PUSH_NOTIFICATION_EXTRA_CASH_CREATED = new PUSH_NOTIFICATION_EXTRA_CASH_CREATED("PUSH_NOTIFICATION_EXTRA_CASH_CREATED", 7);
        public static final EntryPointDto INBOX_EXTRA_CASH_CREATED = new INBOX_EXTRA_CASH_CREATED("INBOX_EXTRA_CASH_CREATED", 8);
        public static final EntryPointDto EMAIL_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE = new EMAIL_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE("EMAIL_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE", 9);
        public static final EntryPointDto PUSH_NOTIFICATION_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE = new PUSH_NOTIFICATION_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE("PUSH_NOTIFICATION_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE", 10);
        public static final EntryPointDto INBOX_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE = new INBOX_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE("INBOX_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE", 11);
        public static final EntryPointDto EMAIL_EXTRA_CASH_SCHEDULED = new EMAIL_EXTRA_CASH_SCHEDULED("EMAIL_EXTRA_CASH_SCHEDULED", 12);
        public static final EntryPointDto PUSH_NOTIFICATION_EXTRA_CASH_SCHEDULED = new PUSH_NOTIFICATION_EXTRA_CASH_SCHEDULED("PUSH_NOTIFICATION_EXTRA_CASH_SCHEDULED", 13);
        public static final EntryPointDto INBOX_EXTRA_CASH_SCHEDULED = new INBOX_EXTRA_CASH_SCHEDULED("INBOX_EXTRA_CASH_SCHEDULED", 14);
        public static final EntryPointDto EMAIL_EXTRA_CASH_FAILED = new EMAIL_EXTRA_CASH_FAILED("EMAIL_EXTRA_CASH_FAILED", 15);

        private static final /* synthetic */ EntryPointDto[] $values() {
            return new EntryPointDto[]{ENTRY_POINT_UNSPECIFIED, EMAIL, INBOX, PUSH_NOTIFICATION, EMAIL_EXTRA_CASH_CREATED, EMAIL_EXTRA_CASH_CANCELLED, EMAIL_EXTRA_CASH_PAUSED, PUSH_NOTIFICATION_EXTRA_CASH_CREATED, INBOX_EXTRA_CASH_CREATED, EMAIL_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE, PUSH_NOTIFICATION_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE, INBOX_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE, EMAIL_EXTRA_CASH_SCHEDULED, PUSH_NOTIFICATION_EXTRA_CASH_SCHEDULED, INBOX_EXTRA_CASH_SCHEDULED, EMAIL_EXTRA_CASH_FAILED};
        }

        public /* synthetic */ EntryPointDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<EntryPointDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private EntryPointDto(String str, int i) {
        }

        /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto.EntryPointDto.ENTRY_POINT_UNSPECIFIED", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ENTRY_POINT_UNSPECIFIED extends EntryPointDto {
            ENTRY_POINT_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringTransfersHubDeeplink.EntryPoint toProto() {
                return RecurringTransfersHubDeeplink.EntryPoint.ENTRY_POINT_UNSPECIFIED;
            }
        }

        static {
            EntryPointDto[] entryPointDtoArr$values = $values();
            $VALUES = entryPointDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: deeplinks.money_movement.v1.RecurringTransfersHubDeeplinkDto$EntryPointDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecurringTransfersHubDeeplinkDto.EntryPointDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto.EntryPointDto.EMAIL", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EMAIL extends EntryPointDto {
            EMAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringTransfersHubDeeplink.EntryPoint toProto() {
                return RecurringTransfersHubDeeplink.EntryPoint.EMAIL;
            }
        }

        /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto.EntryPointDto.INBOX", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INBOX extends EntryPointDto {
            INBOX(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringTransfersHubDeeplink.EntryPoint toProto() {
                return RecurringTransfersHubDeeplink.EntryPoint.INBOX;
            }
        }

        /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto.EntryPointDto.PUSH_NOTIFICATION", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PUSH_NOTIFICATION extends EntryPointDto {
            PUSH_NOTIFICATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringTransfersHubDeeplink.EntryPoint toProto() {
                return RecurringTransfersHubDeeplink.EntryPoint.PUSH_NOTIFICATION;
            }
        }

        /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto.EntryPointDto.EMAIL_EXTRA_CASH_CREATED", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EMAIL_EXTRA_CASH_CREATED extends EntryPointDto {
            EMAIL_EXTRA_CASH_CREATED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringTransfersHubDeeplink.EntryPoint toProto() {
                return RecurringTransfersHubDeeplink.EntryPoint.EMAIL_EXTRA_CASH_CREATED;
            }
        }

        /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto.EntryPointDto.EMAIL_EXTRA_CASH_CANCELLED", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EMAIL_EXTRA_CASH_CANCELLED extends EntryPointDto {
            EMAIL_EXTRA_CASH_CANCELLED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringTransfersHubDeeplink.EntryPoint toProto() {
                return RecurringTransfersHubDeeplink.EntryPoint.EMAIL_EXTRA_CASH_CANCELLED;
            }
        }

        /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto.EntryPointDto.EMAIL_EXTRA_CASH_PAUSED", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EMAIL_EXTRA_CASH_PAUSED extends EntryPointDto {
            EMAIL_EXTRA_CASH_PAUSED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringTransfersHubDeeplink.EntryPoint toProto() {
                return RecurringTransfersHubDeeplink.EntryPoint.EMAIL_EXTRA_CASH_PAUSED;
            }
        }

        /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto.EntryPointDto.PUSH_NOTIFICATION_EXTRA_CASH_CREATED", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PUSH_NOTIFICATION_EXTRA_CASH_CREATED extends EntryPointDto {
            PUSH_NOTIFICATION_EXTRA_CASH_CREATED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringTransfersHubDeeplink.EntryPoint toProto() {
                return RecurringTransfersHubDeeplink.EntryPoint.PUSH_NOTIFICATION_EXTRA_CASH_CREATED;
            }
        }

        /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto.EntryPointDto.INBOX_EXTRA_CASH_CREATED", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INBOX_EXTRA_CASH_CREATED extends EntryPointDto {
            INBOX_EXTRA_CASH_CREATED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringTransfersHubDeeplink.EntryPoint toProto() {
                return RecurringTransfersHubDeeplink.EntryPoint.INBOX_EXTRA_CASH_CREATED;
            }
        }

        /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto.EntryPointDto.EMAIL_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EMAIL_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE extends EntryPointDto {
            EMAIL_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringTransfersHubDeeplink.EntryPoint toProto() {
                return RecurringTransfersHubDeeplink.EntryPoint.EMAIL_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE;
            }
        }

        /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto.EntryPointDto.PUSH_NOTIFICATION_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PUSH_NOTIFICATION_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE extends EntryPointDto {
            PUSH_NOTIFICATION_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringTransfersHubDeeplink.EntryPoint toProto() {
                return RecurringTransfersHubDeeplink.EntryPoint.PUSH_NOTIFICATION_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE;
            }
        }

        /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto.EntryPointDto.INBOX_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INBOX_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE extends EntryPointDto {
            INBOX_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringTransfersHubDeeplink.EntryPoint toProto() {
                return RecurringTransfersHubDeeplink.EntryPoint.INBOX_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE;
            }
        }

        /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto.EntryPointDto.EMAIL_EXTRA_CASH_SCHEDULED", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EMAIL_EXTRA_CASH_SCHEDULED extends EntryPointDto {
            EMAIL_EXTRA_CASH_SCHEDULED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringTransfersHubDeeplink.EntryPoint toProto() {
                return RecurringTransfersHubDeeplink.EntryPoint.EMAIL_EXTRA_CASH_SCHEDULED;
            }
        }

        /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto.EntryPointDto.PUSH_NOTIFICATION_EXTRA_CASH_SCHEDULED", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PUSH_NOTIFICATION_EXTRA_CASH_SCHEDULED extends EntryPointDto {
            PUSH_NOTIFICATION_EXTRA_CASH_SCHEDULED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringTransfersHubDeeplink.EntryPoint toProto() {
                return RecurringTransfersHubDeeplink.EntryPoint.PUSH_NOTIFICATION_EXTRA_CASH_SCHEDULED;
            }
        }

        /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto.EntryPointDto.INBOX_EXTRA_CASH_SCHEDULED", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INBOX_EXTRA_CASH_SCHEDULED extends EntryPointDto {
            INBOX_EXTRA_CASH_SCHEDULED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringTransfersHubDeeplink.EntryPoint toProto() {
                return RecurringTransfersHubDeeplink.EntryPoint.INBOX_EXTRA_CASH_SCHEDULED;
            }
        }

        /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto.EntryPointDto.EMAIL_EXTRA_CASH_FAILED", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EMAIL_EXTRA_CASH_FAILED extends EntryPointDto {
            EMAIL_EXTRA_CASH_FAILED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecurringTransfersHubDeeplink.EntryPoint toProto() {
                return RecurringTransfersHubDeeplink.EntryPoint.EMAIL_EXTRA_CASH_FAILED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplink$EntryPoint;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EntryPointDto, RecurringTransfersHubDeeplink.EntryPoint> {

            /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[RecurringTransfersHubDeeplink.EntryPoint.values().length];
                    try {
                        iArr[RecurringTransfersHubDeeplink.EntryPoint.ENTRY_POINT_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[RecurringTransfersHubDeeplink.EntryPoint.EMAIL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[RecurringTransfersHubDeeplink.EntryPoint.INBOX.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[RecurringTransfersHubDeeplink.EntryPoint.PUSH_NOTIFICATION.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[RecurringTransfersHubDeeplink.EntryPoint.EMAIL_EXTRA_CASH_CREATED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[RecurringTransfersHubDeeplink.EntryPoint.EMAIL_EXTRA_CASH_CANCELLED.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[RecurringTransfersHubDeeplink.EntryPoint.EMAIL_EXTRA_CASH_PAUSED.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[RecurringTransfersHubDeeplink.EntryPoint.PUSH_NOTIFICATION_EXTRA_CASH_CREATED.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    try {
                        iArr[RecurringTransfersHubDeeplink.EntryPoint.INBOX_EXTRA_CASH_CREATED.ordinal()] = 9;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr[RecurringTransfersHubDeeplink.EntryPoint.EMAIL_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE.ordinal()] = 10;
                    } catch (NoSuchFieldError unused10) {
                    }
                    try {
                        iArr[RecurringTransfersHubDeeplink.EntryPoint.PUSH_NOTIFICATION_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE.ordinal()] = 11;
                    } catch (NoSuchFieldError unused11) {
                    }
                    try {
                        iArr[RecurringTransfersHubDeeplink.EntryPoint.INBOX_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE.ordinal()] = 12;
                    } catch (NoSuchFieldError unused12) {
                    }
                    try {
                        iArr[RecurringTransfersHubDeeplink.EntryPoint.EMAIL_EXTRA_CASH_SCHEDULED.ordinal()] = 13;
                    } catch (NoSuchFieldError unused13) {
                    }
                    try {
                        iArr[RecurringTransfersHubDeeplink.EntryPoint.PUSH_NOTIFICATION_EXTRA_CASH_SCHEDULED.ordinal()] = 14;
                    } catch (NoSuchFieldError unused14) {
                    }
                    try {
                        iArr[RecurringTransfersHubDeeplink.EntryPoint.INBOX_EXTRA_CASH_SCHEDULED.ordinal()] = 15;
                    } catch (NoSuchFieldError unused15) {
                    }
                    try {
                        iArr[RecurringTransfersHubDeeplink.EntryPoint.EMAIL_EXTRA_CASH_FAILED.ordinal()] = 16;
                    } catch (NoSuchFieldError unused16) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<EntryPointDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EntryPointDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EntryPointDto> getBinaryBase64Serializer() {
                return (KSerializer) EntryPointDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RecurringTransfersHubDeeplink.EntryPoint> getProtoAdapter() {
                return RecurringTransfersHubDeeplink.EntryPoint.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryPointDto getZeroValue() {
                return EntryPointDto.ENTRY_POINT_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryPointDto fromProto(RecurringTransfersHubDeeplink.EntryPoint proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return EntryPointDto.ENTRY_POINT_UNSPECIFIED;
                    case 2:
                        return EntryPointDto.EMAIL;
                    case 3:
                        return EntryPointDto.INBOX;
                    case 4:
                        return EntryPointDto.PUSH_NOTIFICATION;
                    case 5:
                        return EntryPointDto.EMAIL_EXTRA_CASH_CREATED;
                    case 6:
                        return EntryPointDto.EMAIL_EXTRA_CASH_CANCELLED;
                    case 7:
                        return EntryPointDto.EMAIL_EXTRA_CASH_PAUSED;
                    case 8:
                        return EntryPointDto.PUSH_NOTIFICATION_EXTRA_CASH_CREATED;
                    case 9:
                        return EntryPointDto.INBOX_EXTRA_CASH_CREATED;
                    case 10:
                        return EntryPointDto.EMAIL_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE;
                    case 11:
                        return EntryPointDto.PUSH_NOTIFICATION_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE;
                    case 12:
                        return EntryPointDto.INBOX_EXTRA_CASH_CANCELLED_DUE_TO_ISSUE;
                    case 13:
                        return EntryPointDto.EMAIL_EXTRA_CASH_SCHEDULED;
                    case 14:
                        return EntryPointDto.PUSH_NOTIFICATION_EXTRA_CASH_SCHEDULED;
                    case 15:
                        return EntryPointDto.INBOX_EXTRA_CASH_SCHEDULED;
                    case 16:
                        return EntryPointDto.EMAIL_EXTRA_CASH_FAILED;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$EntryPointDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<EntryPointDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EntryPointDto, RecurringTransfersHubDeeplink.EntryPoint> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/deeplinks.money_movement.v1.RecurringTransfersHubDeeplink.EntryPoint", EntryPointDto.getEntries(), EntryPointDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public EntryPointDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (EntryPointDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, EntryPointDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static EntryPointDto valueOf(String str) {
            return (EntryPointDto) Enum.valueOf(EntryPointDto.class, str);
        }

        public static EntryPointDto[] values() {
            return (EntryPointDto[]) $VALUES.clone();
        }
    }

    /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto;", "<init>", "()V", "surrogateSerializer", "Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<RecurringTransfersHubDeeplinkDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/deeplinks.money_movement.v1.RecurringTransfersHubDeeplink", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, RecurringTransfersHubDeeplinkDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public RecurringTransfersHubDeeplinkDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new RecurringTransfersHubDeeplinkDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: RecurringTransfersHubDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ldeeplinks/money_movement/v1/RecurringTransfersHubDeeplinkDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4190_6)
        public final String provideIntoMap() {
            return "deeplinks.money_movement.v1.RecurringTransfersHubDeeplinkDto";
        }
    }
}
