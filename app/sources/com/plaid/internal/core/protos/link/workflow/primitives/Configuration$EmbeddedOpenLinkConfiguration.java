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
public final class Configuration$EmbeddedOpenLinkConfiguration extends GeneratedMessageLite<Configuration$EmbeddedOpenLinkConfiguration, C6973a> implements MessageLiteOrBuilder {
    private static final Configuration$EmbeddedOpenLinkConfiguration DEFAULT_INSTANCE;
    public static final int EMBEDDED_WORKFLOW_SESSION_ID_FIELD_NUMBER = 1;
    public static final int IS_POLLING_FIELD_NUMBER = 5;
    public static final int OPEN_LINK_ACTION_DEFAULT_FIELD_NUMBER = 2;
    public static final int OPEN_LINK_ACTION_LINK_WITH_ACCOUNT_NUMBERS_FIELD_NUMBER = 4;
    public static final int OPEN_LINK_ACTION_WITH_INSTITUTION_ID_FIELD_NUMBER = 3;
    private static volatile Parser<Configuration$EmbeddedOpenLinkConfiguration> PARSER;
    private Object embeddedOpenLinkAction_;
    private boolean isPolling_;
    private int embeddedOpenLinkActionCase_ = 0;
    private String embeddedWorkflowSessionId_ = "";

    public static final class EmbeddedOpenLinkActionDefault extends GeneratedMessageLite<EmbeddedOpenLinkActionDefault, C6970a> implements MessageLiteOrBuilder {
        private static final EmbeddedOpenLinkActionDefault DEFAULT_INSTANCE;
        private static volatile Parser<EmbeddedOpenLinkActionDefault> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration$EmbeddedOpenLinkActionDefault$a */
        public static final class C6970a extends GeneratedMessageLite.Builder<EmbeddedOpenLinkActionDefault, C6970a> implements MessageLiteOrBuilder {
            public C6970a() {
                super(EmbeddedOpenLinkActionDefault.DEFAULT_INSTANCE);
            }
        }

        static {
            EmbeddedOpenLinkActionDefault embeddedOpenLinkActionDefault = new EmbeddedOpenLinkActionDefault();
            DEFAULT_INSTANCE = embeddedOpenLinkActionDefault;
            GeneratedMessageLite.registerDefaultInstance(EmbeddedOpenLinkActionDefault.class, embeddedOpenLinkActionDefault);
        }

        private EmbeddedOpenLinkActionDefault() {
        }

