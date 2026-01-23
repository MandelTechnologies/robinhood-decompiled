package bonfire.proto.idl.crypto.p033v1;

import bonfire.proto.idl.crypto.p033v1.GetCryptoUserAgreementsResponse;
import com.robinhood.android.instant.p160ui.InstantRetirementAgreementComponents;
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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GetCryptoUserAgreementsResponse.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB+\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0010\u001a\u00020\u0002H\u0017J\u0013\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J*\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse;", "Lcom/squareup/wire/Message;", "", "crypto_agreements", "", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement;", "sign_agreements_individually", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;ZLokio/ByteString;)V", "getSign_agreements_individually", "()Z", "getCrypto_agreements", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "CryptoAgreement", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class GetCryptoUserAgreementsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetCryptoUserAgreementsResponse> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse$CryptoAgreement#ADAPTER", jsonName = "cryptoAgreements", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<CryptoAgreement> crypto_agreements;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "signAgreementsIndividually", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean sign_agreements_individually;

    public GetCryptoUserAgreementsResponse() {
        this(null, false, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8932newBuilder();
    }

    public /* synthetic */ GetCryptoUserAgreementsResponse(List list, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final boolean getSign_agreements_individually() {
        return this.sign_agreements_individually;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCryptoUserAgreementsResponse(List<CryptoAgreement> crypto_agreements, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(crypto_agreements, "crypto_agreements");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.sign_agreements_individually = z;
        this.crypto_agreements = Internal.immutableCopyOf("crypto_agreements", crypto_agreements);
    }

    public final List<CryptoAgreement> getCrypto_agreements() {
        return this.crypto_agreements;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8932newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetCryptoUserAgreementsResponse)) {
            return false;
        }
        GetCryptoUserAgreementsResponse getCryptoUserAgreementsResponse = (GetCryptoUserAgreementsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getCryptoUserAgreementsResponse.unknownFields()) && Intrinsics.areEqual(this.crypto_agreements, getCryptoUserAgreementsResponse.crypto_agreements) && this.sign_agreements_individually == getCryptoUserAgreementsResponse.sign_agreements_individually;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.crypto_agreements.hashCode()) * 37) + Boolean.hashCode(this.sign_agreements_individually);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.crypto_agreements.isEmpty()) {
            arrayList.add("crypto_agreements=" + this.crypto_agreements);
        }
        arrayList.add("sign_agreements_individually=" + this.sign_agreements_individually);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetCryptoUserAgreementsResponse{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetCryptoUserAgreementsResponse copy$default(GetCryptoUserAgreementsResponse getCryptoUserAgreementsResponse, List list, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getCryptoUserAgreementsResponse.crypto_agreements;
        }
        if ((i & 2) != 0) {
            z = getCryptoUserAgreementsResponse.sign_agreements_individually;
        }
        if ((i & 4) != 0) {
            byteString = getCryptoUserAgreementsResponse.unknownFields();
        }
        return getCryptoUserAgreementsResponse.copy(list, z, byteString);
    }

    public final GetCryptoUserAgreementsResponse copy(List<CryptoAgreement> crypto_agreements, boolean sign_agreements_individually, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(crypto_agreements, "crypto_agreements");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetCryptoUserAgreementsResponse(crypto_agreements, sign_agreements_individually, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetCryptoUserAgreementsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetCryptoUserAgreementsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetCryptoUserAgreementsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size() + GetCryptoUserAgreementsResponse.CryptoAgreement.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getCrypto_agreements());
                return value.getSign_agreements_individually() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getSign_agreements_individually())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetCryptoUserAgreementsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                GetCryptoUserAgreementsResponse.CryptoAgreement.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getCrypto_agreements());
                if (value.getSign_agreements_individually()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getSign_agreements_individually()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetCryptoUserAgreementsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSign_agreements_individually()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getSign_agreements_individually()));
                }
                GetCryptoUserAgreementsResponse.CryptoAgreement.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getCrypto_agreements());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoUserAgreementsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetCryptoUserAgreementsResponse(arrayList, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        arrayList.add(GetCryptoUserAgreementsResponse.CryptoAgreement.ADAPTER.decode(reader));
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetCryptoUserAgreementsResponse redact(GetCryptoUserAgreementsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetCryptoUserAgreementsResponse.copy$default(value, Internal.m26823redactElements(value.getCrypto_agreements(), GetCryptoUserAgreementsResponse.CryptoAgreement.ADAPTER), false, ByteString.EMPTY, 2, null);
            }
        };
    }

    /* compiled from: GetCryptoUserAgreementsResponse.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 #2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0004#$%&BO\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001a\u001a\u00020\u0002H\u0017J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u0007H\u0016JN\u0010\"\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement;", "Lcom/squareup/wire/Message;", "", "signable_agreements", "", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement;", "title", "", "subtitle_content", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SubtitleContent;", "unscrolled_button", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$Button;", "scrolled_button", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SubtitleContent;Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$Button;Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$Button;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle_content", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SubtitleContent;", "getUnscrolled_button", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$Button;", "getScrolled_button", "getSignable_agreements", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "SignableAgreement", "Button", "SubtitleContent", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CryptoAgreement extends Message {

        @JvmField
        public static final ProtoAdapter<CryptoAgreement> ADAPTER;

        @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse$CryptoAgreement$Button#ADAPTER", jsonName = "scrolledButton", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
        private final Button scrolled_button;

        @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement#ADAPTER", jsonName = "signableAgreements", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        private final List<SignableAgreement> signable_agreements;

        @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse$CryptoAgreement$SubtitleContent#ADAPTER", jsonName = "subtitleContent", schemaIndex = 2, tag = 3)
        private final SubtitleContent subtitle_content;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String title;

        @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse$CryptoAgreement$Button#ADAPTER", jsonName = "unscrolledButton", schemaIndex = 3, tag = 4)
        private final Button unscrolled_button;

        public CryptoAgreement() {
            this(null, null, null, null, null, null, 63, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m8933newBuilder();
        }

        public /* synthetic */ CryptoAgreement(List list, String str, SubtitleContent subtitleContent, Button button, Button button2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? null : subtitleContent, (i & 8) != 0 ? null : button, (i & 16) != 0 ? null : button2, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        public final String getTitle() {
            return this.title;
        }

        public final SubtitleContent getSubtitle_content() {
            return this.subtitle_content;
        }

        public final Button getUnscrolled_button() {
            return this.unscrolled_button;
        }

        public final Button getScrolled_button() {
            return this.scrolled_button;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CryptoAgreement(List<SignableAgreement> signable_agreements, String title, SubtitleContent subtitleContent, Button button, Button button2, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(signable_agreements, "signable_agreements");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.title = title;
            this.subtitle_content = subtitleContent;
            this.unscrolled_button = button;
            this.scrolled_button = button2;
            this.signable_agreements = Internal.immutableCopyOf("signable_agreements", signable_agreements);
        }

        public final List<SignableAgreement> getSignable_agreements() {
            return this.signable_agreements;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m8933newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CryptoAgreement)) {
                return false;
            }
            CryptoAgreement cryptoAgreement = (CryptoAgreement) other;
            return Intrinsics.areEqual(unknownFields(), cryptoAgreement.unknownFields()) && Intrinsics.areEqual(this.signable_agreements, cryptoAgreement.signable_agreements) && Intrinsics.areEqual(this.title, cryptoAgreement.title) && Intrinsics.areEqual(this.subtitle_content, cryptoAgreement.subtitle_content) && Intrinsics.areEqual(this.unscrolled_button, cryptoAgreement.unscrolled_button) && Intrinsics.areEqual(this.scrolled_button, cryptoAgreement.scrolled_button);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((((unknownFields().hashCode() * 37) + this.signable_agreements.hashCode()) * 37) + this.title.hashCode()) * 37;
            SubtitleContent subtitleContent = this.subtitle_content;
            int iHashCode2 = (iHashCode + (subtitleContent != null ? subtitleContent.hashCode() : 0)) * 37;
            Button button = this.unscrolled_button;
            int iHashCode3 = (iHashCode2 + (button != null ? button.hashCode() : 0)) * 37;
            Button button2 = this.scrolled_button;
            int iHashCode4 = iHashCode3 + (button2 != null ? button2.hashCode() : 0);
            this.hashCode = iHashCode4;
            return iHashCode4;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.signable_agreements.isEmpty()) {
                arrayList.add("signable_agreements=" + this.signable_agreements);
            }
            arrayList.add("title=" + Internal.sanitize(this.title));
            SubtitleContent subtitleContent = this.subtitle_content;
            if (subtitleContent != null) {
                arrayList.add("subtitle_content=" + subtitleContent);
            }
            Button button = this.unscrolled_button;
            if (button != null) {
                arrayList.add("unscrolled_button=" + button);
            }
            Button button2 = this.scrolled_button;
            if (button2 != null) {
                arrayList.add("scrolled_button=" + button2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoAgreement{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ CryptoAgreement copy$default(CryptoAgreement cryptoAgreement, List list, String str, SubtitleContent subtitleContent, Button button, Button button2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = cryptoAgreement.signable_agreements;
            }
            if ((i & 2) != 0) {
                str = cryptoAgreement.title;
            }
            if ((i & 4) != 0) {
                subtitleContent = cryptoAgreement.subtitle_content;
            }
            if ((i & 8) != 0) {
                button = cryptoAgreement.unscrolled_button;
            }
            if ((i & 16) != 0) {
                button2 = cryptoAgreement.scrolled_button;
            }
            if ((i & 32) != 0) {
                byteString = cryptoAgreement.unknownFields();
            }
            Button button3 = button2;
            ByteString byteString2 = byteString;
            return cryptoAgreement.copy(list, str, subtitleContent, button, button3, byteString2);
        }

        public final CryptoAgreement copy(List<SignableAgreement> signable_agreements, String title, SubtitleContent subtitle_content, Button unscrolled_button, Button scrolled_button, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(signable_agreements, "signable_agreements");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new CryptoAgreement(signable_agreements, title, subtitle_content, unscrolled_button, scrolled_button, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoAgreement.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<CryptoAgreement>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse$CryptoAgreement$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GetCryptoUserAgreementsResponse.CryptoAgreement value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size() + GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.ADAPTER.asRepeated().encodedSizeWithTag(1, value.getSignable_agreements());
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                    }
                    int iEncodedSizeWithTag = size + GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent.ADAPTER.encodedSizeWithTag(3, value.getSubtitle_content());
                    ProtoAdapter<GetCryptoUserAgreementsResponse.CryptoAgreement.Button> protoAdapter = GetCryptoUserAgreementsResponse.CryptoAgreement.Button.ADAPTER;
                    int iEncodedSizeWithTag2 = iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(4, value.getUnscrolled_button());
                    return value.getScrolled_button() != null ? iEncodedSizeWithTag2 + protoAdapter.encodedSizeWithTag(5, value.getScrolled_button()) : iEncodedSizeWithTag2;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GetCryptoUserAgreementsResponse.CryptoAgreement value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getSignable_agreements());
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                    }
                    GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent.ADAPTER.encodeWithTag(writer, 3, (int) value.getSubtitle_content());
                    ProtoAdapter<GetCryptoUserAgreementsResponse.CryptoAgreement.Button> protoAdapter = GetCryptoUserAgreementsResponse.CryptoAgreement.Button.ADAPTER;
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getUnscrolled_button());
                    if (value.getScrolled_button() != null) {
                        protoAdapter.encodeWithTag(writer, 5, (int) value.getScrolled_button());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GetCryptoUserAgreementsResponse.CryptoAgreement value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getScrolled_button() != null) {
                        GetCryptoUserAgreementsResponse.CryptoAgreement.Button.ADAPTER.encodeWithTag(writer, 5, (int) value.getScrolled_button());
                    }
                    GetCryptoUserAgreementsResponse.CryptoAgreement.Button.ADAPTER.encodeWithTag(writer, 4, (int) value.getUnscrolled_button());
                    GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent.ADAPTER.encodeWithTag(writer, 3, (int) value.getSubtitle_content());
                    if (!Intrinsics.areEqual(value.getTitle(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                    }
                    GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.ADAPTER.asRepeated().encodeWithTag(writer, 1, (int) value.getSignable_agreements());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public GetCryptoUserAgreementsResponse.CryptoAgreement decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    ArrayList arrayList = new ArrayList();
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent subtitleContentDecode = null;
                    GetCryptoUserAgreementsResponse.CryptoAgreement.Button buttonDecode = null;
                    GetCryptoUserAgreementsResponse.CryptoAgreement.Button buttonDecode2 = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GetCryptoUserAgreementsResponse.CryptoAgreement(arrayList, strDecode, subtitleContentDecode, buttonDecode, buttonDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            arrayList.add(GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.ADAPTER.decode(reader));
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            subtitleContentDecode = GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent.ADAPTER.decode(reader);
                        } else if (iNextTag == 4) {
                            buttonDecode = GetCryptoUserAgreementsResponse.CryptoAgreement.Button.ADAPTER.decode(reader);
                        } else if (iNextTag == 5) {
                            buttonDecode2 = GetCryptoUserAgreementsResponse.CryptoAgreement.Button.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GetCryptoUserAgreementsResponse.CryptoAgreement redact(GetCryptoUserAgreementsResponse.CryptoAgreement value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    List listM26823redactElements = Internal.m26823redactElements(value.getSignable_agreements(), GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.ADAPTER);
                    GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent subtitle_content = value.getSubtitle_content();
                    GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent subtitleContentRedact = subtitle_content != null ? GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent.ADAPTER.redact(subtitle_content) : null;
                    GetCryptoUserAgreementsResponse.CryptoAgreement.Button unscrolled_button = value.getUnscrolled_button();
                    GetCryptoUserAgreementsResponse.CryptoAgreement.Button buttonRedact = unscrolled_button != null ? GetCryptoUserAgreementsResponse.CryptoAgreement.Button.ADAPTER.redact(unscrolled_button) : null;
                    GetCryptoUserAgreementsResponse.CryptoAgreement.Button scrolled_button = value.getScrolled_button();
                    return GetCryptoUserAgreementsResponse.CryptoAgreement.copy$default(value, listM26823redactElements, null, subtitleContentRedact, buttonRedact, scrolled_button != null ? GetCryptoUserAgreementsResponse.CryptoAgreement.Button.ADAPTER.redact(scrolled_button) : null, ByteString.EMPTY, 2, null);
                }
            };
        }

        /* compiled from: GetCryptoUserAgreementsResponse.kt */
        @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J4\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement;", "Lcom/squareup/wire/Message;", "", "agreement_id", "", "agreement_sha256", "agreement_content_sections", "", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getAgreement_id", "()Ljava/lang/String;", "getAgreement_sha256", "getAgreement_content_sections", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "AgreementContentSection", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class SignableAgreement extends Message {

            @JvmField
            public static final ProtoAdapter<SignableAgreement> ADAPTER;

            @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection#ADAPTER", jsonName = "agreementContentSections", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
            private final List<AgreementContentSection> agreement_content_sections;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "agreementId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String agreement_id;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "agreementSha256", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final String agreement_sha256;

            public SignableAgreement() {
                this(null, null, null, null, 15, null);
            }

            public /* synthetic */ SignableAgreement(String str, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m8935newBuilder();
            }

            public final String getAgreement_id() {
                return this.agreement_id;
            }

            public final String getAgreement_sha256() {
                return this.agreement_sha256;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SignableAgreement(String agreement_id, String agreement_sha256, List<AgreementContentSection> agreement_content_sections, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(agreement_id, "agreement_id");
                Intrinsics.checkNotNullParameter(agreement_sha256, "agreement_sha256");
                Intrinsics.checkNotNullParameter(agreement_content_sections, "agreement_content_sections");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.agreement_id = agreement_id;
                this.agreement_sha256 = agreement_sha256;
                this.agreement_content_sections = Internal.immutableCopyOf("agreement_content_sections", agreement_content_sections);
            }

            public final List<AgreementContentSection> getAgreement_content_sections() {
                return this.agreement_content_sections;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m8935newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof SignableAgreement)) {
                    return false;
                }
                SignableAgreement signableAgreement = (SignableAgreement) other;
                return Intrinsics.areEqual(unknownFields(), signableAgreement.unknownFields()) && Intrinsics.areEqual(this.agreement_id, signableAgreement.agreement_id) && Intrinsics.areEqual(this.agreement_sha256, signableAgreement.agreement_sha256) && Intrinsics.areEqual(this.agreement_content_sections, signableAgreement.agreement_content_sections);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = (((((unknownFields().hashCode() * 37) + this.agreement_id.hashCode()) * 37) + this.agreement_sha256.hashCode()) * 37) + this.agreement_content_sections.hashCode();
                this.hashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("agreement_id=" + Internal.sanitize(this.agreement_id));
                arrayList.add("agreement_sha256=" + Internal.sanitize(this.agreement_sha256));
                if (!this.agreement_content_sections.isEmpty()) {
                    arrayList.add("agreement_content_sections=" + this.agreement_content_sections);
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "SignableAgreement{", "}", 0, null, null, 56, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ SignableAgreement copy$default(SignableAgreement signableAgreement, String str, String str2, List list, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = signableAgreement.agreement_id;
                }
                if ((i & 2) != 0) {
                    str2 = signableAgreement.agreement_sha256;
                }
                if ((i & 4) != 0) {
                    list = signableAgreement.agreement_content_sections;
                }
                if ((i & 8) != 0) {
                    byteString = signableAgreement.unknownFields();
                }
                return signableAgreement.copy(str, str2, list, byteString);
            }

            public final SignableAgreement copy(String agreement_id, String agreement_sha256, List<AgreementContentSection> agreement_content_sections, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(agreement_id, "agreement_id");
                Intrinsics.checkNotNullParameter(agreement_sha256, "agreement_sha256");
                Intrinsics.checkNotNullParameter(agreement_content_sections, "agreement_content_sections");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new SignableAgreement(agreement_id, agreement_sha256, agreement_content_sections, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SignableAgreement.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<SignableAgreement>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$Companion$ADAPTER$1
                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (!Intrinsics.areEqual(value.getAgreement_id(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAgreement_id());
                        }
                        if (!Intrinsics.areEqual(value.getAgreement_sha256(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getAgreement_sha256());
                        }
                        return size + GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getAgreement_content_sections());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getAgreement_id(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAgreement_id());
                        }
                        if (!Intrinsics.areEqual(value.getAgreement_sha256(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAgreement_sha256());
                        }
                        GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getAgreement_content_sections());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getAgreement_content_sections());
                        if (!Intrinsics.areEqual(value.getAgreement_sha256(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getAgreement_sha256());
                        }
                        if (Intrinsics.areEqual(value.getAgreement_id(), "")) {
                            return;
                        }
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAgreement_id());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        ArrayList arrayList = new ArrayList();
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        String strDecode2 = "";
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement(strDecode, strDecode2, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 2) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 3) {
                                arrayList.add(GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.ADAPTER.decode(reader));
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement redact(GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.copy$default(value, null, null, Internal.m26823redactElements(value.getAgreement_content_sections(), GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.ADAPTER), ByteString.EMPTY, 3, null);
                    }
                };
            }

            /* compiled from: GetCryptoUserAgreementsResponse.kt */
            @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0019\u001a\u001bB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection;", "Lcom/squareup/wire/Message;", "", InstantRetirementAgreementComponents.MarkdownTag, "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection$Markdown;", "checkbox", "Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection$Checkbox;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection$Markdown;Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection$Checkbox;Lokio/ByteString;)V", "getMarkdown", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection$Markdown;", "getCheckbox", "()Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection$Checkbox;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "Markdown", "Checkbox", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class AgreementContentSection extends Message {

                @JvmField
                public static final ProtoAdapter<AgreementContentSection> ADAPTER;

                @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection$Checkbox#ADAPTER", oneofName = "type", schemaIndex = 1, tag = 2)
                private final Checkbox checkbox;

                @WireField(adapter = "bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection$Markdown#ADAPTER", oneofName = "type", schemaIndex = 0, tag = 1)
                private final Markdown markdown;

                public AgreementContentSection() {
                    this(null, null, null, 7, null);
                }

                @Override // com.squareup.wire.Message
                public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                    return (Message.Builder) m8936newBuilder();
                }

                public final Markdown getMarkdown() {
                    return this.markdown;
                }

                public final Checkbox getCheckbox() {
                    return this.checkbox;
                }

                public /* synthetic */ AgreementContentSection(Markdown markdown, Checkbox checkbox, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i & 1) != 0 ? null : markdown, (i & 2) != 0 ? null : checkbox, (i & 4) != 0 ? ByteString.EMPTY : byteString);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AgreementContentSection(Markdown markdown, Checkbox checkbox, ByteString unknownFields) {
                    super(ADAPTER, unknownFields);
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    this.markdown = markdown;
                    this.checkbox = checkbox;
                    if (Internal.countNonNull(markdown, checkbox) > 1) {
                        throw new IllegalArgumentException("At most one of markdown, checkbox may be non-null");
                    }
                }

                @Deprecated
                /* renamed from: newBuilder, reason: collision with other method in class */
                public /* synthetic */ Void m8936newBuilder() {
                    throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                }

                public boolean equals(Object other) {
                    if (other == this) {
                        return true;
                    }
                    if (!(other instanceof AgreementContentSection)) {
                        return false;
                    }
                    AgreementContentSection agreementContentSection = (AgreementContentSection) other;
                    return Intrinsics.areEqual(unknownFields(), agreementContentSection.unknownFields()) && Intrinsics.areEqual(this.markdown, agreementContentSection.markdown) && Intrinsics.areEqual(this.checkbox, agreementContentSection.checkbox);
                }

                public int hashCode() {
                    int i = this.hashCode;
                    if (i != 0) {
                        return i;
                    }
                    int iHashCode = unknownFields().hashCode() * 37;
                    Markdown markdown = this.markdown;
                    int iHashCode2 = (iHashCode + (markdown != null ? markdown.hashCode() : 0)) * 37;
                    Checkbox checkbox = this.checkbox;
                    int iHashCode3 = iHashCode2 + (checkbox != null ? checkbox.hashCode() : 0);
                    this.hashCode = iHashCode3;
                    return iHashCode3;
                }

                @Override // com.squareup.wire.Message
                public String toString() {
                    ArrayList arrayList = new ArrayList();
                    Markdown markdown = this.markdown;
                    if (markdown != null) {
                        arrayList.add("markdown=" + markdown);
                    }
                    Checkbox checkbox = this.checkbox;
                    if (checkbox != null) {
                        arrayList.add("checkbox=" + checkbox);
                    }
                    return CollectionsKt.joinToString$default(arrayList, ", ", "AgreementContentSection{", "}", 0, null, null, 56, null);
                }

                public final AgreementContentSection copy(Markdown markdown, Checkbox checkbox, ByteString unknownFields) {
                    Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                    return new AgreementContentSection(markdown, checkbox, unknownFields);
                }

                static {
                    final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                    final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AgreementContentSection.class);
                    final Syntax syntax = Syntax.PROTO_3;
                    ADAPTER = new ProtoAdapter<AgreementContentSection>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection$Companion$ADAPTER$1
                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // com.squareup.wire.ProtoAdapter
                        public GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection decode(ProtoReader reader) throws IOException {
                            Intrinsics.checkNotNullParameter(reader, "reader");
                            long jBeginMessage = reader.beginMessage();
                            GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown markdownDecode = null;
                            GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox checkboxDecode = null;
                            while (true) {
                                int iNextTag = reader.nextTag();
                                if (iNextTag == -1) {
                                    return new GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection(markdownDecode, checkboxDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                }
                                if (iNextTag == 1) {
                                    markdownDecode = GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown.ADAPTER.decode(reader);
                                } else if (iNextTag == 2) {
                                    checkboxDecode = GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox.ADAPTER.decode(reader);
                                } else {
                                    reader.readUnknownField(iNextTag);
                                }
                            }
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public int encodedSize(GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            return value.unknownFields().size() + GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown.ADAPTER.encodedSizeWithTag(1, value.getMarkdown()) + GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox.ADAPTER.encodedSizeWithTag(2, value.getCheckbox());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ProtoWriter writer, GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown.ADAPTER.encodeWithTag(writer, 1, (int) value.getMarkdown());
                            GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox.ADAPTER.encodeWithTag(writer, 2, (int) value.getCheckbox());
                            writer.writeBytes(value.unknownFields());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public void encode(ReverseProtoWriter writer, GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection value) throws IOException {
                            Intrinsics.checkNotNullParameter(writer, "writer");
                            Intrinsics.checkNotNullParameter(value, "value");
                            writer.writeBytes(value.unknownFields());
                            GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox.ADAPTER.encodeWithTag(writer, 2, (int) value.getCheckbox());
                            GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown.ADAPTER.encodeWithTag(writer, 1, (int) value.getMarkdown());
                        }

                        @Override // com.squareup.wire.ProtoAdapter
                        public GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection redact(GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown markdown = value.getMarkdown();
                            GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown markdownRedact = markdown != null ? GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown.ADAPTER.redact(markdown) : null;
                            GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox checkbox = value.getCheckbox();
                            return value.copy(markdownRedact, checkbox != null ? GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox.ADAPTER.redact(checkbox) : null, ByteString.EMPTY);
                        }
                    };
                }

                /* compiled from: GetCryptoUserAgreementsResponse.kt */
                @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection$Markdown;", "Lcom/squareup/wire/Message;", "", "markdown_text", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getMarkdown_text", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Markdown extends Message {

                    @JvmField
                    public static final ProtoAdapter<Markdown> ADAPTER;

                    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "markdownText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
                    private final String markdown_text;

                    /* JADX WARN: Multi-variable type inference failed */
                    public Markdown() {
                        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                    }

                    @Override // com.squareup.wire.Message
                    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                        return (Message.Builder) m8938newBuilder();
                    }

                    public final String getMarkdown_text() {
                        return this.markdown_text;
                    }

                    public /* synthetic */ Markdown(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Markdown(String markdown_text, ByteString unknownFields) {
                        super(ADAPTER, unknownFields);
                        Intrinsics.checkNotNullParameter(markdown_text, "markdown_text");
                        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                        this.markdown_text = markdown_text;
                    }

                    @Deprecated
                    /* renamed from: newBuilder, reason: collision with other method in class */
                    public /* synthetic */ Void m8938newBuilder() {
                        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                    }

                    public boolean equals(Object other) {
                        if (other == this) {
                            return true;
                        }
                        if (!(other instanceof Markdown)) {
                            return false;
                        }
                        Markdown markdown = (Markdown) other;
                        return Intrinsics.areEqual(unknownFields(), markdown.unknownFields()) && Intrinsics.areEqual(this.markdown_text, markdown.markdown_text);
                    }

                    public int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int iHashCode = (unknownFields().hashCode() * 37) + this.markdown_text.hashCode();
                        this.hashCode = iHashCode;
                        return iHashCode;
                    }

                    @Override // com.squareup.wire.Message
                    public String toString() {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("markdown_text=" + Internal.sanitize(this.markdown_text));
                        return CollectionsKt.joinToString$default(arrayList, ", ", "Markdown{", "}", 0, null, null, 56, null);
                    }

                    public static /* synthetic */ Markdown copy$default(Markdown markdown, String str, ByteString byteString, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = markdown.markdown_text;
                        }
                        if ((i & 2) != 0) {
                            byteString = markdown.unknownFields();
                        }
                        return markdown.copy(str, byteString);
                    }

                    public final Markdown copy(String markdown_text, ByteString unknownFields) {
                        Intrinsics.checkNotNullParameter(markdown_text, "markdown_text");
                        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                        return new Markdown(markdown_text, unknownFields);
                    }

                    static {
                        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Markdown.class);
                        final Syntax syntax = Syntax.PROTO_3;
                        ADAPTER = new ProtoAdapter<Markdown>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection$Markdown$Companion$ADAPTER$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.squareup.wire.ProtoAdapter
                            public GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown decode(ProtoReader reader) throws IOException {
                                Intrinsics.checkNotNullParameter(reader, "reader");
                                long jBeginMessage = reader.beginMessage();
                                String strDecode = "";
                                while (true) {
                                    int iNextTag = reader.nextTag();
                                    if (iNextTag == -1) {
                                        return new GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                    }
                                    if (iNextTag == 1) {
                                        strDecode = ProtoAdapter.STRING.decode(reader);
                                    } else {
                                        reader.readUnknownField(iNextTag);
                                    }
                                }
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public int encodedSize(GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                int size = value.unknownFields().size();
                                return !Intrinsics.areEqual(value.getMarkdown_text(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getMarkdown_text()) : size;
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ProtoWriter writer, GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown value) throws IOException {
                                Intrinsics.checkNotNullParameter(writer, "writer");
                                Intrinsics.checkNotNullParameter(value, "value");
                                if (!Intrinsics.areEqual(value.getMarkdown_text(), "")) {
                                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMarkdown_text());
                                }
                                writer.writeBytes(value.unknownFields());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ReverseProtoWriter writer, GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown value) throws IOException {
                                Intrinsics.checkNotNullParameter(writer, "writer");
                                Intrinsics.checkNotNullParameter(value, "value");
                                writer.writeBytes(value.unknownFields());
                                if (Intrinsics.areEqual(value.getMarkdown_text(), "")) {
                                    return;
                                }
                                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMarkdown_text());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown redact(GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                return GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Markdown.copy$default(value, null, ByteString.EMPTY, 1, null);
                            }
                        };
                    }
                }

                /* compiled from: GetCryptoUserAgreementsResponse.kt */
                @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection$Checkbox;", "Lcom/squareup/wire/Message;", "", "id", "", "title", "markdown_text", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getTitle", "getMarkdown_text", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
                public static final class Checkbox extends Message {

                    @JvmField
                    public static final ProtoAdapter<Checkbox> ADAPTER;

                    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
                    private final String id;

                    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "markdownText", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 4)
                    private final String markdown_text;

                    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
                    private final String title;

                    public Checkbox() {
                        this(null, null, null, null, 15, null);
                    }

                    public /* synthetic */ Checkbox(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
                    }

                    @Override // com.squareup.wire.Message
                    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                        return (Message.Builder) m8937newBuilder();
                    }

                    public final String getId() {
                        return this.id;
                    }

                    public final String getTitle() {
                        return this.title;
                    }

                    public final String getMarkdown_text() {
                        return this.markdown_text;
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public Checkbox(String id, String title, String markdown_text, ByteString unknownFields) {
                        super(ADAPTER, unknownFields);
                        Intrinsics.checkNotNullParameter(id, "id");
                        Intrinsics.checkNotNullParameter(title, "title");
                        Intrinsics.checkNotNullParameter(markdown_text, "markdown_text");
                        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                        this.id = id;
                        this.title = title;
                        this.markdown_text = markdown_text;
                    }

                    @Deprecated
                    /* renamed from: newBuilder, reason: collision with other method in class */
                    public /* synthetic */ Void m8937newBuilder() {
                        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
                    }

                    public boolean equals(Object other) {
                        if (other == this) {
                            return true;
                        }
                        if (!(other instanceof Checkbox)) {
                            return false;
                        }
                        Checkbox checkbox = (Checkbox) other;
                        return Intrinsics.areEqual(unknownFields(), checkbox.unknownFields()) && Intrinsics.areEqual(this.id, checkbox.id) && Intrinsics.areEqual(this.title, checkbox.title) && Intrinsics.areEqual(this.markdown_text, checkbox.markdown_text);
                    }

                    public int hashCode() {
                        int i = this.hashCode;
                        if (i != 0) {
                            return i;
                        }
                        int iHashCode = (((((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.title.hashCode()) * 37) + this.markdown_text.hashCode();
                        this.hashCode = iHashCode;
                        return iHashCode;
                    }

                    @Override // com.squareup.wire.Message
                    public String toString() {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add("id=" + Internal.sanitize(this.id));
                        arrayList.add("title=" + Internal.sanitize(this.title));
                        arrayList.add("markdown_text=" + Internal.sanitize(this.markdown_text));
                        return CollectionsKt.joinToString$default(arrayList, ", ", "Checkbox{", "}", 0, null, null, 56, null);
                    }

                    public static /* synthetic */ Checkbox copy$default(Checkbox checkbox, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
                        if ((i & 1) != 0) {
                            str = checkbox.id;
                        }
                        if ((i & 2) != 0) {
                            str2 = checkbox.title;
                        }
                        if ((i & 4) != 0) {
                            str3 = checkbox.markdown_text;
                        }
                        if ((i & 8) != 0) {
                            byteString = checkbox.unknownFields();
                        }
                        return checkbox.copy(str, str2, str3, byteString);
                    }

                    public final Checkbox copy(String id, String title, String markdown_text, ByteString unknownFields) {
                        Intrinsics.checkNotNullParameter(id, "id");
                        Intrinsics.checkNotNullParameter(title, "title");
                        Intrinsics.checkNotNullParameter(markdown_text, "markdown_text");
                        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                        return new Checkbox(id, title, markdown_text, unknownFields);
                    }

                    static {
                        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Checkbox.class);
                        final Syntax syntax = Syntax.PROTO_3;
                        ADAPTER = new ProtoAdapter<Checkbox>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse$CryptoAgreement$SignableAgreement$AgreementContentSection$Checkbox$Companion$ADAPTER$1
                            /* JADX WARN: Can't rename method to resolve collision */
                            @Override // com.squareup.wire.ProtoAdapter
                            public GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox decode(ProtoReader reader) throws IOException {
                                Intrinsics.checkNotNullParameter(reader, "reader");
                                long jBeginMessage = reader.beginMessage();
                                String strDecode = "";
                                String strDecode2 = "";
                                String strDecode3 = strDecode2;
                                while (true) {
                                    int iNextTag = reader.nextTag();
                                    if (iNextTag == -1) {
                                        return new GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                                    }
                                    if (iNextTag == 1) {
                                        strDecode = ProtoAdapter.STRING.decode(reader);
                                    } else if (iNextTag == 2) {
                                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                                    } else if (iNextTag == 4) {
                                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                                    } else {
                                        reader.readUnknownField(iNextTag);
                                    }
                                }
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public int encodedSize(GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                int size = value.unknownFields().size();
                                if (!Intrinsics.areEqual(value.getId(), "")) {
                                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                                }
                                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getTitle());
                                }
                                return !Intrinsics.areEqual(value.getMarkdown_text(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getMarkdown_text()) : size;
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ProtoWriter writer, GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox value) throws IOException {
                                Intrinsics.checkNotNullParameter(writer, "writer");
                                Intrinsics.checkNotNullParameter(value, "value");
                                if (!Intrinsics.areEqual(value.getId(), "")) {
                                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                                }
                                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                                }
                                if (!Intrinsics.areEqual(value.getMarkdown_text(), "")) {
                                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getMarkdown_text());
                                }
                                writer.writeBytes(value.unknownFields());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public void encode(ReverseProtoWriter writer, GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox value) throws IOException {
                                Intrinsics.checkNotNullParameter(writer, "writer");
                                Intrinsics.checkNotNullParameter(value, "value");
                                writer.writeBytes(value.unknownFields());
                                if (!Intrinsics.areEqual(value.getMarkdown_text(), "")) {
                                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getMarkdown_text());
                                }
                                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getTitle());
                                }
                                if (Intrinsics.areEqual(value.getId(), "")) {
                                    return;
                                }
                                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                            }

                            @Override // com.squareup.wire.ProtoAdapter
                            public GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox redact(GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox value) {
                                Intrinsics.checkNotNullParameter(value, "value");
                                return GetCryptoUserAgreementsResponse.CryptoAgreement.SignableAgreement.AgreementContentSection.Checkbox.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                            }
                        };
                    }
                }
            }
        }

        /* compiled from: GetCryptoUserAgreementsResponse.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J0\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$Button;", "Lcom/squareup/wire/Message;", "", "text", "", "helper_text", "analytics_identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getText", "()Ljava/lang/String;", "getHelper_text", "getAnalytics_identifier", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Button extends Message {

            @JvmField
            public static final ProtoAdapter<Button> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "analyticsIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
            private final String analytics_identifier;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "helperText", schemaIndex = 1, tag = 2)
            private final String helper_text;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
            private final String text;

            public Button() {
                this(null, null, null, null, 15, null);
            }

            public /* synthetic */ Button(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m8934newBuilder();
            }

            public final String getText() {
                return this.text;
            }

            public final String getHelper_text() {
                return this.helper_text;
            }

            public final String getAnalytics_identifier() {
                return this.analytics_identifier;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Button(String text, String str, String analytics_identifier, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(analytics_identifier, "analytics_identifier");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.text = text;
                this.helper_text = str;
                this.analytics_identifier = analytics_identifier;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m8934newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof Button)) {
                    return false;
                }
                Button button = (Button) other;
                return Intrinsics.areEqual(unknownFields(), button.unknownFields()) && Intrinsics.areEqual(this.text, button.text) && Intrinsics.areEqual(this.helper_text, button.helper_text) && Intrinsics.areEqual(this.analytics_identifier, button.analytics_identifier);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = ((unknownFields().hashCode() * 37) + this.text.hashCode()) * 37;
                String str = this.helper_text;
                int iHashCode2 = ((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.analytics_identifier.hashCode();
                this.hashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                arrayList.add("text=" + Internal.sanitize(this.text));
                String str = this.helper_text;
                if (str != null) {
                    arrayList.add("helper_text=" + Internal.sanitize(str));
                }
                arrayList.add("analytics_identifier=" + Internal.sanitize(this.analytics_identifier));
                return CollectionsKt.joinToString$default(arrayList, ", ", "Button{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ Button copy$default(Button button, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = button.text;
                }
                if ((i & 2) != 0) {
                    str2 = button.helper_text;
                }
                if ((i & 4) != 0) {
                    str3 = button.analytics_identifier;
                }
                if ((i & 8) != 0) {
                    byteString = button.unknownFields();
                }
                return button.copy(str, str2, str3, byteString);
            }

            public final Button copy(String text, String helper_text, String analytics_identifier, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(text, "text");
                Intrinsics.checkNotNullParameter(analytics_identifier, "analytics_identifier");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new Button(text, helper_text, analytics_identifier, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Button.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<Button>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse$CryptoAgreement$Button$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public GetCryptoUserAgreementsResponse.CryptoAgreement.Button decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = "";
                        String strDecode2 = null;
                        String strDecode3 = "";
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new GetCryptoUserAgreementsResponse.CryptoAgreement.Button(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 2) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 3) {
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(GetCryptoUserAgreementsResponse.CryptoAgreement.Button value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        if (!Intrinsics.areEqual(value.getText(), "")) {
                            size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getText());
                        }
                        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                        int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(2, value.getHelper_text());
                        return !Intrinsics.areEqual(value.getAnalytics_identifier(), "") ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, value.getAnalytics_identifier()) : iEncodedSizeWithTag;
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, GetCryptoUserAgreementsResponse.CryptoAgreement.Button value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        if (!Intrinsics.areEqual(value.getText(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                        }
                        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                        protoAdapter.encodeWithTag(writer, 2, (int) value.getHelper_text());
                        if (!Intrinsics.areEqual(value.getAnalytics_identifier(), "")) {
                            protoAdapter.encodeWithTag(writer, 3, (int) value.getAnalytics_identifier());
                        }
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, GetCryptoUserAgreementsResponse.CryptoAgreement.Button value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        if (!Intrinsics.areEqual(value.getAnalytics_identifier(), "")) {
                            ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAnalytics_identifier());
                        }
                        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                        protoAdapter.encodeWithTag(writer, 2, (int) value.getHelper_text());
                        if (Intrinsics.areEqual(value.getText(), "")) {
                            return;
                        }
                        protoAdapter.encodeWithTag(writer, 1, (int) value.getText());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public GetCryptoUserAgreementsResponse.CryptoAgreement.Button redact(GetCryptoUserAgreementsResponse.CryptoAgreement.Button value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return GetCryptoUserAgreementsResponse.CryptoAgreement.Button.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                    }
                };
            }
        }

        /* compiled from: GetCryptoUserAgreementsResponse.kt */
        @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J2\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lbonfire/proto/idl/crypto/v1/GetCryptoUserAgreementsResponse$CryptoAgreement$SubtitleContent;", "Lcom/squareup/wire/Message;", "", "primary_text_markdown", "", "secondary_text_markdown", "start_image_url", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getPrimary_text_markdown", "()Ljava/lang/String;", "getSecondary_text_markdown", "getStart_image_url", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.crypto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class SubtitleContent extends Message {

            @JvmField
            public static final ProtoAdapter<SubtitleContent> ADAPTER;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "primaryTextMarkdown", schemaIndex = 0, tag = 1)
            private final String primary_text_markdown;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "secondaryTextMarkdown", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
            private final String secondary_text_markdown;

            @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "startImageUrl", schemaIndex = 2, tag = 3)
            private final String start_image_url;

            public SubtitleContent() {
                this(null, null, null, null, 15, null);
            }

            @Override // com.squareup.wire.Message
            public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
                return (Message.Builder) m8939newBuilder();
            }

            public final String getPrimary_text_markdown() {
                return this.primary_text_markdown;
            }

            public final String getSecondary_text_markdown() {
                return this.secondary_text_markdown;
            }

            public /* synthetic */ SubtitleContent(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
            }

            public final String getStart_image_url() {
                return this.start_image_url;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SubtitleContent(String str, String secondary_text_markdown, String str2, ByteString unknownFields) {
                super(ADAPTER, unknownFields);
                Intrinsics.checkNotNullParameter(secondary_text_markdown, "secondary_text_markdown");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                this.primary_text_markdown = str;
                this.secondary_text_markdown = secondary_text_markdown;
                this.start_image_url = str2;
            }

            @Deprecated
            /* renamed from: newBuilder, reason: collision with other method in class */
            public /* synthetic */ Void m8939newBuilder() {
                throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
            }

            public boolean equals(Object other) {
                if (other == this) {
                    return true;
                }
                if (!(other instanceof SubtitleContent)) {
                    return false;
                }
                SubtitleContent subtitleContent = (SubtitleContent) other;
                return Intrinsics.areEqual(unknownFields(), subtitleContent.unknownFields()) && Intrinsics.areEqual(this.primary_text_markdown, subtitleContent.primary_text_markdown) && Intrinsics.areEqual(this.secondary_text_markdown, subtitleContent.secondary_text_markdown) && Intrinsics.areEqual(this.start_image_url, subtitleContent.start_image_url);
            }

            public int hashCode() {
                int i = this.hashCode;
                if (i != 0) {
                    return i;
                }
                int iHashCode = unknownFields().hashCode() * 37;
                String str = this.primary_text_markdown;
                int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 37) + this.secondary_text_markdown.hashCode()) * 37;
                String str2 = this.start_image_url;
                int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
                this.hashCode = iHashCode3;
                return iHashCode3;
            }

            @Override // com.squareup.wire.Message
            public String toString() {
                ArrayList arrayList = new ArrayList();
                String str = this.primary_text_markdown;
                if (str != null) {
                    arrayList.add("primary_text_markdown=" + Internal.sanitize(str));
                }
                arrayList.add("secondary_text_markdown=" + Internal.sanitize(this.secondary_text_markdown));
                String str2 = this.start_image_url;
                if (str2 != null) {
                    arrayList.add("start_image_url=" + Internal.sanitize(str2));
                }
                return CollectionsKt.joinToString$default(arrayList, ", ", "SubtitleContent{", "}", 0, null, null, 56, null);
            }

            public static /* synthetic */ SubtitleContent copy$default(SubtitleContent subtitleContent, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = subtitleContent.primary_text_markdown;
                }
                if ((i & 2) != 0) {
                    str2 = subtitleContent.secondary_text_markdown;
                }
                if ((i & 4) != 0) {
                    str3 = subtitleContent.start_image_url;
                }
                if ((i & 8) != 0) {
                    byteString = subtitleContent.unknownFields();
                }
                return subtitleContent.copy(str, str2, str3, byteString);
            }

            public final SubtitleContent copy(String primary_text_markdown, String secondary_text_markdown, String start_image_url, ByteString unknownFields) {
                Intrinsics.checkNotNullParameter(secondary_text_markdown, "secondary_text_markdown");
                Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
                return new SubtitleContent(primary_text_markdown, secondary_text_markdown, start_image_url, unknownFields);
            }

            static {
                final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
                final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SubtitleContent.class);
                final Syntax syntax = Syntax.PROTO_3;
                ADAPTER = new ProtoAdapter<SubtitleContent>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.crypto.v1.GetCryptoUserAgreementsResponse$CryptoAgreement$SubtitleContent$Companion$ADAPTER$1
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // com.squareup.wire.ProtoAdapter
                    public GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent decode(ProtoReader reader) throws IOException {
                        Intrinsics.checkNotNullParameter(reader, "reader");
                        long jBeginMessage = reader.beginMessage();
                        String strDecode = null;
                        String strDecode2 = "";
                        String strDecode3 = null;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                strDecode = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 2) {
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                            } else if (iNextTag == 3) {
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public int encodedSize(GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        int size = value.unknownFields().size();
                        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                        int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getPrimary_text_markdown());
                        if (!Intrinsics.areEqual(value.getSecondary_text_markdown(), "")) {
                            iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(2, value.getSecondary_text_markdown());
                        }
                        return iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(3, value.getStart_image_url());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ProtoWriter writer, GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                        protoAdapter.encodeWithTag(writer, 1, (int) value.getPrimary_text_markdown());
                        if (!Intrinsics.areEqual(value.getSecondary_text_markdown(), "")) {
                            protoAdapter.encodeWithTag(writer, 2, (int) value.getSecondary_text_markdown());
                        }
                        protoAdapter.encodeWithTag(writer, 3, (int) value.getStart_image_url());
                        writer.writeBytes(value.unknownFields());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public void encode(ReverseProtoWriter writer, GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent value) throws IOException {
                        Intrinsics.checkNotNullParameter(writer, "writer");
                        Intrinsics.checkNotNullParameter(value, "value");
                        writer.writeBytes(value.unknownFields());
                        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                        protoAdapter.encodeWithTag(writer, 3, (int) value.getStart_image_url());
                        if (!Intrinsics.areEqual(value.getSecondary_text_markdown(), "")) {
                            protoAdapter.encodeWithTag(writer, 2, (int) value.getSecondary_text_markdown());
                        }
                        protoAdapter.encodeWithTag(writer, 1, (int) value.getPrimary_text_markdown());
                    }

                    @Override // com.squareup.wire.ProtoAdapter
                    public GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent redact(GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent value) {
                        Intrinsics.checkNotNullParameter(value, "value");
                        return GetCryptoUserAgreementsResponse.CryptoAgreement.SubtitleContent.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                    }
                };
            }
        }
    }
}
