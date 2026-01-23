package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$Accordion;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$CobrandedHeaderAsset;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.EnumC7034n;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Common$SDKInternalEvent extends GeneratedMessageLite<Common$SDKInternalEvent, C6490a> implements MessageLiteOrBuilder {
    private static final Common$SDKInternalEvent DEFAULT_INSTANCE;
    public static final int HIDE_SDK_MODAL_FIELD_NUMBER = 6;
    public static final int OPEN_IOS_SDK_OAUTH_POPUP_FIELD_NUMBER = 8;
    public static final int OPEN_URL_FIELD_NUMBER = 4;
    public static final int OUT_OF_PROCESS_IOS_POPUP_FIELD_NUMBER = 1;
    private static volatile Parser<Common$SDKInternalEvent> PARSER = null;
    public static final int REQUEST_SILENT_NETWORK_AUTH_FIELD_NUMBER = 7;
    public static final int SHOW_SDK_MODAL_FIELD_NUMBER = 5;
    public static final int START_LINK_FIELD_NUMBER = 2;
    public static final int WEBVIEW_REDIRECT_URI_FIELD_NUMBER = 3;
    private Object eventType_;
    private int eventTypeCase_ = 0;
    private String webviewRedirectUri_ = "";

    public static final class OpenIosSdkOAuthPopup extends GeneratedMessageLite<OpenIosSdkOAuthPopup, C6482a> implements MessageLiteOrBuilder {
        private static final OpenIosSdkOAuthPopup DEFAULT_INSTANCE;
        public static final int IOS_SDK_POPUP_BEHAVIOR_FIELD_NUMBER = 1;
        public static final int LOGIN_URI_FIELD_NUMBER = 2;
        private static volatile Parser<OpenIosSdkOAuthPopup> PARSER;
        private int iosSdkPopupBehavior_;
        private String loginUri_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent$OpenIosSdkOAuthPopup$a */
        public static final class C6482a extends GeneratedMessageLite.Builder<OpenIosSdkOAuthPopup, C6482a> implements MessageLiteOrBuilder {
            public C6482a() {
                super(OpenIosSdkOAuthPopup.DEFAULT_INSTANCE);
            }
        }

        static {
            OpenIosSdkOAuthPopup openIosSdkOAuthPopup = new OpenIosSdkOAuthPopup();
            DEFAULT_INSTANCE = openIosSdkOAuthPopup;
            GeneratedMessageLite.registerDefaultInstance(OpenIosSdkOAuthPopup.class, openIosSdkOAuthPopup);
        }

        private OpenIosSdkOAuthPopup() {
        }

        private void clearIosSdkPopupBehavior() {
            this.iosSdkPopupBehavior_ = 0;
        }

        private void clearLoginUri() {
            this.loginUri_ = getDefaultInstance().getLoginUri();
        }

        public static OpenIosSdkOAuthPopup getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6482a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OpenIosSdkOAuthPopup parseDelimitedFrom(InputStream inputStream) {
            return (OpenIosSdkOAuthPopup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OpenIosSdkOAuthPopup parseFrom(ByteBuffer byteBuffer) {
            return (OpenIosSdkOAuthPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OpenIosSdkOAuthPopup> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setIosSdkPopupBehavior(EnumC7034n enumC7034n) {
            this.iosSdkPopupBehavior_ = enumC7034n.getNumber();
        }

        private void setIosSdkPopupBehaviorValue(int i) {
            this.iosSdkPopupBehavior_ = i;
        }

        private void setLoginUri(String str) {
            str.getClass();
            this.loginUri_ = str;
        }

        private void setLoginUriBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.loginUri_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OpenIosSdkOAuthPopup();
                case 2:
                    return new C6482a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"iosSdkPopupBehavior_", "loginUri_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OpenIosSdkOAuthPopup> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (OpenIosSdkOAuthPopup.class) {
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

        public EnumC7034n getIosSdkPopupBehavior() {
            EnumC7034n enumC7034nForNumber = EnumC7034n.forNumber(this.iosSdkPopupBehavior_);
            return enumC7034nForNumber == null ? EnumC7034n.UNRECOGNIZED : enumC7034nForNumber;
        }

        public int getIosSdkPopupBehaviorValue() {
            return this.iosSdkPopupBehavior_;
        }

        public String getLoginUri() {
            return this.loginUri_;
        }

        public ByteString getLoginUriBytes() {
            return ByteString.copyFromUtf8(this.loginUri_);
        }

        public static C6482a newBuilder(OpenIosSdkOAuthPopup openIosSdkOAuthPopup) {
            return DEFAULT_INSTANCE.createBuilder(openIosSdkOAuthPopup);
        }

        public static OpenIosSdkOAuthPopup parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenIosSdkOAuthPopup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OpenIosSdkOAuthPopup parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenIosSdkOAuthPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OpenIosSdkOAuthPopup parseFrom(ByteString byteString) {
            return (OpenIosSdkOAuthPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OpenIosSdkOAuthPopup parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenIosSdkOAuthPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OpenIosSdkOAuthPopup parseFrom(byte[] bArr) {
            return (OpenIosSdkOAuthPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OpenIosSdkOAuthPopup parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenIosSdkOAuthPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OpenIosSdkOAuthPopup parseFrom(InputStream inputStream) {
            return (OpenIosSdkOAuthPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OpenIosSdkOAuthPopup parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenIosSdkOAuthPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OpenIosSdkOAuthPopup parseFrom(CodedInputStream codedInputStream) {
            return (OpenIosSdkOAuthPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OpenIosSdkOAuthPopup parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenIosSdkOAuthPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class RequestSilentNetworkAuth extends GeneratedMessageLite<RequestSilentNetworkAuth, C6485a> implements MessageLiteOrBuilder {
        private static final RequestSilentNetworkAuth DEFAULT_INSTANCE;
        private static volatile Parser<RequestSilentNetworkAuth> PARSER = null;
        public static final int PROVE_FIELD_NUMBER = 3;
        public static final int TWILIO_FIELD_NUMBER = 2;
        public static final int VERIFICATION_ID_FIELD_NUMBER = 1;
        private Object vendorSpecificFields_;
        private int vendorSpecificFieldsCase_ = 0;
        private String verificationId_ = "";

        public static final class Prove extends GeneratedMessageLite<Prove, C6483a> implements MessageLiteOrBuilder {
            private static final Prove DEFAULT_INSTANCE;
            private static volatile Parser<Prove> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent$RequestSilentNetworkAuth$Prove$a */
            public static final class C6483a extends GeneratedMessageLite.Builder<Prove, C6483a> implements MessageLiteOrBuilder {
                public C6483a() {
                    super(Prove.DEFAULT_INSTANCE);
                }
            }

            static {
                Prove prove = new Prove();
                DEFAULT_INSTANCE = prove;
                GeneratedMessageLite.registerDefaultInstance(Prove.class, prove);
            }

            private Prove() {
            }

            public static Prove getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6483a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Prove parseDelimitedFrom(InputStream inputStream) {
                return (Prove) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Prove parseFrom(ByteBuffer byteBuffer) {
                return (Prove) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Prove> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Prove();
                    case 2:
                        return new C6483a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Prove> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Prove.class) {
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

            public static C6483a newBuilder(Prove prove) {
                return DEFAULT_INSTANCE.createBuilder(prove);
            }

            public static Prove parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Prove) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Prove parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Prove) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Prove parseFrom(ByteString byteString) {
                return (Prove) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Prove parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Prove) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Prove parseFrom(byte[] bArr) {
                return (Prove) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Prove parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Prove) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Prove parseFrom(InputStream inputStream) {
                return (Prove) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Prove parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Prove) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Prove parseFrom(CodedInputStream codedInputStream) {
                return (Prove) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Prove parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Prove) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Twilio extends GeneratedMessageLite<Twilio, C6484a> implements MessageLiteOrBuilder {
            private static final Twilio DEFAULT_INSTANCE;
            private static volatile Parser<Twilio> PARSER = null;
            public static final int REDIRECT_URI_FIELD_NUMBER = 1;
            private String redirectUri_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent$RequestSilentNetworkAuth$Twilio$a */
            public static final class C6484a extends GeneratedMessageLite.Builder<Twilio, C6484a> implements MessageLiteOrBuilder {
                public C6484a() {
                    super(Twilio.DEFAULT_INSTANCE);
                }
            }

            static {
                Twilio twilio = new Twilio();
                DEFAULT_INSTANCE = twilio;
                GeneratedMessageLite.registerDefaultInstance(Twilio.class, twilio);
            }

            private Twilio() {
            }

            private void clearRedirectUri() {
                this.redirectUri_ = getDefaultInstance().getRedirectUri();
            }

            public static Twilio getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6484a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Twilio parseDelimitedFrom(InputStream inputStream) {
                return (Twilio) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Twilio parseFrom(ByteBuffer byteBuffer) {
                return (Twilio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Twilio> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setRedirectUri(String str) {
                str.getClass();
                this.redirectUri_ = str;
            }

            private void setRedirectUriBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.redirectUri_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Twilio();
                    case 2:
                        return new C6484a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"redirectUri_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Twilio> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Twilio.class) {
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

            public String getRedirectUri() {
                return this.redirectUri_;
            }

            public ByteString getRedirectUriBytes() {
                return ByteString.copyFromUtf8(this.redirectUri_);
            }

            public static C6484a newBuilder(Twilio twilio) {
                return DEFAULT_INSTANCE.createBuilder(twilio);
            }

            public static Twilio parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Twilio) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Twilio parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Twilio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Twilio parseFrom(ByteString byteString) {
                return (Twilio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Twilio parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Twilio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Twilio parseFrom(byte[] bArr) {
                return (Twilio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Twilio parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Twilio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Twilio parseFrom(InputStream inputStream) {
                return (Twilio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Twilio parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Twilio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Twilio parseFrom(CodedInputStream codedInputStream) {
                return (Twilio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Twilio parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Twilio) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent$RequestSilentNetworkAuth$a */
        public static final class C6485a extends GeneratedMessageLite.Builder<RequestSilentNetworkAuth, C6485a> implements MessageLiteOrBuilder {
            public C6485a() {
                super(RequestSilentNetworkAuth.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent$RequestSilentNetworkAuth$b */
        public enum EnumC6486b {
            TWILIO(2),
            PROVE(3),
            VENDORSPECIFICFIELDS_NOT_SET(0);


            /* renamed from: a */
            public final int f2275a;

            EnumC6486b(int i) {
                this.f2275a = i;
            }

            public static EnumC6486b forNumber(int i) {
                if (i == 0) {
                    return VENDORSPECIFICFIELDS_NOT_SET;
                }
                if (i == 2) {
                    return TWILIO;
                }
                if (i != 3) {
                    return null;
                }
                return PROVE;
            }

            public int getNumber() {
                return this.f2275a;
            }

            @Deprecated
            public static EnumC6486b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            RequestSilentNetworkAuth requestSilentNetworkAuth = new RequestSilentNetworkAuth();
            DEFAULT_INSTANCE = requestSilentNetworkAuth;
            GeneratedMessageLite.registerDefaultInstance(RequestSilentNetworkAuth.class, requestSilentNetworkAuth);
        }

        private RequestSilentNetworkAuth() {
        }

        private void clearProve() {
            if (this.vendorSpecificFieldsCase_ == 3) {
                this.vendorSpecificFieldsCase_ = 0;
                this.vendorSpecificFields_ = null;
            }
        }

        private void clearTwilio() {
            if (this.vendorSpecificFieldsCase_ == 2) {
                this.vendorSpecificFieldsCase_ = 0;
                this.vendorSpecificFields_ = null;
            }
        }

        private void clearVendorSpecificFields() {
            this.vendorSpecificFieldsCase_ = 0;
            this.vendorSpecificFields_ = null;
        }

        private void clearVerificationId() {
            this.verificationId_ = getDefaultInstance().getVerificationId();
        }

        public static RequestSilentNetworkAuth getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeProve(Prove prove) {
            prove.getClass();
            if (this.vendorSpecificFieldsCase_ != 3 || this.vendorSpecificFields_ == Prove.getDefaultInstance()) {
                this.vendorSpecificFields_ = prove;
            } else {
                this.vendorSpecificFields_ = Prove.newBuilder((Prove) this.vendorSpecificFields_).mergeFrom((Prove.C6483a) prove).buildPartial();
            }
            this.vendorSpecificFieldsCase_ = 3;
        }

        private void mergeTwilio(Twilio twilio) {
            twilio.getClass();
            if (this.vendorSpecificFieldsCase_ != 2 || this.vendorSpecificFields_ == Twilio.getDefaultInstance()) {
                this.vendorSpecificFields_ = twilio;
            } else {
                this.vendorSpecificFields_ = Twilio.newBuilder((Twilio) this.vendorSpecificFields_).mergeFrom((Twilio.C6484a) twilio).buildPartial();
            }
            this.vendorSpecificFieldsCase_ = 2;
        }

        public static C6485a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static RequestSilentNetworkAuth parseDelimitedFrom(InputStream inputStream) {
            return (RequestSilentNetworkAuth) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RequestSilentNetworkAuth parseFrom(ByteBuffer byteBuffer) {
            return (RequestSilentNetworkAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<RequestSilentNetworkAuth> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setProve(Prove prove) {
            prove.getClass();
            this.vendorSpecificFields_ = prove;
            this.vendorSpecificFieldsCase_ = 3;
        }

        private void setTwilio(Twilio twilio) {
            twilio.getClass();
            this.vendorSpecificFields_ = twilio;
            this.vendorSpecificFieldsCase_ = 2;
        }

        private void setVerificationId(String str) {
            str.getClass();
            this.verificationId_ = str;
        }

        private void setVerificationIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.verificationId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new RequestSilentNetworkAuth();
                case 2:
                    return new C6485a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000", new Object[]{"vendorSpecificFields_", "vendorSpecificFieldsCase_", "verificationId_", Twilio.class, Prove.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RequestSilentNetworkAuth> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (RequestSilentNetworkAuth.class) {
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

        public Prove getProve() {
            return this.vendorSpecificFieldsCase_ == 3 ? (Prove) this.vendorSpecificFields_ : Prove.getDefaultInstance();
        }

        public Twilio getTwilio() {
            return this.vendorSpecificFieldsCase_ == 2 ? (Twilio) this.vendorSpecificFields_ : Twilio.getDefaultInstance();
        }

        public EnumC6486b getVendorSpecificFieldsCase() {
            return EnumC6486b.forNumber(this.vendorSpecificFieldsCase_);
        }

        public String getVerificationId() {
            return this.verificationId_;
        }

        public ByteString getVerificationIdBytes() {
            return ByteString.copyFromUtf8(this.verificationId_);
        }

        public boolean hasProve() {
            return this.vendorSpecificFieldsCase_ == 3;
        }

        public boolean hasTwilio() {
            return this.vendorSpecificFieldsCase_ == 2;
        }

        public static C6485a newBuilder(RequestSilentNetworkAuth requestSilentNetworkAuth) {
            return DEFAULT_INSTANCE.createBuilder(requestSilentNetworkAuth);
        }

        public static RequestSilentNetworkAuth parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RequestSilentNetworkAuth) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RequestSilentNetworkAuth parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (RequestSilentNetworkAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RequestSilentNetworkAuth parseFrom(ByteString byteString) {
            return (RequestSilentNetworkAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RequestSilentNetworkAuth parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (RequestSilentNetworkAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RequestSilentNetworkAuth parseFrom(byte[] bArr) {
            return (RequestSilentNetworkAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RequestSilentNetworkAuth parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (RequestSilentNetworkAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RequestSilentNetworkAuth parseFrom(InputStream inputStream) {
            return (RequestSilentNetworkAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RequestSilentNetworkAuth parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RequestSilentNetworkAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RequestSilentNetworkAuth parseFrom(CodedInputStream codedInputStream) {
            return (RequestSilentNetworkAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RequestSilentNetworkAuth parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (RequestSilentNetworkAuth) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SDKModal extends GeneratedMessageLite<SDKModal, C6487a> implements MessageLiteOrBuilder {
        public static final int ACCORDION_FIELD_NUMBER = 5;
        public static final int COBRANDED_LOGO_FIELD_NUMBER = 2;
        public static final int CONTENT_FIELD_NUMBER = 4;
        private static final SDKModal DEFAULT_INSTANCE;
        public static final int IMAGE_FIELD_NUMBER = 1;
        private static volatile Parser<SDKModal> PARSER = null;
        public static final int PRIMARY_BUTTON_FIELD_NUMBER = 6;
        public static final int TITLE_FIELD_NUMBER = 3;
        private Common$Accordion accordion_;
        private int bitField0_;
        private Common$LocalizedString content_;
        private int headerImageCase_ = 0;
        private Object headerImage_;
        private Common$ButtonContent primaryButton_;
        private Common$LocalizedString title_;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent$SDKModal$a */
        public static final class C6487a extends GeneratedMessageLite.Builder<SDKModal, C6487a> implements MessageLiteOrBuilder {
            public C6487a() {
                super(SDKModal.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent$SDKModal$b */
        public enum EnumC6488b {
            IMAGE(1),
            COBRANDED_LOGO(2),
            HEADERIMAGE_NOT_SET(0);


            /* renamed from: a */
            public final int f2277a;

            EnumC6488b(int i) {
                this.f2277a = i;
            }

            public static EnumC6488b forNumber(int i) {
                if (i == 0) {
                    return HEADERIMAGE_NOT_SET;
                }
                if (i == 1) {
                    return IMAGE;
                }
                if (i != 2) {
                    return null;
                }
                return COBRANDED_LOGO;
            }

            public int getNumber() {
                return this.f2277a;
            }

            @Deprecated
            public static EnumC6488b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            SDKModal sDKModal = new SDKModal();
            DEFAULT_INSTANCE = sDKModal;
            GeneratedMessageLite.registerDefaultInstance(SDKModal.class, sDKModal);
        }

        private SDKModal() {
        }

        private void clearAccordion() {
            this.accordion_ = null;
            this.bitField0_ &= -5;
        }

        private void clearCobrandedLogo() {
            if (this.headerImageCase_ == 2) {
                this.headerImageCase_ = 0;
                this.headerImage_ = null;
            }
        }

        private void clearContent() {
            this.content_ = null;
            this.bitField0_ &= -3;
        }

        private void clearHeaderImage() {
            this.headerImageCase_ = 0;
            this.headerImage_ = null;
        }

        private void clearImage() {
            if (this.headerImageCase_ == 1) {
                this.headerImageCase_ = 0;
                this.headerImage_ = null;
            }
        }

        private void clearPrimaryButton() {
            this.primaryButton_ = null;
            this.bitField0_ &= -9;
        }

        private void clearTitle() {
            this.title_ = null;
            this.bitField0_ &= -2;
        }

        public static SDKModal getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAccordion(Common$Accordion common$Accordion) {
            common$Accordion.getClass();
            Common$Accordion common$Accordion2 = this.accordion_;
            if (common$Accordion2 == null || common$Accordion2 == Common$Accordion.getDefaultInstance()) {
                this.accordion_ = common$Accordion;
            } else {
                this.accordion_ = Common$Accordion.newBuilder(this.accordion_).mergeFrom((Common$Accordion.C6383a) common$Accordion).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        private void mergeCobrandedLogo(Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
            common$CobrandedHeaderAsset.getClass();
            if (this.headerImageCase_ != 2 || this.headerImage_ == Common$CobrandedHeaderAsset.getDefaultInstance()) {
                this.headerImage_ = common$CobrandedHeaderAsset;
            } else {
                this.headerImage_ = Common$CobrandedHeaderAsset.newBuilder((Common$CobrandedHeaderAsset) this.headerImage_).mergeFrom((Common$CobrandedHeaderAsset.C6415a) common$CobrandedHeaderAsset).buildPartial();
            }
            this.headerImageCase_ = 2;
        }

        private void mergeContent(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.content_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
                this.content_ = common$LocalizedString;
            } else {
                this.content_ = Common$LocalizedString.newBuilder(this.content_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeImage(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            if (this.headerImageCase_ != 1 || this.headerImage_ == Common$RenderedAssetAppearance.getDefaultInstance()) {
                this.headerImage_ = common$RenderedAssetAppearance;
            } else {
                this.headerImage_ = Common$RenderedAssetAppearance.newBuilder((Common$RenderedAssetAppearance) this.headerImage_).mergeFrom((Common$RenderedAssetAppearance.C6475a) common$RenderedAssetAppearance).buildPartial();
            }
            this.headerImageCase_ = 1;
        }

        private void mergePrimaryButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            Common$ButtonContent common$ButtonContent2 = this.primaryButton_;
            if (common$ButtonContent2 == null || common$ButtonContent2 == Common$ButtonContent.getDefaultInstance()) {
                this.primaryButton_ = common$ButtonContent;
            } else {
                this.primaryButton_ = Common$ButtonContent.newBuilder(this.primaryButton_).mergeFrom((Common$ButtonContent.C6409a) common$ButtonContent).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        private void mergeTitle(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            Common$LocalizedString common$LocalizedString2 = this.title_;
            if (common$LocalizedString2 == null || common$LocalizedString2 == Common$LocalizedString.getDefaultInstance()) {
                this.title_ = common$LocalizedString;
            } else {
                this.title_ = Common$LocalizedString.newBuilder(this.title_).mergeFrom((Common$LocalizedString.C6442a) common$LocalizedString).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C6487a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SDKModal parseDelimitedFrom(InputStream inputStream) {
            return (SDKModal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SDKModal parseFrom(ByteBuffer byteBuffer) {
            return (SDKModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SDKModal> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAccordion(Common$Accordion common$Accordion) {
            common$Accordion.getClass();
            this.accordion_ = common$Accordion;
            this.bitField0_ |= 4;
        }

        private void setCobrandedLogo(Common$CobrandedHeaderAsset common$CobrandedHeaderAsset) {
            common$CobrandedHeaderAsset.getClass();
            this.headerImage_ = common$CobrandedHeaderAsset;
            this.headerImageCase_ = 2;
        }

        private void setContent(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.content_ = common$LocalizedString;
            this.bitField0_ |= 2;
        }

        private void setImage(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
            common$RenderedAssetAppearance.getClass();
            this.headerImage_ = common$RenderedAssetAppearance;
            this.headerImageCase_ = 1;
        }

        private void setPrimaryButton(Common$ButtonContent common$ButtonContent) {
            common$ButtonContent.getClass();
            this.primaryButton_ = common$ButtonContent;
            this.bitField0_ |= 8;
        }

        private void setTitle(Common$LocalizedString common$LocalizedString) {
            common$LocalizedString.getClass();
            this.title_ = common$LocalizedString;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SDKModal();
                case 2:
                    return new C6487a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003ဉ\u0000\u0004ဉ\u0001\u0005ဉ\u0002\u0006ဉ\u0003", new Object[]{"headerImage_", "headerImageCase_", "bitField0_", Common$RenderedAssetAppearance.class, Common$CobrandedHeaderAsset.class, "title_", "content_", "accordion_", "primaryButton_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SDKModal> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SDKModal.class) {
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

        public Common$Accordion getAccordion() {
            Common$Accordion common$Accordion = this.accordion_;
            return common$Accordion == null ? Common$Accordion.getDefaultInstance() : common$Accordion;
        }

        public Common$CobrandedHeaderAsset getCobrandedLogo() {
            return this.headerImageCase_ == 2 ? (Common$CobrandedHeaderAsset) this.headerImage_ : Common$CobrandedHeaderAsset.getDefaultInstance();
        }

        public Common$LocalizedString getContent() {
            Common$LocalizedString common$LocalizedString = this.content_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public EnumC6488b getHeaderImageCase() {
            return EnumC6488b.forNumber(this.headerImageCase_);
        }

        public Common$RenderedAssetAppearance getImage() {
            return this.headerImageCase_ == 1 ? (Common$RenderedAssetAppearance) this.headerImage_ : Common$RenderedAssetAppearance.getDefaultInstance();
        }

        public Common$ButtonContent getPrimaryButton() {
            Common$ButtonContent common$ButtonContent = this.primaryButton_;
            return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
        }

        public Common$LocalizedString getTitle() {
            Common$LocalizedString common$LocalizedString = this.title_;
            return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
        }

        public boolean hasAccordion() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasCobrandedLogo() {
            return this.headerImageCase_ == 2;
        }

        public boolean hasContent() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasImage() {
            return this.headerImageCase_ == 1;
        }

        public boolean hasPrimaryButton() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasTitle() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6487a newBuilder(SDKModal sDKModal) {
            return DEFAULT_INSTANCE.createBuilder(sDKModal);
        }

        public static SDKModal parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDKModal) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SDKModal parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SDKModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SDKModal parseFrom(ByteString byteString) {
            return (SDKModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SDKModal parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SDKModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SDKModal parseFrom(byte[] bArr) {
            return (SDKModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SDKModal parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SDKModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SDKModal parseFrom(InputStream inputStream) {
            return (SDKModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SDKModal parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDKModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SDKModal parseFrom(CodedInputStream codedInputStream) {
            return (SDKModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SDKModal parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDKModal) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class StartLink extends GeneratedMessageLite<StartLink, C6489a> implements MessageLiteOrBuilder {
        private static final StartLink DEFAULT_INSTANCE;
        public static final int LINK_TOKEN_CONFIGURATION_FIELD_NUMBER = 1;
        private static volatile Parser<StartLink> PARSER;
        private int bitField0_;
        private Configuration$LinkTokenConfiguration linkTokenConfiguration_;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent$StartLink$a */
        public static final class C6489a extends GeneratedMessageLite.Builder<StartLink, C6489a> implements MessageLiteOrBuilder {
            public C6489a() {
                super(StartLink.DEFAULT_INSTANCE);
            }
        }

        static {
            StartLink startLink = new StartLink();
            DEFAULT_INSTANCE = startLink;
            GeneratedMessageLite.registerDefaultInstance(StartLink.class, startLink);
        }

        private StartLink() {
        }

        private void clearLinkTokenConfiguration() {
            this.linkTokenConfiguration_ = null;
            this.bitField0_ &= -2;
        }

        public static StartLink getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeLinkTokenConfiguration(Configuration$LinkTokenConfiguration configuration$LinkTokenConfiguration) {
            configuration$LinkTokenConfiguration.getClass();
            Configuration$LinkTokenConfiguration configuration$LinkTokenConfiguration2 = this.linkTokenConfiguration_;
            if (configuration$LinkTokenConfiguration2 == null || configuration$LinkTokenConfiguration2 == Configuration$LinkTokenConfiguration.getDefaultInstance()) {
                this.linkTokenConfiguration_ = configuration$LinkTokenConfiguration;
            } else {
                this.linkTokenConfiguration_ = Configuration$LinkTokenConfiguration.newBuilder(this.linkTokenConfiguration_).mergeFrom((Configuration$LinkTokenConfiguration.C6981a) configuration$LinkTokenConfiguration).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C6489a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static StartLink parseDelimitedFrom(InputStream inputStream) {
            return (StartLink) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartLink parseFrom(ByteBuffer byteBuffer) {
            return (StartLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<StartLink> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setLinkTokenConfiguration(Configuration$LinkTokenConfiguration configuration$LinkTokenConfiguration) {
            configuration$LinkTokenConfiguration.getClass();
            this.linkTokenConfiguration_ = configuration$LinkTokenConfiguration;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new StartLink();
                case 2:
                    return new C6489a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "linkTokenConfiguration_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<StartLink> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (StartLink.class) {
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

        public Configuration$LinkTokenConfiguration getLinkTokenConfiguration() {
            Configuration$LinkTokenConfiguration configuration$LinkTokenConfiguration = this.linkTokenConfiguration_;
            return configuration$LinkTokenConfiguration == null ? Configuration$LinkTokenConfiguration.getDefaultInstance() : configuration$LinkTokenConfiguration;
        }

        public boolean hasLinkTokenConfiguration() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6489a newBuilder(StartLink startLink) {
            return DEFAULT_INSTANCE.createBuilder(startLink);
        }

        public static StartLink parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartLink) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartLink parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (StartLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static StartLink parseFrom(ByteString byteString) {
            return (StartLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static StartLink parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (StartLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static StartLink parseFrom(byte[] bArr) {
            return (StartLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static StartLink parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (StartLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static StartLink parseFrom(InputStream inputStream) {
            return (StartLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static StartLink parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static StartLink parseFrom(CodedInputStream codedInputStream) {
            return (StartLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static StartLink parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (StartLink) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent$a */
    public static final class C6490a extends GeneratedMessageLite.Builder<Common$SDKInternalEvent, C6490a> implements MessageLiteOrBuilder {
        public C6490a() {
            super(Common$SDKInternalEvent.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent$b */
    public enum EnumC6491b {
        OUT_OF_PROCESS_IOS_POPUP(1),
        START_LINK(2),
        OPEN_URL(4),
        SHOW_SDK_MODAL(5),
        HIDE_SDK_MODAL(6),
        REQUEST_SILENT_NETWORK_AUTH(7),
        OPEN_IOS_SDK_OAUTH_POPUP(8),
        EVENTTYPE_NOT_SET(0);


        /* renamed from: a */
        public final int f2279a;

        EnumC6491b(int i) {
            this.f2279a = i;
        }

        public static EnumC6491b forNumber(int i) {
            switch (i) {
                case 0:
                    return EVENTTYPE_NOT_SET;
                case 1:
                    return OUT_OF_PROCESS_IOS_POPUP;
                case 2:
                    return START_LINK;
                case 3:
                default:
                    return null;
                case 4:
                    return OPEN_URL;
                case 5:
                    return SHOW_SDK_MODAL;
                case 6:
                    return HIDE_SDK_MODAL;
                case 7:
                    return REQUEST_SILENT_NETWORK_AUTH;
                case 8:
                    return OPEN_IOS_SDK_OAUTH_POPUP;
            }
        }

        public int getNumber() {
            return this.f2279a;
        }

        @Deprecated
        public static EnumC6491b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Common$SDKInternalEvent common$SDKInternalEvent = new Common$SDKInternalEvent();
        DEFAULT_INSTANCE = common$SDKInternalEvent;
        GeneratedMessageLite.registerDefaultInstance(Common$SDKInternalEvent.class, common$SDKInternalEvent);
    }

    private Common$SDKInternalEvent() {
    }

    private void clearEventType() {
        this.eventTypeCase_ = 0;
        this.eventType_ = null;
    }

    private void clearHideSdkModal() {
        if (this.eventTypeCase_ == 6) {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
        }
    }

    private void clearOpenIosSdkOauthPopup() {
        if (this.eventTypeCase_ == 8) {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
        }
    }

    private void clearOpenUrl() {
        if (this.eventTypeCase_ == 4) {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
        }
    }

    private void clearOutOfProcessIosPopup() {
        if (this.eventTypeCase_ == 1) {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
        }
    }

    private void clearRequestSilentNetworkAuth() {
        if (this.eventTypeCase_ == 7) {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
        }
    }

    private void clearShowSdkModal() {
        if (this.eventTypeCase_ == 5) {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
        }
    }

    private void clearStartLink() {
        if (this.eventTypeCase_ == 2) {
            this.eventTypeCase_ = 0;
            this.eventType_ = null;
        }
    }

    private void clearWebviewRedirectUri() {
        this.webviewRedirectUri_ = getDefaultInstance().getWebviewRedirectUri();
    }

    public static Common$SDKInternalEvent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeOpenIosSdkOauthPopup(OpenIosSdkOAuthPopup openIosSdkOAuthPopup) {
        openIosSdkOAuthPopup.getClass();
        if (this.eventTypeCase_ != 8 || this.eventType_ == OpenIosSdkOAuthPopup.getDefaultInstance()) {
            this.eventType_ = openIosSdkOAuthPopup;
        } else {
            this.eventType_ = OpenIosSdkOAuthPopup.newBuilder((OpenIosSdkOAuthPopup) this.eventType_).mergeFrom((OpenIosSdkOAuthPopup.C6482a) openIosSdkOAuthPopup).buildPartial();
        }
        this.eventTypeCase_ = 8;
    }

    private void mergeOutOfProcessIosPopup(Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup outOfProcessIOSPopup) {
        outOfProcessIOSPopup.getClass();
        if (this.eventTypeCase_ != 1 || this.eventType_ == Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup.getDefaultInstance()) {
            this.eventType_ = outOfProcessIOSPopup;
        } else {
            this.eventType_ = Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup.newBuilder((Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup) this.eventType_).mergeFrom((Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup.C6451a) outOfProcessIOSPopup).buildPartial();
        }
        this.eventTypeCase_ = 1;
    }

    private void mergeRequestSilentNetworkAuth(RequestSilentNetworkAuth requestSilentNetworkAuth) {
        requestSilentNetworkAuth.getClass();
        if (this.eventTypeCase_ != 7 || this.eventType_ == RequestSilentNetworkAuth.getDefaultInstance()) {
            this.eventType_ = requestSilentNetworkAuth;
        } else {
            this.eventType_ = RequestSilentNetworkAuth.newBuilder((RequestSilentNetworkAuth) this.eventType_).mergeFrom((RequestSilentNetworkAuth.C6485a) requestSilentNetworkAuth).buildPartial();
        }
        this.eventTypeCase_ = 7;
    }

    private void mergeShowSdkModal(SDKModal sDKModal) {
        sDKModal.getClass();
        if (this.eventTypeCase_ != 5 || this.eventType_ == SDKModal.getDefaultInstance()) {
            this.eventType_ = sDKModal;
        } else {
            this.eventType_ = SDKModal.newBuilder((SDKModal) this.eventType_).mergeFrom((SDKModal.C6487a) sDKModal).buildPartial();
        }
        this.eventTypeCase_ = 5;
    }

    private void mergeStartLink(StartLink startLink) {
        startLink.getClass();
        if (this.eventTypeCase_ != 2 || this.eventType_ == StartLink.getDefaultInstance()) {
            this.eventType_ = startLink;
        } else {
            this.eventType_ = StartLink.newBuilder((StartLink) this.eventType_).mergeFrom((StartLink.C6489a) startLink).buildPartial();
        }
        this.eventTypeCase_ = 2;
    }

    public static C6490a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$SDKInternalEvent parseDelimitedFrom(InputStream inputStream) {
        return (Common$SDKInternalEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SDKInternalEvent parseFrom(ByteBuffer byteBuffer) {
        return (Common$SDKInternalEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$SDKInternalEvent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setHideSdkModal(boolean z) {
        this.eventTypeCase_ = 6;
        this.eventType_ = Boolean.valueOf(z);
    }

    private void setOpenIosSdkOauthPopup(OpenIosSdkOAuthPopup openIosSdkOAuthPopup) {
        openIosSdkOAuthPopup.getClass();
        this.eventType_ = openIosSdkOAuthPopup;
        this.eventTypeCase_ = 8;
    }

    private void setOpenUrl(String str) {
        str.getClass();
        this.eventTypeCase_ = 4;
        this.eventType_ = str;
    }

    private void setOpenUrlBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.eventType_ = byteString.toStringUtf8();
        this.eventTypeCase_ = 4;
    }

    private void setOutOfProcessIosPopup(Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup outOfProcessIOSPopup) {
        outOfProcessIOSPopup.getClass();
        this.eventType_ = outOfProcessIOSPopup;
        this.eventTypeCase_ = 1;
    }

    private void setRequestSilentNetworkAuth(RequestSilentNetworkAuth requestSilentNetworkAuth) {
        requestSilentNetworkAuth.getClass();
        this.eventType_ = requestSilentNetworkAuth;
        this.eventTypeCase_ = 7;
    }

    private void setShowSdkModal(SDKModal sDKModal) {
        sDKModal.getClass();
        this.eventType_ = sDKModal;
        this.eventTypeCase_ = 5;
    }

    private void setStartLink(StartLink startLink) {
        startLink.getClass();
        this.eventType_ = startLink;
        this.eventTypeCase_ = 2;
    }

    private void setWebviewRedirectUri(String str) {
        str.getClass();
        this.webviewRedirectUri_ = str;
    }

    private void setWebviewRedirectUriBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.webviewRedirectUri_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$SDKInternalEvent();
            case 2:
                return new C6490a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003Ȉ\u0004Ȼ\u0000\u0005<\u0000\u0006:\u0000\u0007<\u0000\b<\u0000", new Object[]{"eventType_", "eventTypeCase_", Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup.class, StartLink.class, "webviewRedirectUri_", SDKModal.class, RequestSilentNetworkAuth.class, OpenIosSdkOAuthPopup.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$SDKInternalEvent> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$SDKInternalEvent.class) {
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

    public EnumC6491b getEventTypeCase() {
        return EnumC6491b.forNumber(this.eventTypeCase_);
    }

    public boolean getHideSdkModal() {
        if (this.eventTypeCase_ == 6) {
            return ((Boolean) this.eventType_).booleanValue();
        }
        return false;
    }

    public OpenIosSdkOAuthPopup getOpenIosSdkOauthPopup() {
        return this.eventTypeCase_ == 8 ? (OpenIosSdkOAuthPopup) this.eventType_ : OpenIosSdkOAuthPopup.getDefaultInstance();
    }

    public Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup getOutOfProcessIosPopup() {
        return this.eventTypeCase_ == 1 ? (Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup) this.eventType_ : Common$OutOfProcessIOSPopupOptions.OutOfProcessIOSPopup.getDefaultInstance();
    }

    public RequestSilentNetworkAuth getRequestSilentNetworkAuth() {
        return this.eventTypeCase_ == 7 ? (RequestSilentNetworkAuth) this.eventType_ : RequestSilentNetworkAuth.getDefaultInstance();
    }

    public SDKModal getShowSdkModal() {
        return this.eventTypeCase_ == 5 ? (SDKModal) this.eventType_ : SDKModal.getDefaultInstance();
    }

    public StartLink getStartLink() {
        return this.eventTypeCase_ == 2 ? (StartLink) this.eventType_ : StartLink.getDefaultInstance();
    }

    public String getWebviewRedirectUri() {
        return this.webviewRedirectUri_;
    }

    public ByteString getWebviewRedirectUriBytes() {
        return ByteString.copyFromUtf8(this.webviewRedirectUri_);
    }

    public boolean hasHideSdkModal() {
        return this.eventTypeCase_ == 6;
    }

    public boolean hasOpenIosSdkOauthPopup() {
        return this.eventTypeCase_ == 8;
    }

    public boolean hasOpenUrl() {
        return this.eventTypeCase_ == 4;
    }

    public boolean hasOutOfProcessIosPopup() {
        return this.eventTypeCase_ == 1;
    }

    public boolean hasRequestSilentNetworkAuth() {
        return this.eventTypeCase_ == 7;
    }

    public boolean hasShowSdkModal() {
        return this.eventTypeCase_ == 5;
    }

    public boolean hasStartLink() {
        return this.eventTypeCase_ == 2;
    }

    public static C6490a newBuilder(Common$SDKInternalEvent common$SDKInternalEvent) {
        return DEFAULT_INSTANCE.createBuilder(common$SDKInternalEvent);
    }

    public static Common$SDKInternalEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKInternalEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SDKInternalEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKInternalEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public String getOpenUrl() {
        return this.eventTypeCase_ == 4 ? (String) this.eventType_ : "";
    }

    public ByteString getOpenUrlBytes() {
        return ByteString.copyFromUtf8(this.eventTypeCase_ == 4 ? (String) this.eventType_ : "");
    }

    public static Common$SDKInternalEvent parseFrom(ByteString byteString) {
        return (Common$SDKInternalEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$SDKInternalEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKInternalEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$SDKInternalEvent parseFrom(byte[] bArr) {
        return (Common$SDKInternalEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$SDKInternalEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKInternalEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$SDKInternalEvent parseFrom(InputStream inputStream) {
        return (Common$SDKInternalEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SDKInternalEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKInternalEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SDKInternalEvent parseFrom(CodedInputStream codedInputStream) {
        return (Common$SDKInternalEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$SDKInternalEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SDKInternalEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
