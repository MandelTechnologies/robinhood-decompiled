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
public final class Configuration$SDKMetadata extends GeneratedMessageLite<Configuration$SDKMetadata, C6985a> implements MessageLiteOrBuilder {
    public static final int ANDROID_APP_HASH_FIELD_NUMBER = 7;
    public static final int APP_PACKAGE_NAME_FIELD_NUMBER = 6;
    public static final int CLIENT_TYPE_FIELD_NUMBER = 1;
    public static final int COMMIT_FIELD_NUMBER = 3;
    private static final Configuration$SDKMetadata DEFAULT_INSTANCE;
    public static final int INTEGRATION_MODE_FIELD_NUMBER = 4;
    private static volatile Parser<Configuration$SDKMetadata> PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    public static final int WRAPPING_SDKS_FIELD_NUMBER = 5;
    private int clientType_;
    private int integrationMode_;
    private String version_ = "";
    private String commit_ = "";
    private Internal.ProtobufList<WrappingSDK> wrappingSdks_ = GeneratedMessageLite.emptyProtobufList();
    private String appPackageName_ = "";
    private String androidAppHash_ = "";

    public static final class WrappingSDK extends GeneratedMessageLite<WrappingSDK, C6984a> implements InterfaceC6986b {
        public static final int CLIENT_TYPE_FIELD_NUMBER = 1;
        private static final WrappingSDK DEFAULT_INSTANCE;
        private static volatile Parser<WrappingSDK> PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 2;
        private int clientType_;
        private String version_ = "";

        static {
            WrappingSDK wrappingSDK = new WrappingSDK();
            DEFAULT_INSTANCE = wrappingSDK;
            GeneratedMessageLite.registerDefaultInstance(WrappingSDK.class, wrappingSDK);
        }

        private WrappingSDK() {
        }

        private void clearClientType() {
            this.clientType_ = 0;
        }

        private void clearVersion() {
            this.version_ = getDefaultInstance().getVersion();
        }

