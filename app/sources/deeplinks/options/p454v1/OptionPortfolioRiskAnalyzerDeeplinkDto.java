package deeplinks.options.p454v1;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.idl.DeeplinkMessage;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoDeeplinkCreator;
import com.robinhood.idl.DtoDeeplinkCreator2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.IdlDeeplink;
import com.robinhood.idl.RhDeeplinkSupportedUri;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.shared.app.type.AppType;
import com.squareup.wire.ProtoAdapter;
import deeplinks.options.p454v1.OptionPortfolioRiskAnalyzerAccountTypeDto;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
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
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: OptionPortfolioRiskAnalyzerDeeplinkDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 ,2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0004-,./B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB-\b\u0016\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\u001aJ\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0013\u0010\n\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b(\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b)\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00060"}, m3636d2 = {"Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerDeeplinkDto;", "Lcom/robinhood/idl/MessageDto;", "Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerDeeplink;", "Landroid/os/Parcelable;", "Lcom/robinhood/idl/DeeplinkMessage;", "Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerDeeplinkDto$Surrogate;", "surrogate", "<init>", "(Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerDeeplinkDto$Surrogate;)V", "", "account_number", "initial_underlying_id", "Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerAccountTypeDto;", InstantCashConstants.ACCOUNT_TYPE_KEY, "(Ljava/lang/String;Ljava/lang/String;Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerAccountTypeDto;)V", "toProto", "()Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerDeeplink;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lcom/robinhood/idl/RhDeeplinkSupportedUri;", "rhDeeplinkSupportedUri", "Landroid/net/Uri;", "encodeToUri", "(Lcom/robinhood/idl/RhDeeplinkSupportedUri;)Landroid/net/Uri;", "Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerDeeplinkDto$Surrogate;", "getAccount_number", "getInitial_underlying_id", "getAccount_type", "()Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerAccountTypeDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "deeplinks.options_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@IdlDeeplink
@RhGenerated
/* loaded from: classes18.dex */
public final class OptionPortfolioRiskAnalyzerDeeplinkDto implements Dto3<OptionPortfolioRiskAnalyzerDeeplink>, Parcelable, DeeplinkMessage {

    @JvmField
    public static final Parcelable.Creator<OptionPortfolioRiskAnalyzerDeeplinkDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<OptionPortfolioRiskAnalyzerDeeplinkDto, OptionPortfolioRiskAnalyzerDeeplink>> binaryBase64Serializer$delegate;
    private static final boolean deeplinkDeprecated = false;
    private static final boolean deeplinkRequireAuthentication;
    private static final String deeplinkRoute;
    private static final List<AppType> deeplinkSupportedAppTypes;
    private static final OptionPortfolioRiskAnalyzerDeeplinkDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ OptionPortfolioRiskAnalyzerDeeplinkDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private OptionPortfolioRiskAnalyzerDeeplinkDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final String getInitial_underlying_id() {
        return this.surrogate.getInitial_underlying_id();
    }

    public final OptionPortfolioRiskAnalyzerAccountTypeDto getAccount_type() {
        return this.surrogate.getAccount_type();
    }

