package com.plaid.internal.core.protos.link.api;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class ClientEventOuterClass$Performance extends GeneratedMessageLite<ClientEventOuterClass$Performance, C6181a> implements MessageLiteOrBuilder {
    private static final ClientEventOuterClass$Performance DEFAULT_INSTANCE;
    private static volatile Parser<ClientEventOuterClass$Performance> PARSER;

    public static final class NavigationTiming extends GeneratedMessageLite<NavigationTiming, C6179a> implements MessageLiteOrBuilder {
        private static final NavigationTiming DEFAULT_INSTANCE;
        public static final int DOM_COMPLETE_MS_FIELD_NUMBER = 5;
        public static final int DURATION_MS_FIELD_NUMBER = 6;
        private static volatile Parser<NavigationTiming> PARSER = null;
        public static final int REQUEST_START_MS_FIELD_NUMBER = 2;
        public static final int RESPONSE_END_MS_FIELD_NUMBER = 4;
        public static final int RESPONSE_START_MS_FIELD_NUMBER = 3;
        public static final int START_TIME_MS_FIELD_NUMBER = 1;
        private long domCompleteMs_;
        private long durationMs_;
        private long requestStartMs_;
        private long responseEndMs_;
        private long responseStartMs_;
        private long startTimeMs_;

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance$NavigationTiming$a */
        public static final class C6179a extends GeneratedMessageLite.Builder<NavigationTiming, C6179a> implements MessageLiteOrBuilder {
            public C6179a() {
                super(NavigationTiming.DEFAULT_INSTANCE);
            }
        }

        static {
            NavigationTiming navigationTiming = new NavigationTiming();
            DEFAULT_INSTANCE = navigationTiming;
            GeneratedMessageLite.registerDefaultInstance(NavigationTiming.class, navigationTiming);
        }

        private NavigationTiming() {
        }

        private void clearDomCompleteMs() {
            this.domCompleteMs_ = 0L;
        }

        private void clearDurationMs() {
            this.durationMs_ = 0L;
        }

        private void clearRequestStartMs() {
            this.requestStartMs_ = 0L;
        }

        private void clearResponseEndMs() {
            this.responseEndMs_ = 0L;
        }

        private void clearResponseStartMs() {
            this.responseStartMs_ = 0L;
        }

        private void clearStartTimeMs() {
            this.startTimeMs_ = 0L;
        }

        public static NavigationTiming getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6179a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NavigationTiming parseDelimitedFrom(InputStream inputStream) {
            return (NavigationTiming) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NavigationTiming parseFrom(ByteBuffer byteBuffer) {
            return (NavigationTiming) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<NavigationTiming> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDomCompleteMs(long j) {
            this.domCompleteMs_ = j;
        }

        private void setDurationMs(long j) {
            this.durationMs_ = j;
        }

        private void setRequestStartMs(long j) {
            this.requestStartMs_ = j;
        }

        private void setResponseEndMs(long j) {
            this.responseEndMs_ = j;
        }

        private void setResponseStartMs(long j) {
            this.responseStartMs_ = j;
        }

        private void setStartTimeMs(long j) {
            this.startTimeMs_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new NavigationTiming();
                case 2:
                    return new C6179a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0002", new Object[]{"startTimeMs_", "requestStartMs_", "responseStartMs_", "responseEndMs_", "domCompleteMs_", "durationMs_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<NavigationTiming> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (NavigationTiming.class) {
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

        public long getDomCompleteMs() {
            return this.domCompleteMs_;
        }

        public long getDurationMs() {
            return this.durationMs_;
        }

        public long getRequestStartMs() {
            return this.requestStartMs_;
        }

        public long getResponseEndMs() {
            return this.responseEndMs_;
        }

        public long getResponseStartMs() {
            return this.responseStartMs_;
        }

        public long getStartTimeMs() {
            return this.startTimeMs_;
        }

        public static C6179a newBuilder(NavigationTiming navigationTiming) {
            return DEFAULT_INSTANCE.createBuilder(navigationTiming);
        }

        public static NavigationTiming parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NavigationTiming) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NavigationTiming parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (NavigationTiming) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static NavigationTiming parseFrom(ByteString byteString) {
            return (NavigationTiming) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static NavigationTiming parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (NavigationTiming) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static NavigationTiming parseFrom(byte[] bArr) {
            return (NavigationTiming) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NavigationTiming parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (NavigationTiming) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static NavigationTiming parseFrom(InputStream inputStream) {
            return (NavigationTiming) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NavigationTiming parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NavigationTiming) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static NavigationTiming parseFrom(CodedInputStream codedInputStream) {
            return (NavigationTiming) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static NavigationTiming parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (NavigationTiming) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ResourceTiming extends GeneratedMessageLite<ResourceTiming, C6180a> implements MessageLiteOrBuilder {
        private static final ResourceTiming DEFAULT_INSTANCE;
        public static final int DURATION_MS_FIELD_NUMBER = 5;
        private static volatile Parser<ResourceTiming> PARSER = null;
        public static final int REQUEST_START_MS_FIELD_NUMBER = 2;
        public static final int RESPONSE_END_MS_FIELD_NUMBER = 4;
        public static final int RESPONSE_START_MS_FIELD_NUMBER = 3;
        public static final int START_TIME_MS_FIELD_NUMBER = 1;
        public static final int TRANSFER_SIZE_FIELD_NUMBER = 6;
        private long durationMs_;
        private long requestStartMs_;
        private long responseEndMs_;
        private long responseStartMs_;
        private long startTimeMs_;
        private long transferSize_;

        /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance$ResourceTiming$a */
        public static final class C6180a extends GeneratedMessageLite.Builder<ResourceTiming, C6180a> implements MessageLiteOrBuilder {
            public C6180a() {
                super(ResourceTiming.DEFAULT_INSTANCE);
            }
        }

        static {
            ResourceTiming resourceTiming = new ResourceTiming();
            DEFAULT_INSTANCE = resourceTiming;
            GeneratedMessageLite.registerDefaultInstance(ResourceTiming.class, resourceTiming);
        }

        private ResourceTiming() {
        }

        private void clearDurationMs() {
            this.durationMs_ = 0L;
        }

        private void clearRequestStartMs() {
            this.requestStartMs_ = 0L;
        }

        private void clearResponseEndMs() {
            this.responseEndMs_ = 0L;
        }

        private void clearResponseStartMs() {
            this.responseStartMs_ = 0L;
        }

        private void clearStartTimeMs() {
            this.startTimeMs_ = 0L;
        }

        private void clearTransferSize() {
            this.transferSize_ = 0L;
        }

        public static ResourceTiming getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6180a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ResourceTiming parseDelimitedFrom(InputStream inputStream) {
            return (ResourceTiming) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResourceTiming parseFrom(ByteBuffer byteBuffer) {
            return (ResourceTiming) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ResourceTiming> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDurationMs(long j) {
            this.durationMs_ = j;
        }

        private void setRequestStartMs(long j) {
            this.requestStartMs_ = j;
        }

        private void setResponseEndMs(long j) {
            this.responseEndMs_ = j;
        }

        private void setResponseStartMs(long j) {
            this.responseStartMs_ = j;
        }

        private void setStartTimeMs(long j) {
            this.startTimeMs_ = j;
        }

        private void setTransferSize(long j) {
            this.transferSize_ = j;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ResourceTiming();
                case 2:
                    return new C6180a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0002\u0006\u0002", new Object[]{"startTimeMs_", "requestStartMs_", "responseStartMs_", "responseEndMs_", "durationMs_", "transferSize_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ResourceTiming> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ResourceTiming.class) {
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

        public long getDurationMs() {
            return this.durationMs_;
        }

        public long getRequestStartMs() {
            return this.requestStartMs_;
        }

        public long getResponseEndMs() {
            return this.responseEndMs_;
        }

        public long getResponseStartMs() {
            return this.responseStartMs_;
        }

        public long getStartTimeMs() {
            return this.startTimeMs_;
        }

        public long getTransferSize() {
            return this.transferSize_;
        }

        public static C6180a newBuilder(ResourceTiming resourceTiming) {
            return DEFAULT_INSTANCE.createBuilder(resourceTiming);
        }

        public static ResourceTiming parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResourceTiming) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ResourceTiming parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ResourceTiming) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ResourceTiming parseFrom(ByteString byteString) {
            return (ResourceTiming) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ResourceTiming parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ResourceTiming) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ResourceTiming parseFrom(byte[] bArr) {
            return (ResourceTiming) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ResourceTiming parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ResourceTiming) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ResourceTiming parseFrom(InputStream inputStream) {
            return (ResourceTiming) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ResourceTiming parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResourceTiming) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ResourceTiming parseFrom(CodedInputStream codedInputStream) {
            return (ResourceTiming) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ResourceTiming parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ResourceTiming) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.api.ClientEventOuterClass$Performance$a */
    public static final class C6181a extends GeneratedMessageLite.Builder<ClientEventOuterClass$Performance, C6181a> implements MessageLiteOrBuilder {
        public C6181a() {
            super(ClientEventOuterClass$Performance.DEFAULT_INSTANCE);
        }
    }

    static {
        ClientEventOuterClass$Performance clientEventOuterClass$Performance = new ClientEventOuterClass$Performance();
        DEFAULT_INSTANCE = clientEventOuterClass$Performance;
        GeneratedMessageLite.registerDefaultInstance(ClientEventOuterClass$Performance.class, clientEventOuterClass$Performance);
    }

    private ClientEventOuterClass$Performance() {
    }

    public static ClientEventOuterClass$Performance getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6181a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static ClientEventOuterClass$Performance parseDelimitedFrom(InputStream inputStream) {
        return (ClientEventOuterClass$Performance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientEventOuterClass$Performance parseFrom(ByteBuffer byteBuffer) {
        return (ClientEventOuterClass$Performance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<ClientEventOuterClass$Performance> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6256b.f2144a[methodToInvoke.ordinal()]) {
            case 1:
                return new ClientEventOuterClass$Performance();
            case 2:
                return new C6181a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<ClientEventOuterClass$Performance> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (ClientEventOuterClass$Performance.class) {
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

    public static C6181a newBuilder(ClientEventOuterClass$Performance clientEventOuterClass$Performance) {
        return DEFAULT_INSTANCE.createBuilder(clientEventOuterClass$Performance);
    }

    public static ClientEventOuterClass$Performance parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientEventOuterClass$Performance) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClientEventOuterClass$Performance parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientEventOuterClass$Performance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static ClientEventOuterClass$Performance parseFrom(ByteString byteString) {
        return (ClientEventOuterClass$Performance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ClientEventOuterClass$Performance parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientEventOuterClass$Performance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static ClientEventOuterClass$Performance parseFrom(byte[] bArr) {
        return (ClientEventOuterClass$Performance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ClientEventOuterClass$Performance parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientEventOuterClass$Performance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static ClientEventOuterClass$Performance parseFrom(InputStream inputStream) {
        return (ClientEventOuterClass$Performance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ClientEventOuterClass$Performance parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientEventOuterClass$Performance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static ClientEventOuterClass$Performance parseFrom(CodedInputStream codedInputStream) {
        return (ClientEventOuterClass$Performance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static ClientEventOuterClass$Performance parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ClientEventOuterClass$Performance) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
