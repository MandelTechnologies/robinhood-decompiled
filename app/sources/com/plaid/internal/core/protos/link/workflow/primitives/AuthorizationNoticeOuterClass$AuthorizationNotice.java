package com.plaid.internal.core.protos.link.workflow.primitives;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$ClientMeasurement;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class AuthorizationNoticeOuterClass$AuthorizationNotice extends GeneratedMessageLite<AuthorizationNoticeOuterClass$AuthorizationNotice, C6951a> implements MessageLiteOrBuilder {
    public static final int AUTH_TOKEN_FIELD_NUMBER = 2;
    public static final int CLIENT_MEASUREMENT_FIELD_NUMBER = 4;
    public static final int CREATED_AT_FIELD_NUMBER = 1;
    private static final AuthorizationNoticeOuterClass$AuthorizationNotice DEFAULT_INSTANCE;
    private static volatile Parser<AuthorizationNoticeOuterClass$AuthorizationNotice> PARSER = null;
    public static final int USER_ID_FIELD_NUMBER = 3;
    private int bitField0_;
    private AuthorizationNoticeOuterClass$ClientMeasurement clientMeasurement_;
    private Timestamp createdAt_;
    private String authToken_ = "";
    private String userId_ = "";

    /* renamed from: com.plaid.internal.core.protos.link.workflow.primitives.AuthorizationNoticeOuterClass$AuthorizationNotice$a */
    public static final class C6951a extends GeneratedMessageLite.Builder<AuthorizationNoticeOuterClass$AuthorizationNotice, C6951a> implements MessageLiteOrBuilder {
        public C6951a() {
            super(AuthorizationNoticeOuterClass$AuthorizationNotice.DEFAULT_INSTANCE);
        }
    }

    static {
        AuthorizationNoticeOuterClass$AuthorizationNotice authorizationNoticeOuterClass$AuthorizationNotice = new AuthorizationNoticeOuterClass$AuthorizationNotice();
        DEFAULT_INSTANCE = authorizationNoticeOuterClass$AuthorizationNotice;
        GeneratedMessageLite.registerDefaultInstance(AuthorizationNoticeOuterClass$AuthorizationNotice.class, authorizationNoticeOuterClass$AuthorizationNotice);
    }

    private AuthorizationNoticeOuterClass$AuthorizationNotice() {
    }

    private void clearAuthToken() {
        this.authToken_ = getDefaultInstance().getAuthToken();
    }

    private void clearClientMeasurement() {
        this.clientMeasurement_ = null;
        this.bitField0_ &= -3;
    }

    private void clearCreatedAt() {
        this.createdAt_ = null;
        this.bitField0_ &= -2;
    }

    private void clearUserId() {
        this.userId_ = getDefaultInstance().getUserId();
    }

    public static AuthorizationNoticeOuterClass$AuthorizationNotice getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeClientMeasurement(AuthorizationNoticeOuterClass$ClientMeasurement authorizationNoticeOuterClass$ClientMeasurement) {
        authorizationNoticeOuterClass$ClientMeasurement.getClass();
        AuthorizationNoticeOuterClass$ClientMeasurement authorizationNoticeOuterClass$ClientMeasurement2 = this.clientMeasurement_;
        if (authorizationNoticeOuterClass$ClientMeasurement2 == null || authorizationNoticeOuterClass$ClientMeasurement2 == AuthorizationNoticeOuterClass$ClientMeasurement.getDefaultInstance()) {
            this.clientMeasurement_ = authorizationNoticeOuterClass$ClientMeasurement;
        } else {
            this.clientMeasurement_ = AuthorizationNoticeOuterClass$ClientMeasurement.newBuilder(this.clientMeasurement_).mergeFrom((AuthorizationNoticeOuterClass$ClientMeasurement.C6952a) authorizationNoticeOuterClass$ClientMeasurement).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    private void mergeCreatedAt(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.createdAt_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.createdAt_ = timestamp;
        } else {
            this.createdAt_ = Timestamp.newBuilder(this.createdAt_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C6951a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static AuthorizationNoticeOuterClass$AuthorizationNotice parseDelimitedFrom(InputStream inputStream) {
        return (AuthorizationNoticeOuterClass$AuthorizationNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthorizationNoticeOuterClass$AuthorizationNotice parseFrom(ByteBuffer byteBuffer) {
        return (AuthorizationNoticeOuterClass$AuthorizationNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<AuthorizationNoticeOuterClass$AuthorizationNotice> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAuthToken(String str) {
        str.getClass();
        this.authToken_ = str;
    }

    private void setAuthTokenBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.authToken_ = byteString.toStringUtf8();
    }

    private void setClientMeasurement(AuthorizationNoticeOuterClass$ClientMeasurement authorizationNoticeOuterClass$ClientMeasurement) {
        authorizationNoticeOuterClass$ClientMeasurement.getClass();
        this.clientMeasurement_ = authorizationNoticeOuterClass$ClientMeasurement;
        this.bitField0_ |= 2;
    }

    private void setCreatedAt(Timestamp timestamp) {
        timestamp.getClass();
        this.createdAt_ = timestamp;
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
        switch (C7021a.f2648a[methodToInvoke.ordinal()]) {
            case 1:
                return new AuthorizationNoticeOuterClass$AuthorizationNotice();
            case 2:
                return new C6951a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004ဉ\u0001", new Object[]{"bitField0_", "createdAt_", "authToken_", "userId_", "clientMeasurement_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<AuthorizationNoticeOuterClass$AuthorizationNotice> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (AuthorizationNoticeOuterClass$AuthorizationNotice.class) {
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

    public String getAuthToken() {
        return this.authToken_;
    }

    public ByteString getAuthTokenBytes() {
        return ByteString.copyFromUtf8(this.authToken_);
    }

    public AuthorizationNoticeOuterClass$ClientMeasurement getClientMeasurement() {
        AuthorizationNoticeOuterClass$ClientMeasurement authorizationNoticeOuterClass$ClientMeasurement = this.clientMeasurement_;
        return authorizationNoticeOuterClass$ClientMeasurement == null ? AuthorizationNoticeOuterClass$ClientMeasurement.getDefaultInstance() : authorizationNoticeOuterClass$ClientMeasurement;
    }

    public Timestamp getCreatedAt() {
        Timestamp timestamp = this.createdAt_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public String getUserId() {
        return this.userId_;
    }

    public ByteString getUserIdBytes() {
        return ByteString.copyFromUtf8(this.userId_);
    }

    public boolean hasClientMeasurement() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCreatedAt() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6951a newBuilder(AuthorizationNoticeOuterClass$AuthorizationNotice authorizationNoticeOuterClass$AuthorizationNotice) {
        return DEFAULT_INSTANCE.createBuilder(authorizationNoticeOuterClass$AuthorizationNotice);
    }

    public static AuthorizationNoticeOuterClass$AuthorizationNotice parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthorizationNoticeOuterClass$AuthorizationNotice) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuthorizationNoticeOuterClass$AuthorizationNotice parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthorizationNoticeOuterClass$AuthorizationNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static AuthorizationNoticeOuterClass$AuthorizationNotice parseFrom(ByteString byteString) {
        return (AuthorizationNoticeOuterClass$AuthorizationNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AuthorizationNoticeOuterClass$AuthorizationNotice parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthorizationNoticeOuterClass$AuthorizationNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static AuthorizationNoticeOuterClass$AuthorizationNotice parseFrom(byte[] bArr) {
        return (AuthorizationNoticeOuterClass$AuthorizationNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuthorizationNoticeOuterClass$AuthorizationNotice parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthorizationNoticeOuterClass$AuthorizationNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static AuthorizationNoticeOuterClass$AuthorizationNotice parseFrom(InputStream inputStream) {
        return (AuthorizationNoticeOuterClass$AuthorizationNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuthorizationNoticeOuterClass$AuthorizationNotice parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthorizationNoticeOuterClass$AuthorizationNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static AuthorizationNoticeOuterClass$AuthorizationNotice parseFrom(CodedInputStream codedInputStream) {
        return (AuthorizationNoticeOuterClass$AuthorizationNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static AuthorizationNoticeOuterClass$AuthorizationNotice parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (AuthorizationNoticeOuterClass$AuthorizationNotice) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
