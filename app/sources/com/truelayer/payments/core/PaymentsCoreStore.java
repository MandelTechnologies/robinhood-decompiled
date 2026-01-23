package com.truelayer.payments.core;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntryLite;
import com.google.protobuf.MapFieldLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.WireFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class PaymentsCoreStore extends GeneratedMessageLite<PaymentsCoreStore, Builder> implements PaymentsCoreStoreOrBuilder {
    public static final int ADDITIONALINPUTS_FIELD_NUMBER = 3;
    private static final PaymentsCoreStore DEFAULT_INSTANCE;
    public static final int LAST_USED_COUNTRY_CODE_FIELD_NUMBER = 2;
    private static volatile Parser<PaymentsCoreStore> PARSER = null;
    public static final int PROVIDERS_FIELD_NUMBER = 1;
    private MapFieldLite<String, RecentSingleImmediateProvider> providers_ = MapFieldLite.emptyMapField();
    private MapFieldLite<String, RecentAdditionalInputPerProvider> additionalInputs_ = MapFieldLite.emptyMapField();
    private String lastUsedCountryCode_ = "";

    public interface RecentAdditionalInputOrBuilder extends MessageLiteOrBuilder {
        String getInputId();

        ByteString getInputIdBytes();

        long getLastUsedDate();

        String getValue();

        ByteString getValueBytes();
    }

    public interface RecentAdditionalInputPerProviderOrBuilder extends MessageLiteOrBuilder {
        RecentAdditionalInput getAdditionalInputs(int i);

        int getAdditionalInputsCount();

        List<RecentAdditionalInput> getAdditionalInputsList();

        String getProviderId();

        ByteString getProviderIdBytes();
    }

    public interface RecentSingleImmediateProviderOrBuilder extends MessageLiteOrBuilder {
        long getLastUsedDate();

        String getProviderId();

        ByteString getProviderIdBytes();
    }

    private PaymentsCoreStore() {
    }

    public static final class RecentSingleImmediateProvider extends GeneratedMessageLite<RecentSingleImmediateProvider, Builder> implements RecentSingleImmediateProviderOrBuilder {
        private static final RecentSingleImmediateProvider DEFAULT_INSTANCE;
        public static final int LAST_USED_DATE_FIELD_NUMBER = 2;
        private static volatile Parser<RecentSingleImmediateProvider> PARSER = null;
        public static final int PROVIDER_ID_FIELD_NUMBER = 1;
        private long lastUsedDate_;
        private String providerId_ = "";

        private RecentSingleImmediateProvider() {
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentSingleImmediateProviderOrBuilder
        public String getProviderId() {
            return this.providerId_;
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentSingleImmediateProviderOrBuilder
        public ByteString getProviderIdBytes() {
            return ByteString.copyFromUtf8(this.providerId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProviderId(String str) {
            str.getClass();
            this.providerId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProviderId() {
            this.providerId_ = getDefaultInstance().getProviderId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProviderIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.providerId_ = byteString.toStringUtf8();
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentSingleImmediateProviderOrBuilder
        public long getLastUsedDate() {
            return this.lastUsedDate_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastUsedDate(long j) {
            this.lastUsedDate_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastUsedDate() {
            this.lastUsedDate_ = 0L;
        }

        public static RecentSingleImmediateProvider parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RecentSingleImmediateProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RecentSingleImmediateProvider parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RecentSingleImmediateProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RecentSingleImmediateProvider parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RecentSingleImmediateProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RecentSingleImmediateProvider parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RecentSingleImmediateProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RecentSingleImmediateProvider parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RecentSingleImmediateProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RecentSingleImmediateProvider parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RecentSingleImmediateProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RecentSingleImmediateProvider parseFrom(InputStream inputStream) throws IOException {
            return (RecentSingleImmediateProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecentSingleImmediateProvider parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RecentSingleImmediateProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RecentSingleImmediateProvider parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RecentSingleImmediateProvider) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecentSingleImmediateProvider parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RecentSingleImmediateProvider) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RecentSingleImmediateProvider parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RecentSingleImmediateProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RecentSingleImmediateProvider parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RecentSingleImmediateProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(RecentSingleImmediateProvider recentSingleImmediateProvider) {
            return DEFAULT_INSTANCE.createBuilder(recentSingleImmediateProvider);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RecentSingleImmediateProvider, Builder> implements RecentSingleImmediateProviderOrBuilder {
            private Builder() {
                super(RecentSingleImmediateProvider.DEFAULT_INSTANCE);
            }

            @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentSingleImmediateProviderOrBuilder
            public String getProviderId() {
                return ((RecentSingleImmediateProvider) this.instance).getProviderId();
            }

            @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentSingleImmediateProviderOrBuilder
            public ByteString getProviderIdBytes() {
                return ((RecentSingleImmediateProvider) this.instance).getProviderIdBytes();
            }

            public Builder setProviderId(String str) {
                copyOnWrite();
                ((RecentSingleImmediateProvider) this.instance).setProviderId(str);
                return this;
            }

            public Builder clearProviderId() {
                copyOnWrite();
                ((RecentSingleImmediateProvider) this.instance).clearProviderId();
                return this;
            }

            public Builder setProviderIdBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((RecentSingleImmediateProvider) this.instance).setProviderIdBytes(byteString);
                return this;
            }

            @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentSingleImmediateProviderOrBuilder
            public long getLastUsedDate() {
                return ((RecentSingleImmediateProvider) this.instance).getLastUsedDate();
            }

            public Builder setLastUsedDate(long j) {
                copyOnWrite();
                ((RecentSingleImmediateProvider) this.instance).setLastUsedDate(j);
                return this;
            }

            public Builder clearLastUsedDate() {
                copyOnWrite();
                ((RecentSingleImmediateProvider) this.instance).clearLastUsedDate();
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C427191.f6434xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new RecentSingleImmediateProvider();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\u0002", new Object[]{"providerId_", "lastUsedDate_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RecentSingleImmediateProvider> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (RecentSingleImmediateProvider.class) {
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

        static {
            RecentSingleImmediateProvider recentSingleImmediateProvider = new RecentSingleImmediateProvider();
            DEFAULT_INSTANCE = recentSingleImmediateProvider;
            GeneratedMessageLite.registerDefaultInstance(RecentSingleImmediateProvider.class, recentSingleImmediateProvider);
        }

        public static RecentSingleImmediateProvider getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RecentSingleImmediateProvider> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    /* renamed from: com.truelayer.payments.core.PaymentsCoreStore$1 */
    static /* synthetic */ class C427191 {

        /* renamed from: $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke */
        static final /* synthetic */ int[] f6434xa1df5c61;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            f6434xa1df5c61 = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6434xa1df5c61[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6434xa1df5c61[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6434xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6434xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6434xa1df5c61[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6434xa1df5c61[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class RecentAdditionalInputPerProvider extends GeneratedMessageLite<RecentAdditionalInputPerProvider, Builder> implements RecentAdditionalInputPerProviderOrBuilder {
        public static final int ADDITIONAL_INPUTS_FIELD_NUMBER = 2;
        private static final RecentAdditionalInputPerProvider DEFAULT_INSTANCE;
        private static volatile Parser<RecentAdditionalInputPerProvider> PARSER = null;
        public static final int PROVIDER_ID_FIELD_NUMBER = 1;
        private String providerId_ = "";
        private Internal.ProtobufList<RecentAdditionalInput> additionalInputs_ = GeneratedMessageLite.emptyProtobufList();

        private RecentAdditionalInputPerProvider() {
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentAdditionalInputPerProviderOrBuilder
        public String getProviderId() {
            return this.providerId_;
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentAdditionalInputPerProviderOrBuilder
        public ByteString getProviderIdBytes() {
            return ByteString.copyFromUtf8(this.providerId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProviderId(String str) {
            str.getClass();
            this.providerId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearProviderId() {
            this.providerId_ = getDefaultInstance().getProviderId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setProviderIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.providerId_ = byteString.toStringUtf8();
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentAdditionalInputPerProviderOrBuilder
        public List<RecentAdditionalInput> getAdditionalInputsList() {
            return this.additionalInputs_;
        }

        public List<? extends RecentAdditionalInputOrBuilder> getAdditionalInputsOrBuilderList() {
            return this.additionalInputs_;
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentAdditionalInputPerProviderOrBuilder
        public int getAdditionalInputsCount() {
            return this.additionalInputs_.size();
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentAdditionalInputPerProviderOrBuilder
        public RecentAdditionalInput getAdditionalInputs(int i) {
            return this.additionalInputs_.get(i);
        }

        public RecentAdditionalInputOrBuilder getAdditionalInputsOrBuilder(int i) {
            return this.additionalInputs_.get(i);
        }

        private void ensureAdditionalInputsIsMutable() {
            Internal.ProtobufList<RecentAdditionalInput> protobufList = this.additionalInputs_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.additionalInputs_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAdditionalInputs(int i, RecentAdditionalInput recentAdditionalInput) {
            recentAdditionalInput.getClass();
            ensureAdditionalInputsIsMutable();
            this.additionalInputs_.set(i, recentAdditionalInput);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAdditionalInputs(RecentAdditionalInput recentAdditionalInput) {
            recentAdditionalInput.getClass();
            ensureAdditionalInputsIsMutable();
            this.additionalInputs_.add(recentAdditionalInput);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAdditionalInputs(int i, RecentAdditionalInput recentAdditionalInput) {
            recentAdditionalInput.getClass();
            ensureAdditionalInputsIsMutable();
            this.additionalInputs_.add(i, recentAdditionalInput);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAdditionalInputs(Iterable<? extends RecentAdditionalInput> iterable) {
            ensureAdditionalInputsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.additionalInputs_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAdditionalInputs() {
            this.additionalInputs_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeAdditionalInputs(int i) {
            ensureAdditionalInputsIsMutable();
            this.additionalInputs_.remove(i);
        }

        public static RecentAdditionalInputPerProvider parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RecentAdditionalInputPerProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RecentAdditionalInputPerProvider parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RecentAdditionalInputPerProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RecentAdditionalInputPerProvider parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RecentAdditionalInputPerProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RecentAdditionalInputPerProvider parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RecentAdditionalInputPerProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RecentAdditionalInputPerProvider parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RecentAdditionalInputPerProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RecentAdditionalInputPerProvider parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RecentAdditionalInputPerProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RecentAdditionalInputPerProvider parseFrom(InputStream inputStream) throws IOException {
            return (RecentAdditionalInputPerProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecentAdditionalInputPerProvider parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RecentAdditionalInputPerProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RecentAdditionalInputPerProvider parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RecentAdditionalInputPerProvider) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecentAdditionalInputPerProvider parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RecentAdditionalInputPerProvider) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RecentAdditionalInputPerProvider parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RecentAdditionalInputPerProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RecentAdditionalInputPerProvider parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RecentAdditionalInputPerProvider) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(RecentAdditionalInputPerProvider recentAdditionalInputPerProvider) {
            return DEFAULT_INSTANCE.createBuilder(recentAdditionalInputPerProvider);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RecentAdditionalInputPerProvider, Builder> implements RecentAdditionalInputPerProviderOrBuilder {
            private Builder() {
                super(RecentAdditionalInputPerProvider.DEFAULT_INSTANCE);
            }

            @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentAdditionalInputPerProviderOrBuilder
            public String getProviderId() {
                return ((RecentAdditionalInputPerProvider) this.instance).getProviderId();
            }

            @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentAdditionalInputPerProviderOrBuilder
            public ByteString getProviderIdBytes() {
                return ((RecentAdditionalInputPerProvider) this.instance).getProviderIdBytes();
            }

            public Builder setProviderId(String str) {
                copyOnWrite();
                ((RecentAdditionalInputPerProvider) this.instance).setProviderId(str);
                return this;
            }

            public Builder clearProviderId() {
                copyOnWrite();
                ((RecentAdditionalInputPerProvider) this.instance).clearProviderId();
                return this;
            }

            public Builder setProviderIdBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((RecentAdditionalInputPerProvider) this.instance).setProviderIdBytes(byteString);
                return this;
            }

            @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentAdditionalInputPerProviderOrBuilder
            public List<RecentAdditionalInput> getAdditionalInputsList() {
                return Collections.unmodifiableList(((RecentAdditionalInputPerProvider) this.instance).getAdditionalInputsList());
            }

            @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentAdditionalInputPerProviderOrBuilder
            public int getAdditionalInputsCount() {
                return ((RecentAdditionalInputPerProvider) this.instance).getAdditionalInputsCount();
            }

            @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentAdditionalInputPerProviderOrBuilder
            public RecentAdditionalInput getAdditionalInputs(int i) {
                return ((RecentAdditionalInputPerProvider) this.instance).getAdditionalInputs(i);
            }

            public Builder setAdditionalInputs(int i, RecentAdditionalInput recentAdditionalInput) {
                copyOnWrite();
                ((RecentAdditionalInputPerProvider) this.instance).setAdditionalInputs(i, recentAdditionalInput);
                return this;
            }

            public Builder setAdditionalInputs(int i, RecentAdditionalInput.Builder builder) {
                copyOnWrite();
                ((RecentAdditionalInputPerProvider) this.instance).setAdditionalInputs(i, builder.build());
                return this;
            }

            public Builder addAdditionalInputs(RecentAdditionalInput recentAdditionalInput) {
                copyOnWrite();
                ((RecentAdditionalInputPerProvider) this.instance).addAdditionalInputs(recentAdditionalInput);
                return this;
            }

            public Builder addAdditionalInputs(int i, RecentAdditionalInput recentAdditionalInput) {
                copyOnWrite();
                ((RecentAdditionalInputPerProvider) this.instance).addAdditionalInputs(i, recentAdditionalInput);
                return this;
            }

            public Builder addAdditionalInputs(RecentAdditionalInput.Builder builder) {
                copyOnWrite();
                ((RecentAdditionalInputPerProvider) this.instance).addAdditionalInputs(builder.build());
                return this;
            }

            public Builder addAdditionalInputs(int i, RecentAdditionalInput.Builder builder) {
                copyOnWrite();
                ((RecentAdditionalInputPerProvider) this.instance).addAdditionalInputs(i, builder.build());
                return this;
            }

            public Builder addAllAdditionalInputs(Iterable<? extends RecentAdditionalInput> iterable) {
                copyOnWrite();
                ((RecentAdditionalInputPerProvider) this.instance).addAllAdditionalInputs(iterable);
                return this;
            }

            public Builder clearAdditionalInputs() {
                copyOnWrite();
                ((RecentAdditionalInputPerProvider) this.instance).clearAdditionalInputs();
                return this;
            }

            public Builder removeAdditionalInputs(int i) {
                copyOnWrite();
                ((RecentAdditionalInputPerProvider) this.instance).removeAdditionalInputs(i);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C427191.f6434xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new RecentAdditionalInputPerProvider();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"providerId_", "additionalInputs_", RecentAdditionalInput.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RecentAdditionalInputPerProvider> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (RecentAdditionalInputPerProvider.class) {
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

        static {
            RecentAdditionalInputPerProvider recentAdditionalInputPerProvider = new RecentAdditionalInputPerProvider();
            DEFAULT_INSTANCE = recentAdditionalInputPerProvider;
            GeneratedMessageLite.registerDefaultInstance(RecentAdditionalInputPerProvider.class, recentAdditionalInputPerProvider);
        }

        public static RecentAdditionalInputPerProvider getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RecentAdditionalInputPerProvider> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    public static final class RecentAdditionalInput extends GeneratedMessageLite<RecentAdditionalInput, Builder> implements RecentAdditionalInputOrBuilder {
        private static final RecentAdditionalInput DEFAULT_INSTANCE;
        public static final int INPUT_ID_FIELD_NUMBER = 2;
        public static final int LAST_USED_DATE_FIELD_NUMBER = 1;
        private static volatile Parser<RecentAdditionalInput> PARSER = null;
        public static final int VALUE_FIELD_NUMBER = 3;
        private long lastUsedDate_;
        private String inputId_ = "";
        private String value_ = "";

        private RecentAdditionalInput() {
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentAdditionalInputOrBuilder
        public long getLastUsedDate() {
            return this.lastUsedDate_;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLastUsedDate(long j) {
            this.lastUsedDate_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLastUsedDate() {
            this.lastUsedDate_ = 0L;
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentAdditionalInputOrBuilder
        public String getInputId() {
            return this.inputId_;
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentAdditionalInputOrBuilder
        public ByteString getInputIdBytes() {
            return ByteString.copyFromUtf8(this.inputId_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInputId(String str) {
            str.getClass();
            this.inputId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearInputId() {
            this.inputId_ = getDefaultInstance().getInputId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setInputIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.inputId_ = byteString.toStringUtf8();
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentAdditionalInputOrBuilder
        public String getValue() {
            return this.value_;
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentAdditionalInputOrBuilder
        public ByteString getValueBytes() {
            return ByteString.copyFromUtf8(this.value_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValue(String str) {
            str.getClass();
            this.value_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearValue() {
            this.value_ = getDefaultInstance().getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setValueBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.value_ = byteString.toStringUtf8();
        }

        public static RecentAdditionalInput parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (RecentAdditionalInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static RecentAdditionalInput parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RecentAdditionalInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static RecentAdditionalInput parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (RecentAdditionalInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static RecentAdditionalInput parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RecentAdditionalInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static RecentAdditionalInput parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (RecentAdditionalInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static RecentAdditionalInput parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (RecentAdditionalInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static RecentAdditionalInput parseFrom(InputStream inputStream) throws IOException {
            return (RecentAdditionalInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecentAdditionalInput parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RecentAdditionalInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RecentAdditionalInput parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (RecentAdditionalInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static RecentAdditionalInput parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RecentAdditionalInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static RecentAdditionalInput parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (RecentAdditionalInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static RecentAdditionalInput parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (RecentAdditionalInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static Builder newBuilder(RecentAdditionalInput recentAdditionalInput) {
            return DEFAULT_INSTANCE.createBuilder(recentAdditionalInput);
        }

        public static final class Builder extends GeneratedMessageLite.Builder<RecentAdditionalInput, Builder> implements RecentAdditionalInputOrBuilder {
            private Builder() {
                super(RecentAdditionalInput.DEFAULT_INSTANCE);
            }

            @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentAdditionalInputOrBuilder
            public long getLastUsedDate() {
                return ((RecentAdditionalInput) this.instance).getLastUsedDate();
            }

            public Builder setLastUsedDate(long j) {
                copyOnWrite();
                ((RecentAdditionalInput) this.instance).setLastUsedDate(j);
                return this;
            }

            public Builder clearLastUsedDate() {
                copyOnWrite();
                ((RecentAdditionalInput) this.instance).clearLastUsedDate();
                return this;
            }

            @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentAdditionalInputOrBuilder
            public String getInputId() {
                return ((RecentAdditionalInput) this.instance).getInputId();
            }

            @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentAdditionalInputOrBuilder
            public ByteString getInputIdBytes() {
                return ((RecentAdditionalInput) this.instance).getInputIdBytes();
            }

            public Builder setInputId(String str) {
                copyOnWrite();
                ((RecentAdditionalInput) this.instance).setInputId(str);
                return this;
            }

            public Builder clearInputId() {
                copyOnWrite();
                ((RecentAdditionalInput) this.instance).clearInputId();
                return this;
            }

            public Builder setInputIdBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((RecentAdditionalInput) this.instance).setInputIdBytes(byteString);
                return this;
            }

            @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentAdditionalInputOrBuilder
            public String getValue() {
                return ((RecentAdditionalInput) this.instance).getValue();
            }

            @Override // com.truelayer.payments.core.PaymentsCoreStore.RecentAdditionalInputOrBuilder
            public ByteString getValueBytes() {
                return ((RecentAdditionalInput) this.instance).getValueBytes();
            }

            public Builder setValue(String str) {
                copyOnWrite();
                ((RecentAdditionalInput) this.instance).setValue(str);
                return this;
            }

            public Builder clearValue() {
                copyOnWrite();
                ((RecentAdditionalInput) this.instance).clearValue();
                return this;
            }

            public Builder setValueBytes(ByteString byteString) throws IllegalArgumentException {
                copyOnWrite();
                ((RecentAdditionalInput) this.instance).setValueBytes(byteString);
                return this;
            }
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C427191.f6434xa1df5c61[methodToInvoke.ordinal()]) {
                case 1:
                    return new RecentAdditionalInput();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0002\u0002Ȉ\u0003Ȉ", new Object[]{"lastUsedDate_", "inputId_", "value_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<RecentAdditionalInput> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (RecentAdditionalInput.class) {
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

        static {
            RecentAdditionalInput recentAdditionalInput = new RecentAdditionalInput();
            DEFAULT_INSTANCE = recentAdditionalInput;
            GeneratedMessageLite.registerDefaultInstance(RecentAdditionalInput.class, recentAdditionalInput);
        }

        public static RecentAdditionalInput getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Parser<RecentAdditionalInput> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }
    }

    private static final class ProvidersDefaultEntryHolder {
        static final MapEntryLite<String, RecentSingleImmediateProvider> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, RecentSingleImmediateProvider.getDefaultInstance());

        private ProvidersDefaultEntryHolder() {
        }
    }

    private MapFieldLite<String, RecentSingleImmediateProvider> internalGetProviders() {
        return this.providers_;
    }

    private MapFieldLite<String, RecentSingleImmediateProvider> internalGetMutableProviders() {
        if (!this.providers_.isMutable()) {
            this.providers_ = this.providers_.mutableCopy();
        }
        return this.providers_;
    }

    @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
    public int getProvidersCount() {
        return internalGetProviders().size();
    }

    @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
    public boolean containsProviders(String str) {
        str.getClass();
        return internalGetProviders().containsKey(str);
    }

    @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
    @Deprecated
    public Map<String, RecentSingleImmediateProvider> getProviders() {
        return getProvidersMap();
    }

    @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
    public Map<String, RecentSingleImmediateProvider> getProvidersMap() {
        return Collections.unmodifiableMap(internalGetProviders());
    }

    @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
    public RecentSingleImmediateProvider getProvidersOrDefault(String str, RecentSingleImmediateProvider recentSingleImmediateProvider) {
        str.getClass();
        MapFieldLite<String, RecentSingleImmediateProvider> mapFieldLiteInternalGetProviders = internalGetProviders();
        return mapFieldLiteInternalGetProviders.containsKey(str) ? mapFieldLiteInternalGetProviders.get(str) : recentSingleImmediateProvider;
    }

    @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
    public RecentSingleImmediateProvider getProvidersOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, RecentSingleImmediateProvider> mapFieldLiteInternalGetProviders = internalGetProviders();
        if (!mapFieldLiteInternalGetProviders.containsKey(str)) {
            throw new IllegalArgumentException();
        }
        return mapFieldLiteInternalGetProviders.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, RecentSingleImmediateProvider> getMutableProvidersMap() {
        return internalGetMutableProviders();
    }

    @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
    public String getLastUsedCountryCode() {
        return this.lastUsedCountryCode_;
    }

    @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
    public ByteString getLastUsedCountryCodeBytes() {
        return ByteString.copyFromUtf8(this.lastUsedCountryCode_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastUsedCountryCode(String str) {
        str.getClass();
        this.lastUsedCountryCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLastUsedCountryCode() {
        this.lastUsedCountryCode_ = getDefaultInstance().getLastUsedCountryCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLastUsedCountryCodeBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.lastUsedCountryCode_ = byteString.toStringUtf8();
    }

    private static final class AdditionalInputsDefaultEntryHolder {
        static final MapEntryLite<String, RecentAdditionalInputPerProvider> defaultEntry = MapEntryLite.newDefaultInstance(WireFormat.FieldType.STRING, "", WireFormat.FieldType.MESSAGE, RecentAdditionalInputPerProvider.getDefaultInstance());

        private AdditionalInputsDefaultEntryHolder() {
        }
    }

    private MapFieldLite<String, RecentAdditionalInputPerProvider> internalGetAdditionalInputs() {
        return this.additionalInputs_;
    }

    private MapFieldLite<String, RecentAdditionalInputPerProvider> internalGetMutableAdditionalInputs() {
        if (!this.additionalInputs_.isMutable()) {
            this.additionalInputs_ = this.additionalInputs_.mutableCopy();
        }
        return this.additionalInputs_;
    }

    @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
    public int getAdditionalInputsCount() {
        return internalGetAdditionalInputs().size();
    }

    @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
    public boolean containsAdditionalInputs(String str) {
        str.getClass();
        return internalGetAdditionalInputs().containsKey(str);
    }

    @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
    @Deprecated
    public Map<String, RecentAdditionalInputPerProvider> getAdditionalInputs() {
        return getAdditionalInputsMap();
    }

    @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
    public Map<String, RecentAdditionalInputPerProvider> getAdditionalInputsMap() {
        return Collections.unmodifiableMap(internalGetAdditionalInputs());
    }

    @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
    public RecentAdditionalInputPerProvider getAdditionalInputsOrDefault(String str, RecentAdditionalInputPerProvider recentAdditionalInputPerProvider) {
        str.getClass();
        MapFieldLite<String, RecentAdditionalInputPerProvider> mapFieldLiteInternalGetAdditionalInputs = internalGetAdditionalInputs();
        return mapFieldLiteInternalGetAdditionalInputs.containsKey(str) ? mapFieldLiteInternalGetAdditionalInputs.get(str) : recentAdditionalInputPerProvider;
    }

    @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
    public RecentAdditionalInputPerProvider getAdditionalInputsOrThrow(String str) {
        str.getClass();
        MapFieldLite<String, RecentAdditionalInputPerProvider> mapFieldLiteInternalGetAdditionalInputs = internalGetAdditionalInputs();
        if (!mapFieldLiteInternalGetAdditionalInputs.containsKey(str)) {
            throw new IllegalArgumentException();
        }
        return mapFieldLiteInternalGetAdditionalInputs.get(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, RecentAdditionalInputPerProvider> getMutableAdditionalInputsMap() {
        return internalGetMutableAdditionalInputs();
    }

    public static PaymentsCoreStore parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (PaymentsCoreStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static PaymentsCoreStore parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PaymentsCoreStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static PaymentsCoreStore parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (PaymentsCoreStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static PaymentsCoreStore parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PaymentsCoreStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static PaymentsCoreStore parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (PaymentsCoreStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PaymentsCoreStore parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
        return (PaymentsCoreStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static PaymentsCoreStore parseFrom(InputStream inputStream) throws IOException {
        return (PaymentsCoreStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PaymentsCoreStore parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PaymentsCoreStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PaymentsCoreStore parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (PaymentsCoreStore) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PaymentsCoreStore parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PaymentsCoreStore) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static PaymentsCoreStore parseFrom(CodedInputStream codedInputStream) throws IOException {
        return (PaymentsCoreStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static PaymentsCoreStore parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
        return (PaymentsCoreStore) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Builder newBuilder(PaymentsCoreStore paymentsCoreStore) {
        return DEFAULT_INSTANCE.createBuilder(paymentsCoreStore);
    }

    public static final class Builder extends GeneratedMessageLite.Builder<PaymentsCoreStore, Builder> implements PaymentsCoreStoreOrBuilder {
        private Builder() {
            super(PaymentsCoreStore.DEFAULT_INSTANCE);
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
        public int getProvidersCount() {
            return ((PaymentsCoreStore) this.instance).getProvidersMap().size();
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
        public boolean containsProviders(String str) {
            str.getClass();
            return ((PaymentsCoreStore) this.instance).getProvidersMap().containsKey(str);
        }

        public Builder clearProviders() {
            copyOnWrite();
            ((PaymentsCoreStore) this.instance).getMutableProvidersMap().clear();
            return this;
        }

        public Builder removeProviders(String str) {
            str.getClass();
            copyOnWrite();
            ((PaymentsCoreStore) this.instance).getMutableProvidersMap().remove(str);
            return this;
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
        @Deprecated
        public Map<String, RecentSingleImmediateProvider> getProviders() {
            return getProvidersMap();
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
        public Map<String, RecentSingleImmediateProvider> getProvidersMap() {
            return Collections.unmodifiableMap(((PaymentsCoreStore) this.instance).getProvidersMap());
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
        public RecentSingleImmediateProvider getProvidersOrDefault(String str, RecentSingleImmediateProvider recentSingleImmediateProvider) {
            str.getClass();
            Map<String, RecentSingleImmediateProvider> providersMap = ((PaymentsCoreStore) this.instance).getProvidersMap();
            return providersMap.containsKey(str) ? providersMap.get(str) : recentSingleImmediateProvider;
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
        public RecentSingleImmediateProvider getProvidersOrThrow(String str) {
            str.getClass();
            Map<String, RecentSingleImmediateProvider> providersMap = ((PaymentsCoreStore) this.instance).getProvidersMap();
            if (!providersMap.containsKey(str)) {
                throw new IllegalArgumentException();
            }
            return providersMap.get(str);
        }

        public Builder putProviders(String str, RecentSingleImmediateProvider recentSingleImmediateProvider) {
            str.getClass();
            recentSingleImmediateProvider.getClass();
            copyOnWrite();
            ((PaymentsCoreStore) this.instance).getMutableProvidersMap().put(str, recentSingleImmediateProvider);
            return this;
        }

        public Builder putAllProviders(Map<String, RecentSingleImmediateProvider> map) {
            copyOnWrite();
            ((PaymentsCoreStore) this.instance).getMutableProvidersMap().putAll(map);
            return this;
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
        public String getLastUsedCountryCode() {
            return ((PaymentsCoreStore) this.instance).getLastUsedCountryCode();
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
        public ByteString getLastUsedCountryCodeBytes() {
            return ((PaymentsCoreStore) this.instance).getLastUsedCountryCodeBytes();
        }

        public Builder setLastUsedCountryCode(String str) {
            copyOnWrite();
            ((PaymentsCoreStore) this.instance).setLastUsedCountryCode(str);
            return this;
        }

        public Builder clearLastUsedCountryCode() {
            copyOnWrite();
            ((PaymentsCoreStore) this.instance).clearLastUsedCountryCode();
            return this;
        }

        public Builder setLastUsedCountryCodeBytes(ByteString byteString) throws IllegalArgumentException {
            copyOnWrite();
            ((PaymentsCoreStore) this.instance).setLastUsedCountryCodeBytes(byteString);
            return this;
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
        public int getAdditionalInputsCount() {
            return ((PaymentsCoreStore) this.instance).getAdditionalInputsMap().size();
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
        public boolean containsAdditionalInputs(String str) {
            str.getClass();
            return ((PaymentsCoreStore) this.instance).getAdditionalInputsMap().containsKey(str);
        }

        public Builder clearAdditionalInputs() {
            copyOnWrite();
            ((PaymentsCoreStore) this.instance).getMutableAdditionalInputsMap().clear();
            return this;
        }

        public Builder removeAdditionalInputs(String str) {
            str.getClass();
            copyOnWrite();
            ((PaymentsCoreStore) this.instance).getMutableAdditionalInputsMap().remove(str);
            return this;
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
        @Deprecated
        public Map<String, RecentAdditionalInputPerProvider> getAdditionalInputs() {
            return getAdditionalInputsMap();
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
        public Map<String, RecentAdditionalInputPerProvider> getAdditionalInputsMap() {
            return Collections.unmodifiableMap(((PaymentsCoreStore) this.instance).getAdditionalInputsMap());
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
        public RecentAdditionalInputPerProvider getAdditionalInputsOrDefault(String str, RecentAdditionalInputPerProvider recentAdditionalInputPerProvider) {
            str.getClass();
            Map<String, RecentAdditionalInputPerProvider> additionalInputsMap = ((PaymentsCoreStore) this.instance).getAdditionalInputsMap();
            return additionalInputsMap.containsKey(str) ? additionalInputsMap.get(str) : recentAdditionalInputPerProvider;
        }

        @Override // com.truelayer.payments.core.PaymentsCoreStoreOrBuilder
        public RecentAdditionalInputPerProvider getAdditionalInputsOrThrow(String str) {
            str.getClass();
            Map<String, RecentAdditionalInputPerProvider> additionalInputsMap = ((PaymentsCoreStore) this.instance).getAdditionalInputsMap();
            if (!additionalInputsMap.containsKey(str)) {
                throw new IllegalArgumentException();
            }
            return additionalInputsMap.get(str);
        }

        public Builder putAdditionalInputs(String str, RecentAdditionalInputPerProvider recentAdditionalInputPerProvider) {
            str.getClass();
            recentAdditionalInputPerProvider.getClass();
            copyOnWrite();
            ((PaymentsCoreStore) this.instance).getMutableAdditionalInputsMap().put(str, recentAdditionalInputPerProvider);
            return this;
        }

        public Builder putAllAdditionalInputs(Map<String, RecentAdditionalInputPerProvider> map) {
            copyOnWrite();
            ((PaymentsCoreStore) this.instance).getMutableAdditionalInputsMap().putAll(map);
            return this;
        }
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    protected final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C427191.f6434xa1df5c61[methodToInvoke.ordinal()]) {
            case 1:
                return new PaymentsCoreStore();
            case 2:
                return new Builder();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0002\u0000\u0000\u00012\u0002Ȉ\u00032", new Object[]{"providers_", ProvidersDefaultEntryHolder.defaultEntry, "lastUsedCountryCode_", "additionalInputs_", AdditionalInputsDefaultEntryHolder.defaultEntry});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<PaymentsCoreStore> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (PaymentsCoreStore.class) {
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

    static {
        PaymentsCoreStore paymentsCoreStore = new PaymentsCoreStore();
        DEFAULT_INSTANCE = paymentsCoreStore;
        GeneratedMessageLite.registerDefaultInstance(PaymentsCoreStore.class, paymentsCoreStore);
    }

    public static PaymentsCoreStore getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Parser<PaymentsCoreStore> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }
}
