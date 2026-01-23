package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.google.protobuf.WireFormat;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes24.dex */
public final class Workflow$LinkWorkflowStartRequest extends GeneratedMessageLite<Workflow$LinkWorkflowStartRequest, C6228a> implements MessageLiteOrBuilder {
    public static final int CLIENT_CAPABILITIES_FIELD_NUMBER = 10;
    private static final Workflow$LinkWorkflowStartRequest DEFAULT_INSTANCE;
    public static final int DEVICE_METADATA_FIELD_NUMBER = 2;
    public static final int EMBEDDED_LINK_TOKEN_CONFIGURATION_FIELD_NUMBER = 14;
    public static final int FORCED_VARIANTS_FIELD_NUMBER = 8;
    public static final int IS_EAGER_START_FIELD_NUMBER = 11;
    public static final int LINK_CONFIGURATION_FIELD_NUMBER = 4;
    public static final int LINK_TOKEN_CONFIGURATION_FIELD_NUMBER = 6;
    public static final int OAUTH_CONTINUATION_FIELD_NUMBER = 7;
    public static final int OPEN_STARTED_AT_FIELD_NUMBER = 13;
    private static volatile Parser<Workflow$LinkWorkflowStartRequest> PARSER = null;
    public static final int SDK_METADATA_FIELD_NUMBER = 1;
    public static final int SESSION_HANDOFF_CONTINUATION_FIELD_NUMBER = 12;
    public static final int WORKFLOW_OVERRIDE_FIELD_NUMBER = 15;
    public static final int WORKFLOW_VERSION_OVERRIDE_FIELD_NUMBER = 5;
    private int bitField0_;
    private Configuration$ClientCapabilities clientCapabilities_;
    private Object configuration_;
    private Configuration$DeviceMetadata deviceMetadata_;
    private boolean isEagerStart_;
    private Timestamp openStartedAt_;
    private Configuration$SDKMetadata sdkMetadata_;
    private int configurationCase_ = 0;
    private MapFieldLite<String, String> forcedVariants_ = MapFieldLite.emptyMapField();
    private String workflowVersionOverride_ = "";
    private String workflowOverride_ = "";

    public static final class OAuthContinuation extends GeneratedMessageLite<OAuthContinuation, C6226a> implements MessageLiteOrBuilder {
        private static final OAuthContinuation DEFAULT_INSTANCE;
        public static final int LEGACY_FIELD_NUMBER = 3;
        public static final int LEGACY_ITEM_ADD_TOKEN_FIELD_NUMBER = 4;
        public static final int LINK_TOKEN_FIELD_NUMBER = 2;
        private static volatile Parser<OAuthContinuation> PARSER = null;
        public static final int RESPONSE_REDIRECT_URI_FIELD_NUMBER = 1;
        private int bitField0_;
        private LegacyItemAddContinuation legacyItemAddToken_;
        private LegacyContinuation legacy_;
        private String responseRedirectUri_ = "";
        private String linkToken_ = "";

        public static final class LegacyContinuation extends GeneratedMessageLite<LegacyContinuation, C6224a> implements MessageLiteOrBuilder {
            private static final LegacyContinuation DEFAULT_INSTANCE;
            public static final int OAUTH_NONCE_FIELD_NUMBER = 2;
            public static final int OAUTH_STATE_ID_FIELD_NUMBER = 1;
            private static volatile Parser<LegacyContinuation> PARSER;
            private String oauthStateId_ = "";
            private String oauthNonce_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest$OAuthContinuation$LegacyContinuation$a */
            public static final class C6224a extends GeneratedMessageLite.Builder<LegacyContinuation, C6224a> implements MessageLiteOrBuilder {
                public C6224a() {
                    super(LegacyContinuation.DEFAULT_INSTANCE);
                }

                /* renamed from: a */
                public final C6224a m1421a(String str) {
                    copyOnWrite();
                    ((LegacyContinuation) this.instance).setOauthNonce(str);
                    return this;
                }

                /* renamed from: b */
                public final C6224a m1422b(String str) {
                    copyOnWrite();
                    ((LegacyContinuation) this.instance).setOauthStateId(str);
                    return this;
                }
            }

            static {
                LegacyContinuation legacyContinuation = new LegacyContinuation();
                DEFAULT_INSTANCE = legacyContinuation;
                GeneratedMessageLite.registerDefaultInstance(LegacyContinuation.class, legacyContinuation);
            }

            private LegacyContinuation() {
            }

            private void clearOauthNonce() {
                this.oauthNonce_ = getDefaultInstance().getOauthNonce();
            }

            private void clearOauthStateId() {
                this.oauthStateId_ = getDefaultInstance().getOauthStateId();
            }

