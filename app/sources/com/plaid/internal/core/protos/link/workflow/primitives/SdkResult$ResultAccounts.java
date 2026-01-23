package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes24.dex */
public final class SdkResult$ResultAccounts extends GeneratedMessageLite<SdkResult$ResultAccounts, C7009a> implements MessageLiteOrBuilder {
    public static final int ACCOUNTS_FIELD_NUMBER = 1;
    private static final SdkResult$ResultAccounts DEFAULT_INSTANCE;
    private static volatile Parser<SdkResult$ResultAccounts> PARSER;
    private Internal.ProtobufList<SdkResult$SDKResult.Metadata.Account> accounts_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$ResultAccounts$a */
    public static final class C7009a extends GeneratedMessageLite.Builder<SdkResult$ResultAccounts, C7009a> implements MessageLiteOrBuilder {
        public C7009a() {
            super(SdkResult$ResultAccounts.DEFAULT_INSTANCE);
        }
    }

    static {
        SdkResult$ResultAccounts sdkResult$ResultAccounts = new SdkResult$ResultAccounts();
        DEFAULT_INSTANCE = sdkResult$ResultAccounts;
        GeneratedMessageLite.registerDefaultInstance(SdkResult$ResultAccounts.class, sdkResult$ResultAccounts);
    }

    private SdkResult$ResultAccounts() {
    }

    private void addAccounts(SdkResult$SDKResult.Metadata.Account account) {
        account.getClass();
        ensureAccountsIsMutable();
        this.accounts_.add(account);
    }

    private void addAllAccounts(Iterable<? extends SdkResult$SDKResult.Metadata.Account> iterable) {
        ensureAccountsIsMutable();
        AbstractMessageLite.addAll((Iterable) iterable, (List) this.accounts_);
    }

    private void clearAccounts() {
        this.accounts_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureAccountsIsMutable() {
        Internal.ProtobufList<SdkResult$SDKResult.Metadata.Account> protobufList = this.accounts_;
        if (protobufList.isModifiable()) {
            return;
        }
        this.accounts_ = GeneratedMessageLite.mutableCopy(protobufList);
    }

    public static SdkResult$ResultAccounts getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C7009a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static SdkResult$ResultAccounts parseDelimitedFrom(InputStream inputStream) {
        return (SdkResult$ResultAccounts) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SdkResult$ResultAccounts parseFrom(ByteBuffer byteBuffer) {
        return (SdkResult$ResultAccounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<SdkResult$ResultAccounts> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeAccounts(int i) {
        ensureAccountsIsMutable();
        this.accounts_.remove(i);
    }

    private void setAccounts(int i, SdkResult$SDKResult.Metadata.Account account) {
        account.getClass();
        ensureAccountsIsMutable();
        this.accounts_.set(i, account);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C7039s.f2700a[methodToInvoke.ordinal()]) {
            case 1:
                return new SdkResult$ResultAccounts();
            case 2:
                return new C7009a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"accounts_", SdkResult$SDKResult.Metadata.Account.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<SdkResult$ResultAccounts> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (SdkResult$ResultAccounts.class) {
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

    public SdkResult$SDKResult.Metadata.Account getAccounts(int i) {
        return this.accounts_.get(i);
    }

    public int getAccountsCount() {
        return this.accounts_.size();
    }

    public List<SdkResult$SDKResult.Metadata.Account> getAccountsList() {
        return this.accounts_;
    }

    public SdkResult$SDKResult.Metadata.InterfaceC7014a getAccountsOrBuilder(int i) {
        return this.accounts_.get(i);
    }

    public List<? extends SdkResult$SDKResult.Metadata.InterfaceC7014a> getAccountsOrBuilderList() {
        return this.accounts_;
    }

    public static C7009a newBuilder(SdkResult$ResultAccounts sdkResult$ResultAccounts) {
        return DEFAULT_INSTANCE.createBuilder(sdkResult$ResultAccounts);
    }

    public static SdkResult$ResultAccounts parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkResult$ResultAccounts) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SdkResult$ResultAccounts parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkResult$ResultAccounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static SdkResult$ResultAccounts parseFrom(ByteString byteString) {
        return (SdkResult$ResultAccounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    private void addAccounts(int i, SdkResult$SDKResult.Metadata.Account account) {
        account.getClass();
        ensureAccountsIsMutable();
        this.accounts_.add(i, account);
    }

    public static SdkResult$ResultAccounts parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkResult$ResultAccounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static SdkResult$ResultAccounts parseFrom(byte[] bArr) {
        return (SdkResult$ResultAccounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static SdkResult$ResultAccounts parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkResult$ResultAccounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static SdkResult$ResultAccounts parseFrom(InputStream inputStream) {
        return (SdkResult$ResultAccounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static SdkResult$ResultAccounts parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkResult$ResultAccounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static SdkResult$ResultAccounts parseFrom(CodedInputStream codedInputStream) {
        return (SdkResult$ResultAccounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static SdkResult$ResultAccounts parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (SdkResult$ResultAccounts) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
