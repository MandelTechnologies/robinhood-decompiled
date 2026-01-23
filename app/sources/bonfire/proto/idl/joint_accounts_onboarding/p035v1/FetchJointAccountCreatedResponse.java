package bonfire.proto.idl.joint_accounts_onboarding.p035v1;

import bonfire.proto.idl.joint_accounts_onboarding.p035v1.FetchJointAccountCreatedResponse;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
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

/* compiled from: FetchJointAccountCreatedResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponse;", "Lcom/squareup/wire/Message;", "", "view_model", "Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponse$ViewModel;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponse$ViewModel;Lokio/ByteString;)V", "getView_model", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponse$ViewModel;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "ViewModel", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes.dex */
public final class FetchJointAccountCreatedResponse extends Message {

    @JvmField
    public static final ProtoAdapter<FetchJointAccountCreatedResponse> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.joint_accounts_onboarding.v1.FetchJointAccountCreatedResponse$ViewModel#ADAPTER", jsonName = "viewModel", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ViewModel view_model;

    /* JADX WARN: Multi-variable type inference failed */
    public FetchJointAccountCreatedResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8985newBuilder();
    }

    public final ViewModel getView_model() {
        return this.view_model;
    }

    public /* synthetic */ FetchJointAccountCreatedResponse(ViewModel viewModel, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : viewModel, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FetchJointAccountCreatedResponse(ViewModel viewModel, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.view_model = viewModel;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8985newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FetchJointAccountCreatedResponse)) {
            return false;
        }
        FetchJointAccountCreatedResponse fetchJointAccountCreatedResponse = (FetchJointAccountCreatedResponse) other;
        return Intrinsics.areEqual(unknownFields(), fetchJointAccountCreatedResponse.unknownFields()) && Intrinsics.areEqual(this.view_model, fetchJointAccountCreatedResponse.view_model);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ViewModel viewModel = this.view_model;
        int iHashCode2 = iHashCode + (viewModel != null ? viewModel.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ViewModel viewModel = this.view_model;
        if (viewModel != null) {
            arrayList.add("view_model=" + viewModel);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "FetchJointAccountCreatedResponse{", "}", 0, null, null, 56, null);
    }

    public final FetchJointAccountCreatedResponse copy(ViewModel view_model, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new FetchJointAccountCreatedResponse(view_model, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FetchJointAccountCreatedResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<FetchJointAccountCreatedResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.joint_accounts_onboarding.v1.FetchJointAccountCreatedResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(FetchJointAccountCreatedResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getView_model() != null ? size + FetchJointAccountCreatedResponse.ViewModel.ADAPTER.encodedSizeWithTag(1, value.getView_model()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, FetchJointAccountCreatedResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getView_model() != null) {
                    FetchJointAccountCreatedResponse.ViewModel.ADAPTER.encodeWithTag(writer, 1, (int) value.getView_model());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, FetchJointAccountCreatedResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getView_model() != null) {
                    FetchJointAccountCreatedResponse.ViewModel.ADAPTER.encodeWithTag(writer, 1, (int) value.getView_model());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public FetchJointAccountCreatedResponse redact(FetchJointAccountCreatedResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                FetchJointAccountCreatedResponse.ViewModel view_model = value.getView_model();
                return value.copy(view_model != null ? FetchJointAccountCreatedResponse.ViewModel.ADAPTER.redact(view_model) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public FetchJointAccountCreatedResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                FetchJointAccountCreatedResponse.ViewModel viewModelDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new FetchJointAccountCreatedResponse(viewModelDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        viewModelDecode = FetchJointAccountCreatedResponse.ViewModel.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: FetchJointAccountCreatedResponse.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JD\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lbonfire/proto/idl/joint_accounts_onboarding/v1/FetchJointAccountCreatedResponse$ViewModel;", "Lcom/squareup/wire/Message;", "", "hero_url", "", "title_text", "body_text", "cta_deeplink", AccountOverviewOptionsSettingCard4.CTA, "Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCta;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCta;Lokio/ByteString;)V", "getHero_url", "()Ljava/lang/String;", "getTitle_text", "getBody_text", "getCta_deeplink", "getCta", "()Lbonfire/proto/idl/joint_accounts_onboarding/v1/AccountCreationCta;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.joint_accounts_onboarding.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ViewModel extends Message {

        @JvmField
        public static final ProtoAdapter<ViewModel> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "bodyText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String body_text;

        @WireField(adapter = "bonfire.proto.idl.joint_accounts_onboarding.v1.AccountCreationCta#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
        private final AccountCreationCta cta;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "ctaDeeplink", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
        private final String cta_deeplink;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "heroUrl", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String hero_url;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "titleText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String title_text;

        public ViewModel() {
            this(null, null, null, null, null, null, 63, null);
        }

        public /* synthetic */ ViewModel(String str, String str2, String str3, String str4, AccountCreationCta accountCreationCta, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : accountCreationCta, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m8986newBuilder();
        }

        public final String getHero_url() {
            return this.hero_url;
        }

        public final String getTitle_text() {
            return this.title_text;
        }

        public final String getBody_text() {
            return this.body_text;
        }

        public final String getCta_deeplink() {
            return this.cta_deeplink;
        }

        public final AccountCreationCta getCta() {
            return this.cta;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ViewModel(String hero_url, String title_text, String body_text, String cta_deeplink, AccountCreationCta accountCreationCta, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(hero_url, "hero_url");
            Intrinsics.checkNotNullParameter(title_text, "title_text");
            Intrinsics.checkNotNullParameter(body_text, "body_text");
            Intrinsics.checkNotNullParameter(cta_deeplink, "cta_deeplink");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.hero_url = hero_url;
            this.title_text = title_text;
            this.body_text = body_text;
            this.cta_deeplink = cta_deeplink;
            this.cta = accountCreationCta;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m8986newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof ViewModel)) {
                return false;
            }
            ViewModel viewModel = (ViewModel) other;
            return Intrinsics.areEqual(unknownFields(), viewModel.unknownFields()) && Intrinsics.areEqual(this.hero_url, viewModel.hero_url) && Intrinsics.areEqual(this.title_text, viewModel.title_text) && Intrinsics.areEqual(this.body_text, viewModel.body_text) && Intrinsics.areEqual(this.cta_deeplink, viewModel.cta_deeplink) && Intrinsics.areEqual(this.cta, viewModel.cta);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.hero_url.hashCode()) * 37) + this.title_text.hashCode()) * 37) + this.body_text.hashCode()) * 37) + this.cta_deeplink.hashCode()) * 37;
            AccountCreationCta accountCreationCta = this.cta;
            int iHashCode2 = iHashCode + (accountCreationCta != null ? accountCreationCta.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("hero_url=" + Internal.sanitize(this.hero_url));
            arrayList.add("title_text=" + Internal.sanitize(this.title_text));
            arrayList.add("body_text=" + Internal.sanitize(this.body_text));
            arrayList.add("cta_deeplink=" + Internal.sanitize(this.cta_deeplink));
            AccountCreationCta accountCreationCta = this.cta;
            if (accountCreationCta != null) {
                arrayList.add("cta=" + accountCreationCta);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ViewModel{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ ViewModel copy$default(ViewModel viewModel, String str, String str2, String str3, String str4, AccountCreationCta accountCreationCta, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = viewModel.hero_url;
            }
            if ((i & 2) != 0) {
                str2 = viewModel.title_text;
            }
            if ((i & 4) != 0) {
                str3 = viewModel.body_text;
            }
            if ((i & 8) != 0) {
                str4 = viewModel.cta_deeplink;
            }
            if ((i & 16) != 0) {
                accountCreationCta = viewModel.cta;
            }
            if ((i & 32) != 0) {
                byteString = viewModel.unknownFields();
            }
            AccountCreationCta accountCreationCta2 = accountCreationCta;
            ByteString byteString2 = byteString;
            return viewModel.copy(str, str2, str3, str4, accountCreationCta2, byteString2);
        }

        public final ViewModel copy(String hero_url, String title_text, String body_text, String cta_deeplink, AccountCreationCta cta, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(hero_url, "hero_url");
            Intrinsics.checkNotNullParameter(title_text, "title_text");
            Intrinsics.checkNotNullParameter(body_text, "body_text");
            Intrinsics.checkNotNullParameter(cta_deeplink, "cta_deeplink");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new ViewModel(hero_url, title_text, body_text, cta_deeplink, cta, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<ViewModel>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.joint_accounts_onboarding.v1.FetchJointAccountCreatedResponse$ViewModel$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(FetchJointAccountCreatedResponse.ViewModel value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getHero_url(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getHero_url());
                    }
                    if (!Intrinsics.areEqual(value.getTitle_text(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle_text());
                    }
                    if (!Intrinsics.areEqual(value.getBody_text(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getBody_text());
                    }
                    if (!Intrinsics.areEqual(value.getCta_deeplink(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getCta_deeplink());
                    }
                    return value.getCta() != null ? size + AccountCreationCta.ADAPTER.encodedSizeWithTag(5, value.getCta()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, FetchJointAccountCreatedResponse.ViewModel value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getHero_url(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHero_url());
                    }
                    if (!Intrinsics.areEqual(value.getTitle_text(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle_text());
                    }
                    if (!Intrinsics.areEqual(value.getBody_text(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBody_text());
                    }
                    if (!Intrinsics.areEqual(value.getCta_deeplink(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCta_deeplink());
                    }
                    if (value.getCta() != null) {
                        AccountCreationCta.ADAPTER.encodeWithTag(writer, 5, (int) value.getCta());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, FetchJointAccountCreatedResponse.ViewModel value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getCta() != null) {
                        AccountCreationCta.ADAPTER.encodeWithTag(writer, 5, (int) value.getCta());
                    }
                    if (!Intrinsics.areEqual(value.getCta_deeplink(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getCta_deeplink());
                    }
                    if (!Intrinsics.areEqual(value.getBody_text(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBody_text());
                    }
                    if (!Intrinsics.areEqual(value.getTitle_text(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle_text());
                    }
                    if (Intrinsics.areEqual(value.getHero_url(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getHero_url());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public FetchJointAccountCreatedResponse.ViewModel redact(FetchJointAccountCreatedResponse.ViewModel value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    AccountCreationCta cta = value.getCta();
                    return FetchJointAccountCreatedResponse.ViewModel.copy$default(value, null, null, null, null, cta != null ? AccountCreationCta.ADAPTER.redact(cta) : null, ByteString.EMPTY, 15, null);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public FetchJointAccountCreatedResponse.ViewModel decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    String strDecode3 = strDecode2;
                    AccountCreationCta accountCreationCtaDecode = null;
                    String strDecode4 = strDecode3;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new FetchJointAccountCreatedResponse.ViewModel(strDecode, strDecode4, strDecode2, strDecode3, accountCreationCtaDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode4 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 4) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            accountCreationCtaDecode = AccountCreationCta.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }
            };
        }
    }
}
