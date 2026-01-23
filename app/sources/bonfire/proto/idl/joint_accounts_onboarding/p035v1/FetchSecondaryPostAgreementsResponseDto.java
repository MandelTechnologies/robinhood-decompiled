package bonfire.proto.idl.joint_accounts_onboarding.p035v1;

import android.os.Parcel;
import android.os.Parcelable;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.AccountCreationErrorViewModelDto;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.AccountCreationLoadingViewModelDto;
import bonfire.proto.idl.joint_accounts_onboarding.p035v1.AccountCreationSuccessViewModelDto;
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
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: FetchSecondaryPostAgreementsResponseDto.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00040/12B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007BM\b\u0016\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001cH\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001cH\u0016¢\u0006\u0004\b%\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0011\u0010\t\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\f8F¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u000e8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00108F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00063"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponse;", "Landroid/os/Parcelable;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponseDto$Surrogate;", "surrogate", "<init>", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponseDto$Surrogate;)V", "", "invitation_completed", "", "hero_url", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationLoadingViewModelDto;", "loading_view_model", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto;", "error_view_model", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto;", "success_view_model", "application_id", "(ZLjava/lang/String;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationLoadingViewModelDto;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto;Ljava/lang/String;)V", "toProto", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponse;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponseDto$Surrogate;", "getInvitation_completed", "()Z", "getLoading_view_model", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationLoadingViewModelDto;", "getError_view_model", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto;", "getSuccess_view_model", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto;", "Companion", "Surrogate", "Serializer", "MultibindingModule", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public final class FetchSecondaryPostAgreementsResponseDto implements Dto3<FetchSecondaryPostAgreementsResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<FetchSecondaryPostAgreementsResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FetchSecondaryPostAgreementsResponseDto, FetchSecondaryPostAgreementsResponse>> binaryBase64Serializer$delegate;
    private static final FetchSecondaryPostAgreementsResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ FetchSecondaryPostAgreementsResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FetchSecondaryPostAgreementsResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final boolean getInvitation_completed() {
        return this.surrogate.getInvitation_completed();
    }

    public final AccountCreationLoadingViewModelDto getLoading_view_model() {
        return this.surrogate.getLoading_view_model();
    }

    public final AccountCreationErrorViewModelDto getError_view_model() {
        return this.surrogate.getError_view_model();
    }

    public final AccountCreationSuccessViewModelDto getSuccess_view_model() {
        return this.surrogate.getSuccess_view_model();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ FetchSecondaryPostAgreementsResponseDto(boolean r2, java.lang.String r3, bonfire.proto.idl.joint_accounts_onboarding.p035v1.AccountCreationLoadingViewModelDto r4, bonfire.proto.idl.joint_accounts_onboarding.p035v1.AccountCreationErrorViewModelDto r5, bonfire.proto.idl.joint_accounts_onboarding.p035v1.AccountCreationSuccessViewModelDto r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 0
        L5:
            r9 = r8 & 2
            if (r9 == 0) goto Lb
            java.lang.String r3 = ""
        Lb:
            r9 = r8 & 4
            r0 = 0
            if (r9 == 0) goto L11
            r4 = r0
        L11:
            r9 = r8 & 8
            if (r9 == 0) goto L16
            r5 = r0
        L16:
            r9 = r8 & 16
            if (r9 == 0) goto L1b
            r6 = r0
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bonfire.proto.idl.joint_accounts_onboarding.p035v1.FetchSecondaryPostAgreementsResponseDto.<init>(boolean, java.lang.String, bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationLoadingViewModelDto, bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationErrorViewModelDto, bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationSuccessViewModelDto, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FetchSecondaryPostAgreementsResponseDto(boolean z, String hero_url, AccountCreationLoadingViewModelDto accountCreationLoadingViewModelDto, AccountCreationErrorViewModelDto accountCreationErrorViewModelDto, AccountCreationSuccessViewModelDto accountCreationSuccessViewModelDto, String str) {
        this(new Surrogate(z, hero_url, accountCreationLoadingViewModelDto, accountCreationErrorViewModelDto, accountCreationSuccessViewModelDto, str));
        Intrinsics.checkNotNullParameter(hero_url, "hero_url");
    }

    @Override // com.robinhood.idl.Dto
    public FetchSecondaryPostAgreementsResponse toProto() {
        boolean invitation_completed = this.surrogate.getInvitation_completed();
        String hero_url = this.surrogate.getHero_url();
        AccountCreationLoadingViewModelDto loading_view_model = this.surrogate.getLoading_view_model();
        AccountCreationLoadingViewModel proto = loading_view_model != null ? loading_view_model.toProto() : null;
        AccountCreationErrorViewModelDto error_view_model = this.surrogate.getError_view_model();
        AccountCreationErrorViewModel proto2 = error_view_model != null ? error_view_model.toProto() : null;
        AccountCreationSuccessViewModelDto success_view_model = this.surrogate.getSuccess_view_model();
        return new FetchSecondaryPostAgreementsResponse(invitation_completed, hero_url, proto, proto2, success_view_model != null ? success_view_model.toProto() : null, this.surrogate.getApplication_id(), null, 64, null);
    }

    public String toString() {
        return "[FetchSecondaryPostAgreementsResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof FetchSecondaryPostAgreementsResponseDto) && Intrinsics.areEqual(((FetchSecondaryPostAgreementsResponseDto) other).surrogate, this.surrogate);
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
    /* compiled from: FetchSecondaryPostAgreementsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b#\b\u0083\b\u0018\u0000 :2\u00020\u0001:\u0002;:BK\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eBU\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b+\u0010(\u001a\u0004\b*\u0010\u001eR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010,\u0012\u0004\b/\u0010(\u001a\u0004\b-\u0010.R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00100\u0012\u0004\b3\u0010(\u001a\u0004\b1\u00102R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00104\u0012\u0004\b7\u0010(\u001a\u0004\b5\u00106R\"\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010)\u0012\u0004\b9\u0010(\u001a\u0004\b8\u0010\u001e¨\u0006<"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponseDto$Surrogate;", "", "", "invitation_completed", "", "hero_url", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationLoadingViewModelDto;", "loading_view_model", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto;", "error_view_model", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto;", "success_view_model", "application_id", "<init>", "(ZLjava/lang/String;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationLoadingViewModelDto;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZLjava/lang/String;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationLoadingViewModelDto;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "write$Self$bonfire_joint_accounts_onboarding_v1_externalRelease", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponseDto$Surrogate;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "write$Self", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getInvitation_completed", "()Z", "getInvitation_completed$annotations", "()V", "Ljava/lang/String;", "getHero_url", "getHero_url$annotations", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationLoadingViewModelDto;", "getLoading_view_model", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationLoadingViewModelDto;", "getLoading_view_model$annotations", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto;", "getError_view_model", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModelDto;", "getError_view_model$annotations", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto;", "getSuccess_view_model", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModelDto;", "getSuccess_view_model$annotations", "getApplication_id", "getApplication_id$annotations", "Companion", "$serializer", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String application_id;
        private final AccountCreationErrorViewModelDto error_view_model;
        private final String hero_url;
        private final boolean invitation_completed;
        private final AccountCreationLoadingViewModelDto loading_view_model;
        private final AccountCreationSuccessViewModelDto success_view_model;

        public Surrogate() {
            this(false, (String) null, (AccountCreationLoadingViewModelDto) null, (AccountCreationErrorViewModelDto) null, (AccountCreationSuccessViewModelDto) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.invitation_completed == surrogate.invitation_completed && Intrinsics.areEqual(this.hero_url, surrogate.hero_url) && Intrinsics.areEqual(this.loading_view_model, surrogate.loading_view_model) && Intrinsics.areEqual(this.error_view_model, surrogate.error_view_model) && Intrinsics.areEqual(this.success_view_model, surrogate.success_view_model) && Intrinsics.areEqual(this.application_id, surrogate.application_id);
        }

        public int hashCode() {
            int iHashCode = ((Boolean.hashCode(this.invitation_completed) * 31) + this.hero_url.hashCode()) * 31;
            AccountCreationLoadingViewModelDto accountCreationLoadingViewModelDto = this.loading_view_model;
            int iHashCode2 = (iHashCode + (accountCreationLoadingViewModelDto == null ? 0 : accountCreationLoadingViewModelDto.hashCode())) * 31;
            AccountCreationErrorViewModelDto accountCreationErrorViewModelDto = this.error_view_model;
            int iHashCode3 = (iHashCode2 + (accountCreationErrorViewModelDto == null ? 0 : accountCreationErrorViewModelDto.hashCode())) * 31;
            AccountCreationSuccessViewModelDto accountCreationSuccessViewModelDto = this.success_view_model;
            int iHashCode4 = (iHashCode3 + (accountCreationSuccessViewModelDto == null ? 0 : accountCreationSuccessViewModelDto.hashCode())) * 31;
            String str = this.application_id;
            return iHashCode4 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(invitation_completed=" + this.invitation_completed + ", hero_url=" + this.hero_url + ", loading_view_model=" + this.loading_view_model + ", error_view_model=" + this.error_view_model + ", success_view_model=" + this.success_view_model + ", application_id=" + this.application_id + ")";
        }

        /* compiled from: FetchSecondaryPostAgreementsResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponseDto$Surrogate;", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return FetchSecondaryPostAgreementsResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, boolean z, String str, AccountCreationLoadingViewModelDto accountCreationLoadingViewModelDto, AccountCreationErrorViewModelDto accountCreationErrorViewModelDto, AccountCreationSuccessViewModelDto accountCreationSuccessViewModelDto, String str2, SerializationConstructorMarker serializationConstructorMarker) {
            this.invitation_completed = (i & 1) == 0 ? false : z;
            if ((i & 2) == 0) {
                this.hero_url = "";
            } else {
                this.hero_url = str;
            }
            if ((i & 4) == 0) {
                this.loading_view_model = null;
            } else {
                this.loading_view_model = accountCreationLoadingViewModelDto;
            }
            if ((i & 8) == 0) {
                this.error_view_model = null;
            } else {
                this.error_view_model = accountCreationErrorViewModelDto;
            }
            if ((i & 16) == 0) {
                this.success_view_model = null;
            } else {
                this.success_view_model = accountCreationSuccessViewModelDto;
            }
            if ((i & 32) == 0) {
                this.application_id = null;
            } else {
                this.application_id = str2;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$bonfire_joint_accounts_onboarding_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            boolean z = self.invitation_completed;
            if (z) {
                output.encodeBooleanElement(serialDesc, 0, z);
            }
            if (!Intrinsics.areEqual(self.hero_url, "")) {
                output.encodeStringElement(serialDesc, 1, self.hero_url);
            }
            AccountCreationLoadingViewModelDto accountCreationLoadingViewModelDto = self.loading_view_model;
            if (accountCreationLoadingViewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, AccountCreationLoadingViewModelDto.Serializer.INSTANCE, accountCreationLoadingViewModelDto);
            }
            AccountCreationErrorViewModelDto accountCreationErrorViewModelDto = self.error_view_model;
            if (accountCreationErrorViewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, AccountCreationErrorViewModelDto.Serializer.INSTANCE, accountCreationErrorViewModelDto);
            }
            AccountCreationSuccessViewModelDto accountCreationSuccessViewModelDto = self.success_view_model;
            if (accountCreationSuccessViewModelDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, AccountCreationSuccessViewModelDto.Serializer.INSTANCE, accountCreationSuccessViewModelDto);
            }
            String str = self.application_id;
            if (str != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, str);
            }
        }

        public Surrogate(boolean z, String hero_url, AccountCreationLoadingViewModelDto accountCreationLoadingViewModelDto, AccountCreationErrorViewModelDto accountCreationErrorViewModelDto, AccountCreationSuccessViewModelDto accountCreationSuccessViewModelDto, String str) {
            Intrinsics.checkNotNullParameter(hero_url, "hero_url");
            this.invitation_completed = z;
            this.hero_url = hero_url;
            this.loading_view_model = accountCreationLoadingViewModelDto;
            this.error_view_model = accountCreationErrorViewModelDto;
            this.success_view_model = accountCreationSuccessViewModelDto;
            this.application_id = str;
        }

        public final boolean getInvitation_completed() {
            return this.invitation_completed;
        }

        public final String getHero_url() {
            return this.hero_url;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(boolean r2, java.lang.String r3, bonfire.proto.idl.joint_accounts_onboarding.p035v1.AccountCreationLoadingViewModelDto r4, bonfire.proto.idl.joint_accounts_onboarding.p035v1.AccountCreationErrorViewModelDto r5, bonfire.proto.idl.joint_accounts_onboarding.p035v1.AccountCreationSuccessViewModelDto r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto L5
                r2 = 0
            L5:
                r9 = r8 & 2
                if (r9 == 0) goto Lb
                java.lang.String r3 = ""
            Lb:
                r9 = r8 & 4
                r0 = 0
                if (r9 == 0) goto L11
                r4 = r0
            L11:
                r9 = r8 & 8
                if (r9 == 0) goto L16
                r5 = r0
            L16:
                r9 = r8 & 16
                if (r9 == 0) goto L1b
                r6 = r0
            L1b:
                r8 = r8 & 32
                if (r8 == 0) goto L27
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L2e
            L27:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L2e:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bonfire.proto.idl.joint_accounts_onboarding.p035v1.FetchSecondaryPostAgreementsResponseDto.Surrogate.<init>(boolean, java.lang.String, bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationLoadingViewModelDto, bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationErrorViewModelDto, bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationSuccessViewModelDto, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final AccountCreationLoadingViewModelDto getLoading_view_model() {
            return this.loading_view_model;
        }

        public final AccountCreationErrorViewModelDto getError_view_model() {
            return this.error_view_model;
        }

        public final AccountCreationSuccessViewModelDto getSuccess_view_model() {
            return this.success_view_model;
        }

        public final String getApplication_id() {
            return this.application_id;
        }
    }

    /* compiled from: FetchSecondaryPostAgreementsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponseDto;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<FetchSecondaryPostAgreementsResponseDto, FetchSecondaryPostAgreementsResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FetchSecondaryPostAgreementsResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FetchSecondaryPostAgreementsResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FetchSecondaryPostAgreementsResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) FetchSecondaryPostAgreementsResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FetchSecondaryPostAgreementsResponse> getProtoAdapter() {
            return FetchSecondaryPostAgreementsResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FetchSecondaryPostAgreementsResponseDto getZeroValue() {
            return FetchSecondaryPostAgreementsResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FetchSecondaryPostAgreementsResponseDto fromProto(FetchSecondaryPostAgreementsResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            boolean invitation_completed = proto.getInvitation_completed();
            String hero_url = proto.getHero_url();
            AccountCreationLoadingViewModel loading_view_model = proto.getLoading_view_model();
            DefaultConstructorMarker defaultConstructorMarker = null;
            AccountCreationLoadingViewModelDto accountCreationLoadingViewModelDtoFromProto = loading_view_model != null ? AccountCreationLoadingViewModelDto.INSTANCE.fromProto(loading_view_model) : null;
            AccountCreationErrorViewModel error_view_model = proto.getError_view_model();
            AccountCreationErrorViewModelDto accountCreationErrorViewModelDtoFromProto = error_view_model != null ? AccountCreationErrorViewModelDto.INSTANCE.fromProto(error_view_model) : null;
            AccountCreationSuccessViewModel success_view_model = proto.getSuccess_view_model();
            return new FetchSecondaryPostAgreementsResponseDto(new Surrogate(invitation_completed, hero_url, accountCreationLoadingViewModelDtoFromProto, accountCreationErrorViewModelDtoFromProto, success_view_model != null ? AccountCreationSuccessViewModelDto.INSTANCE.fromProto(success_view_model) : null, proto.getApplication_id()), defaultConstructorMarker);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.joint_accounts_onboarding.v1.FetchSecondaryPostAgreementsResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FetchSecondaryPostAgreementsResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new FetchSecondaryPostAgreementsResponseDto(false, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FetchSecondaryPostAgreementsResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponseDto;", "<init>", "()V", "surrogateSerializer", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<FetchSecondaryPostAgreementsResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/bonfire.proto.idl.joint_accounts_onboarding.v1.FetchSecondaryPostAgreementsResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FetchSecondaryPostAgreementsResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public FetchSecondaryPostAgreementsResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new FetchSecondaryPostAgreementsResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: FetchSecondaryPostAgreementsResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "bonfire.proto.idl.joint_accounts_onboarding.v1.FetchSecondaryPostAgreementsResponseDto";
        }
    }
}