    public /* synthetic */ OptionPortfolioRiskAnalyzerDeeplinkDto(String str, String str2, OptionPortfolioRiskAnalyzerAccountTypeDto optionPortfolioRiskAnalyzerAccountTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : optionPortfolioRiskAnalyzerAccountTypeDto);
    }

    public OptionPortfolioRiskAnalyzerDeeplinkDto(String str, String str2, OptionPortfolioRiskAnalyzerAccountTypeDto optionPortfolioRiskAnalyzerAccountTypeDto) {
        this(new Surrogate(str, str2, optionPortfolioRiskAnalyzerAccountTypeDto));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public OptionPortfolioRiskAnalyzerDeeplink toProto() {
        String account_number = this.surrogate.getAccount_number();
        String initial_underlying_id = this.surrogate.getInitial_underlying_id();
        OptionPortfolioRiskAnalyzerAccountTypeDto account_type = this.surrogate.getAccount_type();
        return new OptionPortfolioRiskAnalyzerDeeplink(account_number, initial_underlying_id, account_type != null ? (OptionPortfolioRiskAnalyzerAccountType) account_type.toProto() : null, null, 8, null);
    }

    public String toString() {
        return "[OptionPortfolioRiskAnalyzerDeeplinkDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof OptionPortfolioRiskAnalyzerDeeplinkDto) && Intrinsics.areEqual(((OptionPortfolioRiskAnalyzerDeeplinkDto) other).surrogate, this.surrogate);
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
    /* compiled from: OptionPortfolioRiskAnalyzerDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002*)B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001f\u0012\u0004\b!\u0010\"\u001a\u0004\b \u0010\u0018R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010\u0018R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010%\u0012\u0004\b(\u0010\"\u001a\u0004\b&\u0010'¨\u0006+"}, m3636d2 = {"Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerDeeplinkDto$Surrogate;", "", "", "account_number", "initial_underlying_id", "Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerAccountTypeDto;", InstantCashConstants.ACCOUNT_TYPE_KEY, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerAccountTypeDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerAccountTypeDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$deeplinks_options_externalRelease", "(Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerDeeplinkDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAccount_number", "getAccount_number$annotations", "()V", "getInitial_underlying_id", "getInitial_underlying_id$annotations", "Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerAccountTypeDto;", "getAccount_type", "()Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerAccountTypeDto;", "getAccount_type$annotations", "Companion", "$serializer", "deeplinks.options_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final OptionPortfolioRiskAnalyzerAccountTypeDto account_type;
        private final String initial_underlying_id;

        public Surrogate() {
            this((String) null, (String) null, (OptionPortfolioRiskAnalyzerAccountTypeDto) null, 7, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.account_number, surrogate.account_number) && Intrinsics.areEqual(this.initial_underlying_id, surrogate.initial_underlying_id) && this.account_type == surrogate.account_type;
        }

        public int hashCode() {
            String str = this.account_number;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.initial_underlying_id;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            OptionPortfolioRiskAnalyzerAccountTypeDto optionPortfolioRiskAnalyzerAccountTypeDto = this.account_type;
            return iHashCode2 + (optionPortfolioRiskAnalyzerAccountTypeDto != null ? optionPortfolioRiskAnalyzerAccountTypeDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(account_number=" + this.account_number + ", initial_underlying_id=" + this.initial_underlying_id + ", account_type=" + this.account_type + ")";
        }

        /* compiled from: OptionPortfolioRiskAnalyzerDeeplinkDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerDeeplinkDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerDeeplinkDto$Surrogate;", "deeplinks.options_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return OptionPortfolioRiskAnalyzerDeeplinkDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, OptionPortfolioRiskAnalyzerAccountTypeDto optionPortfolioRiskAnalyzerAccountTypeDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.account_number = null;
            } else {
                this.account_number = str;
            }
            if ((i & 2) == 0) {
                this.initial_underlying_id = null;
            } else {
                this.initial_underlying_id = str2;
            }
            if ((i & 4) == 0) {
                this.account_type = null;
            } else {
                this.account_type = optionPortfolioRiskAnalyzerAccountTypeDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$deeplinks_options_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            String str = self.account_number;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, str);
            }
            String str2 = self.initial_underlying_id;
            if (str2 != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, str2);
            }
            OptionPortfolioRiskAnalyzerAccountTypeDto optionPortfolioRiskAnalyzerAccountTypeDto = self.account_type;
            if (optionPortfolioRiskAnalyzerAccountTypeDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, OptionPortfolioRiskAnalyzerAccountTypeDto.Serializer.INSTANCE, optionPortfolioRiskAnalyzerAccountTypeDto);
            }
        }

        public Surrogate(String str, String str2, OptionPortfolioRiskAnalyzerAccountTypeDto optionPortfolioRiskAnalyzerAccountTypeDto) {
            this.account_number = str;
            this.initial_underlying_id = str2;
            this.account_type = optionPortfolioRiskAnalyzerAccountTypeDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, OptionPortfolioRiskAnalyzerAccountTypeDto optionPortfolioRiskAnalyzerAccountTypeDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : optionPortfolioRiskAnalyzerAccountTypeDto);
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final String getInitial_underlying_id() {
            return this.initial_underlying_id;
        }

        public final OptionPortfolioRiskAnalyzerAccountTypeDto getAccount_type() {
            return this.account_type;
        }
    }

    @Override // com.robinhood.idl.DeeplinkMessage
    public Uri encodeToUri(RhDeeplinkSupportedUri rhDeeplinkSupportedUri) {
        Intrinsics.checkNotNullParameter(rhDeeplinkSupportedUri, "rhDeeplinkSupportedUri");
        return DtoDeeplinkCreator2.encodeToUri(INSTANCE, this, rhDeeplinkSupportedUri);
    }

    /* compiled from: OptionPortfolioRiskAnalyzerDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0003H\u0016J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020\bR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\nR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\u00178\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001dX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u001dX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006*"}, m3636d2 = {"Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerDeeplinkDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerDeeplinkDto;", "Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerDeeplink;", "Lcom/robinhood/idl/DtoDeeplinkCreator;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerDeeplinkDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "deeplinkRoute", "", "getDeeplinkRoute", "()Ljava/lang/String;", "deeplinkRequireAuthentication", "", "getDeeplinkRequireAuthentication", "()Z", "deeplinkDeprecated", "getDeeplinkDeprecated", "deeplinkSupportedAppTypes", "", "Lcom/robinhood/shared/app/type/AppType;", "getDeeplinkSupportedAppTypes", "()Ljava/util/List;", "fromProto", "proto", "serializer", "deeplinks.options_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<OptionPortfolioRiskAnalyzerDeeplinkDto, OptionPortfolioRiskAnalyzerDeeplink>, DtoDeeplinkCreator<OptionPortfolioRiskAnalyzerDeeplinkDto> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public OptionPortfolioRiskAnalyzerDeeplinkDto decodeFromUri(Uri uri) {
            return (OptionPortfolioRiskAnalyzerDeeplinkDto) DtoDeeplinkCreator.DefaultImpls.decodeFromUri(this, uri);
        }

        public final KSerializer<OptionPortfolioRiskAnalyzerDeeplinkDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionPortfolioRiskAnalyzerDeeplinkDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<OptionPortfolioRiskAnalyzerDeeplinkDto> getBinaryBase64Serializer() {
            return (KSerializer) OptionPortfolioRiskAnalyzerDeeplinkDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<OptionPortfolioRiskAnalyzerDeeplink> getProtoAdapter() {
            return OptionPortfolioRiskAnalyzerDeeplink.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionPortfolioRiskAnalyzerDeeplinkDto getZeroValue() {
            return OptionPortfolioRiskAnalyzerDeeplinkDto.zeroValue;
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public String getDeeplinkRoute() {
            return OptionPortfolioRiskAnalyzerDeeplinkDto.deeplinkRoute;
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public boolean getDeeplinkRequireAuthentication() {
            return OptionPortfolioRiskAnalyzerDeeplinkDto.deeplinkRequireAuthentication;
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public boolean getDeeplinkDeprecated() {
            return OptionPortfolioRiskAnalyzerDeeplinkDto.deeplinkDeprecated;
        }

        @Override // com.robinhood.idl.DtoDeeplinkCreator
        public List<AppType> getDeeplinkSupportedAppTypes() {
            return OptionPortfolioRiskAnalyzerDeeplinkDto.deeplinkSupportedAppTypes;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public OptionPortfolioRiskAnalyzerDeeplinkDto fromProto(OptionPortfolioRiskAnalyzerDeeplink proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String account_number = proto.getAccount_number();
            String initial_underlying_id = proto.getInitial_underlying_id();
            OptionPortfolioRiskAnalyzerAccountType account_type = proto.getAccount_type();
            return new OptionPortfolioRiskAnalyzerDeeplinkDto(new Surrogate(account_number, initial_underlying_id, account_type != null ? OptionPortfolioRiskAnalyzerAccountTypeDto.INSTANCE.fromProto(account_type) : null), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: deeplinks.options.v1.OptionPortfolioRiskAnalyzerDeeplinkDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return OptionPortfolioRiskAnalyzerDeeplinkDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new OptionPortfolioRiskAnalyzerDeeplinkDto(null, null, null, 7, null);
        CREATOR = new DtoParcelableCreator(companion);
        deeplinkRoute = "portfolio_risk_analyzer";
        deeplinkRequireAuthentication = true;
        deeplinkSupportedAppTypes = CollectionsKt.listOf(AppType.TRADER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: OptionPortfolioRiskAnalyzerDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerDeeplinkDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerDeeplinkDto;", "<init>", "()V", "surrogateSerializer", "Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerDeeplinkDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "deeplinks.options_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<OptionPortfolioRiskAnalyzerDeeplinkDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/deeplinks.options.v1.OptionPortfolioRiskAnalyzerDeeplink", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, OptionPortfolioRiskAnalyzerDeeplinkDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public OptionPortfolioRiskAnalyzerDeeplinkDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new OptionPortfolioRiskAnalyzerDeeplinkDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: OptionPortfolioRiskAnalyzerDeeplinkDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Ldeeplinks/options/v1/OptionPortfolioRiskAnalyzerDeeplinkDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "deeplinks.options_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4188_4)
        public final String provideIntoMap() {
            return "deeplinks.options.v1.OptionPortfolioRiskAnalyzerDeeplinkDto";
        }
    }
}
