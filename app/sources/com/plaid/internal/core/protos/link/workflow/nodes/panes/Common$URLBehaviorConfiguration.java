package com.plaid.internal.core.protos.link.workflow.nodes.panes;

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
public final class Common$URLBehaviorConfiguration extends GeneratedMessageLite<Common$URLBehaviorConfiguration, C6547a> implements InterfaceC6896X {
    public static final int BEHAVIOR_FIELD_NUMBER = 2;
    private static final Common$URLBehaviorConfiguration DEFAULT_INSTANCE;
    public static final int MATCHER_FIELD_NUMBER = 1;
    private static volatile Parser<Common$URLBehaviorConfiguration> PARSER;
    private int behavior_;
    private int bitField0_;
    private Matcher matcher_;

    public static final class Matcher extends GeneratedMessageLite<Matcher, C6546a> implements MessageLiteOrBuilder {
        private static final Matcher DEFAULT_INSTANCE;
        public static final int EXPECTED_QUERY_PARAMETERS_FIELD_NUMBER = 4;
        public static final int HOST_FIELD_NUMBER = 2;
        private static volatile Parser<Matcher> PARSER = null;
        public static final int PATH_FIELD_NUMBER = 3;
        public static final int SCHEME_FIELD_NUMBER = 1;
        private String scheme_ = "";
        private String host_ = "";
        private String path_ = "";
        private Internal.ProtobufList<String> expectedQueryParameters_ = GeneratedMessageLite.emptyProtobufList();

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration$Matcher$a */
        public static final class C6546a extends GeneratedMessageLite.Builder<Matcher, C6546a> implements MessageLiteOrBuilder {
            public C6546a() {
                super(Matcher.DEFAULT_INSTANCE);
            }
        }

        static {
            Matcher matcher = new Matcher();
            DEFAULT_INSTANCE = matcher;
            GeneratedMessageLite.registerDefaultInstance(Matcher.class, matcher);
        }

        private Matcher() {
        }

        private void addAllExpectedQueryParameters(Iterable<String> iterable) {
            ensureExpectedQueryParametersIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.expectedQueryParameters_);
        }

        private void addExpectedQueryParameters(String str) {
            str.getClass();
            ensureExpectedQueryParametersIsMutable();
            this.expectedQueryParameters_.add(str);
        }