        public static WrappingSDK getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6984a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static WrappingSDK parseDelimitedFrom(InputStream inputStream) {
            return (WrappingSDK) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WrappingSDK parseFrom(ByteBuffer byteBuffer) {
            return (WrappingSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<WrappingSDK> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientType(EnumC7027g enumC7027g) {
            this.clientType_ = enumC7027g.getNumber();
        }

        private void setClientTypeValue(int i) {
            this.clientType_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(String str) {
            str.getClass();
            this.version_ = str;
        }

        private void setVersionBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.version_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
                case 1:
                    return new WrappingSDK();
                case 2:
                    return new C6984a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"clientType_", "version_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<WrappingSDK> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (WrappingSDK.class) {
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

        public EnumC7027g getClientType() {
            EnumC7027g enumC7027gForNumber = EnumC7027g.forNumber(this.clientType_);
            return enumC7027gForNumber == null ? EnumC7027g.UNRECOGNIZED : enumC7027gForNumber;
        }

        public int getClientTypeValue() {
            return this.clientType_;
        }

        public String getVersion() {
            return this.version_;
        }

        public ByteString getVersionBytes() {
            return ByteString.copyFromUtf8(this.version_);
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata$WrappingSDK$a */
        public static final class C6984a extends GeneratedMessageLite.Builder<WrappingSDK, C6984a> implements InterfaceC6986b {
            public C6984a() {
                super(WrappingSDK.DEFAULT_INSTANCE);
            }

            /* renamed from: a */
            public final C6984a m1479a(EnumC7027g enumC7027g) {
                copyOnWrite();
                ((WrappingSDK) this.instance).setClientType(enumC7027g);
                return this;
            }

            /* renamed from: a */
            public final C6984a m1480a(String str) {
                copyOnWrite();
                ((WrappingSDK) this.instance).setVersion(str);
                return this;
            }
        }

        public static C6984a newBuilder(WrappingSDK wrappingSDK) {
            return DEFAULT_INSTANCE.createBuilder(wrappingSDK);
        }

        public static WrappingSDK parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WrappingSDK) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WrappingSDK parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (WrappingSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static WrappingSDK parseFrom(ByteString byteString) {
            return (WrappingSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static WrappingSDK parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (WrappingSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static WrappingSDK parseFrom(byte[] bArr) {
            return (WrappingSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static WrappingSDK parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (WrappingSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static WrappingSDK parseFrom(InputStream inputStream) {
            return (WrappingSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static WrappingSDK parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WrappingSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static WrappingSDK parseFrom(CodedInputStream codedInputStream) {
            return (WrappingSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static WrappingSDK parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (WrappingSDK) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata$b */
    public interface InterfaceC6986b extends MessageLiteOrBuilder {
    }

    static {
        Configuration$SDKMetadata configuration$SDKMetadata = new Configuration$SDKMetadata();
        DEFAULT_INSTANCE = configuration$SDKMetadata;
        GeneratedMessageLite.registerDefaultInstance(Configuration$SDKMetadata.class, configuration$SDKMetadata);
    }

    private Configuration$SDKMetadata() {
    }

    private void addAllWrappingSdks(Iterable<? extends WrappingSDK> iterable) {
        ensureWrappingSdksIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.wrappingSdks_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addWrappingSdks(WrappingSDK wrappingSDK) {
        wrappingSDK.getClass();
        ensureWrappingSdksIsMutable();
        this.wrappingSdks_.add(wrappingSDK);
    }

    private void clearAndroidAppHash() {
        this.androidAppHash_ = getDefaultInstance().getAndroidAppHash();
    }

    private void clearAppPackageName() {
        this.appPackageName_ = getDefaultInstance().getAppPackageName();
    }

    private void clearClientType() {
        this.clientType_ = 0;
    }

    private void clearCommit() {
        this.commit_ = getDefaultInstance().getCommit();
    }

    private void clearIntegrationMode() {
        this.integrationMode_ = 0;
    }

    private void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    private void clearWrappingSdks() {
        this.wrappingSdks_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureWrappingSdksIsMutable() {
        Internal.ProtobufList<WrappingSDK> protobufList = this.wrappingSdks_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.wrappingSdks_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Configuration$SDKMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6985a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$SDKMetadata parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$SDKMetadata parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$SDKMetadata> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeWrappingSdks(int i) {
        ensureWrappingSdksIsMutable();
        this.wrappingSdks_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidAppHash(String str) {
        str.getClass();
        this.androidAppHash_ = str;
    }

    private void setAndroidAppHashBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.androidAppHash_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppPackageName(String str) {
        str.getClass();
        this.appPackageName_ = str;
    }

    private void setAppPackageNameBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.appPackageName_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientType(EnumC7027g enumC7027g) {
        this.clientType_ = enumC7027g.getNumber();
    }

    private void setClientTypeValue(int i) {
        this.clientType_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCommit(String str) {
        str.getClass();
        this.commit_ = str;
    }

    private void setCommitBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.commit_ = byteString.toStringUtf8();
    }

    private void setIntegrationMode(EnumC7029i enumC7029i) {
        this.integrationMode_ = enumC7029i.getNumber();
    }

    private void setIntegrationModeValue(int i) {
        this.integrationMode_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(String str) {
        str.getClass();
        this.version_ = str;
    }

    private void setVersionBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.version_ = byteString.toStringUtf8();
    }

    private void setWrappingSdks(int i, WrappingSDK wrappingSDK) {
        wrappingSDK.getClass();
        ensureWrappingSdksIsMutable();
        this.wrappingSdks_.set(i, wrappingSDK);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$SDKMetadata();
            case 2:
                return new C6985a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004\f\u0005\u001b\u0006Ȉ\u0007Ȉ", new Object[]{"clientType_", "version_", "commit_", "integrationMode_", "wrappingSdks_", WrappingSDK.class, "appPackageName_", "androidAppHash_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$SDKMetadata> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Configuration$SDKMetadata.class) {
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

    public String getAndroidAppHash() {
        return this.androidAppHash_;
    }

    public ByteString getAndroidAppHashBytes() {
        return ByteString.copyFromUtf8(this.androidAppHash_);
    }

    public String getAppPackageName() {
        return this.appPackageName_;
    }

    public ByteString getAppPackageNameBytes() {
        return ByteString.copyFromUtf8(this.appPackageName_);
    }

    public EnumC7027g getClientType() {
        EnumC7027g enumC7027gForNumber = EnumC7027g.forNumber(this.clientType_);
        return enumC7027gForNumber == null ? EnumC7027g.UNRECOGNIZED : enumC7027gForNumber;
    }

    public int getClientTypeValue() {
        return this.clientType_;
    }

    public String getCommit() {
        return this.commit_;
    }

    public ByteString getCommitBytes() {
        return ByteString.copyFromUtf8(this.commit_);
    }

    public EnumC7029i getIntegrationMode() {
        EnumC7029i enumC7029iForNumber = EnumC7029i.forNumber(this.integrationMode_);
        return enumC7029iForNumber == null ? EnumC7029i.UNRECOGNIZED : enumC7029iForNumber;
    }

    public int getIntegrationModeValue() {
        return this.integrationMode_;
    }

    public String getVersion() {
        return this.version_;
    }

    public ByteString getVersionBytes() {
        return ByteString.copyFromUtf8(this.version_);
    }

    public WrappingSDK getWrappingSdks(int i) {
        return this.wrappingSdks_.get(i);
    }

    public int getWrappingSdksCount() {
        return this.wrappingSdks_.size();
    }

    public List<WrappingSDK> getWrappingSdksList() {
        return this.wrappingSdks_;
    }

    public InterfaceC6986b getWrappingSdksOrBuilder(int i) {
        return this.wrappingSdks_.get(i);
    }

    public List<? extends InterfaceC6986b> getWrappingSdksOrBuilderList() {
        return this.wrappingSdks_;
    }

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata$a */
    public static final class C6985a extends GeneratedMessageLite.Builder<Configuration$SDKMetadata, C6985a> implements MessageLiteOrBuilder {
        public C6985a() {
            super(Configuration$SDKMetadata.DEFAULT_INSTANCE);
        }

        /* renamed from: a */
        public final void m1483a(EnumC7027g enumC7027g) {
            copyOnWrite();
            ((Configuration$SDKMetadata) this.instance).setClientType(enumC7027g);
        }

        /* renamed from: b */
        public final void m1485b(String str) {
            copyOnWrite();
            ((Configuration$SDKMetadata) this.instance).setAppPackageName(str);
        }

        /* renamed from: c */
        public final void m1486c(String str) {
            copyOnWrite();
            ((Configuration$SDKMetadata) this.instance).setVersion(str);
        }

        /* renamed from: a */
        public final void m1481a() {
            copyOnWrite();
            ((Configuration$SDKMetadata) this.instance).setCommit("5d8ab3d97fe");
        }

        /* renamed from: a */
        public final void m1482a(WrappingSDK wrappingSDK) {
            copyOnWrite();
            ((Configuration$SDKMetadata) this.instance).addWrappingSdks(wrappingSDK);
        }

        /* renamed from: a */
        public final void m1484a(String str) {
            copyOnWrite();
            ((Configuration$SDKMetadata) this.instance).setAndroidAppHash(str);
        }
    }

    public static C6985a newBuilder(Configuration$SDKMetadata configuration$SDKMetadata) {
        return DEFAULT_INSTANCE.createBuilder(configuration$SDKMetadata);
    }

    public static Configuration$SDKMetadata parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$SDKMetadata parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$SDKMetadata parseFrom(ByteString byteString) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addWrappingSdks(int i, WrappingSDK wrappingSDK) {
        wrappingSDK.getClass();
        ensureWrappingSdksIsMutable();
        this.wrappingSdks_.add(i, wrappingSDK);
    }

    public static Configuration$SDKMetadata parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$SDKMetadata parseFrom(byte[] bArr) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$SDKMetadata parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$SDKMetadata parseFrom(InputStream inputStream) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$SDKMetadata parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$SDKMetadata parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$SDKMetadata parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$SDKMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
