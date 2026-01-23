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
public final class Configuration$ClientCapabilities extends GeneratedMessageLite<Configuration$ClientCapabilities, C6957a> implements MessageLiteOrBuilder {
    private static final Configuration$ClientCapabilities DEFAULT_INSTANCE;
    public static final int DETECTED_WEB3_WALLET_IDS_FIELD_NUMBER = 3;
    public static final int DISABLE_CUSTOM_TABS_FIELD_NUMBER = 4;
    public static final int INCREMENTAL_CALLBACK_SUPPORT_FIELD_NUMBER = 2;
    private static volatile Parser<Configuration$ClientCapabilities> PARSER = null;
    public static final int SUPPORTS_EAGER_START_FIELD_NUMBER = 5;
    public static final int SUPPORTS_INCREMENTAL_RESULTS_FIELD_NUMBER = 1;
    private Internal.ProtobufList<String> detectedWeb3WalletIds_ = GeneratedMessageLite.emptyProtobufList();
    private boolean disableCustomTabs_;
    private int incrementalCallbackSupport_;
    private boolean supportsEagerStart_;
    private boolean supportsIncrementalResults_;

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities$a */
    public static final class C6957a extends GeneratedMessageLite.Builder<Configuration$ClientCapabilities, C6957a> implements MessageLiteOrBuilder {
        public C6957a() {
            super(Configuration$ClientCapabilities.DEFAULT_INSTANCE);
        }

        /* renamed from: a */
        public final C6957a m1448a(boolean z) {
            copyOnWrite();
            ((Configuration$ClientCapabilities) this.instance).setDisableCustomTabs(z);
            return this;
        }

        /* renamed from: b */
        public final C6957a m1449b(boolean z) {
            copyOnWrite();
            ((Configuration$ClientCapabilities) this.instance).setSupportsEagerStart(z);
            return this;
        }
    }

    static {
        Configuration$ClientCapabilities configuration$ClientCapabilities = new Configuration$ClientCapabilities();
        DEFAULT_INSTANCE = configuration$ClientCapabilities;
        GeneratedMessageLite.registerDefaultInstance(Configuration$ClientCapabilities.class, configuration$ClientCapabilities);
    }

    private Configuration$ClientCapabilities() {
    }

    private void addAllDetectedWeb3WalletIds(Iterable<String> iterable) {
        ensureDetectedWeb3WalletIdsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.detectedWeb3WalletIds_);
    }

    private void addDetectedWeb3WalletIds(String str) {
        str.getClass();
        ensureDetectedWeb3WalletIdsIsMutable();
        this.detectedWeb3WalletIds_.add(str);
    }

    private void addDetectedWeb3WalletIdsBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        ensureDetectedWeb3WalletIdsIsMutable();
        this.detectedWeb3WalletIds_.add(byteString.toStringUtf8());
    }

    private void clearDetectedWeb3WalletIds() {
        this.detectedWeb3WalletIds_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void clearDisableCustomTabs() {
        this.disableCustomTabs_ = false;
    }

    private void clearIncrementalCallbackSupport() {
        this.incrementalCallbackSupport_ = 0;
    }

    private void clearSupportsEagerStart() {
        this.supportsEagerStart_ = false;
    }

    private void clearSupportsIncrementalResults() {
        this.supportsIncrementalResults_ = false;
    }

    private void ensureDetectedWeb3WalletIdsIsMutable() {
        Internal.ProtobufList<String> protobufList = this.detectedWeb3WalletIds_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.detectedWeb3WalletIds_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static Configuration$ClientCapabilities getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6957a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Configuration$ClientCapabilities parseDelimitedFrom(InputStream inputStream) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$ClientCapabilities parseFrom(ByteBuffer byteBuffer) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Configuration$ClientCapabilities> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setDetectedWeb3WalletIds(int i, String str) {
        str.getClass();
        ensureDetectedWeb3WalletIdsIsMutable();
        this.detectedWeb3WalletIds_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisableCustomTabs(boolean z) {
        this.disableCustomTabs_ = z;
    }

    private void setIncrementalCallbackSupport(EnumC7028h enumC7028h) {
        this.incrementalCallbackSupport_ = enumC7028h.getNumber();
    }

    private void setIncrementalCallbackSupportValue(int i) {
        this.incrementalCallbackSupport_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSupportsEagerStart(boolean z) {
        this.supportsEagerStart_ = z;
    }

    private void setSupportsIncrementalResults(boolean z) {
        this.supportsIncrementalResults_ = z;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7025e.f2658a[methodToInvoke.ordinal()]) {
            case 1:
                return new Configuration$ClientCapabilities();
            case 2:
                return new C6957a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0007\u0002\f\u0003Ț\u0004\u0007\u0005\u0007", new Object[]{"supportsIncrementalResults_", "incrementalCallbackSupport_", "detectedWeb3WalletIds_", "disableCustomTabs_", "supportsEagerStart_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Configuration$ClientCapabilities> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Configuration$ClientCapabilities.class) {
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

    public String getDetectedWeb3WalletIds(int i) {
        return this.detectedWeb3WalletIds_.get(i);
    }

    public ByteString getDetectedWeb3WalletIdsBytes(int i) {
        return ByteString.copyFromUtf8(this.detectedWeb3WalletIds_.get(i));
    }

    public int getDetectedWeb3WalletIdsCount() {
        return this.detectedWeb3WalletIds_.size();
    }

    public List<String> getDetectedWeb3WalletIdsList() {
        return this.detectedWeb3WalletIds_;
    }

    public boolean getDisableCustomTabs() {
        return this.disableCustomTabs_;
    }

    public EnumC7028h getIncrementalCallbackSupport() {
        EnumC7028h enumC7028hForNumber = EnumC7028h.forNumber(this.incrementalCallbackSupport_);
        return enumC7028hForNumber == null ? EnumC7028h.UNRECOGNIZED : enumC7028hForNumber;
    }

    public int getIncrementalCallbackSupportValue() {
        return this.incrementalCallbackSupport_;
    }

    public boolean getSupportsEagerStart() {
        return this.supportsEagerStart_;
    }

    public boolean getSupportsIncrementalResults() {
        return this.supportsIncrementalResults_;
    }

    public static C6957a newBuilder(Configuration$ClientCapabilities configuration$ClientCapabilities) {
        return DEFAULT_INSTANCE.createBuilder(configuration$ClientCapabilities);
    }

    public static Configuration$ClientCapabilities parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$ClientCapabilities parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Configuration$ClientCapabilities parseFrom(ByteString byteString) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Configuration$ClientCapabilities parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Configuration$ClientCapabilities parseFrom(byte[] bArr) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Configuration$ClientCapabilities parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Configuration$ClientCapabilities parseFrom(InputStream inputStream) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Configuration$ClientCapabilities parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Configuration$ClientCapabilities parseFrom(CodedInputStream codedInputStream) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Configuration$ClientCapabilities parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Configuration$ClientCapabilities) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
