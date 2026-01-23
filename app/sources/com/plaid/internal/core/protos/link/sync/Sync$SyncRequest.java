package com.plaid.internal.core.protos.link.sync;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Sync$SyncRequest extends GeneratedMessageLite<Sync$SyncRequest, C6281a> implements MessageLiteOrBuilder {
    private static final Sync$SyncRequest DEFAULT_INSTANCE;
    public static final int GET_ACCOUNTS_FIELD_NUMBER = 2;
    public static final int GET_ACCOUNT_BALANCES_FIELD_NUMBER = 3;
    public static final int GET_TRANSACTION_HISTORY_FIELD_NUMBER = 4;
    private static volatile Parser<Sync$SyncRequest> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int SYNC_COMPLETE_FIELD_NUMBER = 6;
    public static final int VALIDATE_SYNC_CONNECTED_FIELD_NUMBER = 5;
    private Object requestType_;
    private int requestTypeCase_ = 0;
    private String requestId_ = "";

    public static final class GetAccountBalancesRequest extends GeneratedMessageLite<GetAccountBalancesRequest, C6276a> implements MessageLiteOrBuilder {
        private static final GetAccountBalancesRequest DEFAULT_INSTANCE;
        private static volatile Parser<GetAccountBalancesRequest> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.sync.Sync$SyncRequest$GetAccountBalancesRequest$a */
        public static final class C6276a extends GeneratedMessageLite.Builder<GetAccountBalancesRequest, C6276a> implements MessageLiteOrBuilder {
            public C6276a() {
                super(GetAccountBalancesRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            GetAccountBalancesRequest getAccountBalancesRequest = new GetAccountBalancesRequest();
            DEFAULT_INSTANCE = getAccountBalancesRequest;
            GeneratedMessageLite.registerDefaultInstance(GetAccountBalancesRequest.class, getAccountBalancesRequest);
        }

        private GetAccountBalancesRequest() {
        }

        public static GetAccountBalancesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6276a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetAccountBalancesRequest parseDelimitedFrom(InputStream inputStream) {
            return (GetAccountBalancesRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetAccountBalancesRequest parseFrom(ByteBuffer byteBuffer) {
            return (GetAccountBalancesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetAccountBalancesRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6292a.f2168a[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetAccountBalancesRequest();
                case 2:
                    return new C6276a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<GetAccountBalancesRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (GetAccountBalancesRequest.class) {
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

        public static C6276a newBuilder(GetAccountBalancesRequest getAccountBalancesRequest) {
            return DEFAULT_INSTANCE.createBuilder(getAccountBalancesRequest);
        }

        public static GetAccountBalancesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountBalancesRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetAccountBalancesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountBalancesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetAccountBalancesRequest parseFrom(ByteString byteString) {
            return (GetAccountBalancesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetAccountBalancesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountBalancesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetAccountBalancesRequest parseFrom(byte[] bArr) {
            return (GetAccountBalancesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetAccountBalancesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountBalancesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetAccountBalancesRequest parseFrom(InputStream inputStream) {
            return (GetAccountBalancesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetAccountBalancesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountBalancesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetAccountBalancesRequest parseFrom(CodedInputStream codedInputStream) {
            return (GetAccountBalancesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetAccountBalancesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountBalancesRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetAccountsRequest extends GeneratedMessageLite<GetAccountsRequest, C6277a> implements MessageLiteOrBuilder {
        private static final GetAccountsRequest DEFAULT_INSTANCE;
        private static volatile Parser<GetAccountsRequest> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.sync.Sync$SyncRequest$GetAccountsRequest$a */
        public static final class C6277a extends GeneratedMessageLite.Builder<GetAccountsRequest, C6277a> implements MessageLiteOrBuilder {
            public C6277a() {
                super(GetAccountsRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            GetAccountsRequest getAccountsRequest = new GetAccountsRequest();
            DEFAULT_INSTANCE = getAccountsRequest;
            GeneratedMessageLite.registerDefaultInstance(GetAccountsRequest.class, getAccountsRequest);
        }

        private GetAccountsRequest() {
        }

        public static GetAccountsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6277a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetAccountsRequest parseDelimitedFrom(InputStream inputStream) {
            return (GetAccountsRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetAccountsRequest parseFrom(ByteBuffer byteBuffer) {
            return (GetAccountsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetAccountsRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6292a.f2168a[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetAccountsRequest();
                case 2:
                    return new C6277a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<GetAccountsRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (GetAccountsRequest.class) {
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

        public static C6277a newBuilder(GetAccountsRequest getAccountsRequest) {
            return DEFAULT_INSTANCE.createBuilder(getAccountsRequest);
        }

        public static GetAccountsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountsRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetAccountsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetAccountsRequest parseFrom(ByteString byteString) {
            return (GetAccountsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetAccountsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetAccountsRequest parseFrom(byte[] bArr) {
            return (GetAccountsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetAccountsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetAccountsRequest parseFrom(InputStream inputStream) {
            return (GetAccountsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetAccountsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetAccountsRequest parseFrom(CodedInputStream codedInputStream) {
            return (GetAccountsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetAccountsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountsRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetTransactionHistoryRequest extends GeneratedMessageLite<GetTransactionHistoryRequest, C6278a> implements MessageLiteOrBuilder {
        public static final int ACCOUNT_ID_FIELD_NUMBER = 1;
        private static final GetTransactionHistoryRequest DEFAULT_INSTANCE;
        public static final int END_DATE_FIELD_NUMBER = 3;
        public static final int LIMIT_FIELD_NUMBER = 4;
        public static final int OFFSET_FIELD_NUMBER = 5;
        private static volatile Parser<GetTransactionHistoryRequest> PARSER = null;
        public static final int START_DATE_FIELD_NUMBER = 2;
        private String accountId_ = "";
        private int bitField0_;
        private Timestamp endDate_;
        private int limit_;
        private int offset_;
        private Timestamp startDate_;

        /* renamed from: com.plaid.internal.core.protos.link.sync.Sync$SyncRequest$GetTransactionHistoryRequest$a */
        public static final class C6278a extends GeneratedMessageLite.Builder<GetTransactionHistoryRequest, C6278a> implements MessageLiteOrBuilder {
            public C6278a() {
                super(GetTransactionHistoryRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            GetTransactionHistoryRequest getTransactionHistoryRequest = new GetTransactionHistoryRequest();
            DEFAULT_INSTANCE = getTransactionHistoryRequest;
            GeneratedMessageLite.registerDefaultInstance(GetTransactionHistoryRequest.class, getTransactionHistoryRequest);
        }

        private GetTransactionHistoryRequest() {
        }

        private void clearAccountId() {
            this.accountId_ = getDefaultInstance().getAccountId();
        }

        private void clearEndDate() {
            this.endDate_ = null;
            this.bitField0_ &= -3;
        }

        private void clearLimit() {
            this.limit_ = 0;
        }

        private void clearOffset() {
            this.offset_ = 0;
        }

        private void clearStartDate() {
            this.startDate_ = null;
            this.bitField0_ &= -2;
        }

        public static GetTransactionHistoryRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeEndDate(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.endDate_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.endDate_ = timestamp;
            } else {
                this.endDate_ = Timestamp.newBuilder(this.endDate_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        private void mergeStartDate(Timestamp timestamp) {
            timestamp.getClass();
            Timestamp timestamp2 = this.startDate_;
            if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
                this.startDate_ = timestamp;
            } else {
                this.startDate_ = Timestamp.newBuilder(this.startDate_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C6278a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetTransactionHistoryRequest parseDelimitedFrom(InputStream inputStream) {
            return (GetTransactionHistoryRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetTransactionHistoryRequest parseFrom(ByteBuffer byteBuffer) {
            return (GetTransactionHistoryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetTransactionHistoryRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAccountId(String str) {
            str.getClass();
            this.accountId_ = str;
        }

        private void setAccountIdBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.accountId_ = byteString.toStringUtf8();
        }

        private void setEndDate(Timestamp timestamp) {
            timestamp.getClass();
            this.endDate_ = timestamp;
            this.bitField0_ |= 2;
        }

        private void setLimit(int i) {
            this.limit_ = i;
        }

        private void setOffset(int i) {
            this.offset_ = i;
        }

        private void setStartDate(Timestamp timestamp) {
            timestamp.getClass();
            this.startDate_ = timestamp;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6292a.f2168a[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetTransactionHistoryRequest();
                case 2:
                    return new C6278a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u0004\u0005\u0004", new Object[]{"bitField0_", "accountId_", "startDate_", "endDate_", "limit_", "offset_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<GetTransactionHistoryRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (GetTransactionHistoryRequest.class) {
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

        public String getAccountId() {
            return this.accountId_;
        }

        public ByteString getAccountIdBytes() {
            return ByteString.copyFromUtf8(this.accountId_);
        }

        public Timestamp getEndDate() {
            Timestamp timestamp = this.endDate_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public int getLimit() {
            return this.limit_;
        }

        public int getOffset() {
            return this.offset_;
        }

        public Timestamp getStartDate() {
            Timestamp timestamp = this.startDate_;
            return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
        }

        public boolean hasEndDate() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasStartDate() {
            return (this.bitField0_ & 1) != 0;
        }

        public static C6278a newBuilder(GetTransactionHistoryRequest getTransactionHistoryRequest) {
            return DEFAULT_INSTANCE.createBuilder(getTransactionHistoryRequest);
        }

        public static GetTransactionHistoryRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetTransactionHistoryRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetTransactionHistoryRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (GetTransactionHistoryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetTransactionHistoryRequest parseFrom(ByteString byteString) {
            return (GetTransactionHistoryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetTransactionHistoryRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (GetTransactionHistoryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetTransactionHistoryRequest parseFrom(byte[] bArr) {
            return (GetTransactionHistoryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetTransactionHistoryRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (GetTransactionHistoryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetTransactionHistoryRequest parseFrom(InputStream inputStream) {
            return (GetTransactionHistoryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetTransactionHistoryRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetTransactionHistoryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetTransactionHistoryRequest parseFrom(CodedInputStream codedInputStream) {
            return (GetTransactionHistoryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetTransactionHistoryRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetTransactionHistoryRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SyncCompleteRequest extends GeneratedMessageLite<SyncCompleteRequest, C6279a> implements MessageLiteOrBuilder {
        private static final SyncCompleteRequest DEFAULT_INSTANCE;
        private static volatile Parser<SyncCompleteRequest> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.sync.Sync$SyncRequest$SyncCompleteRequest$a */
        public static final class C6279a extends GeneratedMessageLite.Builder<SyncCompleteRequest, C6279a> implements MessageLiteOrBuilder {
            public C6279a() {
                super(SyncCompleteRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            SyncCompleteRequest syncCompleteRequest = new SyncCompleteRequest();
            DEFAULT_INSTANCE = syncCompleteRequest;
            GeneratedMessageLite.registerDefaultInstance(SyncCompleteRequest.class, syncCompleteRequest);
        }

        private SyncCompleteRequest() {
        }

        public static SyncCompleteRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6279a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SyncCompleteRequest parseDelimitedFrom(InputStream inputStream) {
            return (SyncCompleteRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SyncCompleteRequest parseFrom(ByteBuffer byteBuffer) {
            return (SyncCompleteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SyncCompleteRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6292a.f2168a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SyncCompleteRequest();
                case 2:
                    return new C6279a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SyncCompleteRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SyncCompleteRequest.class) {
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

        public static C6279a newBuilder(SyncCompleteRequest syncCompleteRequest) {
            return DEFAULT_INSTANCE.createBuilder(syncCompleteRequest);
        }

        public static SyncCompleteRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncCompleteRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SyncCompleteRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncCompleteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SyncCompleteRequest parseFrom(ByteString byteString) {
            return (SyncCompleteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SyncCompleteRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncCompleteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SyncCompleteRequest parseFrom(byte[] bArr) {
            return (SyncCompleteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SyncCompleteRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncCompleteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SyncCompleteRequest parseFrom(InputStream inputStream) {
            return (SyncCompleteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SyncCompleteRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncCompleteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SyncCompleteRequest parseFrom(CodedInputStream codedInputStream) {
            return (SyncCompleteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SyncCompleteRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SyncCompleteRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ValidateSyncConnectedRequest extends GeneratedMessageLite<ValidateSyncConnectedRequest, C6280a> implements MessageLiteOrBuilder {
        private static final ValidateSyncConnectedRequest DEFAULT_INSTANCE;
        private static volatile Parser<ValidateSyncConnectedRequest> PARSER;

        /* renamed from: com.plaid.internal.core.protos.link.sync.Sync$SyncRequest$ValidateSyncConnectedRequest$a */
        public static final class C6280a extends GeneratedMessageLite.Builder<ValidateSyncConnectedRequest, C6280a> implements MessageLiteOrBuilder {
            public C6280a() {
                super(ValidateSyncConnectedRequest.DEFAULT_INSTANCE);
            }
        }

        static {
            ValidateSyncConnectedRequest validateSyncConnectedRequest = new ValidateSyncConnectedRequest();
            DEFAULT_INSTANCE = validateSyncConnectedRequest;
            GeneratedMessageLite.registerDefaultInstance(ValidateSyncConnectedRequest.class, validateSyncConnectedRequest);
        }

        private ValidateSyncConnectedRequest() {
        }

        public static ValidateSyncConnectedRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6280a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ValidateSyncConnectedRequest parseDelimitedFrom(InputStream inputStream) {
            return (ValidateSyncConnectedRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ValidateSyncConnectedRequest parseFrom(ByteBuffer byteBuffer) {
            return (ValidateSyncConnectedRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ValidateSyncConnectedRequest> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6292a.f2168a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ValidateSyncConnectedRequest();
                case 2:
                    return new C6280a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ValidateSyncConnectedRequest> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ValidateSyncConnectedRequest.class) {
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

        public static C6280a newBuilder(ValidateSyncConnectedRequest validateSyncConnectedRequest) {
            return DEFAULT_INSTANCE.createBuilder(validateSyncConnectedRequest);
        }

        public static ValidateSyncConnectedRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ValidateSyncConnectedRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ValidateSyncConnectedRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ValidateSyncConnectedRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ValidateSyncConnectedRequest parseFrom(ByteString byteString) {
            return (ValidateSyncConnectedRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ValidateSyncConnectedRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ValidateSyncConnectedRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ValidateSyncConnectedRequest parseFrom(byte[] bArr) {
            return (ValidateSyncConnectedRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ValidateSyncConnectedRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ValidateSyncConnectedRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ValidateSyncConnectedRequest parseFrom(InputStream inputStream) {
            return (ValidateSyncConnectedRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ValidateSyncConnectedRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ValidateSyncConnectedRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ValidateSyncConnectedRequest parseFrom(CodedInputStream codedInputStream) {
            return (ValidateSyncConnectedRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ValidateSyncConnectedRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ValidateSyncConnectedRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.sync.Sync$SyncRequest$a */
    public static final class C6281a extends GeneratedMessageLite.Builder<Sync$SyncRequest, C6281a> implements MessageLiteOrBuilder {
        public C6281a() {
            super(Sync$SyncRequest.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.sync.Sync$SyncRequest$b */
    public enum EnumC6282b {
        GET_ACCOUNTS(2),
        GET_ACCOUNT_BALANCES(3),
        GET_TRANSACTION_HISTORY(4),
        VALIDATE_SYNC_CONNECTED(5),
        SYNC_COMPLETE(6),
        REQUESTTYPE_NOT_SET(0);


        /* renamed from: a */
        public final int f2165a;

        EnumC6282b(int i) {
            this.f2165a = i;
        }

        public static EnumC6282b forNumber(int i) {
            if (i == 0) {
                return REQUESTTYPE_NOT_SET;
            }
            if (i == 2) {
                return GET_ACCOUNTS;
            }
            if (i == 3) {
                return GET_ACCOUNT_BALANCES;
            }
            if (i == 4) {
                return GET_TRANSACTION_HISTORY;
            }
            if (i == 5) {
                return VALIDATE_SYNC_CONNECTED;
            }
            if (i != 6) {
                return null;
            }
            return SYNC_COMPLETE;
        }

        public int getNumber() {
            return this.f2165a;
        }

        @Deprecated
        public static EnumC6282b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Sync$SyncRequest sync$SyncRequest = new Sync$SyncRequest();
        DEFAULT_INSTANCE = sync$SyncRequest;
        GeneratedMessageLite.registerDefaultInstance(Sync$SyncRequest.class, sync$SyncRequest);
    }

    private Sync$SyncRequest() {
    }

    private void clearGetAccountBalances() {
        if (this.requestTypeCase_ == 3) {
            this.requestTypeCase_ = 0;
            this.requestType_ = null;
        }
    }

    private void clearGetAccounts() {
        if (this.requestTypeCase_ == 2) {
            this.requestTypeCase_ = 0;
            this.requestType_ = null;
        }
    }

    private void clearGetTransactionHistory() {
        if (this.requestTypeCase_ == 4) {
            this.requestTypeCase_ = 0;
            this.requestType_ = null;
        }
    }

    private void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    private void clearRequestType() {
        this.requestTypeCase_ = 0;
        this.requestType_ = null;
    }

    private void clearSyncComplete() {
        if (this.requestTypeCase_ == 6) {
            this.requestTypeCase_ = 0;
            this.requestType_ = null;
        }
    }

    private void clearValidateSyncConnected() {
        if (this.requestTypeCase_ == 5) {
            this.requestTypeCase_ = 0;
            this.requestType_ = null;
        }
    }

    public static Sync$SyncRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeGetAccountBalances(GetAccountBalancesRequest getAccountBalancesRequest) {
        getAccountBalancesRequest.getClass();
        if (this.requestTypeCase_ != 3 || this.requestType_ == GetAccountBalancesRequest.getDefaultInstance()) {
            this.requestType_ = getAccountBalancesRequest;
        } else {
            this.requestType_ = GetAccountBalancesRequest.newBuilder((GetAccountBalancesRequest) this.requestType_).mergeFrom((GetAccountBalancesRequest.C6276a) getAccountBalancesRequest).buildPartial();
        }
        this.requestTypeCase_ = 3;
    }

    private void mergeGetAccounts(GetAccountsRequest getAccountsRequest) {
        getAccountsRequest.getClass();
        if (this.requestTypeCase_ != 2 || this.requestType_ == GetAccountsRequest.getDefaultInstance()) {
            this.requestType_ = getAccountsRequest;
        } else {
            this.requestType_ = GetAccountsRequest.newBuilder((GetAccountsRequest) this.requestType_).mergeFrom((GetAccountsRequest.C6277a) getAccountsRequest).buildPartial();
        }
        this.requestTypeCase_ = 2;
    }

    private void mergeGetTransactionHistory(GetTransactionHistoryRequest getTransactionHistoryRequest) {
        getTransactionHistoryRequest.getClass();
        if (this.requestTypeCase_ != 4 || this.requestType_ == GetTransactionHistoryRequest.getDefaultInstance()) {
            this.requestType_ = getTransactionHistoryRequest;
        } else {
            this.requestType_ = GetTransactionHistoryRequest.newBuilder((GetTransactionHistoryRequest) this.requestType_).mergeFrom((GetTransactionHistoryRequest.C6278a) getTransactionHistoryRequest).buildPartial();
        }
        this.requestTypeCase_ = 4;
    }

    private void mergeSyncComplete(SyncCompleteRequest syncCompleteRequest) {
        syncCompleteRequest.getClass();
        if (this.requestTypeCase_ != 6 || this.requestType_ == SyncCompleteRequest.getDefaultInstance()) {
            this.requestType_ = syncCompleteRequest;
        } else {
            this.requestType_ = SyncCompleteRequest.newBuilder((SyncCompleteRequest) this.requestType_).mergeFrom((SyncCompleteRequest.C6279a) syncCompleteRequest).buildPartial();
        }
        this.requestTypeCase_ = 6;
    }

    private void mergeValidateSyncConnected(ValidateSyncConnectedRequest validateSyncConnectedRequest) {
        validateSyncConnectedRequest.getClass();
        if (this.requestTypeCase_ != 5 || this.requestType_ == ValidateSyncConnectedRequest.getDefaultInstance()) {
            this.requestType_ = validateSyncConnectedRequest;
        } else {
            this.requestType_ = ValidateSyncConnectedRequest.newBuilder((ValidateSyncConnectedRequest) this.requestType_).mergeFrom((ValidateSyncConnectedRequest.C6280a) validateSyncConnectedRequest).buildPartial();
        }
        this.requestTypeCase_ = 5;
    }

    public static C6281a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Sync$SyncRequest parseDelimitedFrom(InputStream inputStream) {
        return (Sync$SyncRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sync$SyncRequest parseFrom(ByteBuffer byteBuffer) {
        return (Sync$SyncRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Sync$SyncRequest> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setGetAccountBalances(GetAccountBalancesRequest getAccountBalancesRequest) {
        getAccountBalancesRequest.getClass();
        this.requestType_ = getAccountBalancesRequest;
        this.requestTypeCase_ = 3;
    }

    private void setGetAccounts(GetAccountsRequest getAccountsRequest) {
        getAccountsRequest.getClass();
        this.requestType_ = getAccountsRequest;
        this.requestTypeCase_ = 2;
    }

    private void setGetTransactionHistory(GetTransactionHistoryRequest getTransactionHistoryRequest) {
        getTransactionHistoryRequest.getClass();
        this.requestType_ = getTransactionHistoryRequest;
        this.requestTypeCase_ = 4;
    }

    private void setRequestId(String str) {
        str.getClass();
        this.requestId_ = str;
    }

    private void setRequestIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.requestId_ = byteString.toStringUtf8();
    }

    private void setSyncComplete(SyncCompleteRequest syncCompleteRequest) {
        syncCompleteRequest.getClass();
        this.requestType_ = syncCompleteRequest;
        this.requestTypeCase_ = 6;
    }

    private void setValidateSyncConnected(ValidateSyncConnectedRequest validateSyncConnectedRequest) {
        validateSyncConnectedRequest.getClass();
        this.requestType_ = validateSyncConnectedRequest;
        this.requestTypeCase_ = 5;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6292a.f2168a[methodToInvoke.ordinal()]) {
            case 1:
                return new Sync$SyncRequest();
            case 2:
                return new C6281a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"requestType_", "requestTypeCase_", "requestId_", GetAccountsRequest.class, GetAccountBalancesRequest.class, GetTransactionHistoryRequest.class, ValidateSyncConnectedRequest.class, SyncCompleteRequest.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Sync$SyncRequest> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Sync$SyncRequest.class) {
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

    public GetAccountBalancesRequest getGetAccountBalances() {
        return this.requestTypeCase_ == 3 ? (GetAccountBalancesRequest) this.requestType_ : GetAccountBalancesRequest.getDefaultInstance();
    }

    public GetAccountsRequest getGetAccounts() {
        return this.requestTypeCase_ == 2 ? (GetAccountsRequest) this.requestType_ : GetAccountsRequest.getDefaultInstance();
    }

    public GetTransactionHistoryRequest getGetTransactionHistory() {
        return this.requestTypeCase_ == 4 ? (GetTransactionHistoryRequest) this.requestType_ : GetTransactionHistoryRequest.getDefaultInstance();
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public ByteString getRequestIdBytes() {
        return ByteString.copyFromUtf8(this.requestId_);
    }

    public EnumC6282b getRequestTypeCase() {
        return EnumC6282b.forNumber(this.requestTypeCase_);
    }

    public SyncCompleteRequest getSyncComplete() {
        return this.requestTypeCase_ == 6 ? (SyncCompleteRequest) this.requestType_ : SyncCompleteRequest.getDefaultInstance();
    }

    public ValidateSyncConnectedRequest getValidateSyncConnected() {
        return this.requestTypeCase_ == 5 ? (ValidateSyncConnectedRequest) this.requestType_ : ValidateSyncConnectedRequest.getDefaultInstance();
    }

    public boolean hasGetAccountBalances() {
        return this.requestTypeCase_ == 3;
    }

    public boolean hasGetAccounts() {
        return this.requestTypeCase_ == 2;
    }

    public boolean hasGetTransactionHistory() {
        return this.requestTypeCase_ == 4;
    }

    public boolean hasSyncComplete() {
        return this.requestTypeCase_ == 6;
    }

    public boolean hasValidateSyncConnected() {
        return this.requestTypeCase_ == 5;
    }

    public static C6281a newBuilder(Sync$SyncRequest sync$SyncRequest) {
        return DEFAULT_INSTANCE.createBuilder(sync$SyncRequest);
    }

    public static Sync$SyncRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Sync$SyncRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Sync$SyncRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Sync$SyncRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Sync$SyncRequest parseFrom(ByteString byteString) {
        return (Sync$SyncRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Sync$SyncRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Sync$SyncRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Sync$SyncRequest parseFrom(byte[] bArr) {
        return (Sync$SyncRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sync$SyncRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Sync$SyncRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Sync$SyncRequest parseFrom(InputStream inputStream) {
        return (Sync$SyncRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sync$SyncRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Sync$SyncRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Sync$SyncRequest parseFrom(CodedInputStream codedInputStream) {
        return (Sync$SyncRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Sync$SyncRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Sync$SyncRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
