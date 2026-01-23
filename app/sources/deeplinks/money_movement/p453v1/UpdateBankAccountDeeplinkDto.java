package deeplinks.money_movement.p453v1;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.transfers.p271ui.retirement.contributions.matchselection.MatchSelectionActivity;
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
import deeplinks.money_movement.p453v1.UpdateBankAccountDeeplink;
import deeplinks.money_movement.p453v1.UpdateBankAccountDeeplinkDto;
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
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: UpdateBankAccountDeeplinkDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0005,+-./B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0016\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0007\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bJ\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010(R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0014R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b*\u0010\u0014¨\u00060"}, m3636d2 = {"Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto;", "Lcom/robinhood/idl/MessageDto;", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplink;", "Landroid/os/Parcelable;", "Lcom/robinhood/idl/DeeplinkMessage;", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$Surrogate;", "surrogate", "<init>", "(Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$Surrogate;)V", "", "bank_account_id", MatchSelectionActivity.TRANSFER_ID_EXTRA, "", "require_new_link", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$EntryPointDto;", "entry_point", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$EntryPointDto;)V", "toProto", "()Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplink;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/idl/RhDeeplinkSupportedUri;", "rhDeeplinkSupportedUri", "Landroid/net/Uri;", "encodeToUri", "(Lcom/robinhood/idl/RhDeeplinkSupportedUri;)Landroid/net/Uri;", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$Surrogate;", "getBank_account_id", "getTransfer_id", "Companion", "Surrogate", "EntryPointDto", "Serializer", "MultibindingModule", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@IdlDeeplink
@RhGenerated
/* loaded from: classes18.dex */
public final class UpdateBankAccountDeeplinkDto implements Dto3<UpdateBankAccountDeeplink>, Parcelable, DeeplinkMessage {

    @JvmField
    public static final Parcelable.Creator<UpdateBankAccountDeeplinkDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<UpdateBankAccountDeeplinkDto, UpdateBankAccountDeeplink>> binaryBase64Serializer$delegate;
    private static final boolean deeplinkDeprecated = false;
    private static final boolean deeplinkRequireAuthentication;
    private static final String deeplinkRoute;
    private static final List<AppType> deeplinkSupportedAppTypes;
    private static final UpdateBankAccountDeeplinkDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ UpdateBankAccountDeeplinkDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private UpdateBankAccountDeeplinkDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getBank_account_id() {
        return this.surrogate.getBank_account_id();
    }

    public final String getTransfer_id() {
        return this.surrogate.getTransfer_id();
    }