            public static LegacyContinuation getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6224a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static LegacyContinuation parseDelimitedFrom(InputStream inputStream) {
                return (LegacyContinuation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LegacyContinuation parseFrom(ByteBuffer byteBuffer) {
                return (LegacyContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<LegacyContinuation> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOauthNonce(String str) {
                str.getClass();
                this.oauthNonce_ = str;
            }

            private void setOauthNonceBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.oauthNonce_ = byteString.toStringUtf8();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setOauthStateId(String str) {
                str.getClass();
                this.oauthStateId_ = str;
            }

            private void setOauthStateIdBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.oauthStateId_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new LegacyContinuation();
                    case 2:
                        return new C6224a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"oauthStateId_", "oauthNonce_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<LegacyContinuation> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (LegacyContinuation.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return defaultInstanceBasedParser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public String getOauthNonce() {
                return this.oauthNonce_;
            }

            public ByteString getOauthNonceBytes() {
                return ByteString.copyFromUtf8(this.oauthNonce_);
            }

            public String getOauthStateId() {
                return this.oauthStateId_;
            }

            public ByteString getOauthStateIdBytes() {
                return ByteString.copyFromUtf8(this.oauthStateId_);
            }

            public static C6224a newBuilder(LegacyContinuation legacyContinuation) {
                return DEFAULT_INSTANCE.createBuilder(legacyContinuation);
            }

            public static LegacyContinuation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyContinuation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LegacyContinuation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static LegacyContinuation parseFrom(ByteString byteString) {
                return (LegacyContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static LegacyContinuation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static LegacyContinuation parseFrom(byte[] bArr) {
                return (LegacyContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static LegacyContinuation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static LegacyContinuation parseFrom(InputStream inputStream) {
                return (LegacyContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LegacyContinuation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LegacyContinuation parseFrom(CodedInputStream codedInputStream) {
                return (LegacyContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static LegacyContinuation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class LegacyItemAddContinuation extends GeneratedMessageLite<LegacyItemAddContinuation, C6225a> implements MessageLiteOrBuilder {
            private static final LegacyItemAddContinuation DEFAULT_INSTANCE;
            public static final int ITEM_ADD_TOKEN_FIELD_NUMBER = 2;
            public static final int OAUTH_STATE_ID_FIELD_NUMBER = 1;
            private static volatile Parser<LegacyItemAddContinuation> PARSER;
            private String oauthStateId_ = "";
            private String itemAddToken_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest$OAuthContinuation$LegacyItemAddContinuation$a */
            public static final class C6225a extends GeneratedMessageLite.Builder<LegacyItemAddContinuation, C6225a> implements MessageLiteOrBuilder {
                public C6225a() {
                    super(LegacyItemAddContinuation.DEFAULT_INSTANCE);
                }
            }

            static {
                LegacyItemAddContinuation legacyItemAddContinuation = new LegacyItemAddContinuation();
                DEFAULT_INSTANCE = legacyItemAddContinuation;
                GeneratedMessageLite.registerDefaultInstance(LegacyItemAddContinuation.class, legacyItemAddContinuation);
            }

            private LegacyItemAddContinuation() {
            }

            private void clearItemAddToken() {
                this.itemAddToken_ = getDefaultInstance().getItemAddToken();
            }

            private void clearOauthStateId() {
                this.oauthStateId_ = getDefaultInstance().getOauthStateId();
            }

            public static LegacyItemAddContinuation getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6225a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static LegacyItemAddContinuation parseDelimitedFrom(InputStream inputStream) {
                return (LegacyItemAddContinuation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LegacyItemAddContinuation parseFrom(ByteBuffer byteBuffer) {
                return (LegacyItemAddContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<LegacyItemAddContinuation> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setItemAddToken(String str) {
                str.getClass();
                this.itemAddToken_ = str;
            }

            private void setItemAddTokenBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.itemAddToken_ = byteString.toStringUtf8();
            }

            private void setOauthStateId(String str) {
                str.getClass();
                this.oauthStateId_ = str;
            }

            private void setOauthStateIdBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.oauthStateId_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new LegacyItemAddContinuation();
                    case 2:
                        return new C6225a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"oauthStateId_", "itemAddToken_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<LegacyItemAddContinuation> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (LegacyItemAddContinuation.class) {
                            try {
                                defaultInstanceBasedParser = PARSER;
                                if (defaultInstanceBasedParser == null) {
                                    defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                    PARSER = defaultInstanceBasedParser;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return defaultInstanceBasedParser;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            public String getItemAddToken() {
                return this.itemAddToken_;
            }

            public ByteString getItemAddTokenBytes() {
                return ByteString.copyFromUtf8(this.itemAddToken_);
            }

            public String getOauthStateId() {
                return this.oauthStateId_;
            }

            public ByteString getOauthStateIdBytes() {
                return ByteString.copyFromUtf8(this.oauthStateId_);
            }

            public static C6225a newBuilder(LegacyItemAddContinuation legacyItemAddContinuation) {
                return DEFAULT_INSTANCE.createBuilder(legacyItemAddContinuation);
            }

            public static LegacyItemAddContinuation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyItemAddContinuation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LegacyItemAddContinuation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyItemAddContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static LegacyItemAddContinuation parseFrom(ByteString byteString) {
                return (LegacyItemAddContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static LegacyItemAddContinuation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyItemAddContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static LegacyItemAddContinuation parseFrom(byte[] bArr) {
                return (LegacyItemAddContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static LegacyItemAddContinuation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyItemAddContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static LegacyItemAddContinuation parseFrom(InputStream inputStream) {
                return (LegacyItemAddContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static LegacyItemAddContinuation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyItemAddContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static LegacyItemAddContinuation parseFrom(CodedInputStream codedInputStream) {
                return (LegacyItemAddContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static LegacyItemAddContinuation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (LegacyItemAddContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        static {
            OAuthContinuation oAuthContinuation = new OAuthContinuation();
            DEFAULT_INSTANCE = oAuthContinuation;
            GeneratedMessageLite.registerDefaultInstance(OAuthContinuation.class, oAuthContinuation);
        }

        private OAuthContinuation() {
        }

        private void clearLegacy() {
            this.legacy_ = null;
            this.bitField0_ &= -2;
        }

        private void clearLegacyItemAddToken() {
            this.legacyItemAddToken_ = null;
            this.bitField0_ &= -3;
        }

        private void clearLinkToken() {
            this.linkToken_ = getDefaultInstance().getLinkToken();
        }

        private void clearResponseRedirectUri() {
            this.responseRedirectUri_ = getDefaultInstance().getResponseRedirectUri();
        }

        public static OAuthContinuation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeLegacy(LegacyContinuation legacyContinuation) {
            legacyContinuation.getClass();
            LegacyContinuation legacyContinuation2 = this.legacy_;
            if (legacyContinuation2 == null || legacyContinuation2 == LegacyContinuation.getDefaultInstance()) {
                this.legacy_ = legacyContinuation;
            } else {
                this.legacy_ = LegacyContinuation.newBuilder(this.legacy_).mergeFrom((LegacyContinuation.C6224a) legacyContinuation).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeLegacyItemAddToken(LegacyItemAddContinuation legacyItemAddContinuation) {
            legacyItemAddContinuation.getClass();
            LegacyItemAddContinuation legacyItemAddContinuation2 = this.legacyItemAddToken_;
            if (legacyItemAddContinuation2 == null || legacyItemAddContinuation2 == LegacyItemAddContinuation.getDefaultInstance()) {
                this.legacyItemAddToken_ = legacyItemAddContinuation;
            } else {
                this.legacyItemAddToken_ = LegacyItemAddContinuation.newBuilder(this.legacyItemAddToken_).mergeFrom((LegacyItemAddContinuation.C6225a) legacyItemAddContinuation).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static C6226a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OAuthContinuation parseDelimitedFrom(InputStream inputStream) {
            return (OAuthContinuation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OAuthContinuation parseFrom(ByteBuffer byteBuffer) {
            return (OAuthContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OAuthContinuation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLegacy(LegacyContinuation legacyContinuation) {
            legacyContinuation.getClass();
            this.legacy_ = legacyContinuation;
            this.bitField0_ |= 1;
        }

        private void setLegacyItemAddToken(LegacyItemAddContinuation legacyItemAddContinuation) {
            legacyItemAddContinuation.getClass();
            this.legacyItemAddToken_ = legacyItemAddContinuation;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLinkToken(String str) {
            str.getClass();
            this.linkToken_ = str;
        }

        private void setLinkTokenBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.linkToken_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setResponseRedirectUri(String str) {
            str.getClass();
            this.responseRedirectUri_ = str;
        }

        private void setResponseRedirectUriBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.responseRedirectUri_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OAuthContinuation();
                case 2:
                    return new C6226a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "responseRedirectUri_", "linkToken_", "legacy_", "legacyItemAddToken_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OAuthContinuation> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (OAuthContinuation.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public LegacyContinuation getLegacy() {
            LegacyContinuation legacyContinuation = this.legacy_;
            return legacyContinuation == null ? LegacyContinuation.getDefaultInstance() : legacyContinuation;
        }

        public LegacyItemAddContinuation getLegacyItemAddToken() {
            LegacyItemAddContinuation legacyItemAddContinuation = this.legacyItemAddToken_;
            return legacyItemAddContinuation == null ? LegacyItemAddContinuation.getDefaultInstance() : legacyItemAddContinuation;
        }

        public String getLinkToken() {
            return this.linkToken_;
        }

        public ByteString getLinkTokenBytes() {
            return ByteString.copyFromUtf8(this.linkToken_);
        }

        public String getResponseRedirectUri() {
            return this.responseRedirectUri_;
        }

        public ByteString getResponseRedirectUriBytes() {
            return ByteString.copyFromUtf8(this.responseRedirectUri_);
        }

        public boolean hasLegacy() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasLegacyItemAddToken() {
            return (this.bitField0_ & 2) != 0;
        }

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest$OAuthContinuation$a */
        public static final class C6226a extends GeneratedMessageLite.Builder<OAuthContinuation, C6226a> implements MessageLiteOrBuilder {
            public C6226a() {
                super(OAuthContinuation.DEFAULT_INSTANCE);
            }

            /* renamed from: a */
            public final C6226a m1424a(String str) {
                copyOnWrite();
                ((OAuthContinuation) this.instance).setLinkToken(str);
                return this;
            }

            /* renamed from: b */
            public final C6226a m1425b(String str) {
                copyOnWrite();
                ((OAuthContinuation) this.instance).setResponseRedirectUri(str);
                return this;
            }

            /* renamed from: a */
            public final C6226a m1423a(LegacyContinuation.C6224a c6224a) {
                copyOnWrite();
                ((OAuthContinuation) this.instance).setLegacy(c6224a.build());
                return this;
            }
        }

        public static C6226a newBuilder(OAuthContinuation oAuthContinuation) {
            return DEFAULT_INSTANCE.createBuilder(oAuthContinuation);
        }

        public static OAuthContinuation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthContinuation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OAuthContinuation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OAuthContinuation parseFrom(ByteString byteString) {
            return (OAuthContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OAuthContinuation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OAuthContinuation parseFrom(byte[] bArr) {
            return (OAuthContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OAuthContinuation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OAuthContinuation parseFrom(InputStream inputStream) {
            return (OAuthContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OAuthContinuation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OAuthContinuation parseFrom(CodedInputStream codedInputStream) {
            return (OAuthContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OAuthContinuation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OAuthContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SessionHandoffContinuation extends GeneratedMessageLite<SessionHandoffContinuation, C6227a> implements MessageLiteOrBuilder {
        public static final int CONTINUATION_TOKEN_FIELD_NUMBER = 2;
        private static final SessionHandoffContinuation DEFAULT_INSTANCE;
        private static volatile Parser<SessionHandoffContinuation> PARSER = null;
        public static final int WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
        private String workflowSessionId_ = "";
        private String continuationToken_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest$SessionHandoffContinuation$a */
        public static final class C6227a extends GeneratedMessageLite.Builder<SessionHandoffContinuation, C6227a> implements MessageLiteOrBuilder {
            public C6227a() {
                super(SessionHandoffContinuation.DEFAULT_INSTANCE);
            }
        }

        static {
            SessionHandoffContinuation sessionHandoffContinuation = new SessionHandoffContinuation();
            DEFAULT_INSTANCE = sessionHandoffContinuation;
            GeneratedMessageLite.registerDefaultInstance(SessionHandoffContinuation.class, sessionHandoffContinuation);
        }

        private SessionHandoffContinuation() {
        }

        private void clearContinuationToken() {
            this.continuationToken_ = getDefaultInstance().getContinuationToken();
        }

        private void clearWorkflowSessionId() {
            this.workflowSessionId_ = getDefaultInstance().getWorkflowSessionId();
        }

        public static SessionHandoffContinuation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6227a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SessionHandoffContinuation parseDelimitedFrom(InputStream inputStream) {
            return (SessionHandoffContinuation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionHandoffContinuation parseFrom(ByteBuffer byteBuffer) {
            return (SessionHandoffContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SessionHandoffContinuation> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setContinuationToken(String str) {
            str.getClass();
            this.continuationToken_ = str;
        }

        private void setContinuationTokenBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.continuationToken_ = byteString.toStringUtf8();
        }

        private void setWorkflowSessionId(String str) {
            str.getClass();
            this.workflowSessionId_ = str;
        }

        private void setWorkflowSessionIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.workflowSessionId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SessionHandoffContinuation();
                case 2:
                    return new C6227a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"workflowSessionId_", "continuationToken_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SessionHandoffContinuation> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SessionHandoffContinuation.class) {
                        try {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public String getContinuationToken() {
            return this.continuationToken_;
        }

        public ByteString getContinuationTokenBytes() {
            return ByteString.copyFromUtf8(this.continuationToken_);
        }

        public String getWorkflowSessionId() {
            return this.workflowSessionId_;
        }

        public ByteString getWorkflowSessionIdBytes() {
            return ByteString.copyFromUtf8(this.workflowSessionId_);
        }

        public static C6227a newBuilder(SessionHandoffContinuation sessionHandoffContinuation) {
            return DEFAULT_INSTANCE.createBuilder(sessionHandoffContinuation);
        }

        public static SessionHandoffContinuation parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionHandoffContinuation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SessionHandoffContinuation parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionHandoffContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SessionHandoffContinuation parseFrom(ByteString byteString) {
            return (SessionHandoffContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SessionHandoffContinuation parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionHandoffContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SessionHandoffContinuation parseFrom(byte[] bArr) {
            return (SessionHandoffContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SessionHandoffContinuation parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionHandoffContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SessionHandoffContinuation parseFrom(InputStream inputStream) {
            return (SessionHandoffContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SessionHandoffContinuation parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionHandoffContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SessionHandoffContinuation parseFrom(CodedInputStream codedInputStream) {
            return (SessionHandoffContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SessionHandoffContinuation parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionHandoffContinuation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest$b */
    public enum EnumC6229b {
        LINK_CONFIGURATION(4),
        LINK_TOKEN_CONFIGURATION(6),
        OAUTH_CONTINUATION(7),
        SESSION_HANDOFF_CONTINUATION(12),
        EMBEDDED_LINK_TOKEN_CONFIGURATION(14),
        CONFIGURATION_NOT_SET(0);


        /* renamed from: a */
        public final int f2117a;

        EnumC6229b(int i) {
            this.f2117a = i;
        }

        public static EnumC6229b forNumber(int i) {
            if (i == 0) {
                return CONFIGURATION_NOT_SET;
            }
            if (i == 4) {
                return LINK_CONFIGURATION;
            }
            if (i == 12) {
                return SESSION_HANDOFF_CONTINUATION;
            }
            if (i == 14) {
                return EMBEDDED_LINK_TOKEN_CONFIGURATION;
            }
            if (i == 6) {
                return LINK_TOKEN_CONFIGURATION;
            }
            if (i != 7) {
                return null;
            }
            return OAUTH_CONTINUATION;
        }

        public int getNumber() {
            return this.f2117a;
        }

        @Deprecated
        public static EnumC6229b valueOf(int i) {
            return forNumber(i);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest$c */
    public static final class C6230c {

        /* renamed from: a */
        public static final MapEntryLite<String, String> f2118a;

        static {
            WireFormat.FieldType fieldType = WireFormat.FieldType.STRING;
            f2118a = MapEntryLite.newDefaultInstance(fieldType, "", fieldType, "");
        }
    }

    static {
        Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest = new Workflow$LinkWorkflowStartRequest();
        DEFAULT_INSTANCE = workflow$LinkWorkflowStartRequest;
        GeneratedMessageLite.registerDefaultInstance(Workflow$LinkWorkflowStartRequest.class, workflow$LinkWorkflowStartRequest);
    }

    private Workflow$LinkWorkflowStartRequest() {
    }

    private void clearClientCapabilities() {
        this.clientCapabilities_ = null;
        this.bitField0_ &= -5;
    }

    private void clearConfiguration() {
        this.configurationCase_ = 0;
        this.configuration_ = null;
    }

    private void clearDeviceMetadata() {
        this.deviceMetadata_ = null;
        this.bitField0_ &= -3;
    }

    private void clearEmbeddedLinkTokenConfiguration() {
        if (this.configurationCase_ == 14) {
            this.configurationCase_ = 0;
            this.configuration_ = null;
        }
    }

    private void clearIsEagerStart() {
        this.isEagerStart_ = false;
    }

    private void clearLinkConfiguration() {
        if (this.configurationCase_ == 4) {
            this.configurationCase_ = 0;
            this.configuration_ = null;
        }
    }

    private void clearLinkTokenConfiguration() {
        if (this.configurationCase_ == 6) {
            this.configurationCase_ = 0;
            this.configuration_ = null;
        }
    }

    private void clearOauthContinuation() {
        if (this.configurationCase_ == 7) {
            this.configurationCase_ = 0;
            this.configuration_ = null;
        }
    }

    private void clearOpenStartedAt() {
        this.openStartedAt_ = null;
        this.bitField0_ &= -9;
    }

    private void clearSdkMetadata() {
        this.sdkMetadata_ = null;
        this.bitField0_ &= -2;
    }

    private void clearSessionHandoffContinuation() {
        if (this.configurationCase_ == 12) {
            this.configurationCase_ = 0;
            this.configuration_ = null;
        }
    }

    private void clearWorkflowOverride() {
        this.workflowOverride_ = getDefaultInstance().getWorkflowOverride();
    }

    private void clearWorkflowVersionOverride() {
        this.workflowVersionOverride_ = getDefaultInstance().getWorkflowVersionOverride();
    }

    public static Workflow$LinkWorkflowStartRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private Map<String, String> getMutableForcedVariantsMap() {
        return internalGetMutableForcedVariants();
    }

    private MapFieldLite<String, String> internalGetForcedVariants() {
        return this.forcedVariants_;
    }

    private MapFieldLite<String, String> internalGetMutableForcedVariants() {
        if (!this.forcedVariants_.isMutable()) {
            this.forcedVariants_ = this.forcedVariants_.mutableCopy();
        }
        return this.forcedVariants_;
    }

    private void mergeClientCapabilities(Configuration$ClientCapabilities configuration$ClientCapabilities) {
        configuration$ClientCapabilities.getClass();
        Configuration$ClientCapabilities configuration$ClientCapabilities2 = this.clientCapabilities_;
        if (configuration$ClientCapabilities2 == null || configuration$ClientCapabilities2 == Configuration$ClientCapabilities.getDefaultInstance()) {
            this.clientCapabilities_ = configuration$ClientCapabilities;
        } else {
            this.clientCapabilities_ = Configuration$ClientCapabilities.newBuilder(this.clientCapabilities_).mergeFrom((Configuration$ClientCapabilities.C6957a) configuration$ClientCapabilities).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    private void mergeDeviceMetadata(Configuration$DeviceMetadata configuration$DeviceMetadata) {
        configuration$DeviceMetadata.getClass();
        Configuration$DeviceMetadata configuration$DeviceMetadata2 = this.deviceMetadata_;
        if (configuration$DeviceMetadata2 == null || configuration$DeviceMetadata2 == Configuration$DeviceMetadata.getDefaultInstance()) {
            this.deviceMetadata_ = configuration$DeviceMetadata;
        } else {
            this.deviceMetadata_ = Configuration$DeviceMetadata.newBuilder(this.deviceMetadata_).mergeFrom((Configuration$DeviceMetadata.C6960a) configuration$DeviceMetadata).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeEmbeddedLinkTokenConfiguration(Configuration$EmbeddedLinkTokenConfiguration configuration$EmbeddedLinkTokenConfiguration) {
        configuration$EmbeddedLinkTokenConfiguration.getClass();
        if (this.configurationCase_ != 14 || this.configuration_ == Configuration$EmbeddedLinkTokenConfiguration.getDefaultInstance()) {
            this.configuration_ = configuration$EmbeddedLinkTokenConfiguration;
        } else {
            this.configuration_ = Configuration$EmbeddedLinkTokenConfiguration.newBuilder((Configuration$EmbeddedLinkTokenConfiguration) this.configuration_).mergeFrom((Configuration$EmbeddedLinkTokenConfiguration.C6968a) configuration$EmbeddedLinkTokenConfiguration).buildPartial();
        }
        this.configurationCase_ = 14;
    }

    private void mergeLinkConfiguration(Configuration$LinkConfiguration configuration$LinkConfiguration) {
        configuration$LinkConfiguration.getClass();
        if (this.configurationCase_ != 4 || this.configuration_ == Configuration$LinkConfiguration.getDefaultInstance()) {
            this.configuration_ = configuration$LinkConfiguration;
        } else {
            this.configuration_ = Configuration$LinkConfiguration.newBuilder((Configuration$LinkConfiguration) this.configuration_).mergeFrom((Configuration$LinkConfiguration.C6979b) configuration$LinkConfiguration).buildPartial();
        }
        this.configurationCase_ = 4;
    }

    private void mergeLinkTokenConfiguration(Configuration$LinkTokenConfiguration configuration$LinkTokenConfiguration) {
        configuration$LinkTokenConfiguration.getClass();
        if (this.configurationCase_ != 6 || this.configuration_ == Configuration$LinkTokenConfiguration.getDefaultInstance()) {
            this.configuration_ = configuration$LinkTokenConfiguration;
        } else {
            this.configuration_ = Configuration$LinkTokenConfiguration.newBuilder((Configuration$LinkTokenConfiguration) this.configuration_).mergeFrom((Configuration$LinkTokenConfiguration.C6981a) configuration$LinkTokenConfiguration).buildPartial();
        }
        this.configurationCase_ = 6;
    }

    private void mergeOauthContinuation(OAuthContinuation oAuthContinuation) {
        oAuthContinuation.getClass();
        if (this.configurationCase_ != 7 || this.configuration_ == OAuthContinuation.getDefaultInstance()) {
            this.configuration_ = oAuthContinuation;
        } else {
            this.configuration_ = OAuthContinuation.newBuilder((OAuthContinuation) this.configuration_).mergeFrom((OAuthContinuation.C6226a) oAuthContinuation).buildPartial();
        }
        this.configurationCase_ = 7;
    }

    private void mergeOpenStartedAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.openStartedAt_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.openStartedAt_ = timestamp;
        } else {
            this.openStartedAt_ = Timestamp.newBuilder(this.openStartedAt_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    private void mergeSdkMetadata(Configuration$SDKMetadata configuration$SDKMetadata) {
        configuration$SDKMetadata.getClass();
        Configuration$SDKMetadata configuration$SDKMetadata2 = this.sdkMetadata_;
        if (configuration$SDKMetadata2 == null || configuration$SDKMetadata2 == Configuration$SDKMetadata.getDefaultInstance()) {
            this.sdkMetadata_ = configuration$SDKMetadata;
        } else {
            this.sdkMetadata_ = Configuration$SDKMetadata.newBuilder(this.sdkMetadata_).mergeFrom((Configuration$SDKMetadata.C6985a) configuration$SDKMetadata).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeSessionHandoffContinuation(SessionHandoffContinuation sessionHandoffContinuation) {
        sessionHandoffContinuation.getClass();
        if (this.configurationCase_ != 12 || this.configuration_ == SessionHandoffContinuation.getDefaultInstance()) {
            this.configuration_ = sessionHandoffContinuation;
        } else {
            this.configuration_ = SessionHandoffContinuation.newBuilder((SessionHandoffContinuation) this.configuration_).mergeFrom((SessionHandoffContinuation.C6227a) sessionHandoffContinuation).buildPartial();
        }
        this.configurationCase_ = 12;
    }

    public static C6228a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Workflow$LinkWorkflowStartRequest parseDelimitedFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowStartRequest parseFrom(ByteBuffer byteBuffer) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Workflow$LinkWorkflowStartRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientCapabilities(Configuration$ClientCapabilities configuration$ClientCapabilities) {
        configuration$ClientCapabilities.getClass();
        this.clientCapabilities_ = configuration$ClientCapabilities;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceMetadata(Configuration$DeviceMetadata configuration$DeviceMetadata) {
        configuration$DeviceMetadata.getClass();
        this.deviceMetadata_ = configuration$DeviceMetadata;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmbeddedLinkTokenConfiguration(Configuration$EmbeddedLinkTokenConfiguration configuration$EmbeddedLinkTokenConfiguration) {
        configuration$EmbeddedLinkTokenConfiguration.getClass();
        this.configuration_ = configuration$EmbeddedLinkTokenConfiguration;
        this.configurationCase_ = 14;
    }

    private void setIsEagerStart(boolean z) {
        this.isEagerStart_ = z;
    }

    private void setLinkConfiguration(Configuration$LinkConfiguration configuration$LinkConfiguration) {
        configuration$LinkConfiguration.getClass();
        this.configuration_ = configuration$LinkConfiguration;
        this.configurationCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinkTokenConfiguration(Configuration$LinkTokenConfiguration configuration$LinkTokenConfiguration) {
        configuration$LinkTokenConfiguration.getClass();
        this.configuration_ = configuration$LinkTokenConfiguration;
        this.configurationCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOauthContinuation(OAuthContinuation oAuthContinuation) {
        oAuthContinuation.getClass();
        this.configuration_ = oAuthContinuation;
        this.configurationCase_ = 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenStartedAt(Timestamp timestamp) {
        timestamp.getClass();
        this.openStartedAt_ = timestamp;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkMetadata(Configuration$SDKMetadata configuration$SDKMetadata) {
        configuration$SDKMetadata.getClass();
        this.sdkMetadata_ = configuration$SDKMetadata;
        this.bitField0_ |= 1;
    }

    private void setSessionHandoffContinuation(SessionHandoffContinuation sessionHandoffContinuation) {
        sessionHandoffContinuation.getClass();
        this.configuration_ = sessionHandoffContinuation;
        this.configurationCase_ = 12;
    }

    private void setWorkflowOverride(String str) {
        str.getClass();
        this.workflowOverride_ = str;
    }

    private void setWorkflowOverrideBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.workflowOverride_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWorkflowVersionOverride(String str) {
        str.getClass();
        this.workflowVersionOverride_ = str;
    }

    private void setWorkflowVersionOverrideBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.workflowVersionOverride_ = byteString.toStringUtf8();
    }

    public boolean containsForcedVariants(String str) {
        str.getClass();
        return internalGetForcedVariants().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6260f.f2147a[methodToInvoke.ordinal()]) {
            case 1:
                return new Workflow$LinkWorkflowStartRequest();
            case 2:
                return new C6228a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0001\u0001\u0001\u000f\r\u0001\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0004<\u0000\u0005Ȉ\u0006<\u0000\u0007<\u0000\b2\nဉ\u0002\u000b\u0007\f<\u0000\rဉ\u0003\u000e<\u0000\u000fȈ", new Object[]{"configuration_", "configurationCase_", "bitField0_", "sdkMetadata_", "deviceMetadata_", Configuration$LinkConfiguration.class, "workflowVersionOverride_", Configuration$LinkTokenConfiguration.class, OAuthContinuation.class, "forcedVariants_", C6230c.f2118a, "clientCapabilities_", "isEagerStart_", SessionHandoffContinuation.class, "openStartedAt_", Configuration$EmbeddedLinkTokenConfiguration.class, "workflowOverride_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Workflow$LinkWorkflowStartRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Workflow$LinkWorkflowStartRequest.class) {
                    try {
                        defaultInstanceBasedParser = PARSER;
                        if (defaultInstanceBasedParser == null) {
                            defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = defaultInstanceBasedParser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return defaultInstanceBasedParser;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public Configuration$ClientCapabilities getClientCapabilities() {
        Configuration$ClientCapabilities configuration$ClientCapabilities = this.clientCapabilities_;
        return configuration$ClientCapabilities == null ? Configuration$ClientCapabilities.getDefaultInstance() : configuration$ClientCapabilities;
    }

    public EnumC6229b getConfigurationCase() {
        return EnumC6229b.forNumber(this.configurationCase_);
    }

    public Configuration$DeviceMetadata getDeviceMetadata() {
        Configuration$DeviceMetadata configuration$DeviceMetadata = this.deviceMetadata_;
        return configuration$DeviceMetadata == null ? Configuration$DeviceMetadata.getDefaultInstance() : configuration$DeviceMetadata;
    }

    public Configuration$EmbeddedLinkTokenConfiguration getEmbeddedLinkTokenConfiguration() {
        return this.configurationCase_ == 14 ? (Configuration$EmbeddedLinkTokenConfiguration) this.configuration_ : Configuration$EmbeddedLinkTokenConfiguration.getDefaultInstance();
    }

    @Deprecated
    public Map<String, String> getForcedVariants() {
        return getForcedVariantsMap();
    }

    public int getForcedVariantsCount() {
        return internalGetForcedVariants().size();
    }

    public Map<String, String> getForcedVariantsMap() {
        return Collections.unmodifiableMap(internalGetForcedVariants());
    }

    public String getForcedVariantsOrDefault(String str, String str2) {
        str.getClass();
        MapFieldLite<String, String> mapFieldLiteInternalGetForcedVariants = internalGetForcedVariants();
        return mapFieldLiteInternalGetForcedVariants.containsKey(str) ? mapFieldLiteInternalGetForcedVariants.get(str) : str2;
    }

    public String getForcedVariantsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, String> mapFieldLiteInternalGetForcedVariants = internalGetForcedVariants();
        if (mapFieldLiteInternalGetForcedVariants.containsKey(str)) {
            return mapFieldLiteInternalGetForcedVariants.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean getIsEagerStart() {
        return this.isEagerStart_;
    }

    public Configuration$LinkConfiguration getLinkConfiguration() {
        return this.configurationCase_ == 4 ? (Configuration$LinkConfiguration) this.configuration_ : Configuration$LinkConfiguration.getDefaultInstance();
    }

    public Configuration$LinkTokenConfiguration getLinkTokenConfiguration() {
        return this.configurationCase_ == 6 ? (Configuration$LinkTokenConfiguration) this.configuration_ : Configuration$LinkTokenConfiguration.getDefaultInstance();
    }

    public OAuthContinuation getOauthContinuation() {
        return this.configurationCase_ == 7 ? (OAuthContinuation) this.configuration_ : OAuthContinuation.getDefaultInstance();
    }

    public Timestamp getOpenStartedAt() {
        Timestamp timestamp = this.openStartedAt_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public Configuration$SDKMetadata getSdkMetadata() {
        Configuration$SDKMetadata configuration$SDKMetadata = this.sdkMetadata_;
        return configuration$SDKMetadata == null ? Configuration$SDKMetadata.getDefaultInstance() : configuration$SDKMetadata;
    }

    public SessionHandoffContinuation getSessionHandoffContinuation() {
        return this.configurationCase_ == 12 ? (SessionHandoffContinuation) this.configuration_ : SessionHandoffContinuation.getDefaultInstance();
    }

    public String getWorkflowOverride() {
        return this.workflowOverride_;
    }

    public ByteString getWorkflowOverrideBytes() {
        return ByteString.copyFromUtf8(this.workflowOverride_);
    }

    public String getWorkflowVersionOverride() {
        return this.workflowVersionOverride_;
    }

    public ByteString getWorkflowVersionOverrideBytes() {
        return ByteString.copyFromUtf8(this.workflowVersionOverride_);
    }

    public boolean hasClientCapabilities() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDeviceMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasEmbeddedLinkTokenConfiguration() {
        return this.configurationCase_ == 14;
    }

    public boolean hasLinkConfiguration() {
        return this.configurationCase_ == 4;
    }

    public boolean hasLinkTokenConfiguration() {
        return this.configurationCase_ == 6;
    }

    public boolean hasOauthContinuation() {
        return this.configurationCase_ == 7;
    }

    public boolean hasOpenStartedAt() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSdkMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSessionHandoffContinuation() {
        return this.configurationCase_ == 12;
    }

    /* renamed from: com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest$a */
    public static final class C6228a extends GeneratedMessageLite.Builder<Workflow$LinkWorkflowStartRequest, C6228a> implements MessageLiteOrBuilder {
        public C6228a() {
            super(Workflow$LinkWorkflowStartRequest.DEFAULT_INSTANCE);
        }

        /* renamed from: a */
        public final C6228a m1433a(Configuration$SDKMetadata configuration$SDKMetadata) {
            copyOnWrite();
            ((Workflow$LinkWorkflowStartRequest) this.instance).setSdkMetadata(configuration$SDKMetadata);
            return this;
        }

        /* renamed from: a */
        public final C6228a m1429a(Configuration$DeviceMetadata configuration$DeviceMetadata) {
            copyOnWrite();
            ((Workflow$LinkWorkflowStartRequest) this.instance).setDeviceMetadata(configuration$DeviceMetadata);
            return this;
        }

        /* renamed from: a */
        public final C6228a m1428a(Configuration$ClientCapabilities configuration$ClientCapabilities) {
            copyOnWrite();
            ((Workflow$LinkWorkflowStartRequest) this.instance).setClientCapabilities(configuration$ClientCapabilities);
            return this;
        }

        /* renamed from: a */
        public final C6228a m1432a(Configuration$LinkTokenConfiguration configuration$LinkTokenConfiguration) {
            copyOnWrite();
            ((Workflow$LinkWorkflowStartRequest) this.instance).setLinkTokenConfiguration(configuration$LinkTokenConfiguration);
            return this;
        }

        /* renamed from: a */
        public final C6228a m1431a(Configuration$LinkTokenConfiguration.C6981a c6981a) {
            copyOnWrite();
            ((Workflow$LinkWorkflowStartRequest) this.instance).setLinkTokenConfiguration(c6981a.build());
            return this;
        }

        /* renamed from: a */
        public final C6228a m1427a(OAuthContinuation.C6226a c6226a) {
            copyOnWrite();
            ((Workflow$LinkWorkflowStartRequest) this.instance).setOauthContinuation(c6226a.build());
            return this;
        }

        /* renamed from: a */
        public final C6228a m1430a(Configuration$EmbeddedLinkTokenConfiguration.C6968a c6968a) {
            copyOnWrite();
            ((Workflow$LinkWorkflowStartRequest) this.instance).setEmbeddedLinkTokenConfiguration(c6968a.build());
            return this;
        }

        /* renamed from: a */
        public final C6228a m1434a(String str) {
            copyOnWrite();
            ((Workflow$LinkWorkflowStartRequest) this.instance).setWorkflowVersionOverride(str);
            return this;
        }

        /* renamed from: a */
        public final C6228a m1426a(Timestamp timestamp) {
            copyOnWrite();
            ((Workflow$LinkWorkflowStartRequest) this.instance).setOpenStartedAt(timestamp);
            return this;
        }
    }

    public static C6228a newBuilder(Workflow$LinkWorkflowStartRequest workflow$LinkWorkflowStartRequest) {
        return DEFAULT_INSTANCE.createBuilder(workflow$LinkWorkflowStartRequest);
    }

    public static Workflow$LinkWorkflowStartRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowStartRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowStartRequest parseFrom(ByteString byteString) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Workflow$LinkWorkflowStartRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowStartRequest parseFrom(byte[] bArr) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Workflow$LinkWorkflowStartRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowStartRequest parseFrom(InputStream inputStream) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Workflow$LinkWorkflowStartRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Workflow$LinkWorkflowStartRequest parseFrom(CodedInputStream codedInputStream) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Workflow$LinkWorkflowStartRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Workflow$LinkWorkflowStartRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
