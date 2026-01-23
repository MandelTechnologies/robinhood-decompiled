package bonfire.proto.idl.joint_accounts_onboarding.p035v1;

import com.plaid.internal.EnumC7081g;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: FetchSecondaryPostAgreementsResponse.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0096\u0002J\b\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\u0006H\u0016JT\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015¨\u0006&"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchSecondaryPostAgreementsResponse;", "Lcom/squareup/wire/Message;", "", "invitation_completed", "", "hero_url", "", "loading_view_model", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationLoadingViewModel;", "error_view_model", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModel;", "success_view_model", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModel;", "application_id", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLjava/lang/String;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationLoadingViewModel;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModel;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModel;Ljava/lang/String;Lokio/ByteString;)V", "getInvitation_completed", "()Z", "getHero_url", "()Ljava/lang/String;", "getLoading_view_model", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationLoadingViewModel;", "getError_view_model", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationErrorViewModel;", "getSuccess_view_model", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationSuccessViewModel;", "getApplication_id", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class FetchSecondaryPostAgreementsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<FetchSecondaryPostAgreementsResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "applicationId", schemaIndex = 5, tag = 6)
    private final String application_id;

    @WireField(adapter = "bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationErrorViewModel#ADAPTER", jsonName = "errorViewModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final AccountCreationErrorViewModel error_view_model;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "heroUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String hero_url;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "invitationCompleted", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean invitation_completed;

    @WireField(adapter = "bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationLoadingViewModel#ADAPTER", jsonName = "loadingViewModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final AccountCreationLoadingViewModel loading_view_model;

    @WireField(adapter = "bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationSuccessViewModel#ADAPTER", jsonName = "successViewModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final AccountCreationSuccessViewModel success_view_model;

    public FetchSecondaryPostAgreementsResponse() {
        this(false, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8990newBuilder();
    }

    public final boolean getInvitation_completed() {
        return this.invitation_completed;
    }

    public final String getHero_url() {
        return this.hero_url;
    }

    public /* synthetic */ FetchSecondaryPostAgreementsResponse(boolean z, String str, AccountCreationLoadingViewModel accountCreationLoadingViewModel, AccountCreationErrorViewModel accountCreationErrorViewModel, AccountCreationSuccessViewModel accountCreationSuccessViewModel, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : accountCreationLoadingViewModel, (i & 8) != 0 ? null : accountCreationErrorViewModel, (i & 16) != 0 ? null : accountCreationSuccessViewModel, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final AccountCreationLoadingViewModel getLoading_view_model() {
        return this.loading_view_model;
    }

    public final AccountCreationErrorViewModel getError_view_model() {
        return this.error_view_model;
    }

    public final AccountCreationSuccessViewModel getSuccess_view_model() {
        return this.success_view_model;
    }

    public final String getApplication_id() {
        return this.application_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchSecondaryPostAgreementsResponse(boolean z, String hero_url, AccountCreationLoadingViewModel accountCreationLoadingViewModel, AccountCreationErrorViewModel accountCreationErrorViewModel, AccountCreationSuccessViewModel accountCreationSuccessViewModel, String str, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(hero_url, "hero_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.invitation_completed = z;
        this.hero_url = hero_url;
        this.loading_view_model = accountCreationLoadingViewModel;
        this.error_view_model = accountCreationErrorViewModel;
        this.success_view_model = accountCreationSuccessViewModel;
        this.application_id = str;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8990newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FetchSecondaryPostAgreementsResponse)) {
            return false;
        }
        FetchSecondaryPostAgreementsResponse fetchSecondaryPostAgreementsResponse = (FetchSecondaryPostAgreementsResponse) other;
        return Intrinsics.areEqual(unknownFields(), fetchSecondaryPostAgreementsResponse.unknownFields()) && this.invitation_completed == fetchSecondaryPostAgreementsResponse.invitation_completed && Intrinsics.areEqual(this.hero_url, fetchSecondaryPostAgreementsResponse.hero_url) && Intrinsics.areEqual(this.loading_view_model, fetchSecondaryPostAgreementsResponse.loading_view_model) && Intrinsics.areEqual(this.error_view_model, fetchSecondaryPostAgreementsResponse.error_view_model) && Intrinsics.areEqual(this.success_view_model, fetchSecondaryPostAgreementsResponse.success_view_model) && Intrinsics.areEqual(this.application_id, fetchSecondaryPostAgreementsResponse.application_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.invitation_completed)) * 37) + this.hero_url.hashCode()) * 37;
        AccountCreationLoadingViewModel accountCreationLoadingViewModel = this.loading_view_model;
        int iHashCode2 = (iHashCode + (accountCreationLoadingViewModel != null ? accountCreationLoadingViewModel.hashCode() : 0)) * 37;
        AccountCreationErrorViewModel accountCreationErrorViewModel = this.error_view_model;
        int iHashCode3 = (iHashCode2 + (accountCreationErrorViewModel != null ? accountCreationErrorViewModel.hashCode() : 0)) * 37;
        AccountCreationSuccessViewModel accountCreationSuccessViewModel = this.success_view_model;
        int iHashCode4 = (iHashCode3 + (accountCreationSuccessViewModel != null ? accountCreationSuccessViewModel.hashCode() : 0)) * 37;
        String str = this.application_id;
        int iHashCode5 = iHashCode4 + (str != null ? str.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("invitation_completed=" + this.invitation_completed);
        arrayList.add("hero_url=" + Internal.sanitize(this.hero_url));
        AccountCreationLoadingViewModel accountCreationLoadingViewModel = this.loading_view_model;
        if (accountCreationLoadingViewModel != null) {
            arrayList.add("loading_view_model=" + accountCreationLoadingViewModel);
        }
        AccountCreationErrorViewModel accountCreationErrorViewModel = this.error_view_model;
        if (accountCreationErrorViewModel != null) {
            arrayList.add("error_view_model=" + accountCreationErrorViewModel);
        }
        AccountCreationSuccessViewModel accountCreationSuccessViewModel = this.success_view_model;
        if (accountCreationSuccessViewModel != null) {
            arrayList.add("success_view_model=" + accountCreationSuccessViewModel);
        }
        String str = this.application_id;
        if (str != null) {
            arrayList.add("application_id=" + Internal.sanitize(str));
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FetchSecondaryPostAgreementsResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ FetchSecondaryPostAgreementsResponse copy$default(FetchSecondaryPostAgreementsResponse fetchSecondaryPostAgreementsResponse, boolean z, String str, AccountCreationLoadingViewModel accountCreationLoadingViewModel, AccountCreationErrorViewModel accountCreationErrorViewModel, AccountCreationSuccessViewModel accountCreationSuccessViewModel, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fetchSecondaryPostAgreementsResponse.invitation_completed;
        }
        if ((i & 2) != 0) {
            str = fetchSecondaryPostAgreementsResponse.hero_url;
        }
        if ((i & 4) != 0) {
            accountCreationLoadingViewModel = fetchSecondaryPostAgreementsResponse.loading_view_model;
        }
        if ((i & 8) != 0) {
            accountCreationErrorViewModel = fetchSecondaryPostAgreementsResponse.error_view_model;
        }
        if ((i & 16) != 0) {
            accountCreationSuccessViewModel = fetchSecondaryPostAgreementsResponse.success_view_model;
        }
        if ((i & 32) != 0) {
            str2 = fetchSecondaryPostAgreementsResponse.application_id;
        }
        if ((i & 64) != 0) {
            byteString = fetchSecondaryPostAgreementsResponse.unknownFields();
        }
        String str3 = str2;
        ByteString byteString2 = byteString;
        AccountCreationSuccessViewModel accountCreationSuccessViewModel2 = accountCreationSuccessViewModel;
        AccountCreationLoadingViewModel accountCreationLoadingViewModel2 = accountCreationLoadingViewModel;
        return fetchSecondaryPostAgreementsResponse.copy(z, str, accountCreationLoadingViewModel2, accountCreationErrorViewModel, accountCreationSuccessViewModel2, str3, byteString2);
    }

    public final FetchSecondaryPostAgreementsResponse copy(boolean invitation_completed, String hero_url, AccountCreationLoadingViewModel loading_view_model, AccountCreationErrorViewModel error_view_model, AccountCreationSuccessViewModel success_view_model, String application_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(hero_url, "hero_url");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FetchSecondaryPostAgreementsResponse(invitation_completed, hero_url, loading_view_model, error_view_model, success_view_model, application_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FetchSecondaryPostAgreementsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FetchSecondaryPostAgreementsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.joint_accounts_onboarding.v1.FetchSecondaryPostAgreementsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FetchSecondaryPostAgreementsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getInvitation_completed()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getInvitation_completed()));
                }
                if (!Intrinsics.areEqual(value.getHero_url(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getHero_url());
                }
                if (value.getLoading_view_model() != null) {
                    size += AccountCreationLoadingViewModel.ADAPTER.encodedSizeWithTag(3, value.getLoading_view_model());
                }
                if (value.getError_view_model() != null) {
                    size += AccountCreationErrorViewModel.ADAPTER.encodedSizeWithTag(4, value.getError_view_model());
                }
                if (value.getSuccess_view_model() != null) {
                    size += AccountCreationSuccessViewModel.ADAPTER.encodedSizeWithTag(5, value.getSuccess_view_model());
                }
                return size + ProtoAdapter.STRING.encodedSizeWithTag(6, value.getApplication_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FetchSecondaryPostAgreementsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getInvitation_completed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getInvitation_completed()));
                }
                if (!Intrinsics.areEqual(value.getHero_url(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getHero_url());
                }
                if (value.getLoading_view_model() != null) {
                    AccountCreationLoadingViewModel.ADAPTER.encodeWithTag(writer, 3, (int) value.getLoading_view_model());
                }
                if (value.getError_view_model() != null) {
                    AccountCreationErrorViewModel.ADAPTER.encodeWithTag(writer, 4, (int) value.getError_view_model());
                }
                if (value.getSuccess_view_model() != null) {
                    AccountCreationSuccessViewModel.ADAPTER.encodeWithTag(writer, 5, (int) value.getSuccess_view_model());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getApplication_id());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FetchSecondaryPostAgreementsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 6, (int) value.getApplication_id());
                if (value.getSuccess_view_model() != null) {
                    AccountCreationSuccessViewModel.ADAPTER.encodeWithTag(writer, 5, (int) value.getSuccess_view_model());
                }
                if (value.getError_view_model() != null) {
                    AccountCreationErrorViewModel.ADAPTER.encodeWithTag(writer, 4, (int) value.getError_view_model());
                }
                if (value.getLoading_view_model() != null) {
                    AccountCreationLoadingViewModel.ADAPTER.encodeWithTag(writer, 3, (int) value.getLoading_view_model());
                }
                if (!Intrinsics.areEqual(value.getHero_url(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getHero_url());
                }
                if (value.getInvitation_completed()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getInvitation_completed()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FetchSecondaryPostAgreementsResponse redact(FetchSecondaryPostAgreementsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                AccountCreationLoadingViewModel loading_view_model = value.getLoading_view_model();
                AccountCreationLoadingViewModel accountCreationLoadingViewModelRedact = loading_view_model != null ? AccountCreationLoadingViewModel.ADAPTER.redact(loading_view_model) : null;
                AccountCreationErrorViewModel error_view_model = value.getError_view_model();
                AccountCreationErrorViewModel accountCreationErrorViewModelRedact = error_view_model != null ? AccountCreationErrorViewModel.ADAPTER.redact(error_view_model) : null;
                AccountCreationSuccessViewModel success_view_model = value.getSuccess_view_model();
                return FetchSecondaryPostAgreementsResponse.copy$default(value, false, null, accountCreationLoadingViewModelRedact, accountCreationErrorViewModelRedact, success_view_model != null ? AccountCreationSuccessViewModel.ADAPTER.redact(success_view_model) : null, null, ByteString.EMPTY, 35, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FetchSecondaryPostAgreementsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                AccountCreationLoadingViewModel accountCreationLoadingViewModelDecode = null;
                boolean zBooleanValue = false;
                AccountCreationErrorViewModel accountCreationErrorViewModelDecode = null;
                AccountCreationSuccessViewModel accountCreationSuccessViewModelDecode = null;
                String strDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 2:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                accountCreationLoadingViewModelDecode = AccountCreationLoadingViewModel.ADAPTER.decode(reader);
                                break;
                            case 4:
                                accountCreationErrorViewModelDecode = AccountCreationErrorViewModel.ADAPTER.decode(reader);
                                break;
                            case 5:
                                accountCreationSuccessViewModelDecode = AccountCreationSuccessViewModel.ADAPTER.decode(reader);
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new FetchSecondaryPostAgreementsResponse(zBooleanValue, strDecode, accountCreationLoadingViewModelDecode, accountCreationErrorViewModelDecode, accountCreationSuccessViewModelDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
