package com.plaid.internal.core.protos.clients;

import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.income_verification_manager.EnumC6079b;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class LinkCustomizations$DocumentPreference extends GeneratedMessageLite<LinkCustomizations$DocumentPreference, C6062a> implements InterfaceC6075b {
    public static final int AT_LEAST_FIELD_NUMBER = 2;
    public static final int AT_MOST_FIELD_NUMBER = 3;
    private static final LinkCustomizations$DocumentPreference DEFAULT_INSTANCE;
    public static final int DOCUMENT_TYPE_FIELD_NUMBER = 1;
    private static volatile Parser<LinkCustomizations$DocumentPreference> PARSER;
    private Int32Value atLeast_;
    private Int32Value atMost_;
    private int bitField0_;
    private int documentType_;

    /* renamed from: com.plaid.internal.core.protos.clients.LinkCustomizations$DocumentPreference$a */
    public static final class C6062a extends GeneratedMessageLite.Builder<LinkCustomizations$DocumentPreference, C6062a> implements InterfaceC6075b {
        public C6062a() {
            super(LinkCustomizations$DocumentPreference.DEFAULT_INSTANCE);
        }
    }

    static {
        LinkCustomizations$DocumentPreference linkCustomizations$DocumentPreference = new LinkCustomizations$DocumentPreference();
        DEFAULT_INSTANCE = linkCustomizations$DocumentPreference;
        GeneratedMessageLite.registerDefaultInstance(LinkCustomizations$DocumentPreference.class, linkCustomizations$DocumentPreference);
    }

    private LinkCustomizations$DocumentPreference() {
    }

    private void clearAtLeast() {
        this.atLeast_ = null;
        this.bitField0_ &= -2;
    }

    private void clearAtMost() {
        this.atMost_ = null;
        this.bitField0_ &= -3;
    }

    private void clearDocumentType() {
        this.documentType_ = 0;
    }

    public static LinkCustomizations$DocumentPreference getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeAtLeast(Int32Value int32Value) {
        int32Value.getClass();
        Int32Value int32Value2 = this.atLeast_;
        if (int32Value2 == null || int32Value2 == Int32Value.getDefaultInstance()) {
            this.atLeast_ = int32Value;
        } else {
            this.atLeast_ = Int32Value.newBuilder(this.atLeast_).mergeFrom((Int32Value.Builder) int32Value).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    private void mergeAtMost(Int32Value int32Value) {
        int32Value.getClass();
        Int32Value int32Value2 = this.atMost_;
        if (int32Value2 == null || int32Value2 == Int32Value.getDefaultInstance()) {
            this.atMost_ = int32Value;
        } else {
            this.atMost_ = Int32Value.newBuilder(this.atMost_).mergeFrom((Int32Value.Builder) int32Value).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static C6062a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static LinkCustomizations$DocumentPreference parseDelimitedFrom(InputStream inputStream) {
        return (LinkCustomizations$DocumentPreference) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkCustomizations$DocumentPreference parseFrom(ByteBuffer byteBuffer) {
        return (LinkCustomizations$DocumentPreference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<LinkCustomizations$DocumentPreference> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAtLeast(Int32Value int32Value) {
        int32Value.getClass();
        this.atLeast_ = int32Value;
        this.bitField0_ |= 1;
    }

    private void setAtMost(Int32Value int32Value) {
        int32Value.getClass();
        this.atMost_ = int32Value;
        this.bitField0_ |= 2;
    }

    private void setDocumentType(EnumC6079b enumC6079b) {
        this.documentType_ = enumC6079b.getNumber();
    }

    private void setDocumentTypeValue(int i) {
        this.documentType_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6074a.f2030a[methodToInvoke.ordinal()]) {
            case 1:
                return new LinkCustomizations$DocumentPreference();
            case 2:
                return new C6062a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "documentType_", "atLeast_", "atMost_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<LinkCustomizations$DocumentPreference> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (LinkCustomizations$DocumentPreference.class) {
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

    public Int32Value getAtLeast() {
        Int32Value int32Value = this.atLeast_;
        return int32Value == null ? Int32Value.getDefaultInstance() : int32Value;
    }

    public Int32Value getAtMost() {
        Int32Value int32Value = this.atMost_;
        return int32Value == null ? Int32Value.getDefaultInstance() : int32Value;
    }

    public EnumC6079b getDocumentType() {
        EnumC6079b enumC6079bForNumber = EnumC6079b.forNumber(this.documentType_);
        return enumC6079bForNumber == null ? EnumC6079b.UNRECOGNIZED : enumC6079bForNumber;
    }

    public int getDocumentTypeValue() {
        return this.documentType_;
    }

    public boolean hasAtLeast() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasAtMost() {
        return (this.bitField0_ & 2) != 0;
    }

    public static C6062a newBuilder(LinkCustomizations$DocumentPreference linkCustomizations$DocumentPreference) {
        return DEFAULT_INSTANCE.createBuilder(linkCustomizations$DocumentPreference);
    }

    public static LinkCustomizations$DocumentPreference parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$DocumentPreference) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkCustomizations$DocumentPreference parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$DocumentPreference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static LinkCustomizations$DocumentPreference parseFrom(ByteString byteString) {
        return (LinkCustomizations$DocumentPreference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static LinkCustomizations$DocumentPreference parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$DocumentPreference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static LinkCustomizations$DocumentPreference parseFrom(byte[] bArr) {
        return (LinkCustomizations$DocumentPreference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LinkCustomizations$DocumentPreference parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$DocumentPreference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static LinkCustomizations$DocumentPreference parseFrom(InputStream inputStream) {
        return (LinkCustomizations$DocumentPreference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LinkCustomizations$DocumentPreference parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$DocumentPreference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static LinkCustomizations$DocumentPreference parseFrom(CodedInputStream codedInputStream) {
        return (LinkCustomizations$DocumentPreference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static LinkCustomizations$DocumentPreference parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (LinkCustomizations$DocumentPreference) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
