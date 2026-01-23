package com.plaid.internal.core.protos.income_verification_manager;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class External$DocumentNumberOfUploadsPreferences extends GeneratedMessageLite<External$DocumentNumberOfUploadsPreferences, C6076a> implements MessageLiteOrBuilder {
    private static final External$DocumentNumberOfUploadsPreferences DEFAULT_INSTANCE;
    public static final int MAX_UPLOADS_FIELD_NUMBER = 1;
    public static final int MIN_UPLOADS_FIELD_NUMBER = 2;
    private static volatile Parser<External$DocumentNumberOfUploadsPreferences> PARSER;
    private int maxUploads_;
    private int minUploads_;

    /* renamed from: com.plaid.internal.core.protos.income_verification_manager.External$DocumentNumberOfUploadsPreferences$a */
    public static final class C6076a extends GeneratedMessageLite.Builder<External$DocumentNumberOfUploadsPreferences, C6076a> implements MessageLiteOrBuilder {
        public C6076a() {
            super(External$DocumentNumberOfUploadsPreferences.DEFAULT_INSTANCE);
        }
    }

    static {
        External$DocumentNumberOfUploadsPreferences external$DocumentNumberOfUploadsPreferences = new External$DocumentNumberOfUploadsPreferences();
        DEFAULT_INSTANCE = external$DocumentNumberOfUploadsPreferences;
        GeneratedMessageLite.registerDefaultInstance(External$DocumentNumberOfUploadsPreferences.class, external$DocumentNumberOfUploadsPreferences);
    }

    private External$DocumentNumberOfUploadsPreferences() {
    }

    private void clearMaxUploads() {
        this.maxUploads_ = 0;
    }

    private void clearMinUploads() {
        this.minUploads_ = 0;
    }

    public static External$DocumentNumberOfUploadsPreferences getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C6076a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static External$DocumentNumberOfUploadsPreferences parseDelimitedFrom(InputStream inputStream) {
        return (External$DocumentNumberOfUploadsPreferences) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static External$DocumentNumberOfUploadsPreferences parseFrom(ByteBuffer byteBuffer) {
        return (External$DocumentNumberOfUploadsPreferences) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<External$DocumentNumberOfUploadsPreferences> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setMaxUploads(int i) {
        this.maxUploads_ = i;
    }

    private void setMinUploads(int i) {
        this.minUploads_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6078a.f2031a[methodToInvoke.ordinal()]) {
            case 1:
                return new External$DocumentNumberOfUploadsPreferences();
            case 2:
                return new C6076a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"maxUploads_", "minUploads_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<External$DocumentNumberOfUploadsPreferences> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (External$DocumentNumberOfUploadsPreferences.class) {
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

    public int getMaxUploads() {
        return this.maxUploads_;
    }

    public int getMinUploads() {
        return this.minUploads_;
    }

    public static C6076a newBuilder(External$DocumentNumberOfUploadsPreferences external$DocumentNumberOfUploadsPreferences) {
        return DEFAULT_INSTANCE.createBuilder(external$DocumentNumberOfUploadsPreferences);
    }

    public static External$DocumentNumberOfUploadsPreferences parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (External$DocumentNumberOfUploadsPreferences) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static External$DocumentNumberOfUploadsPreferences parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (External$DocumentNumberOfUploadsPreferences) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static External$DocumentNumberOfUploadsPreferences parseFrom(ByteString byteString) {
        return (External$DocumentNumberOfUploadsPreferences) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static External$DocumentNumberOfUploadsPreferences parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (External$DocumentNumberOfUploadsPreferences) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static External$DocumentNumberOfUploadsPreferences parseFrom(byte[] bArr) {
        return (External$DocumentNumberOfUploadsPreferences) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static External$DocumentNumberOfUploadsPreferences parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (External$DocumentNumberOfUploadsPreferences) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static External$DocumentNumberOfUploadsPreferences parseFrom(InputStream inputStream) {
        return (External$DocumentNumberOfUploadsPreferences) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static External$DocumentNumberOfUploadsPreferences parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (External$DocumentNumberOfUploadsPreferences) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static External$DocumentNumberOfUploadsPreferences parseFrom(CodedInputStream codedInputStream) {
        return (External$DocumentNumberOfUploadsPreferences) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static External$DocumentNumberOfUploadsPreferences parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (External$DocumentNumberOfUploadsPreferences) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
