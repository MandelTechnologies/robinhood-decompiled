package bonfire.proto.idl.joint_accounts_onboarding.p035v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.AccountCreationCtaDto;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.AccountCreationCtaWithDeeplinkDto;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: AccountCreationSuccessViewModelDto.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0004)(*+B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B5\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0006\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\"\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u0011\u0010\n\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b%\u0010\u0013R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006,"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModel;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto$Surrogate;)V", "", "title_text", "body_text", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;", "continue_cta", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaWithDeeplinkDto;", "continue_cta_v2", "(Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaWithDeeplinkDto;)V", "toProto", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModel;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto$Surrogate;", "getTitle_text", "getBody_text", "getContinue_cta_v2", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaWithDeeplinkDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class AccountCreationSuccessViewModelDto implements Dto3<AccountCreationSuccessViewModel>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<AccountCreationSuccessViewModelDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AccountCreationSuccessViewModelDto, AccountCreationSuccessViewModel>> binaryBase64Serializer$delegate;
    private static final AccountCreationSuccessViewModelDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ AccountCreationSuccessViewModelDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AccountCreationSuccessViewModelDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getTitle_text() {
        return this.surrogate.getTitle_text();
    }

    public final String getBody_text() {
        return this.surrogate.getBody_text();
    }

    public final AccountCreationCtaWithDeeplinkDto getContinue_cta_v2() {
        return this.surrogate.getContinue_cta_v2();
    }

    public /* synthetic */ AccountCreationSuccessViewModelDto(String str, String str2, AccountCreationCtaDto accountCreationCtaDto, AccountCreationCtaWithDeeplinkDto accountCreationCtaWithDeeplinkDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : accountCreationCtaDto, (i & 8) != 0 ? null : accountCreationCtaWithDeeplinkDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AccountCreationSuccessViewModelDto(String title_text, String body_text, AccountCreationCtaDto accountCreationCtaDto, AccountCreationCtaWithDeeplinkDto accountCreationCtaWithDeeplinkDto) {
        this(new Surrogate(title_text, body_text, accountCreationCtaDto, accountCreationCtaWithDeeplinkDto));
        Intrinsics.checkNotNullParameter(title_text, "title_text");
        Intrinsics.checkNotNullParameter(body_text, "body_text");
    }

    @Override // com.robinhood.idl.Dto
    public AccountCreationSuccessViewModel toProto() {
        String title_text = this.surrogate.getTitle_text();
        String body_text = this.surrogate.getBody_text();
        AccountCreationCtaDto continue_cta = this.surrogate.getContinue_cta();
        AccountCreationCta proto = continue_cta != null ? continue_cta.toProto() : null;
        AccountCreationCtaWithDeeplinkDto continue_cta_v2 = this.surrogate.getContinue_cta_v2();
        return new AccountCreationSuccessViewModel(title_text, body_text, proto, continue_cta_v2 != null ? continue_cta_v2.toProto() : null, null, 16, null);
    }

    public String toString() {
        return "[AccountCreationSuccessViewModelDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof AccountCreationSuccessViewModelDto) && Intrinsics.areEqual(((AccountCreationSuccessViewModelDto) other).surrogate, this.surrogate);
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
    /* compiled from: AccountCreationSuccessViewModelDto.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0083\b\u0018\u0000 /2\u00020\u0001:\u00020/B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nBC\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010!\u0012\u0004\b#\u0010$\u001a\u0004\b\"\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010!\u0012\u0004\b&\u0010$\u001a\u0004\b%\u0010\u001aR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010'\u0012\u0004\b*\u0010$\u001a\u0004\b(\u0010)R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010+\u0012\u0004\b.\u0010$\u001a\u0004\b,\u0010-¨\u00061"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto$Surrogate;", "", "", "title_text", "body_text", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;", "continue_cta", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaWithDeeplinkDto;", "continue_cta_v2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaWithDeeplinkDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaWithDeeplinkDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_joint_accounts_onboarding_v1_externalRelease", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle_text", "getTitle_text$annotations", "()V", "getBody_text", "getBody_text$annotations", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;", "getContinue_cta", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaDto;", "getContinue_cta$annotations", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaWithDeeplinkDto;", "getContinue_cta_v2", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCtaWithDeeplinkDto;", "getContinue_cta_v2$annotations", "Companion", "$serializer", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String body_text;
        private final AccountCreationCtaDto continue_cta;
        private final AccountCreationCtaWithDeeplinkDto continue_cta_v2;
        private final String title_text;

        public Surrogate() {
            this((String) null, (String) null, (AccountCreationCtaDto) null, (AccountCreationCtaWithDeeplinkDto) null, 15, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.title_text, surrogate.title_text) && Intrinsics.areEqual(this.body_text, surrogate.body_text) && Intrinsics.areEqual(this.continue_cta, surrogate.continue_cta) && Intrinsics.areEqual(this.continue_cta_v2, surrogate.continue_cta_v2);
        }

        public int hashCode() {
            int iHashCode = ((this.title_text.hashCode() * 31) + this.body_text.hashCode()) * 31;
            AccountCreationCtaDto accountCreationCtaDto = this.continue_cta;
            int iHashCode2 = (iHashCode + (accountCreationCtaDto == null ? 0 : accountCreationCtaDto.hashCode())) * 31;
            AccountCreationCtaWithDeeplinkDto accountCreationCtaWithDeeplinkDto = this.continue_cta_v2;
            return iHashCode2 + (accountCreationCtaWithDeeplinkDto != null ? accountCreationCtaWithDeeplinkDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(title_text=" + this.title_text + ", body_text=" + this.body_text + ", continue_cta=" + this.continue_cta + ", continue_cta_v2=" + this.continue_cta_v2 + ")";
        }

        /* compiled from: AccountCreationSuccessViewModelDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto$Surrogate;", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return AccountCreationSuccessViewModelDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, String str2, AccountCreationCtaDto accountCreationCtaDto, AccountCreationCtaWithDeeplinkDto accountCreationCtaWithDeeplinkDto, SerializationConstructorMarker serializationConstructorMarker) {
            if ((i & 1) == 0) {
                this.title_text = "";
            } else {
                this.title_text = str;
            }
            if ((i & 2) == 0) {
                this.body_text = "";
            } else {
                this.body_text = str2;
            }
            if ((i & 4) == 0) {
                this.continue_cta = null;
            } else {
                this.continue_cta = accountCreationCtaDto;
            }
            if ((i & 8) == 0) {
                this.continue_cta_v2 = null;
            } else {
                this.continue_cta_v2 = accountCreationCtaWithDeeplinkDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_joint_accounts_onboarding_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.title_text, "")) {
                output.encodeStringElement(serialDesc, 0, self.title_text);
            }
            if (!Intrinsics.areEqual(self.body_text, "")) {
                output.encodeStringElement(serialDesc, 1, self.body_text);
            }
            AccountCreationCtaDto accountCreationCtaDto = self.continue_cta;
            if (accountCreationCtaDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, AccountCreationCtaDto.Serializer.INSTANCE, accountCreationCtaDto);
            }
            AccountCreationCtaWithDeeplinkDto accountCreationCtaWithDeeplinkDto = self.continue_cta_v2;
            if (accountCreationCtaWithDeeplinkDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, AccountCreationCtaWithDeeplinkDto.Serializer.INSTANCE, accountCreationCtaWithDeeplinkDto);
            }
        }

        public Surrogate(String title_text, String body_text, AccountCreationCtaDto accountCreationCtaDto, AccountCreationCtaWithDeeplinkDto accountCreationCtaWithDeeplinkDto) {
            Intrinsics.checkNotNullParameter(title_text, "title_text");
            Intrinsics.checkNotNullParameter(body_text, "body_text");
            this.title_text = title_text;
            this.body_text = body_text;
            this.continue_cta = accountCreationCtaDto;
            this.continue_cta_v2 = accountCreationCtaWithDeeplinkDto;
        }

        public /* synthetic */ Surrogate(String str, String str2, AccountCreationCtaDto accountCreationCtaDto, AccountCreationCtaWithDeeplinkDto accountCreationCtaWithDeeplinkDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : accountCreationCtaDto, (i & 8) != 0 ? null : accountCreationCtaWithDeeplinkDto);
        }

        public final String getTitle_text() {
            return this.title_text;
        }

        public final String getBody_text() {
            return this.body_text;
        }

        public final AccountCreationCtaDto getContinue_cta() {
            return this.continue_cta;
        }

        public final AccountCreationCtaWithDeeplinkDto getContinue_cta_v2() {
            return this.continue_cta_v2;
        }
    }

    /* compiled from: AccountCreationSuccessViewModelDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModel;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<AccountCreationSuccessViewModelDto, AccountCreationSuccessViewModel> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AccountCreationSuccessViewModelDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AccountCreationSuccessViewModelDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AccountCreationSuccessViewModelDto> getBinaryBase64Serializer() {
            return (KSerializer) AccountCreationSuccessViewModelDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AccountCreationSuccessViewModel> getProtoAdapter() {
            return AccountCreationSuccessViewModel.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AccountCreationSuccessViewModelDto getZeroValue() {
            return AccountCreationSuccessViewModelDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AccountCreationSuccessViewModelDto fromProto(AccountCreationSuccessViewModel proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            String title_text = proto.getTitle_text();
            String body_text = proto.getBody_text();
            AccountCreationCta continue_cta = proto.getContinue_cta();
            DefaultConstructorMarker defaultConstructorMarker = null;
            AccountCreationCtaDto accountCreationCtaDtoFromProto = continue_cta != null ? AccountCreationCtaDto.INSTANCE.fromProto(continue_cta) : null;
            AccountCreationCtaWithDeeplink continue_cta_v2 = proto.getContinue_cta_v2();
            return new AccountCreationSuccessViewModelDto(new Surrogate(title_text, body_text, accountCreationCtaDtoFromProto, continue_cta_v2 != null ? AccountCreationCtaWithDeeplinkDto.INSTANCE.fromProto(continue_cta_v2) : null), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationSuccessViewModelDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AccountCreationSuccessViewModelDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new AccountCreationSuccessViewModelDto(null, null, null, null, 15, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AccountCreationSuccessViewModelDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<AccountCreationSuccessViewModelDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationSuccessViewModel", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AccountCreationSuccessViewModelDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public AccountCreationSuccessViewModelDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new AccountCreationSuccessViewModelDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: AccountCreationSuccessViewModelDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationSuccessViewModelDto";
        }
    }
}
