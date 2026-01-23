package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class SdkResult$SDKResult extends GeneratedMessageLite<SdkResult$SDKResult, C7016a> implements MessageLiteOrBuilder {
    public static final int CALLBACK_FIELD_NUMBER = 1;
    private static final SdkResult$SDKResult DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER = 3;
    public static final int METADATA_FIELD_NUMBER = 4;
    private static volatile Parser<SdkResult$SDKResult> PARSER = null;
    public static final int PUBLIC_TOKEN_FIELD_NUMBER = 2;
    private int bitField0_;
    private int callback_;
    private Error error_;
    private Metadata metadata_;
    private String publicToken_ = "";

    public static final class Error extends GeneratedMessageLite<Error, C7010a> implements MessageLiteOrBuilder {
        private static final Error DEFAULT_INSTANCE;
        public static final int DISPLAY_MESSAGE_FIELD_NUMBER = 4;
        public static final int ERROR_CODE_FIELD_NUMBER = 2;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 3;
        public static final int ERROR_TYPE_FIELD_NUMBER = 1;
        private static volatile Parser<Error> PARSER = null;
        public static final int REQUEST_ID_FIELD_NUMBER = 5;
        private String errorType_ = "";
        private String errorCode_ = "";
        private String errorMessage_ = "";
        private String displayMessage_ = "";
        private String requestId_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult$Error$a */
        public static final class C7010a extends GeneratedMessageLite.Builder<Error, C7010a> implements MessageLiteOrBuilder {
            public C7010a() {
                super(Error.DEFAULT_INSTANCE);
            }
        }

        static {
            Error error = new Error();
            DEFAULT_INSTANCE = error;
            GeneratedMessageLite.registerDefaultInstance(Error.class, error);
        }

        private Error() {
        }

        private void clearDisplayMessage() {
            this.displayMessage_ = getDefaultInstance().getDisplayMessage();
        }

        private void clearErrorCode() {
            this.errorCode_ = getDefaultInstance().getErrorCode();
        }

        private void clearErrorMessage() {
            this.errorMessage_ = getDefaultInstance().getErrorMessage();
        }

        private void clearErrorType() {
            this.errorType_ = getDefaultInstance().getErrorType();
        }

        private void clearRequestId() {
            this.requestId_ = getDefaultInstance().getRequestId();
        }

        public static Error getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C7010a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Error parseDelimitedFrom(InputStream inputStream) {
            return (Error) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Error parseFrom(ByteBuffer byteBuffer) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Error> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDisplayMessage(String str) {
            str.getClass();
            this.displayMessage_ = str;
        }

        private void setDisplayMessageBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.displayMessage_ = byteString.toStringUtf8();
        }

        private void setErrorCode(String str) {
            str.getClass();
            this.errorCode_ = str;
        }

        private void setErrorCodeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.errorCode_ = byteString.toStringUtf8();
        }

        private void setErrorMessage(String str) {
            str.getClass();
            this.errorMessage_ = str;
        }

        private void setErrorMessageBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.errorMessage_ = byteString.toStringUtf8();
        }

        private void setErrorType(String str) {
            str.getClass();
            this.errorType_ = str;
        }

        private void setErrorTypeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.errorType_ = byteString.toStringUtf8();
        }

        private void setRequestId(String str) {
            str.getClass();
            this.requestId_ = str;
        }

        private void setRequestIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.requestId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C7039s.f2700a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Error();
                case 2:
                    return new C7010a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ", new Object[]{"errorType_", "errorCode_", "errorMessage_", "displayMessage_", "requestId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Error> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Error.class) {
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

        public String getDisplayMessage() {
            return this.displayMessage_;
        }

        public ByteString getDisplayMessageBytes() {
            return ByteString.copyFromUtf8(this.displayMessage_);
        }

        public String getErrorCode() {
            return this.errorCode_;
        }

        public ByteString getErrorCodeBytes() {
            return ByteString.copyFromUtf8(this.errorCode_);
        }

        public String getErrorMessage() {
            return this.errorMessage_;
        }

        public ByteString getErrorMessageBytes() {
            return ByteString.copyFromUtf8(this.errorMessage_);
        }

        public String getErrorType() {
            return this.errorType_;
        }

        public ByteString getErrorTypeBytes() {
            return ByteString.copyFromUtf8(this.errorType_);
        }

        public String getRequestId() {
            return this.requestId_;
        }

        public ByteString getRequestIdBytes() {
            return ByteString.copyFromUtf8(this.requestId_);
        }

        public static C7010a newBuilder(Error error) {
            return DEFAULT_INSTANCE.createBuilder(error);
        }

        public static Error parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Error) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Error parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Error parseFrom(ByteString byteString) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Error parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Error parseFrom(byte[] bArr) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Error parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Error parseFrom(InputStream inputStream) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Error parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Error parseFrom(CodedInputStream codedInputStream) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Error parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Error) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Metadata extends GeneratedMessageLite<Metadata, C7015b> implements MessageLiteOrBuilder {
        public static final int ACCOUNTS_FIELD_NUMBER = 4;
        public static final int ACCOUNT_FIELD_NUMBER = 5;
        public static final int ACCOUNT_ID_FIELD_NUMBER = 6;
        private static final Metadata DEFAULT_INSTANCE;
        public static final int INSTITUTION_FIELD_NUMBER = 3;
        public static final int LINK_SESSION_ID_FIELD_NUMBER = 2;
        private static volatile Parser<Metadata> PARSER = null;
        public static final int REQUEST_ID_FIELD_NUMBER = 8;
        public static final int STATUS_FIELD_NUMBER = 1;
        public static final int TRANSFER_STATUS_FIELD_NUMBER = 7;
        public static final int WALLET_FIELD_NUMBER = 9;
        private Account account_;
        private int bitField0_;
        private Institution institution_;
        private Wallet wallet_;
        private String status_ = "";
        private String linkSessionId_ = "";
        private String requestId_ = "";
        private Internal.ProtobufList<Account> accounts_ = GeneratedMessageLite.emptyProtobufList();
        private String accountId_ = "";
        private String transferStatus_ = "";

        public static final class Account extends GeneratedMessageLite<Account, C7011a> implements InterfaceC7014a {
            public static final int CLASS_TYPE_FIELD_NUMBER = 7;
            private static final Account DEFAULT_INSTANCE;
            public static final int ID_FIELD_NUMBER = 1;
            public static final int MASK_FIELD_NUMBER = 3;
            public static final int NAME_FIELD_NUMBER = 2;
            private static volatile Parser<Account> PARSER = null;
            public static final int SUBTYPE_FIELD_NUMBER = 5;
            public static final int TYPE_FIELD_NUMBER = 4;
            public static final int VERIFICATION_STATUS_FIELD_NUMBER = 6;
            private String id_ = "";
            private String name_ = "";
            private String mask_ = "";
            private String type_ = "";
            private String subtype_ = "";
            private String verificationStatus_ = "";
            private String classType_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult$Metadata$Account$a */
            public static final class C7011a extends GeneratedMessageLite.Builder<Account, C7011a> implements InterfaceC7014a {
                public C7011a() {
                    super(Account.DEFAULT_INSTANCE);
                }
            }

            static {
                Account account = new Account();
                DEFAULT_INSTANCE = account;
                GeneratedMessageLite.registerDefaultInstance(Account.class, account);
            }

            private Account() {
            }

            private void clearClassType() {
                this.classType_ = getDefaultInstance().getClassType();
            }

            private void clearId() {
                this.id_ = getDefaultInstance().getId();
            }

            private void clearMask() {
                this.mask_ = getDefaultInstance().getMask();
            }

            private void clearName() {
                this.name_ = getDefaultInstance().getName();
            }

            private void clearSubtype() {
                this.subtype_ = getDefaultInstance().getSubtype();
            }

            private void clearType() {
                this.type_ = getDefaultInstance().getType();
            }

            private void clearVerificationStatus() {
                this.verificationStatus_ = getDefaultInstance().getVerificationStatus();
            }

            public static Account getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C7011a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Account parseDelimitedFrom(InputStream inputStream) {
                return (Account) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Account parseFrom(ByteBuffer byteBuffer) {
                return (Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Account> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setClassType(String str) {
                str.getClass();
                this.classType_ = str;
            }

            private void setClassTypeBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.classType_ = byteString.toStringUtf8();
            }

            private void setId(String str) {
                str.getClass();
                this.id_ = str;
            }

            private void setIdBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.id_ = byteString.toStringUtf8();
            }

            private void setMask(String str) {
                str.getClass();
                this.mask_ = str;
            }

            private void setMaskBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.mask_ = byteString.toStringUtf8();
            }

            private void setName(String str) {
                str.getClass();
                this.name_ = str;
            }

            private void setNameBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.name_ = byteString.toStringUtf8();
            }

            private void setSubtype(String str) {
                str.getClass();
                this.subtype_ = str;
            }

            private void setSubtypeBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.subtype_ = byteString.toStringUtf8();
            }

            private void setType(String str) {
                str.getClass();
                this.type_ = str;
            }

            private void setTypeBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.type_ = byteString.toStringUtf8();
            }

            private void setVerificationStatus(String str) {
                str.getClass();
                this.verificationStatus_ = str;
            }

            private void setVerificationStatusBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.verificationStatus_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C7039s.f2700a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Account();
                    case 2:
                        return new C7011a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"id_", "name_", "mask_", "type_", "subtype_", "verificationStatus_", "classType_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Account> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Account.class) {
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

            public String getClassType() {
                return this.classType_;
            }

            public ByteString getClassTypeBytes() {
                return ByteString.copyFromUtf8(this.classType_);
            }

            public String getId() {
                return this.id_;
            }

            public ByteString getIdBytes() {
                return ByteString.copyFromUtf8(this.id_);
            }

            public String getMask() {
                return this.mask_;
            }

            public ByteString getMaskBytes() {
                return ByteString.copyFromUtf8(this.mask_);
            }

            public String getName() {
                return this.name_;
            }

            public ByteString getNameBytes() {
                return ByteString.copyFromUtf8(this.name_);
            }

            public String getSubtype() {
                return this.subtype_;
            }

            public ByteString getSubtypeBytes() {
                return ByteString.copyFromUtf8(this.subtype_);
            }

            public String getType() {
                return this.type_;
            }

            public ByteString getTypeBytes() {
                return ByteString.copyFromUtf8(this.type_);
            }

            public String getVerificationStatus() {
                return this.verificationStatus_;
            }

            public ByteString getVerificationStatusBytes() {
                return ByteString.copyFromUtf8(this.verificationStatus_);
            }

            public static C7011a newBuilder(Account account) {
                return DEFAULT_INSTANCE.createBuilder(account);
            }

            public static Account parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Account) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Account parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Account parseFrom(ByteString byteString) {
                return (Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Account parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Account parseFrom(byte[] bArr) {
                return (Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Account parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Account parseFrom(InputStream inputStream) {
                return (Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Account parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Account parseFrom(CodedInputStream codedInputStream) {
                return (Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Account parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Account) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Institution extends GeneratedMessageLite<Institution, C7012a> implements MessageLiteOrBuilder {
            private static final Institution DEFAULT_INSTANCE;
            public static final int INSTITUTION_ID_FIELD_NUMBER = 2;
            public static final int NAME_FIELD_NUMBER = 1;
            private static volatile Parser<Institution> PARSER;
            private String name_ = "";
            private String institutionId_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult$Metadata$Institution$a */
            public static final class C7012a extends GeneratedMessageLite.Builder<Institution, C7012a> implements MessageLiteOrBuilder {
                public C7012a() {
                    super(Institution.DEFAULT_INSTANCE);
                }
            }

            static {
                Institution institution = new Institution();
                DEFAULT_INSTANCE = institution;
                GeneratedMessageLite.registerDefaultInstance(Institution.class, institution);
            }

            private Institution() {
            }

            private void clearInstitutionId() {
                this.institutionId_ = getDefaultInstance().getInstitutionId();
            }

            private void clearName() {
                this.name_ = getDefaultInstance().getName();
            }

            public static Institution getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C7012a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Institution parseDelimitedFrom(InputStream inputStream) {
                return (Institution) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Institution parseFrom(ByteBuffer byteBuffer) {
                return (Institution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Institution> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setInstitutionId(String str) {
                str.getClass();
                this.institutionId_ = str;
            }

            private void setInstitutionIdBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.institutionId_ = byteString.toStringUtf8();
            }

            private void setName(String str) {
                str.getClass();
                this.name_ = str;
            }

            private void setNameBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.name_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C7039s.f2700a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Institution();
                    case 2:
                        return new C7012a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"name_", "institutionId_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Institution> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Institution.class) {
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

            public String getInstitutionId() {
                return this.institutionId_;
            }

            public ByteString getInstitutionIdBytes() {
                return ByteString.copyFromUtf8(this.institutionId_);
            }

            public String getName() {
                return this.name_;
            }

            public ByteString getNameBytes() {
                return ByteString.copyFromUtf8(this.name_);
            }

            public static C7012a newBuilder(Institution institution) {
                return DEFAULT_INSTANCE.createBuilder(institution);
            }

            public static Institution parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Institution) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Institution parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Institution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Institution parseFrom(ByteString byteString) {
                return (Institution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Institution parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Institution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Institution parseFrom(byte[] bArr) {
                return (Institution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Institution parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Institution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Institution parseFrom(InputStream inputStream) {
                return (Institution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Institution parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Institution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Institution parseFrom(CodedInputStream codedInputStream) {
                return (Institution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Institution parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Institution) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Wallet extends GeneratedMessageLite<Wallet, C7013a> implements MessageLiteOrBuilder {
            private static final Wallet DEFAULT_INSTANCE;
            public static final int NAME_FIELD_NUMBER = 1;
            private static volatile Parser<Wallet> PARSER;
            private String name_ = "";

            /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult$Metadata$Wallet$a */
            public static final class C7013a extends GeneratedMessageLite.Builder<Wallet, C7013a> implements MessageLiteOrBuilder {
                public C7013a() {
                    super(Wallet.DEFAULT_INSTANCE);
                }
            }

            static {
                Wallet wallet = new Wallet();
                DEFAULT_INSTANCE = wallet;
                GeneratedMessageLite.registerDefaultInstance(Wallet.class, wallet);
            }

            private Wallet() {
            }

            private void clearName() {
                this.name_ = getDefaultInstance().getName();
            }

            public static Wallet getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C7013a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static Wallet parseDelimitedFrom(InputStream inputStream) {
                return (Wallet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Wallet parseFrom(ByteBuffer byteBuffer) {
                return (Wallet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<Wallet> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setName(String str) {
                str.getClass();
                this.name_ = str;
            }

            private void setNameBytes(ByteString byteString) throws IllegalArgumentException {
                AbstractMessageLite.checkByteStringIsUtf8(byteString);
                this.name_ = byteString.toStringUtf8();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C7039s.f2700a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Wallet();
                    case 2:
                        return new C7013a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"name_"});
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<Wallet> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (Wallet.class) {
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

            public String getName() {
                return this.name_;
            }

            public ByteString getNameBytes() {
                return ByteString.copyFromUtf8(this.name_);
            }

            public static C7013a newBuilder(Wallet wallet) {
                return DEFAULT_INSTANCE.createBuilder(wallet);
            }

            public static Wallet parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Wallet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Wallet parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (Wallet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static Wallet parseFrom(ByteString byteString) {
                return (Wallet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static Wallet parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (Wallet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static Wallet parseFrom(byte[] bArr) {
                return (Wallet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static Wallet parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (Wallet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static Wallet parseFrom(InputStream inputStream) {
                return (Wallet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static Wallet parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Wallet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static Wallet parseFrom(CodedInputStream codedInputStream) {
                return (Wallet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static Wallet parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (Wallet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult$Metadata$a */
        public interface InterfaceC7014a extends MessageLiteOrBuilder {
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult$Metadata$b */
        public static final class C7015b extends GeneratedMessageLite.Builder<Metadata, C7015b> implements MessageLiteOrBuilder {
            public C7015b() {
                super(Metadata.DEFAULT_INSTANCE);
            }
        }

        static {
            Metadata metadata = new Metadata();
            DEFAULT_INSTANCE = metadata;
            GeneratedMessageLite.registerDefaultInstance(Metadata.class, metadata);
        }

        private Metadata() {
        }

        private void addAccounts(Account account) {
            account.getClass();
            ensureAccountsIsMutable();
            this.accounts_.add(account);
        }

        private void addAllAccounts(Iterable<? extends Account> iterable) {
            ensureAccountsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.accounts_);
        }

        private void clearAccount() {
            this.account_ = null;
            this.bitField0_ &= -3;
        }

        private void clearAccountId() {
            this.accountId_ = getDefaultInstance().getAccountId();
        }

        private void clearAccounts() {
            this.accounts_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearInstitution() {
            this.institution_ = null;
            this.bitField0_ &= -2;
        }

        private void clearLinkSessionId() {
            this.linkSessionId_ = getDefaultInstance().getLinkSessionId();
        }

        private void clearRequestId() {
            this.requestId_ = getDefaultInstance().getRequestId();
        }

        private void clearStatus() {
            this.status_ = getDefaultInstance().getStatus();
        }

        private void clearTransferStatus() {
            this.transferStatus_ = getDefaultInstance().getTransferStatus();
        }

        private void clearWallet() {
            this.wallet_ = null;
            this.bitField0_ &= -5;
        }

        private void ensureAccountsIsMutable() {
            Internal.ProtobufList<Account> protobufList = this.accounts_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.accounts_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static Metadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAccount(Account account) {
            account.getClass();
            Account account2 = this.account_;
            if (account2 == null || account2 == Account.getDefaultInstance()) {
                this.account_ = account;
            } else {
                this.account_ = Account.newBuilder(this.account_).mergeFrom((Account.C7011a) account).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeInstitution(Institution institution) {
            institution.getClass();
            Institution institution2 = this.institution_;
            if (institution2 == null || institution2 == Institution.getDefaultInstance()) {
                this.institution_ = institution;
            } else {
                this.institution_ = Institution.newBuilder(this.institution_).mergeFrom((Institution.C7012a) institution).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeWallet(Wallet wallet) {
            wallet.getClass();
            Wallet wallet2 = this.wallet_;
            if (wallet2 == null || wallet2 == Wallet.getDefaultInstance()) {
                this.wallet_ = wallet;
            } else {
                this.wallet_ = Wallet.newBuilder(this.wallet_).mergeFrom((Wallet.C7013a) wallet).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static C7015b newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Metadata parseDelimitedFrom(InputStream inputStream) {
            return (Metadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Metadata parseFrom(ByteBuffer byteBuffer) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Metadata> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeAccounts(int i) {
            ensureAccountsIsMutable();
            this.accounts_.remove(i);
        }

        private void setAccount(Account account) {
            account.getClass();
            this.account_ = account;
            this.bitField0_ |= 2;
        }

        private void setAccountId(String str) {
            str.getClass();
            this.accountId_ = str;
        }

        private void setAccountIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.accountId_ = byteString.toStringUtf8();
        }

        private void setAccounts(int i, Account account) {
            account.getClass();
            ensureAccountsIsMutable();
            this.accounts_.set(i, account);
        }

        private void setInstitution(Institution institution) {
            institution.getClass();
            this.institution_ = institution;
            this.bitField0_ |= 1;
        }

        private void setLinkSessionId(String str) {
            str.getClass();
            this.linkSessionId_ = str;
        }

        private void setLinkSessionIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.linkSessionId_ = byteString.toStringUtf8();
        }

        private void setRequestId(String str) {
            str.getClass();
            this.requestId_ = str;
        }

        private void setRequestIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.requestId_ = byteString.toStringUtf8();
        }

        private void setStatus(String str) {
            str.getClass();
            this.status_ = str;
        }

        private void setStatusBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.status_ = byteString.toStringUtf8();
        }

        private void setTransferStatus(String str) {
            str.getClass();
            this.transferStatus_ = str;
        }

        private void setTransferStatusBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.transferStatus_ = byteString.toStringUtf8();
        }

        private void setWallet(Wallet wallet) {
            wallet.getClass();
            this.wallet_ = wallet;
            this.bitField0_ |= 4;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C7039s.f2700a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Metadata();
                case 2:
                    return new C7015b();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\u001b\u0005ဉ\u0001\u0006Ȉ\u0007Ȉ\bȈ\tဉ\u0002", new Object[]{"bitField0_", "status_", "linkSessionId_", "institution_", "accounts_", Account.class, "account_", "accountId_", "transferStatus_", "requestId_", "wallet_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Metadata> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Metadata.class) {
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

        public Account getAccount() {
            Account account = this.account_;
            return account == null ? Account.getDefaultInstance() : account;
        }

        public String getAccountId() {
            return this.accountId_;
        }

        public ByteString getAccountIdBytes() {
            return ByteString.copyFromUtf8(this.accountId_);
        }

        public Account getAccounts(int i) {
            return this.accounts_.get(i);
        }

        public int getAccountsCount() {
            return this.accounts_.size();
        }

        public List<Account> getAccountsList() {
            return this.accounts_;
        }

        public InterfaceC7014a getAccountsOrBuilder(int i) {
            return this.accounts_.get(i);
        }

        public List<? extends InterfaceC7014a> getAccountsOrBuilderList() {
            return this.accounts_;
        }

        public Institution getInstitution() {
            Institution institution = this.institution_;
            return institution == null ? Institution.getDefaultInstance() : institution;
        }

        public String getLinkSessionId() {
            return this.linkSessionId_;
        }

        public ByteString getLinkSessionIdBytes() {
            return ByteString.copyFromUtf8(this.linkSessionId_);
        }

        public String getRequestId() {
            return this.requestId_;
        }

        public ByteString getRequestIdBytes() {
            return ByteString.copyFromUtf8(this.requestId_);
        }

        public String getStatus() {
            return this.status_;
        }

        public ByteString getStatusBytes() {
            return ByteString.copyFromUtf8(this.status_);
        }

        public String getTransferStatus() {
            return this.transferStatus_;
        }

        public ByteString getTransferStatusBytes() {
            return ByteString.copyFromUtf8(this.transferStatus_);
        }

        public Wallet getWallet() {
            Wallet wallet = this.wallet_;
            return wallet == null ? Wallet.getDefaultInstance() : wallet;
        }

        public boolean hasAccount() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasInstitution() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasWallet() {
            return (this.bitField0_ & 4) != 0;
        }

        public static C7015b newBuilder(Metadata metadata) {
            return DEFAULT_INSTANCE.createBuilder(metadata);
        }

        public static Metadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Metadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Metadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Metadata parseFrom(ByteString byteString) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void addAccounts(int i, Account account) {
            account.getClass();
            ensureAccountsIsMutable();
            this.accounts_.add(i, account);
        }

        public static Metadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Metadata parseFrom(byte[] bArr) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Metadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Metadata parseFrom(InputStream inputStream) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Metadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Metadata parseFrom(CodedInputStream codedInputStream) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Metadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Metadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult$a */
    public static final class C7016a extends GeneratedMessageLite.Builder<SdkResult$SDKResult, C7016a> implements MessageLiteOrBuilder {
        public C7016a() {
            super(SdkResult$SDKResult.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult$b */
    public enum EnumC7017b implements Internal.EnumLite {
        SDK_RESULT_CALLBACK_UNKNOWN(0),
        SDK_RESULT_CALLBACK_SUCCESS(1),
        SDK_RESULT_CALLBACK_ERROR(2),
        SDK_RESULT_CALLBACK_HTA_REDIRECT(3),
        UNRECOGNIZED(-1);

        public static final int SDK_RESULT_CALLBACK_ERROR_VALUE = 2;
        public static final int SDK_RESULT_CALLBACK_HTA_REDIRECT_VALUE = 3;
        public static final int SDK_RESULT_CALLBACK_SUCCESS_VALUE = 1;
        public static final int SDK_RESULT_CALLBACK_UNKNOWN_VALUE = 0;

        /* renamed from: b */
        public static final a f2644b = new a();

        /* renamed from: a */
        public final int f2646a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult$b$a */
        public class a implements Internal.EnumLiteMap<EnumC7017b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final Internal.EnumLite findValueByNumber(int i) {
                return EnumC7017b.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult$b$b */
        public static final class b implements Internal.EnumVerifier {

            /* renamed from: a */
            public static final b f2647a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return EnumC7017b.forNumber(i) != null;
            }
        }

        EnumC7017b(int i) {
            this.f2646a = i;
        }

        public static EnumC7017b forNumber(int i) {
            if (i == 0) {
                return SDK_RESULT_CALLBACK_UNKNOWN;
            }
            if (i == 1) {
                return SDK_RESULT_CALLBACK_SUCCESS;
            }
            if (i == 2) {
                return SDK_RESULT_CALLBACK_ERROR;
            }
            if (i != 3) {
                return null;
            }
            return SDK_RESULT_CALLBACK_HTA_REDIRECT;
        }

        public static Internal.EnumLiteMap<EnumC7017b> internalGetValueMap() {
            return f2644b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.f2647a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.f2646a;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        @Deprecated
        public static EnumC7017b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        SdkResult$SDKResult sdkResult$SDKResult = new SdkResult$SDKResult();
        DEFAULT_INSTANCE = sdkResult$SDKResult;
        GeneratedMessageLite.registerDefaultInstance(SdkResult$SDKResult.class, sdkResult$SDKResult);
    }

    private SdkResult$SDKResult() {
    }

    private void clearCallback() {
        this.callback_ = 0;
    }

    private void clearError() {
        this.error_ = null;
        this.bitField0_ &= -2;
    }

    private void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -3;
    }

    private void clearPublicToken() {
        this.publicToken_ = getDefaultInstance().getPublicToken();
    }

    public static SdkResult$SDKResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeError(Error error) {
        error.getClass();
        Error error2 = this.error_;
        if (error2 == null || error2 == Error.getDefaultInstance()) {
            this.error_ = error;
        } else {
            this.error_ = Error.newBuilder(this.error_).mergeFrom((Error.C7010a) error).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeMetadata(Metadata metadata) {
        metadata.getClass();
        Metadata metadata2 = this.metadata_;
        if (metadata2 == null || metadata2 == Metadata.getDefaultInstance()) {
            this.metadata_ = metadata;
        } else {
            this.metadata_ = Metadata.newBuilder(this.metadata_).mergeFrom((Metadata.C7015b) metadata).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static C7016a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SdkResult$SDKResult parseDelimitedFrom(InputStream inputStream) {
        return (SdkResult$SDKResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SdkResult$SDKResult parseFrom(ByteBuffer byteBuffer) {
        return (SdkResult$SDKResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SdkResult$SDKResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setCallback(EnumC7017b enumC7017b) {
        this.callback_ = enumC7017b.getNumber();
    }

    private void setCallbackValue(int i) {
        this.callback_ = i;
    }

    private void setError(Error error) {
        error.getClass();
        this.error_ = error;
        this.bitField0_ |= 1;
    }

    private void setMetadata(Metadata metadata) {
        metadata.getClass();
        this.metadata_ = metadata;
        this.bitField0_ |= 2;
    }

    private void setPublicToken(String str) {
        str.getClass();
        this.publicToken_ = str;
    }

    private void setPublicTokenBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.publicToken_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7039s.f2700a[methodToInvoke.ordinal()]) {
            case 1:
                return new SdkResult$SDKResult();
            case 2:
                return new C7016a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001", new Object[]{"bitField0_", "callback_", "publicToken_", "error_", "metadata_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SdkResult$SDKResult> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SdkResult$SDKResult.class) {
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

    public EnumC7017b getCallback() {
        EnumC7017b enumC7017bForNumber = EnumC7017b.forNumber(this.callback_);
        return enumC7017bForNumber == null ? EnumC7017b.UNRECOGNIZED : enumC7017bForNumber;
    }

    public int getCallbackValue() {
        return this.callback_;
    }

    public Error getError() {
        Error error = this.error_;
        return error == null ? Error.getDefaultInstance() : error;
    }

    public Metadata getMetadata() {
        Metadata metadata = this.metadata_;
        return metadata == null ? Metadata.getDefaultInstance() : metadata;
    }

    public String getPublicToken() {
        return this.publicToken_;
    }

    public ByteString getPublicTokenBytes() {
        return ByteString.copyFromUtf8(this.publicToken_);
    }

    public boolean hasError() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    public static C7016a newBuilder(SdkResult$SDKResult sdkResult$SDKResult) {
        return DEFAULT_INSTANCE.createBuilder(sdkResult$SDKResult);
    }

    public static SdkResult$SDKResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkResult$SDKResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SdkResult$SDKResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkResult$SDKResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SdkResult$SDKResult parseFrom(ByteString byteString) {
        return (SdkResult$SDKResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SdkResult$SDKResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkResult$SDKResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SdkResult$SDKResult parseFrom(byte[] bArr) {
        return (SdkResult$SDKResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SdkResult$SDKResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkResult$SDKResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SdkResult$SDKResult parseFrom(InputStream inputStream) {
        return (SdkResult$SDKResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SdkResult$SDKResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkResult$SDKResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SdkResult$SDKResult parseFrom(CodedInputStream codedInputStream) {
        return (SdkResult$SDKResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SdkResult$SDKResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkResult$SDKResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