        private void addExpectedQueryParametersBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            ensureExpectedQueryParametersIsMutable();
            this.expectedQueryParameters_.add(byteString.toStringUtf8());
        }

        private void clearExpectedQueryParameters() {
            this.expectedQueryParameters_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void clearHost() {
            this.host_ = getDefaultInstance().getHost();
        }

        private void clearPath() {
            this.path_ = getDefaultInstance().getPath();
        }

        private void clearScheme() {
            this.scheme_ = getDefaultInstance().getScheme();
        }

        private void ensureExpectedQueryParametersIsMutable() {
            Internal.ProtobufList<String> protobufList = this.expectedQueryParameters_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.expectedQueryParameters_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static Matcher getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6546a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Matcher parseDelimitedFrom(InputStream inputStream) {
            return (Matcher) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Matcher parseFrom(ByteBuffer byteBuffer) {
            return (Matcher) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<Matcher> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setExpectedQueryParameters(int i, String str) {
            str.getClass();
            ensureExpectedQueryParametersIsMutable();
            this.expectedQueryParameters_.set(i, str);
        }

        private void setHost(String str) {
            str.getClass();
            this.host_ = str;
        }

        private void setHostBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.host_ = byteString.toStringUtf8();
        }

        private void setPath(String str) {
            str.getClass();
            this.path_ = str;
        }

        private void setPathBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.path_ = byteString.toStringUtf8();
        }

        private void setScheme(String str) {
            str.getClass();
            this.scheme_ = str;
        }

        private void setSchemeBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.scheme_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
                case 1:
                    return new Matcher();
                case 2:
                    return new C6546a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ț", new Object[]{"scheme_", "host_", "path_", "expectedQueryParameters_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<Matcher> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (Matcher.class) {
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

        public String getExpectedQueryParameters(int i) {
            return this.expectedQueryParameters_.get(i);
        }

        public ByteString getExpectedQueryParametersBytes(int i) {
            return ByteString.copyFromUtf8(this.expectedQueryParameters_.get(i));
        }

        public int getExpectedQueryParametersCount() {
            return this.expectedQueryParameters_.size();
        }

        public List<String> getExpectedQueryParametersList() {
            return this.expectedQueryParameters_;
        }

        public String getHost() {
            return this.host_;
        }

        public ByteString getHostBytes() {
            return ByteString.copyFromUtf8(this.host_);
        }

        public String getPath() {
            return this.path_;
        }

        public ByteString getPathBytes() {
            return ByteString.copyFromUtf8(this.path_);
        }

        public String getScheme() {
            return this.scheme_;
        }

        public ByteString getSchemeBytes() {
            return ByteString.copyFromUtf8(this.scheme_);
        }

        public static C6546a newBuilder(Matcher matcher) {
            return DEFAULT_INSTANCE.createBuilder(matcher);
        }

        public static Matcher parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Matcher) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Matcher parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (Matcher) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static Matcher parseFrom(ByteString byteString) {
            return (Matcher) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Matcher parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (Matcher) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static Matcher parseFrom(byte[] bArr) {
            return (Matcher) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Matcher parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (Matcher) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static Matcher parseFrom(InputStream inputStream) {
            return (Matcher) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Matcher parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Matcher) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static Matcher parseFrom(CodedInputStream codedInputStream) {
            return (Matcher) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static Matcher parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Matcher) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$URLBehaviorConfiguration$a */
    public static final class C6547a extends GeneratedMessageLite.Builder<Common$URLBehaviorConfiguration, C6547a> implements InterfaceC6896X {
        public C6547a() {
            super(Common$URLBehaviorConfiguration.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$URLBehaviorConfiguration common$URLBehaviorConfiguration = new Common$URLBehaviorConfiguration();
        DEFAULT_INSTANCE = common$URLBehaviorConfiguration;
        GeneratedMessageLite.registerDefaultInstance(Common$URLBehaviorConfiguration.class, common$URLBehaviorConfiguration);
    }

    private Common$URLBehaviorConfiguration() {
    }

    private void clearBehavior() {
        this.behavior_ = 0;
    }

    private void clearMatcher() {
        this.matcher_ = null;
        this.bitField0_ &= -2;
    }

    public static Common$URLBehaviorConfiguration getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeMatcher(Matcher matcher) {
        matcher.getClass();
        Matcher matcher2 = this.matcher_;
        if (matcher2 == null || matcher2 == Matcher.getDefaultInstance()) {
            this.matcher_ = matcher;
        } else {
            this.matcher_ = Matcher.newBuilder(this.matcher_).mergeFrom((Matcher.C6546a) matcher).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C6547a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$URLBehaviorConfiguration parseDelimitedFrom(InputStream inputStream) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$URLBehaviorConfiguration parseFrom(ByteBuffer byteBuffer) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Common$URLBehaviorConfiguration> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setBehavior(EnumC6895W enumC6895W) {
        this.behavior_ = enumC6895W.getNumber();
    }

    private void setBehaviorValue(int i) {
        this.behavior_ = i;
    }

    private void setMatcher(Matcher matcher) {
        matcher.getClass();
        this.matcher_ = matcher;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6917j.f2562a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$URLBehaviorConfiguration();
            case 2:
                return new C6547a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f", new Object[]{"bitField0_", "matcher_", "behavior_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$URLBehaviorConfiguration> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Common$URLBehaviorConfiguration.class) {
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

    public EnumC6895W getBehavior() {
        EnumC6895W enumC6895WForNumber = EnumC6895W.forNumber(this.behavior_);
        return enumC6895WForNumber == null ? EnumC6895W.UNRECOGNIZED : enumC6895WForNumber;
    }

    public int getBehaviorValue() {
        return this.behavior_;
    }

    public Matcher getMatcher() {
        Matcher matcher = this.matcher_;
        return matcher == null ? Matcher.getDefaultInstance() : matcher;
    }

    public boolean hasMatcher() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6547a newBuilder(Common$URLBehaviorConfiguration common$URLBehaviorConfiguration) {
        return DEFAULT_INSTANCE.createBuilder(common$URLBehaviorConfiguration);
    }

    public static Common$URLBehaviorConfiguration parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$URLBehaviorConfiguration parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$URLBehaviorConfiguration parseFrom(ByteString byteString) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Common$URLBehaviorConfiguration parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$URLBehaviorConfiguration parseFrom(byte[] bArr) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$URLBehaviorConfiguration parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Common$URLBehaviorConfiguration parseFrom(InputStream inputStream) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$URLBehaviorConfiguration parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$URLBehaviorConfiguration parseFrom(CodedInputStream codedInputStream) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$URLBehaviorConfiguration parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$URLBehaviorConfiguration) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