        public static EmbeddedOpenLinkActionDefault getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6970a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EmbeddedOpenLinkActionDefault parseDelimitedFrom(InputStream inputStream) {
            return (EmbeddedOpenLinkActionDefault) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EmbeddedOpenLinkActionDefault parseFrom(ByteBuffer byteBuffer) {
            return (EmbeddedOpenLinkActionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EmbeddedOpenLinkActionDefault> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
                case 1:
                    return new EmbeddedOpenLinkActionDefault();
                case 2:
                    return new C6970a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EmbeddedOpenLinkActionDefault> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (EmbeddedOpenLinkActionDefault.class) {
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

        public static C6970a newBuilder(EmbeddedOpenLinkActionDefault embeddedOpenLinkActionDefault) {
            return DEFAULT_INSTANCE.createBuilder(embeddedOpenLinkActionDefault);
        }

        public static EmbeddedOpenLinkActionDefault parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedOpenLinkActionDefault) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EmbeddedOpenLinkActionDefault parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedOpenLinkActionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EmbeddedOpenLinkActionDefault parseFrom(ByteString byteString) {
            return (EmbeddedOpenLinkActionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EmbeddedOpenLinkActionDefault parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedOpenLinkActionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EmbeddedOpenLinkActionDefault parseFrom(byte[] bArr) {
            return (EmbeddedOpenLinkActionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EmbeddedOpenLinkActionDefault parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedOpenLinkActionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EmbeddedOpenLinkActionDefault parseFrom(InputStream inputStream) {
            return (EmbeddedOpenLinkActionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EmbeddedOpenLinkActionDefault parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedOpenLinkActionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EmbeddedOpenLinkActionDefault parseFrom(CodedInputStream codedInputStream) {
            return (EmbeddedOpenLinkActionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EmbeddedOpenLinkActionDefault parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedOpenLinkActionDefault) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EmbeddedOpenLinkActionLinkWithAccountNumbers extends GeneratedMessageLite<EmbeddedOpenLinkActionLinkWithAccountNumbers, C6971a> implements MessageLiteOrBuilder {
        private static final EmbeddedOpenLinkActionLinkWithAccountNumbers DEFAULT_INSTANCE;
        private static volatile Parser<EmbeddedOpenLinkActionLinkWithAccountNumbers> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration$EmbeddedOpenLinkActionLinkWithAccountNumbers$a */
        public static final class C6971a extends GeneratedMessageLite.Builder<EmbeddedOpenLinkActionLinkWithAccountNumbers, C6971a> implements MessageLiteOrBuilder {
            public C6971a() {
                super(EmbeddedOpenLinkActionLinkWithAccountNumbers.DEFAULT_INSTANCE);
            }
        }

        static {
            EmbeddedOpenLinkActionLinkWithAccountNumbers embeddedOpenLinkActionLinkWithAccountNumbers = new EmbeddedOpenLinkActionLinkWithAccountNumbers();
            DEFAULT_INSTANCE = embeddedOpenLinkActionLinkWithAccountNumbers;
            GeneratedMessageLite.registerDefaultInstance(EmbeddedOpenLinkActionLinkWithAccountNumbers.class, embeddedOpenLinkActionLinkWithAccountNumbers);
        }

        private EmbeddedOpenLinkActionLinkWithAccountNumbers() {
        }

        public static EmbeddedOpenLinkActionLinkWithAccountNumbers getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6971a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EmbeddedOpenLinkActionLinkWithAccountNumbers parseDelimitedFrom(InputStream inputStream) {
            return (EmbeddedOpenLinkActionLinkWithAccountNumbers) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EmbeddedOpenLinkActionLinkWithAccountNumbers parseFrom(ByteBuffer byteBuffer) {
            return (EmbeddedOpenLinkActionLinkWithAccountNumbers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EmbeddedOpenLinkActionLinkWithAccountNumbers> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
                case 1:
                    return new EmbeddedOpenLinkActionLinkWithAccountNumbers();
                case 2:
                    return new C6971a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EmbeddedOpenLinkActionLinkWithAccountNumbers> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (EmbeddedOpenLinkActionLinkWithAccountNumbers.class) {
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

        public static C6971a newBuilder(EmbeddedOpenLinkActionLinkWithAccountNumbers embeddedOpenLinkActionLinkWithAccountNumbers) {
            return DEFAULT_INSTANCE.createBuilder(embeddedOpenLinkActionLinkWithAccountNumbers);
        }

        public static EmbeddedOpenLinkActionLinkWithAccountNumbers parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedOpenLinkActionLinkWithAccountNumbers) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EmbeddedOpenLinkActionLinkWithAccountNumbers parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedOpenLinkActionLinkWithAccountNumbers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EmbeddedOpenLinkActionLinkWithAccountNumbers parseFrom(ByteString byteString) {
            return (EmbeddedOpenLinkActionLinkWithAccountNumbers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EmbeddedOpenLinkActionLinkWithAccountNumbers parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedOpenLinkActionLinkWithAccountNumbers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EmbeddedOpenLinkActionLinkWithAccountNumbers parseFrom(byte[] bArr) {
            return (EmbeddedOpenLinkActionLinkWithAccountNumbers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EmbeddedOpenLinkActionLinkWithAccountNumbers parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedOpenLinkActionLinkWithAccountNumbers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EmbeddedOpenLinkActionLinkWithAccountNumbers parseFrom(InputStream inputStream) {
            return (EmbeddedOpenLinkActionLinkWithAccountNumbers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EmbeddedOpenLinkActionLinkWithAccountNumbers parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedOpenLinkActionLinkWithAccountNumbers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EmbeddedOpenLinkActionLinkWithAccountNumbers parseFrom(CodedInputStream codedInputStream) {
            return (EmbeddedOpenLinkActionLinkWithAccountNumbers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EmbeddedOpenLinkActionLinkWithAccountNumbers parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedOpenLinkActionLinkWithAccountNumbers) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EmbeddedOpenLinkActionWithInstitutionId extends GeneratedMessageLite<EmbeddedOpenLinkActionWithInstitutionId, C6972a> implements MessageLiteOrBuilder {
        private static final EmbeddedOpenLinkActionWithInstitutionId DEFAULT_INSTANCE;
        public static final int INSTITUTION_ID_FIELD_NUMBER = 1;
        private static volatile Parser<EmbeddedOpenLinkActionWithInstitutionId> PARSER;
        private String institutionId_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration$EmbeddedOpenLinkActionWithInstitutionId$a */
        public static final class C6972a extends GeneratedMessageLite.Builder<EmbeddedOpenLinkActionWithInstitutionId, C6972a> implements MessageLiteOrBuilder {
            public C6972a() {
                super(EmbeddedOpenLinkActionWithInstitutionId.DEFAULT_INSTANCE);
            }

            /* renamed from: a */
            public final C6972a m1463a(String str) {
                copyOnWrite();
                ((EmbeddedOpenLinkActionWithInstitutionId) this.instance).setInstitutionId(str);
                return this;
            }
        }

        static {
            EmbeddedOpenLinkActionWithInstitutionId embeddedOpenLinkActionWithInstitutionId = new EmbeddedOpenLinkActionWithInstitutionId();
            DEFAULT_INSTANCE = embeddedOpenLinkActionWithInstitutionId;
            GeneratedMessageLite.registerDefaultInstance(EmbeddedOpenLinkActionWithInstitutionId.class, embeddedOpenLinkActionWithInstitutionId);
        }

        private EmbeddedOpenLinkActionWithInstitutionId() {
        }

        private void clearInstitutionId() {
            this.institutionId_ = getDefaultInstance().getInstitutionId();
        }

        public static EmbeddedOpenLinkActionWithInstitutionId getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6972a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static EmbeddedOpenLinkActionWithInstitutionId parseDelimitedFrom(InputStream inputStream) {
            return (EmbeddedOpenLinkActionWithInstitutionId) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EmbeddedOpenLinkActionWithInstitutionId parseFrom(ByteBuffer byteBuffer) {
            return (EmbeddedOpenLinkActionWithInstitutionId) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<EmbeddedOpenLinkActionWithInstitutionId> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInstitutionId(String str) {
            str.getClass();
            this.institutionId_ = str;
        }

        private void setInstitutionIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.institutionId_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
                case 1:
                    return new EmbeddedOpenLinkActionWithInstitutionId();
                case 2:
                    return new C6972a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"institutionId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<EmbeddedOpenLinkActionWithInstitutionId> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (EmbeddedOpenLinkActionWithInstitutionId.class) {
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

        public static C6972a newBuilder(EmbeddedOpenLinkActionWithInstitutionId embeddedOpenLinkActionWithInstitutionId) {
            return DEFAULT_INSTANCE.createBuilder(embeddedOpenLinkActionWithInstitutionId);
        }

        public static EmbeddedOpenLinkActionWithInstitutionId parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedOpenLinkActionWithInstitutionId) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EmbeddedOpenLinkActionWithInstitutionId parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedOpenLinkActionWithInstitutionId) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static EmbeddedOpenLinkActionWithInstitutionId parseFrom(ByteString byteString) {
            return (EmbeddedOpenLinkActionWithInstitutionId) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static EmbeddedOpenLinkActionWithInstitutionId parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedOpenLinkActionWithInstitutionId) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static EmbeddedOpenLinkActionWithInstitutionId parseFrom(byte[] bArr) {
            return (EmbeddedOpenLinkActionWithInstitutionId) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EmbeddedOpenLinkActionWithInstitutionId parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedOpenLinkActionWithInstitutionId) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static EmbeddedOpenLinkActionWithInstitutionId parseFrom(InputStream inputStream) {
            return (EmbeddedOpenLinkActionWithInstitutionId) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EmbeddedOpenLinkActionWithInstitutionId parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedOpenLinkActionWithInstitutionId) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static EmbeddedOpenLinkActionWithInstitutionId parseFrom(CodedInputStream codedInputStream) {
            return (EmbeddedOpenLinkActionWithInstitutionId) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static EmbeddedOpenLinkActionWithInstitutionId parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedOpenLinkActionWithInstitutionId) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration$b */
    public enum EnumC6974b {
        OPEN_LINK_ACTION_DEFAULT(2),
        OPEN_LINK_ACTION_WITH_INSTITUTION_ID(3),
        OPEN_LINK_ACTION_LINK_WITH_ACCOUNT_NUMBERS(4),
        EMBEDDEDOPENLINKACTION_NOT_SET(0);


        /* renamed from: a */
        public final int f2628a;

        EnumC6974b(int i) {
            this.f2628a = i;
        }

        public static EnumC6974b forNumber(int i) {
            if (i == 0) {
                return EMBEDDEDOPENLINKACTION_NOT_SET;
            }
            if (i == 2) {
                return OPEN_LINK_ACTION_DEFAULT;
            }
            if (i == 3) {
                return OPEN_LINK_ACTION_WITH_INSTITUTION_ID;
            }
            if (i != 4) {
                return null;
            }
            return OPEN_LINK_ACTION_LINK_WITH_ACCOUNT_NUMBERS;
        }

        public int getNumber() {
            return this.f2628a;
        }

        @Deprecated
        public static EnumC6974b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Configuration$EmbeddedOpenLinkConfiguration configuration$EmbeddedOpenLinkConfiguration = new Configuration$EmbeddedOpenLinkConfiguration();
        DEFAULT_INSTANCE = configuration$EmbeddedOpenLinkConfiguration;
        GeneratedMessageLite.registerDefaultInstance(Configuration$EmbeddedOpenLinkConfiguration.class, configuration$EmbeddedOpenLinkConfiguration);
    }

    private Configuration$EmbeddedOpenLinkConfiguration() {
    }

    private void clearEmbeddedOpenLinkAction() {
        this.embeddedOpenLinkActionCase_ = 0;
        this.embeddedOpenLinkAction_ = null;
    }

    private void clearEmbeddedWorkflowSessionId() {
        this.embeddedWorkflowSessionId_ = getDefaultInstance().getEmbeddedWorkflowSessionId();
    }

    private void clearIsPolling() {
        this.isPolling_ = false;
    }

    private void clearOpenLinkActionDefault() {
        if (this.embeddedOpenLinkActionCase_ == 2) {
            this.embeddedOpenLinkActionCase_ = 0;
            this.embeddedOpenLinkAction_ = null;
        }
    }

    private void clearOpenLinkActionLinkWithAccountNumbers() {
        if (this.embeddedOpenLinkActionCase_ == 4) {
            this.embeddedOpenLinkActionCase_ = 0;
            this.embeddedOpenLinkAction_ = null;
        }
    }

    private void clearOpenLinkActionWithInstitutionId() {
        if (this.embeddedOpenLinkActionCase_ == 3) {
            this.embeddedOpenLinkActionCase_ = 0;
            this.embeddedOpenLinkAction_ = null;
        }
    }

    public static Configuration$EmbeddedOpenLinkConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeOpenLinkActionDefault(EmbeddedOpenLinkActionDefault embeddedOpenLinkActionDefault) {
        embeddedOpenLinkActionDefault.getClass();
        if (this.embeddedOpenLinkActionCase_ != 2 || this.embeddedOpenLinkAction_ == EmbeddedOpenLinkActionDefault.getDefaultInstance()) {
            this.embeddedOpenLinkAction_ = embeddedOpenLinkActionDefault;
        } else {
            this.embeddedOpenLinkAction_ = EmbeddedOpenLinkActionDefault.newBuilder((EmbeddedOpenLinkActionDefault) this.embeddedOpenLinkAction_).mergeFrom((EmbeddedOpenLinkActionDefault.C6970a) embeddedOpenLinkActionDefault).buildPartial();
        }
        this.embeddedOpenLinkActionCase_ = 2;
    }

    private void mergeOpenLinkActionLinkWithAccountNumbers(EmbeddedOpenLinkActionLinkWithAccountNumbers embeddedOpenLinkActionLinkWithAccountNumbers) {
        embeddedOpenLinkActionLinkWithAccountNumbers.getClass();
        if (this.embeddedOpenLinkActionCase_ != 4 || this.embeddedOpenLinkAction_ == EmbeddedOpenLinkActionLinkWithAccountNumbers.getDefaultInstance()) {
            this.embeddedOpenLinkAction_ = embeddedOpenLinkActionLinkWithAccountNumbers;
        } else {
            this.embeddedOpenLinkAction_ = EmbeddedOpenLinkActionLinkWithAccountNumbers.newBuilder((EmbeddedOpenLinkActionLinkWithAccountNumbers) this.embeddedOpenLinkAction_).mergeFrom((EmbeddedOpenLinkActionLinkWithAccountNumbers.C6971a) embeddedOpenLinkActionLinkWithAccountNumbers).buildPartial();
        }
        this.embeddedOpenLinkActionCase_ = 4;
    }

    private void mergeOpenLinkActionWithInstitutionId(EmbeddedOpenLinkActionWithInstitutionId embeddedOpenLinkActionWithInstitutionId) {
        embeddedOpenLinkActionWithInstitutionId.getClass();
        if (this.embeddedOpenLinkActionCase_ != 3 || this.embeddedOpenLinkAction_ == EmbeddedOpenLinkActionWithInstitutionId.getDefaultInstance()) {
            this.embeddedOpenLinkAction_ = embeddedOpenLinkActionWithInstitutionId;
        } else {
            this.embeddedOpenLinkAction_ = EmbeddedOpenLinkActionWithInstitutionId.newBuilder((EmbeddedOpenLinkActionWithInstitutionId) this.embeddedOpenLinkAction_).mergeFrom((EmbeddedOpenLinkActionWithInstitutionId.C6972a) embeddedOpenLinkActionWithInstitutionId).buildPartial();
        }
        this.embeddedOpenLinkActionCase_ = 3;
    }

    public static C6973a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$EmbeddedOpenLinkConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$EmbeddedOpenLinkConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$EmbeddedOpenLinkConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$EmbeddedOpenLinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$EmbeddedOpenLinkConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEmbeddedWorkflowSessionId(String str) {
        str.getClass();
        this.embeddedWorkflowSessionId_ = str;
    }

    private void setEmbeddedWorkflowSessionIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.embeddedWorkflowSessionId_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPolling(boolean z) {
        this.isPolling_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenLinkActionDefault(EmbeddedOpenLinkActionDefault embeddedOpenLinkActionDefault) {
        embeddedOpenLinkActionDefault.getClass();
        this.embeddedOpenLinkAction_ = embeddedOpenLinkActionDefault;
        this.embeddedOpenLinkActionCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenLinkActionLinkWithAccountNumbers(EmbeddedOpenLinkActionLinkWithAccountNumbers embeddedOpenLinkActionLinkWithAccountNumbers) {
        embeddedOpenLinkActionLinkWithAccountNumbers.getClass();
        this.embeddedOpenLinkAction_ = embeddedOpenLinkActionLinkWithAccountNumbers;
        this.embeddedOpenLinkActionCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenLinkActionWithInstitutionId(EmbeddedOpenLinkActionWithInstitutionId embeddedOpenLinkActionWithInstitutionId) {
        embeddedOpenLinkActionWithInstitutionId.getClass();
        this.embeddedOpenLinkAction_ = embeddedOpenLinkActionWithInstitutionId;
        this.embeddedOpenLinkActionCase_ = 3;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$EmbeddedOpenLinkConfiguration();
            case 2:
                return new C6973a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005\u0007", new Object[]{"embeddedOpenLinkAction_", "embeddedOpenLinkActionCase_", "embeddedWorkflowSessionId_", EmbeddedOpenLinkActionDefault.class, EmbeddedOpenLinkActionWithInstitutionId.class, EmbeddedOpenLinkActionLinkWithAccountNumbers.class, "isPolling_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$EmbeddedOpenLinkConfiguration> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Configuration$EmbeddedOpenLinkConfiguration.class) {
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

    public EnumC6974b getEmbeddedOpenLinkActionCase() {
        return EnumC6974b.forNumber(this.embeddedOpenLinkActionCase_);
    }

    public String getEmbeddedWorkflowSessionId() {
        return this.embeddedWorkflowSessionId_;
    }

    public ByteString getEmbeddedWorkflowSessionIdBytes() {
        return ByteString.copyFromUtf8(this.embeddedWorkflowSessionId_);
    }

    public boolean getIsPolling() {
        return this.isPolling_;
    }

    public EmbeddedOpenLinkActionDefault getOpenLinkActionDefault() {
        return this.embeddedOpenLinkActionCase_ == 2 ? (EmbeddedOpenLinkActionDefault) this.embeddedOpenLinkAction_ : EmbeddedOpenLinkActionDefault.getDefaultInstance();
    }

    public EmbeddedOpenLinkActionLinkWithAccountNumbers getOpenLinkActionLinkWithAccountNumbers() {
        return this.embeddedOpenLinkActionCase_ == 4 ? (EmbeddedOpenLinkActionLinkWithAccountNumbers) this.embeddedOpenLinkAction_ : EmbeddedOpenLinkActionLinkWithAccountNumbers.getDefaultInstance();
    }

    public EmbeddedOpenLinkActionWithInstitutionId getOpenLinkActionWithInstitutionId() {
        return this.embeddedOpenLinkActionCase_ == 3 ? (EmbeddedOpenLinkActionWithInstitutionId) this.embeddedOpenLinkAction_ : EmbeddedOpenLinkActionWithInstitutionId.getDefaultInstance();
    }

    public boolean hasOpenLinkActionDefault() {
        return this.embeddedOpenLinkActionCase_ == 2;
    }

    public boolean hasOpenLinkActionLinkWithAccountNumbers() {
        return this.embeddedOpenLinkActionCase_ == 4;
    }

    public boolean hasOpenLinkActionWithInstitutionId() {
        return this.embeddedOpenLinkActionCase_ == 3;
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration$a */
    public static final class C6973a extends GeneratedMessageLite.Builder<Configuration$EmbeddedOpenLinkConfiguration, C6973a> implements MessageLiteOrBuilder {
        public C6973a() {
            super(Configuration$EmbeddedOpenLinkConfiguration.DEFAULT_INSTANCE);
        }

        /* renamed from: a */
        public final C6973a m1464a(String str) {
            copyOnWrite();
            ((Configuration$EmbeddedOpenLinkConfiguration) this.instance).setEmbeddedWorkflowSessionId(str);
            return this;
        }

        /* renamed from: a */
        public final void m1466a(EmbeddedOpenLinkActionDefault embeddedOpenLinkActionDefault) {
            copyOnWrite();
            ((Configuration$EmbeddedOpenLinkConfiguration) this.instance).setOpenLinkActionDefault(embeddedOpenLinkActionDefault);
        }

        /* renamed from: a */
        public final void m1468a(EmbeddedOpenLinkActionWithInstitutionId embeddedOpenLinkActionWithInstitutionId) {
            copyOnWrite();
            ((Configuration$EmbeddedOpenLinkConfiguration) this.instance).setOpenLinkActionWithInstitutionId(embeddedOpenLinkActionWithInstitutionId);
        }

        /* renamed from: a */
        public final void m1467a(EmbeddedOpenLinkActionLinkWithAccountNumbers embeddedOpenLinkActionLinkWithAccountNumbers) {
            copyOnWrite();
            ((Configuration$EmbeddedOpenLinkConfiguration) this.instance).setOpenLinkActionLinkWithAccountNumbers(embeddedOpenLinkActionLinkWithAccountNumbers);
        }

        /* renamed from: a */
        public final C6973a m1465a(boolean z) {
            copyOnWrite();
            ((Configuration$EmbeddedOpenLinkConfiguration) this.instance).setIsPolling(z);
            return this;
        }
    }

    public static C6973a newBuilder(Configuration$EmbeddedOpenLinkConfiguration configuration$EmbeddedOpenLinkConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(configuration$EmbeddedOpenLinkConfiguration);
    }

    public static Configuration$EmbeddedOpenLinkConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedOpenLinkConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$EmbeddedOpenLinkConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedOpenLinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$EmbeddedOpenLinkConfiguration parseFrom(ByteString byteString) {
        return (Configuration$EmbeddedOpenLinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$EmbeddedOpenLinkConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedOpenLinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$EmbeddedOpenLinkConfiguration parseFrom(byte[] bArr) {
        return (Configuration$EmbeddedOpenLinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$EmbeddedOpenLinkConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedOpenLinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$EmbeddedOpenLinkConfiguration parseFrom(InputStream inputStream) {
        return (Configuration$EmbeddedOpenLinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$EmbeddedOpenLinkConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedOpenLinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$EmbeddedOpenLinkConfiguration parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$EmbeddedOpenLinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$EmbeddedOpenLinkConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$EmbeddedOpenLinkConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