    public /* synthetic */ UpdateBankAccountDeeplinkDto(String str, String str2, Boolean bool, EntryPointDto entryPointDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : entryPointDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public UpdateBankAccountDeeplinkDto(String bank_account_id, String str, Boolean bool, EntryPointDto entryPointDto) {
        this(new Surrogate(bank_account_id, str, bool, entryPointDto));
        Intrinsics.checkNotNullParameter(bank_account_id, "bank_account_id");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public UpdateBankAccountDeeplink toProto() {
        String bank_account_id = this.surrogate.getBank_account_id();
        String transfer_id = this.surrogate.getTransfer_id();
        Boolean require_new_link = this.surrogate.getRequire_new_link();
        EntryPointDto entry_point = this.surrogate.getEntry_point();
        return new UpdateBankAccountDeeplink(bank_account_id, transfer_id, require_new_link, entry_point != null ? (UpdateBankAccountDeeplink.EntryPoint) entry_point.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[UpdateBankAccountDeeplinkDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof UpdateBankAccountDeeplinkDto) && Intrinsics.areEqual(((UpdateBankAccountDeeplinkDto) other).surrogate, this.surrogate);
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
    /* compiled from: UpdateBankAccountDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u001b\b\u0083\b\u0018\u0000 .2\u00020\u0001:\u0002/.B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u001aR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010 \u0012\u0004\b%\u0010#\u001a\u0004\b$\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010&\u0012\u0004\b)\u0010#\u001a\u0004\b'\u0010(R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010*\u0012\u0004\b-\u0010#\u001a\u0004\b+\u0010,¨\u00060"}, m3636d2 = {"Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$Surrogate;", "", "", "bank_account_id", MatchSelectionActivity.TRANSFER_ID_EXTRA, "", "require_new_link", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$EntryPointDto;", "entry_point", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$EntryPointDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$EntryPointDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$deeplinks_money_movement_externalRelease", "(Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBank_account_id", "getBank_account_id$annotations", "()V", "getTransfer_id", "getTransfer_id$annotations", "Ljava/lang/Boolean;", "getRequire_new_link", "()Ljava/lang/Boolean;", "getRequire_new_link$annotations", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$EntryPointDto;", "getEntry_point", "()Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$EntryPointDto;", "getEntry_point$annotations", "Companion", "$serializer", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String bank_account_id;
        private final EntryPointDto entry_point;
        private final Boolean require_new_link;
        private final String transfer_id;

        public Surrogate() {
            this((String) null, (String) null, (Boolean) null, (EntryPointDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.bank_account_id, surrogate.bank_account_id) && Intrinsics.areEqual(this.transfer_id, surrogate.transfer_id) && Intrinsics.areEqual(this.require_new_link, surrogate.require_new_link) && this.entry_point == surrogate.entry_point;
        }

        public int hashCode() {
            int iHashCode = this.bank_account_id.hashCode() * 31;
            String str = this.transfer_id;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.require_new_link;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            EntryPointDto entryPointDto = this.entry_point;
            return iHashCode3 + (entryPointDto != null ? entryPointDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(bank_account_id=" + this.bank_account_id + ", transfer_id=" + this.transfer_id + ", require_new_link=" + this.require_new_link + ", entry_point=" + this.entry_point + ")";
        }

        /* compiled from: UpdateBankAccountDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$Surrogate;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return UpdateBankAccountDeeplinkDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, Boolean bool, EntryPointDto entryPointDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.bank_account_id = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.transfer_id = null;
            } else {
                this.transfer_id = str2;
            }
            if ((i & 4) == 0) {
                this.require_new_link = null;
            } else {
                this.require_new_link = bool;
            }
            if ((i & 8) == 0) {
                this.entry_point = null;
            } else {
                this.entry_point = entryPointDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$deeplinks_money_movement_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.bank_account_id, "")) {
                output.encodeStringElement(serialDesc, 0, self.bank_account_id);
            }
            String str = self.transfer_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str);
            }
            Boolean bool = self.require_new_link;
            if (bool != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, BooleanSerializer.INSTANCE, bool);
            }
            EntryPointDto entryPointDto = self.entry_point;
            if (entryPointDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, EntryPointDto.Serializer.INSTANCE, entryPointDto);
            }
        }

        public Surrogate(String bank_account_id, String str, Boolean bool, EntryPointDto entryPointDto) {
            Intrinsics.checkNotNullParameter(bank_account_id, "bank_account_id");
            this.bank_account_id = bank_account_id;
            this.transfer_id = str;
            this.require_new_link = bool;
            this.entry_point = entryPointDto;
        }

        public final String getBank_account_id() {
            return this.bank_account_id;
        }

        public /* synthetic */ Surrogate(String str, String str2, Boolean bool, EntryPointDto entryPointDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : entryPointDto);
        }

        public final String getTransfer_id() {
            return this.transfer_id;
        }

        public final Boolean getRequire_new_link() {
            return this.require_new_link;
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

    /* compiled from: UpdateBankAccountDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0016J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001dX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto;", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplink;", "Lcom/robinhood/idl/DtoDeeplinkCreator;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "deeplinkRoute", "", "getDeeplinkRoute", "()Ljava/lang/String;", "deeplinkRequireAuthentication", "", "getDeeplinkRequireAuthentication", "()Z", "deeplinkDeprecated", "getDeeplinkDeprecated", "deeplinkSupportedAppTypes", "", "Lcom/robinhood/shared/app/type/AppType;", "getDeeplinkSupportedAppTypes", "()Ljava/util/List;", "fromProto", "proto", "serializer", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<UpdateBankAccountDeeplinkDto, UpdateBankAccountDeeplink>, DtoDeeplinkCreator<UpdateBankAccountDeeplinkDto> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public UpdateBankAccountDeeplinkDto decodeFromUri(Uri uri) {
            return (UpdateBankAccountDeeplinkDto) DtoDeeplinkCreator.DefaultImpls.decodeFromUri(this, uri);
        }

        public final KSerializer<UpdateBankAccountDeeplinkDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<UpdateBankAccountDeeplinkDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<UpdateBankAccountDeeplinkDto> getBinaryBase64Serializer() {
            return (KSerializer) UpdateBankAccountDeeplinkDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<UpdateBankAccountDeeplink> getProtoAdapter() {
            return UpdateBankAccountDeeplink.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public UpdateBankAccountDeeplinkDto getZeroValue() {
            return UpdateBankAccountDeeplinkDto.zeroValue;
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public String getDeeplinkRoute() {
            return UpdateBankAccountDeeplinkDto.deeplinkRoute;
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public boolean getDeeplinkRequireAuthentication() {
            return UpdateBankAccountDeeplinkDto.deeplinkRequireAuthentication;
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public boolean getDeeplinkDeprecated() {
            return UpdateBankAccountDeeplinkDto.deeplinkDeprecated;
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public List<AppType> getDeeplinkSupportedAppTypes() {
            return UpdateBankAccountDeeplinkDto.deeplinkSupportedAppTypes;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public UpdateBankAccountDeeplinkDto fromProto(UpdateBankAccountDeeplink proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String bank_account_id = proto.getBank_account_id();
            String transfer_id = proto.getTransfer_id();
            Boolean require_new_link = proto.getRequire_new_link();
            UpdateBankAccountDeeplink.EntryPoint entry_point = proto.getEntry_point();
            return new UpdateBankAccountDeeplinkDto(new Surrogate(bank_account_id, transfer_id, require_new_link, entry_point != null ? EntryPointDto.INSTANCE.fromProto(entry_point) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: deeplinks.money_movement.v1.UpdateBankAccountDeeplinkDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return UpdateBankAccountDeeplinkDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new UpdateBankAccountDeeplinkDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
        deeplinkRoute = "update_bank_account";
        deeplinkRequireAuthentication = true;
        deeplinkSupportedAppTypes = CollectionsKt.listOf(AppType.TRADER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UpdateBankAccountDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$EntryPointDto;", "Lcom/robinhood/idl/EnumDto;", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplink$EntryPoint;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ENTRY_POINT_UNSPECIFIED", "POST_TRANSFER", "INBOX", "RECURRING_DEPOSITS_HUB", "RECURRING_DEPOSIT_DETAIL", "EMAIL", "PUSH_NOTIFICATION", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EntryPointDto implements Dto2<UpdateBankAccountDeeplink.EntryPoint>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPointDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EntryPointDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EntryPointDto, UpdateBankAccountDeeplink.EntryPoint>> binaryBase64Serializer$delegate;
        public static final EntryPointDto ENTRY_POINT_UNSPECIFIED = new ENTRY_POINT_UNSPECIFIED("ENTRY_POINT_UNSPECIFIED", 0);
        public static final EntryPointDto POST_TRANSFER = new POST_TRANSFER("POST_TRANSFER", 1);
        public static final EntryPointDto INBOX = new INBOX("INBOX", 2);
        public static final EntryPointDto RECURRING_DEPOSITS_HUB = new RECURRING_DEPOSITS_HUB("RECURRING_DEPOSITS_HUB", 3);
        public static final EntryPointDto RECURRING_DEPOSIT_DETAIL = new RECURRING_DEPOSIT_DETAIL("RECURRING_DEPOSIT_DETAIL", 4);
        public static final EntryPointDto EMAIL = new EMAIL("EMAIL", 5);
        public static final EntryPointDto PUSH_NOTIFICATION = new PUSH_NOTIFICATION("PUSH_NOTIFICATION", 6);

        private static final /* synthetic */ EntryPointDto[] $values() {
            return new EntryPointDto[]{ENTRY_POINT_UNSPECIFIED, POST_TRANSFER, INBOX, RECURRING_DEPOSITS_HUB, RECURRING_DEPOSIT_DETAIL, EMAIL, PUSH_NOTIFICATION};
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

        /* compiled from: UpdateBankAccountDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto.EntryPointDto.ENTRY_POINT_UNSPECIFIED", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ENTRY_POINT_UNSPECIFIED extends EntryPointDto {
            ENTRY_POINT_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public UpdateBankAccountDeeplink.EntryPoint toProto() {
                return UpdateBankAccountDeeplink.EntryPoint.ENTRY_POINT_UNSPECIFIED;
            }
        }

        private EntryPointDto(String str, int i) {
        }

        static {
            EntryPointDto[] entryPointDtoArr$values = $values();
            $VALUES = entryPointDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: deeplinks.money_movement.v1.UpdateBankAccountDeeplinkDto$EntryPointDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return UpdateBankAccountDeeplinkDto.EntryPointDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: UpdateBankAccountDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto.EntryPointDto.POST_TRANSFER", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class POST_TRANSFER extends EntryPointDto {
            POST_TRANSFER(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public UpdateBankAccountDeeplink.EntryPoint toProto() {
                return UpdateBankAccountDeeplink.EntryPoint.POST_TRANSFER;
            }
        }

        /* compiled from: UpdateBankAccountDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto.EntryPointDto.INBOX", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INBOX extends EntryPointDto {
            INBOX(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public UpdateBankAccountDeeplink.EntryPoint toProto() {
                return UpdateBankAccountDeeplink.EntryPoint.INBOX;
            }
        }

        /* compiled from: UpdateBankAccountDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto.EntryPointDto.RECURRING_DEPOSITS_HUB", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECURRING_DEPOSITS_HUB extends EntryPointDto {
            RECURRING_DEPOSITS_HUB(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public UpdateBankAccountDeeplink.EntryPoint toProto() {
                return UpdateBankAccountDeeplink.EntryPoint.RECURRING_DEPOSITS_HUB;
            }
        }

        /* compiled from: UpdateBankAccountDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto.EntryPointDto.RECURRING_DEPOSIT_DETAIL", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECURRING_DEPOSIT_DETAIL extends EntryPointDto {
            RECURRING_DEPOSIT_DETAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public UpdateBankAccountDeeplink.EntryPoint toProto() {
                return UpdateBankAccountDeeplink.EntryPoint.RECURRING_DEPOSIT_DETAIL;
            }
        }

        /* compiled from: UpdateBankAccountDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto.EntryPointDto.EMAIL", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EMAIL extends EntryPointDto {
            EMAIL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public UpdateBankAccountDeeplink.EntryPoint toProto() {
                return UpdateBankAccountDeeplink.EntryPoint.EMAIL;
            }
        }

        /* compiled from: UpdateBankAccountDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"deeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto.EntryPointDto.PUSH_NOTIFICATION", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$EntryPointDto;", "toProto", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplink$EntryPoint;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PUSH_NOTIFICATION extends EntryPointDto {
            PUSH_NOTIFICATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public UpdateBankAccountDeeplink.EntryPoint toProto() {
                return UpdateBankAccountDeeplink.EntryPoint.PUSH_NOTIFICATION;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: UpdateBankAccountDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$EntryPointDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$EntryPointDto;", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplink$EntryPoint;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$EntryPointDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EntryPointDto, UpdateBankAccountDeeplink.EntryPoint> {

            /* compiled from: UpdateBankAccountDeeplinkDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[UpdateBankAccountDeeplink.EntryPoint.values().length];
                    try {
                        iArr[UpdateBankAccountDeeplink.EntryPoint.ENTRY_POINT_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[UpdateBankAccountDeeplink.EntryPoint.POST_TRANSFER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[UpdateBankAccountDeeplink.EntryPoint.INBOX.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[UpdateBankAccountDeeplink.EntryPoint.RECURRING_DEPOSITS_HUB.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[UpdateBankAccountDeeplink.EntryPoint.RECURRING_DEPOSIT_DETAIL.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[UpdateBankAccountDeeplink.EntryPoint.EMAIL.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[UpdateBankAccountDeeplink.EntryPoint.PUSH_NOTIFICATION.ordinal()] = 7;
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
            public ProtoAdapter<UpdateBankAccountDeeplink.EntryPoint> getProtoAdapter() {
                return UpdateBankAccountDeeplink.EntryPoint.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryPointDto getZeroValue() {
                return EntryPointDto.ENTRY_POINT_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryPointDto fromProto(UpdateBankAccountDeeplink.EntryPoint proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return EntryPointDto.ENTRY_POINT_UNSPECIFIED;
                    case 2:
                        return EntryPointDto.POST_TRANSFER;
                    case 3:
                        return EntryPointDto.INBOX;
                    case 4:
                        return EntryPointDto.RECURRING_DEPOSITS_HUB;
                    case 5:
                        return EntryPointDto.RECURRING_DEPOSIT_DETAIL;
                    case 6:
                        return EntryPointDto.EMAIL;
                    case 7:
                        return EntryPointDto.PUSH_NOTIFICATION;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: UpdateBankAccountDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$EntryPointDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$EntryPointDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Serializer implements KSerializer<EntryPointDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EntryPointDto, UpdateBankAccountDeeplink.EntryPoint> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/deeplinks.money_movement.v1.UpdateBankAccountDeeplink.EntryPoint", EntryPointDto.getEntries(), EntryPointDto.INSTANCE.getZeroValue());

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

    /* compiled from: UpdateBankAccountDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto;", "<init>", "()V", "surrogateSerializer", "Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<UpdateBankAccountDeeplinkDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/deeplinks.money_movement.v1.UpdateBankAccountDeeplink", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, UpdateBankAccountDeeplinkDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public UpdateBankAccountDeeplinkDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new UpdateBankAccountDeeplinkDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: UpdateBankAccountDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ldeeplinks/money_movement/v1/UpdateBankAccountDeeplinkDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "deeplinks.money_movement_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "deeplinks.money_movement.v1.UpdateBankAccountDeeplinkDto";
        }
    }
}
