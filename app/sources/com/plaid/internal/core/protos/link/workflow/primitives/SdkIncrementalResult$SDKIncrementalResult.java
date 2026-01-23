package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class SdkIncrementalResult$SDKIncrementalResult extends GeneratedMessageLite<SdkIncrementalResult$SDKIncrementalResult, C7007a> implements InterfaceC7038r {
    public static final int BANK_INCOME_COMPLETED_FIELD_NUMBER = 102;
    private static final SdkIncrementalResult$SDKIncrementalResult DEFAULT_INSTANCE;
    public static final int ITEM_ADD_RESULT_FIELD_NUMBER = 101;
    private static volatile Parser<SdkIncrementalResult$SDKIncrementalResult> PARSER = null;
    public static final int RESULT_TYPE_FIELD_NUMBER = 100;
    private int resultCase_ = 0;
    private String resultType_ = "";
    private Object result_;

    public static final class BankIncomeCompleted extends GeneratedMessageLite<BankIncomeCompleted, C7003a> implements MessageLiteOrBuilder {
        private static final BankIncomeCompleted DEFAULT_INSTANCE;
        public static final int METADATA_FIELD_NUMBER = 2;
        private static volatile Parser<BankIncomeCompleted> PARSER = null;
        public static final int USER_ID_FIELD_NUMBER = 1;
        private int bitField0_;
        private Metadata metadata_;
        private String userId_ = "";

        public static final class Metadata extends GeneratedMessageLite<Metadata, C7002a> implements MessageLiteOrBuilder {
            private static final Metadata DEFAULT_INSTANCE;
            public static final int INSTITUTION_FIELD_NUMBER = 2;
            public static final int LINK_SESSION_ID_FIELD_NUMBER = 1;
            private static volatile Parser<Metadata> PARSER;
            private int bitField0_;
            private Institution institution_;
            private String linkSessionId_ = "";

            public static final class Institution extends GeneratedMessageLite<Institution, C7001a> implements MessageLiteOrBuilder {
                private static final Institution DEFAULT_INSTANCE;
                public static final int INSTITUTION_ID_FIELD_NUMBER = 2;
                public static final int NAME_FIELD_NUMBER = 1;
                private static volatile Parser<Institution> PARSER;
                private String name_ = "";
                private String institutionId_ = "";

                /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult$BankIncomeCompleted$Metadata$Institution$a */
                public static final class C7001a extends GeneratedMessageLite.Builder<Institution, C7001a> implements MessageLiteOrBuilder {
                    public C7001a() {
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

                public static C7001a newBuilder() {
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
                    switch (C7037q.f2699a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Institution();
                        case 2:
                            return new C7001a();
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

                public static C7001a newBuilder(Institution institution) {
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

            /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult$BankIncomeCompleted$Metadata$a */
            public static final class C7002a extends GeneratedMessageLite.Builder<Metadata, C7002a> implements MessageLiteOrBuilder {
                public C7002a() {
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

            private void clearInstitution() {
                this.institution_ = null;
                this.bitField0_ &= -2;
            }

            private void clearLinkSessionId() {
                this.linkSessionId_ = getDefaultInstance().getLinkSessionId();
            }

            public static Metadata getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeInstitution(Institution institution) {
                institution.getClass();
                Institution institution2 = this.institution_;
                if (institution2 == null || institution2 == Institution.getDefaultInstance()) {
                    this.institution_ = institution;
                } else {
                    this.institution_ = Institution.newBuilder(this.institution_).mergeFrom((Institution.C7001a) institution).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C7002a newBuilder() {
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

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C7037q.f2699a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Metadata();
                    case 2:
                        return new C7002a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "linkSessionId_", "institution_"});
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

            public boolean hasInstitution() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C7002a newBuilder(Metadata metadata) {
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult$BankIncomeCompleted$a */
        public static final class C7003a extends GeneratedMessageLite.Builder<BankIncomeCompleted, C7003a> implements MessageLiteOrBuilder {
            public C7003a() {
                super(BankIncomeCompleted.DEFAULT_INSTANCE);
            }
        }

        static {
            BankIncomeCompleted bankIncomeCompleted = new BankIncomeCompleted();
            DEFAULT_INSTANCE = bankIncomeCompleted;
            GeneratedMessageLite.registerDefaultInstance(BankIncomeCompleted.class, bankIncomeCompleted);
        }

        private BankIncomeCompleted() {
        }

        private void clearMetadata() {
            this.metadata_ = null;
            this.bitField0_ &= -2;
        }

        private void clearUserId() {
            this.userId_ = getDefaultInstance().getUserId();
        }

        public static BankIncomeCompleted getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeMetadata(Metadata metadata) {
            metadata.getClass();
            Metadata metadata2 = this.metadata_;
            if (metadata2 == null || metadata2 == Metadata.getDefaultInstance()) {
                this.metadata_ = metadata;
            } else {
                this.metadata_ = Metadata.newBuilder(this.metadata_).mergeFrom((Metadata.C7002a) metadata).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C7003a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BankIncomeCompleted parseDelimitedFrom(InputStream inputStream) {
            return (BankIncomeCompleted) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BankIncomeCompleted parseFrom(ByteBuffer byteBuffer) {
            return (BankIncomeCompleted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<BankIncomeCompleted> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setMetadata(Metadata metadata) {
            metadata.getClass();
            this.metadata_ = metadata;
            this.bitField0_ |= 1;
        }

        private void setUserId(String str) {
            str.getClass();
            this.userId_ = str;
        }

        private void setUserIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.userId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C7037q.f2699a[methodToInvoke.ordinal()]) {
                case 1:
                    return new BankIncomeCompleted();
                case 2:
                    return new C7003a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "userId_", "metadata_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BankIncomeCompleted> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (BankIncomeCompleted.class) {
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

        public Metadata getMetadata() {
            Metadata metadata = this.metadata_;
            return metadata == null ? Metadata.getDefaultInstance() : metadata;
        }

        public String getUserId() {
            return this.userId_;
        }

        public ByteString getUserIdBytes() {
            return ByteString.copyFromUtf8(this.userId_);
        }

        public boolean hasMetadata() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C7003a newBuilder(BankIncomeCompleted bankIncomeCompleted) {
            return DEFAULT_INSTANCE.createBuilder(bankIncomeCompleted);
        }

        public static BankIncomeCompleted parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BankIncomeCompleted) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BankIncomeCompleted parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (BankIncomeCompleted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static BankIncomeCompleted parseFrom(ByteString byteString) {
            return (BankIncomeCompleted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BankIncomeCompleted parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (BankIncomeCompleted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static BankIncomeCompleted parseFrom(byte[] bArr) {
            return (BankIncomeCompleted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BankIncomeCompleted parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (BankIncomeCompleted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static BankIncomeCompleted parseFrom(InputStream inputStream) {
            return (BankIncomeCompleted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BankIncomeCompleted parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BankIncomeCompleted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static BankIncomeCompleted parseFrom(CodedInputStream codedInputStream) {
            return (BankIncomeCompleted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static BankIncomeCompleted parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (BankIncomeCompleted) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ItemAddResult extends GeneratedMessageLite<ItemAddResult, C7006a> implements MessageLiteOrBuilder {
        private static final ItemAddResult DEFAULT_INSTANCE;
        public static final int METADATA_FIELD_NUMBER = 2;
        private static volatile Parser<ItemAddResult> PARSER = null;
        public static final int PUBLIC_TOKEN_FIELD_NUMBER = 1;
        private int bitField0_;
        private Metadata metadata_;
        private String publicToken_ = "";

        public static final class Metadata extends GeneratedMessageLite<Metadata, C7005a> implements MessageLiteOrBuilder {
            private static final Metadata DEFAULT_INSTANCE;
            public static final int INSTITUTION_FIELD_NUMBER = 2;
            public static final int LINK_SESSION_ID_FIELD_NUMBER = 1;
            private static volatile Parser<Metadata> PARSER;
            private int bitField0_;
            private Institution institution_;
            private String linkSessionId_ = "";

            public static final class Institution extends GeneratedMessageLite<Institution, C7004a> implements MessageLiteOrBuilder {
                private static final Institution DEFAULT_INSTANCE;
                public static final int INSTITUTION_ID_FIELD_NUMBER = 2;
                public static final int NAME_FIELD_NUMBER = 1;
                private static volatile Parser<Institution> PARSER;
                private String name_ = "";
                private String institutionId_ = "";

                /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult$ItemAddResult$Metadata$Institution$a */
                public static final class C7004a extends GeneratedMessageLite.Builder<Institution, C7004a> implements MessageLiteOrBuilder {
                    public C7004a() {
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

                public static C7004a newBuilder() {
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
                    switch (C7037q.f2699a[methodToInvoke.ordinal()]) {
                        case 1:
                            return new Institution();
                        case 2:
                            return new C7004a();
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

                public static C7004a newBuilder(Institution institution) {
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

            /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult$ItemAddResult$Metadata$a */
            public static final class C7005a extends GeneratedMessageLite.Builder<Metadata, C7005a> implements MessageLiteOrBuilder {
                public C7005a() {
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

            private void clearInstitution() {
                this.institution_ = null;
                this.bitField0_ &= -2;
            }

            private void clearLinkSessionId() {
                this.linkSessionId_ = getDefaultInstance().getLinkSessionId();
            }

            public static Metadata getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            private void mergeInstitution(Institution institution) {
                institution.getClass();
                Institution institution2 = this.institution_;
                if (institution2 == null || institution2 == Institution.getDefaultInstance()) {
                    this.institution_ = institution;
                } else {
                    this.institution_ = Institution.newBuilder(this.institution_).mergeFrom((Institution.C7004a) institution).buildPartial();
                }
                this.bitField0_ |= 1;
            }

            public static C7005a newBuilder() {
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

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C7037q.f2699a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new Metadata();
                    case 2:
                        return new C7005a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "linkSessionId_", "institution_"});
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

            public boolean hasInstitution() {
                return (this.bitField0_ & 1) != 0;
            }

            public static C7005a newBuilder(Metadata metadata) {
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

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult$ItemAddResult$a */
        public static final class C7006a extends GeneratedMessageLite.Builder<ItemAddResult, C7006a> implements MessageLiteOrBuilder {
            public C7006a() {
                super(ItemAddResult.DEFAULT_INSTANCE);
            }
        }

        static {
            ItemAddResult itemAddResult = new ItemAddResult();
            DEFAULT_INSTANCE = itemAddResult;
            GeneratedMessageLite.registerDefaultInstance(ItemAddResult.class, itemAddResult);
        }

        private ItemAddResult() {
        }

        private void clearMetadata() {
            this.metadata_ = null;
            this.bitField0_ &= -2;
        }

        private void clearPublicToken() {
            this.publicToken_ = getDefaultInstance().getPublicToken();
        }

        public static ItemAddResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeMetadata(Metadata metadata) {
            metadata.getClass();
            Metadata metadata2 = this.metadata_;
            if (metadata2 == null || metadata2 == Metadata.getDefaultInstance()) {
                this.metadata_ = metadata;
            } else {
                this.metadata_ = Metadata.newBuilder(this.metadata_).mergeFrom((Metadata.C7005a) metadata).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C7006a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ItemAddResult parseDelimitedFrom(InputStream inputStream) {
            return (ItemAddResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ItemAddResult parseFrom(ByteBuffer byteBuffer) {
            return (ItemAddResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ItemAddResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setMetadata(Metadata metadata) {
            metadata.getClass();
            this.metadata_ = metadata;
            this.bitField0_ |= 1;
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
            switch (C7037q.f2699a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ItemAddResult();
                case 2:
                    return new C7006a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "publicToken_", "metadata_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ItemAddResult> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ItemAddResult.class) {
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

        public boolean hasMetadata() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C7006a newBuilder(ItemAddResult itemAddResult) {
            return DEFAULT_INSTANCE.createBuilder(itemAddResult);
        }

        public static ItemAddResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemAddResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ItemAddResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemAddResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ItemAddResult parseFrom(ByteString byteString) {
            return (ItemAddResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ItemAddResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemAddResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ItemAddResult parseFrom(byte[] bArr) {
            return (ItemAddResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ItemAddResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemAddResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ItemAddResult parseFrom(InputStream inputStream) {
            return (ItemAddResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ItemAddResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemAddResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ItemAddResult parseFrom(CodedInputStream codedInputStream) {
            return (ItemAddResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ItemAddResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemAddResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult$a */
    public static final class C7007a extends GeneratedMessageLite.Builder<SdkIncrementalResult$SDKIncrementalResult, C7007a> implements InterfaceC7038r {
        public C7007a() {
            super(SdkIncrementalResult$SDKIncrementalResult.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.SdkIncrementalResult$SDKIncrementalResult$b */
    public enum EnumC7008b {
        ITEM_ADD_RESULT(101),
        BANK_INCOME_COMPLETED(102),
        RESULT_NOT_SET(0);


        /* renamed from: a */
        public final int f2643a;

        EnumC7008b(int i) {
            this.f2643a = i;
        }

        public static EnumC7008b forNumber(int i) {
            if (i == 0) {
                return RESULT_NOT_SET;
            }
            if (i == 101) {
                return ITEM_ADD_RESULT;
            }
            if (i != 102) {
                return null;
            }
            return BANK_INCOME_COMPLETED;
        }

        public int getNumber() {
            return this.f2643a;
        }

        @Deprecated
        public static EnumC7008b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        SdkIncrementalResult$SDKIncrementalResult sdkIncrementalResult$SDKIncrementalResult = new SdkIncrementalResult$SDKIncrementalResult();
        DEFAULT_INSTANCE = sdkIncrementalResult$SDKIncrementalResult;
        GeneratedMessageLite.registerDefaultInstance(SdkIncrementalResult$SDKIncrementalResult.class, sdkIncrementalResult$SDKIncrementalResult);
    }

    private SdkIncrementalResult$SDKIncrementalResult() {
    }

    private void clearBankIncomeCompleted() {
        if (this.resultCase_ == 102) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    private void clearItemAddResult() {
        if (this.resultCase_ == 101) {
            this.resultCase_ = 0;
            this.result_ = null;
        }
    }

    private void clearResult() {
        this.resultCase_ = 0;
        this.result_ = null;
    }

    private void clearResultType() {
        this.resultType_ = getDefaultInstance().getResultType();
    }

    public static SdkIncrementalResult$SDKIncrementalResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeBankIncomeCompleted(BankIncomeCompleted bankIncomeCompleted) {
        bankIncomeCompleted.getClass();
        if (this.resultCase_ != 102 || this.result_ == BankIncomeCompleted.getDefaultInstance()) {
            this.result_ = bankIncomeCompleted;
        } else {
            this.result_ = BankIncomeCompleted.newBuilder((BankIncomeCompleted) this.result_).mergeFrom((BankIncomeCompleted.C7003a) bankIncomeCompleted).buildPartial();
        }
        this.resultCase_ = 102;
    }

    private void mergeItemAddResult(ItemAddResult itemAddResult) {
        itemAddResult.getClass();
        if (this.resultCase_ != 101 || this.result_ == ItemAddResult.getDefaultInstance()) {
            this.result_ = itemAddResult;
        } else {
            this.result_ = ItemAddResult.newBuilder((ItemAddResult) this.result_).mergeFrom((ItemAddResult.C7006a) itemAddResult).buildPartial();
        }
        this.resultCase_ = 101;
    }

    public static C7007a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseDelimitedFrom(InputStream inputStream) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseFrom(ByteBuffer byteBuffer) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SdkIncrementalResult$SDKIncrementalResult> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setBankIncomeCompleted(BankIncomeCompleted bankIncomeCompleted) {
        bankIncomeCompleted.getClass();
        this.result_ = bankIncomeCompleted;
        this.resultCase_ = 102;
    }

    private void setItemAddResult(ItemAddResult itemAddResult) {
        itemAddResult.getClass();
        this.result_ = itemAddResult;
        this.resultCase_ = 101;
    }

    private void setResultType(String str) {
        str.getClass();
        this.resultType_ = str;
    }

    private void setResultTypeBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.resultType_ = byteString.toStringUtf8();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7037q.f2699a[methodToInvoke.ordinal()]) {
            case 1:
                return new SdkIncrementalResult$SDKIncrementalResult();
            case 2:
                return new C7007a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000df\u0003\u0000\u0000\u0000dȈe<\u0000f<\u0000", new Object[]{"result_", "resultCase_", "resultType_", ItemAddResult.class, BankIncomeCompleted.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SdkIncrementalResult$SDKIncrementalResult> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SdkIncrementalResult$SDKIncrementalResult.class) {
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

    public BankIncomeCompleted getBankIncomeCompleted() {
        return this.resultCase_ == 102 ? (BankIncomeCompleted) this.result_ : BankIncomeCompleted.getDefaultInstance();
    }

    public ItemAddResult getItemAddResult() {
        return this.resultCase_ == 101 ? (ItemAddResult) this.result_ : ItemAddResult.getDefaultInstance();
    }

    public EnumC7008b getResultCase() {
        return EnumC7008b.forNumber(this.resultCase_);
    }

    public String getResultType() {
        return this.resultType_;
    }

    public ByteString getResultTypeBytes() {
        return ByteString.copyFromUtf8(this.resultType_);
    }

    public boolean hasBankIncomeCompleted() {
        return this.resultCase_ == 102;
    }

    public boolean hasItemAddResult() {
        return this.resultCase_ == 101;
    }

    public static C7007a newBuilder(SdkIncrementalResult$SDKIncrementalResult sdkIncrementalResult$SDKIncrementalResult) {
        return DEFAULT_INSTANCE.createBuilder(sdkIncrementalResult$SDKIncrementalResult);
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseFrom(ByteString byteString) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseFrom(byte[] bArr) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseFrom(InputStream inputStream) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseFrom(CodedInputStream codedInputStream) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SdkIncrementalResult$SDKIncrementalResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkIncrementalResult$SDKIncrementalResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
