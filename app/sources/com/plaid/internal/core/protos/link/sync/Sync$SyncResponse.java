package com.plaid.internal.core.protos.link.sync;

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
public final class Sync$SyncResponse extends GeneratedMessageLite<Sync$SyncResponse, C6290a> implements MessageLiteOrBuilder {
    private static final Sync$SyncResponse DEFAULT_INSTANCE;
    public static final int ERROR_RESPONSE_FIELD_NUMBER = 6;
    public static final int GET_ACCOUNTS_FIELD_NUMBER = 2;
    public static final int GET_ACCOUNT_BALANCES_FIELD_NUMBER = 3;
    public static final int GET_TRANSACTION_HISTORY_FIELD_NUMBER = 4;
    private static volatile Parser<Sync$SyncResponse> PARSER = null;
    public static final int REQUEST_ID_FIELD_NUMBER = 1;
    public static final int VALIDATE_SYNC_CONNECTED_FIELD_NUMBER = 5;
    private Object responseType_;
    private int responseTypeCase_ = 0;
    private String requestId_ = "";

    public static final class ErrorResponse extends GeneratedMessageLite<ErrorResponse, C6283a> implements MessageLiteOrBuilder {
        private static final ErrorResponse DEFAULT_INSTANCE;
        public static final int ERROR_MESSAGE_FIELD_NUMBER = 1;
        private static volatile Parser<ErrorResponse> PARSER;
        private String errorMessage_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.sync.Sync$SyncResponse$ErrorResponse$a */
        public static final class C6283a extends GeneratedMessageLite.Builder<ErrorResponse, C6283a> implements MessageLiteOrBuilder {
            public C6283a() {
                super(ErrorResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            ErrorResponse errorResponse = new ErrorResponse();
            DEFAULT_INSTANCE = errorResponse;
            GeneratedMessageLite.registerDefaultInstance(ErrorResponse.class, errorResponse);
        }

        private ErrorResponse() {
        }

        private void clearErrorMessage() {
            this.errorMessage_ = getDefaultInstance().getErrorMessage();
        }

        public static ErrorResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6283a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ErrorResponse parseDelimitedFrom(InputStream inputStream) {
            return (ErrorResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ErrorResponse parseFrom(ByteBuffer byteBuffer) {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ErrorResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setErrorMessage(String str) {
            str.getClass();
            this.errorMessage_ = str;
        }

        private void setErrorMessageBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.errorMessage_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6292a.f2168a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ErrorResponse();
                case 2:
                    return new C6283a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"errorMessage_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ErrorResponse> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ErrorResponse.class) {
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

        public String getErrorMessage() {
            return this.errorMessage_;
        }

        public ByteString getErrorMessageBytes() {
            return ByteString.copyFromUtf8(this.errorMessage_);
        }

        public static C6283a newBuilder(ErrorResponse errorResponse) {
            return DEFAULT_INSTANCE.createBuilder(errorResponse);
        }

        public static ErrorResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ErrorResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ErrorResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ErrorResponse parseFrom(ByteString byteString) {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ErrorResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ErrorResponse parseFrom(byte[] bArr) {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ErrorResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ErrorResponse parseFrom(InputStream inputStream) {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ErrorResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ErrorResponse parseFrom(CodedInputStream codedInputStream) {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ErrorResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ErrorResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetAccountBalancesResponse extends GeneratedMessageLite<GetAccountBalancesResponse, C6284a> implements MessageLiteOrBuilder {
        private static final GetAccountBalancesResponse DEFAULT_INSTANCE;
        private static volatile Parser<GetAccountBalancesResponse> PARSER = null;
        public static final int RAW_JSON_FIELD_NUMBER = 1;
        private String rawJson_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.sync.Sync$SyncResponse$GetAccountBalancesResponse$a */
        public static final class C6284a extends GeneratedMessageLite.Builder<GetAccountBalancesResponse, C6284a> implements MessageLiteOrBuilder {
            public C6284a() {
                super(GetAccountBalancesResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            GetAccountBalancesResponse getAccountBalancesResponse = new GetAccountBalancesResponse();
            DEFAULT_INSTANCE = getAccountBalancesResponse;
            GeneratedMessageLite.registerDefaultInstance(GetAccountBalancesResponse.class, getAccountBalancesResponse);
        }

        private GetAccountBalancesResponse() {
        }

        private void clearRawJson() {
            this.rawJson_ = getDefaultInstance().getRawJson();
        }

        public static GetAccountBalancesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6284a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetAccountBalancesResponse parseDelimitedFrom(InputStream inputStream) {
            return (GetAccountBalancesResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetAccountBalancesResponse parseFrom(ByteBuffer byteBuffer) {
            return (GetAccountBalancesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetAccountBalancesResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setRawJson(String str) {
            str.getClass();
            this.rawJson_ = str;
        }

        private void setRawJsonBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.rawJson_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6292a.f2168a[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetAccountBalancesResponse();
                case 2:
                    return new C6284a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"rawJson_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<GetAccountBalancesResponse> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (GetAccountBalancesResponse.class) {
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

        public String getRawJson() {
            return this.rawJson_;
        }

        public ByteString getRawJsonBytes() {
            return ByteString.copyFromUtf8(this.rawJson_);
        }

        public static C6284a newBuilder(GetAccountBalancesResponse getAccountBalancesResponse) {
            return DEFAULT_INSTANCE.createBuilder(getAccountBalancesResponse);
        }

        public static GetAccountBalancesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountBalancesResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetAccountBalancesResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountBalancesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetAccountBalancesResponse parseFrom(ByteString byteString) {
            return (GetAccountBalancesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetAccountBalancesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountBalancesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetAccountBalancesResponse parseFrom(byte[] bArr) {
            return (GetAccountBalancesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetAccountBalancesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountBalancesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetAccountBalancesResponse parseFrom(InputStream inputStream) {
            return (GetAccountBalancesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetAccountBalancesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountBalancesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetAccountBalancesResponse parseFrom(CodedInputStream codedInputStream) {
            return (GetAccountBalancesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetAccountBalancesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountBalancesResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetAccountsResponse extends GeneratedMessageLite<GetAccountsResponse, C6285a> implements MessageLiteOrBuilder {
        private static final GetAccountsResponse DEFAULT_INSTANCE;
        private static volatile Parser<GetAccountsResponse> PARSER = null;
        public static final int RAW_JSON_FIELD_NUMBER = 1;
        private String rawJson_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.sync.Sync$SyncResponse$GetAccountsResponse$a */
        public static final class C6285a extends GeneratedMessageLite.Builder<GetAccountsResponse, C6285a> implements MessageLiteOrBuilder {
            public C6285a() {
                super(GetAccountsResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            GetAccountsResponse getAccountsResponse = new GetAccountsResponse();
            DEFAULT_INSTANCE = getAccountsResponse;
            GeneratedMessageLite.registerDefaultInstance(GetAccountsResponse.class, getAccountsResponse);
        }

        private GetAccountsResponse() {
        }

        private void clearRawJson() {
            this.rawJson_ = getDefaultInstance().getRawJson();
        }

        public static GetAccountsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6285a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetAccountsResponse parseDelimitedFrom(InputStream inputStream) {
            return (GetAccountsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetAccountsResponse parseFrom(ByteBuffer byteBuffer) {
            return (GetAccountsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetAccountsResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setRawJson(String str) {
            str.getClass();
            this.rawJson_ = str;
        }

        private void setRawJsonBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.rawJson_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6292a.f2168a[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetAccountsResponse();
                case 2:
                    return new C6285a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"rawJson_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<GetAccountsResponse> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (GetAccountsResponse.class) {
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

        public String getRawJson() {
            return this.rawJson_;
        }

        public ByteString getRawJsonBytes() {
            return ByteString.copyFromUtf8(this.rawJson_);
        }

        public static C6285a newBuilder(GetAccountsResponse getAccountsResponse) {
            return DEFAULT_INSTANCE.createBuilder(getAccountsResponse);
        }

        public static GetAccountsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountsResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetAccountsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetAccountsResponse parseFrom(ByteString byteString) {
            return (GetAccountsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static GetAccountsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetAccountsResponse parseFrom(byte[] bArr) {
            return (GetAccountsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetAccountsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetAccountsResponse parseFrom(InputStream inputStream) {
            return (GetAccountsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetAccountsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetAccountsResponse parseFrom(CodedInputStream codedInputStream) {
            return (GetAccountsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetAccountsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetAccountsResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GetTransactionHistoryResponse extends GeneratedMessageLite<GetTransactionHistoryResponse, C6287a> implements MessageLiteOrBuilder {
        private static final GetTransactionHistoryResponse DEFAULT_INSTANCE;
        public static final int NEXT_OFFSET_FIELD_NUMBER = 3;
        private static volatile Parser<GetTransactionHistoryResponse> PARSER = null;
        public static final int RAW_JSON_FIELD_NUMBER = 1;
        public static final int TRANSACTIONS_FIELD_NUMBER = 2;
        private int nextOffset_;
        private String rawJson_ = "";
        private Internal.ProtobufList<TransactionResponse> transactions_ = GeneratedMessageLite.emptyProtobufList();

        public static final class TransactionResponse extends GeneratedMessageLite<TransactionResponse, C6286a> implements InterfaceC6288b {
            private static final TransactionResponse DEFAULT_INSTANCE;
            private static volatile Parser<TransactionResponse> PARSER;

            /* renamed from: com.plaid.internal.core.protos.link.sync.Sync$SyncResponse$GetTransactionHistoryResponse$TransactionResponse$a */
            public static final class C6286a extends GeneratedMessageLite.Builder<TransactionResponse, C6286a> implements InterfaceC6288b {
                public C6286a() {
                    super(TransactionResponse.DEFAULT_INSTANCE);
                }
            }

            static {
                TransactionResponse transactionResponse = new TransactionResponse();
                DEFAULT_INSTANCE = transactionResponse;
                GeneratedMessageLite.registerDefaultInstance(TransactionResponse.class, transactionResponse);
            }

            private TransactionResponse() {
            }

            public static TransactionResponse getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static C6286a newBuilder() {
                return DEFAULT_INSTANCE.createBuilder();
            }

            public static TransactionResponse parseDelimitedFrom(InputStream inputStream) {
                return (TransactionResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TransactionResponse parseFrom(ByteBuffer byteBuffer) {
                return (TransactionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static Parser<TransactionResponse> parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            @Override // com.google.protobuf.GeneratedMessageLite
            public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
                Parser defaultInstanceBasedParser;
                switch (C6292a.f2168a[methodToInvoke.ordinal()]) {
                    case 1:
                        return new TransactionResponse();
                    case 2:
                        return new C6286a();
                    case 3:
                        return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0000", null);
                    case 4:
                        return DEFAULT_INSTANCE;
                    case 5:
                        Parser<TransactionResponse> parser = PARSER;
                        if (parser != null) {
                            return parser;
                        }
                        synchronized (TransactionResponse.class) {
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

            public static C6286a newBuilder(TransactionResponse transactionResponse) {
                return DEFAULT_INSTANCE.createBuilder(transactionResponse);
            }

            public static TransactionResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TransactionResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TransactionResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return (TransactionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
            }

            public static TransactionResponse parseFrom(ByteString byteString) {
                return (TransactionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
            }

            public static TransactionResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return (TransactionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
            }

            public static TransactionResponse parseFrom(byte[] bArr) {
                return (TransactionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static TransactionResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return (TransactionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
            }

            public static TransactionResponse parseFrom(InputStream inputStream) {
                return (TransactionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static TransactionResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TransactionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
            }

            public static TransactionResponse parseFrom(CodedInputStream codedInputStream) {
                return (TransactionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
            }

            public static TransactionResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (TransactionResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.sync.Sync$SyncResponse$GetTransactionHistoryResponse$a */
        public static final class C6287a extends GeneratedMessageLite.Builder<GetTransactionHistoryResponse, C6287a> implements MessageLiteOrBuilder {
            public C6287a() {
                super(GetTransactionHistoryResponse.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.sync.Sync$SyncResponse$GetTransactionHistoryResponse$b */
        public interface InterfaceC6288b extends MessageLiteOrBuilder {
        }

        static {
            GetTransactionHistoryResponse getTransactionHistoryResponse = new GetTransactionHistoryResponse();
            DEFAULT_INSTANCE = getTransactionHistoryResponse;
            GeneratedMessageLite.registerDefaultInstance(GetTransactionHistoryResponse.class, getTransactionHistoryResponse);
        }

        private GetTransactionHistoryResponse() {
        }

        private void addAllTransactions(Iterable<? extends TransactionResponse> iterable) {
            ensureTransactionsIsMutable();
            AbstractMessageLite.addAll((Iterable) iterable, (List) this.transactions_);
        }

        private void addTransactions(TransactionResponse transactionResponse) {
            transactionResponse.getClass();
            ensureTransactionsIsMutable();
            this.transactions_.add(transactionResponse);
        }

        private void clearNextOffset() {
            this.nextOffset_ = 0;
        }

        private void clearRawJson() {
            this.rawJson_ = getDefaultInstance().getRawJson();
        }

        private void clearTransactions() {
            this.transactions_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureTransactionsIsMutable() {
            Internal.ProtobufList<TransactionResponse> protobufList = this.transactions_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.transactions_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static GetTransactionHistoryResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6287a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static GetTransactionHistoryResponse parseDelimitedFrom(InputStream inputStream) {
            return (GetTransactionHistoryResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetTransactionHistoryResponse parseFrom(ByteBuffer byteBuffer) {
            return (GetTransactionHistoryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<GetTransactionHistoryResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeTransactions(int i) {
            ensureTransactionsIsMutable();
            this.transactions_.remove(i);
        }

        private void setNextOffset(int i) {
            this.nextOffset_ = i;
        }

        private void setRawJson(String str) {
            str.getClass();
            this.rawJson_ = str;
        }

        private void setRawJsonBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.rawJson_ = byteString.toStringUtf8();
        }

        private void setTransactions(int i, TransactionResponse transactionResponse) {
            transactionResponse.getClass();
            ensureTransactionsIsMutable();
            this.transactions_.set(i, transactionResponse);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6292a.f2168a[methodToInvoke.ordinal()]) {
                case 1:
                    return new GetTransactionHistoryResponse();
                case 2:
                    return new C6287a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\u0004", new Object[]{"rawJson_", "transactions_", TransactionResponse.class, "nextOffset_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<GetTransactionHistoryResponse> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (GetTransactionHistoryResponse.class) {
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

        public int getNextOffset() {
            return this.nextOffset_;
        }

        public String getRawJson() {
            return this.rawJson_;
        }

        public ByteString getRawJsonBytes() {
            return ByteString.copyFromUtf8(this.rawJson_);
        }

        public TransactionResponse getTransactions(int i) {
            return this.transactions_.get(i);
        }

        public int getTransactionsCount() {
            return this.transactions_.size();
        }

        public List<TransactionResponse> getTransactionsList() {
            return this.transactions_;
        }

        public InterfaceC6288b getTransactionsOrBuilder(int i) {
            return this.transactions_.get(i);
        }

        public List<? extends InterfaceC6288b> getTransactionsOrBuilderList() {
            return this.transactions_;
        }

        public static C6287a newBuilder(GetTransactionHistoryResponse getTransactionHistoryResponse) {
            return DEFAULT_INSTANCE.createBuilder(getTransactionHistoryResponse);
        }

        public static GetTransactionHistoryResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetTransactionHistoryResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetTransactionHistoryResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (GetTransactionHistoryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static GetTransactionHistoryResponse parseFrom(ByteString byteString) {
            return (GetTransactionHistoryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        private void addTransactions(int i, TransactionResponse transactionResponse) {
            transactionResponse.getClass();
            ensureTransactionsIsMutable();
            this.transactions_.add(i, transactionResponse);
        }

        public static GetTransactionHistoryResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (GetTransactionHistoryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static GetTransactionHistoryResponse parseFrom(byte[] bArr) {
            return (GetTransactionHistoryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static GetTransactionHistoryResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (GetTransactionHistoryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static GetTransactionHistoryResponse parseFrom(InputStream inputStream) {
            return (GetTransactionHistoryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static GetTransactionHistoryResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetTransactionHistoryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static GetTransactionHistoryResponse parseFrom(CodedInputStream codedInputStream) {
            return (GetTransactionHistoryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static GetTransactionHistoryResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetTransactionHistoryResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ValidateSyncConnectedResponse extends GeneratedMessageLite<ValidateSyncConnectedResponse, C6289a> implements MessageLiteOrBuilder {
        public static final int CONNECTED_FIELD_NUMBER = 1;
        private static final ValidateSyncConnectedResponse DEFAULT_INSTANCE;
        private static volatile Parser<ValidateSyncConnectedResponse> PARSER;
        private boolean connected_;

        /* renamed from: com.plaid.internal.core.protos.link.sync.Sync$SyncResponse$ValidateSyncConnectedResponse$a */
        public static final class C6289a extends GeneratedMessageLite.Builder<ValidateSyncConnectedResponse, C6289a> implements MessageLiteOrBuilder {
            public C6289a() {
                super(ValidateSyncConnectedResponse.DEFAULT_INSTANCE);
            }
        }

        static {
            ValidateSyncConnectedResponse validateSyncConnectedResponse = new ValidateSyncConnectedResponse();
            DEFAULT_INSTANCE = validateSyncConnectedResponse;
            GeneratedMessageLite.registerDefaultInstance(ValidateSyncConnectedResponse.class, validateSyncConnectedResponse);
        }

        private ValidateSyncConnectedResponse() {
        }

        private void clearConnected() {
            this.connected_ = false;
        }

        public static ValidateSyncConnectedResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6289a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ValidateSyncConnectedResponse parseDelimitedFrom(InputStream inputStream) {
            return (ValidateSyncConnectedResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ValidateSyncConnectedResponse parseFrom(ByteBuffer byteBuffer) {
            return (ValidateSyncConnectedResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ValidateSyncConnectedResponse> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setConnected(boolean z) {
            this.connected_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6292a.f2168a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ValidateSyncConnectedResponse();
                case 2:
                    return new C6289a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"connected_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ValidateSyncConnectedResponse> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (ValidateSyncConnectedResponse.class) {
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

        public boolean getConnected() {
            return this.connected_;
        }

        public static C6289a newBuilder(ValidateSyncConnectedResponse validateSyncConnectedResponse) {
            return DEFAULT_INSTANCE.createBuilder(validateSyncConnectedResponse);
        }

        public static ValidateSyncConnectedResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ValidateSyncConnectedResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ValidateSyncConnectedResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (ValidateSyncConnectedResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ValidateSyncConnectedResponse parseFrom(ByteString byteString) {
            return (ValidateSyncConnectedResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ValidateSyncConnectedResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (ValidateSyncConnectedResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ValidateSyncConnectedResponse parseFrom(byte[] bArr) {
            return (ValidateSyncConnectedResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ValidateSyncConnectedResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (ValidateSyncConnectedResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ValidateSyncConnectedResponse parseFrom(InputStream inputStream) {
            return (ValidateSyncConnectedResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ValidateSyncConnectedResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ValidateSyncConnectedResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ValidateSyncConnectedResponse parseFrom(CodedInputStream codedInputStream) {
            return (ValidateSyncConnectedResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ValidateSyncConnectedResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ValidateSyncConnectedResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.sync.Sync$SyncResponse$a */
    public static final class C6290a extends GeneratedMessageLite.Builder<Sync$SyncResponse, C6290a> implements MessageLiteOrBuilder {
        public C6290a() {
            super(Sync$SyncResponse.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.sync.Sync$SyncResponse$b */
    public enum EnumC6291b {
        GET_ACCOUNTS(2),
        GET_ACCOUNT_BALANCES(3),
        GET_TRANSACTION_HISTORY(4),
        VALIDATE_SYNC_CONNECTED(5),
        ERROR_RESPONSE(6),
        RESPONSETYPE_NOT_SET(0);


        /* renamed from: a */
        public final int f2167a;

        EnumC6291b(int i) {
            this.f2167a = i;
        }

        public static EnumC6291b forNumber(int i) {
            if (i == 0) {
                return RESPONSETYPE_NOT_SET;
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
            return ERROR_RESPONSE;
        }

        public int getNumber() {
            return this.f2167a;
        }

        @Deprecated
        public static EnumC6291b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Sync$SyncResponse sync$SyncResponse = new Sync$SyncResponse();
        DEFAULT_INSTANCE = sync$SyncResponse;
        GeneratedMessageLite.registerDefaultInstance(Sync$SyncResponse.class, sync$SyncResponse);
    }

    private Sync$SyncResponse() {
    }

    private void clearErrorResponse() {
        if (this.responseTypeCase_ == 6) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    private void clearGetAccountBalances() {
        if (this.responseTypeCase_ == 3) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    private void clearGetAccounts() {
        if (this.responseTypeCase_ == 2) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    private void clearGetTransactionHistory() {
        if (this.responseTypeCase_ == 4) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    private void clearRequestId() {
        this.requestId_ = getDefaultInstance().getRequestId();
    }

    private void clearResponseType() {
        this.responseTypeCase_ = 0;
        this.responseType_ = null;
    }

    private void clearValidateSyncConnected() {
        if (this.responseTypeCase_ == 5) {
            this.responseTypeCase_ = 0;
            this.responseType_ = null;
        }
    }

    public static Sync$SyncResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeErrorResponse(ErrorResponse errorResponse) {
        errorResponse.getClass();
        if (this.responseTypeCase_ != 6 || this.responseType_ == ErrorResponse.getDefaultInstance()) {
            this.responseType_ = errorResponse;
        } else {
            this.responseType_ = ErrorResponse.newBuilder((ErrorResponse) this.responseType_).mergeFrom((ErrorResponse.C6283a) errorResponse).buildPartial();
        }
        this.responseTypeCase_ = 6;
    }

    private void mergeGetAccountBalances(GetAccountBalancesResponse getAccountBalancesResponse) {
        getAccountBalancesResponse.getClass();
        if (this.responseTypeCase_ != 3 || this.responseType_ == GetAccountBalancesResponse.getDefaultInstance()) {
            this.responseType_ = getAccountBalancesResponse;
        } else {
            this.responseType_ = GetAccountBalancesResponse.newBuilder((GetAccountBalancesResponse) this.responseType_).mergeFrom((GetAccountBalancesResponse.C6284a) getAccountBalancesResponse).buildPartial();
        }
        this.responseTypeCase_ = 3;
    }

    private void mergeGetAccounts(GetAccountsResponse getAccountsResponse) {
        getAccountsResponse.getClass();
        if (this.responseTypeCase_ != 2 || this.responseType_ == GetAccountsResponse.getDefaultInstance()) {
            this.responseType_ = getAccountsResponse;
        } else {
            this.responseType_ = GetAccountsResponse.newBuilder((GetAccountsResponse) this.responseType_).mergeFrom((GetAccountsResponse.C6285a) getAccountsResponse).buildPartial();
        }
        this.responseTypeCase_ = 2;
    }

    private void mergeGetTransactionHistory(GetTransactionHistoryResponse getTransactionHistoryResponse) {
        getTransactionHistoryResponse.getClass();
        if (this.responseTypeCase_ != 4 || this.responseType_ == GetTransactionHistoryResponse.getDefaultInstance()) {
            this.responseType_ = getTransactionHistoryResponse;
        } else {
            this.responseType_ = GetTransactionHistoryResponse.newBuilder((GetTransactionHistoryResponse) this.responseType_).mergeFrom((GetTransactionHistoryResponse.C6287a) getTransactionHistoryResponse).buildPartial();
        }
        this.responseTypeCase_ = 4;
    }

    private void mergeValidateSyncConnected(ValidateSyncConnectedResponse validateSyncConnectedResponse) {
        validateSyncConnectedResponse.getClass();
        if (this.responseTypeCase_ != 5 || this.responseType_ == ValidateSyncConnectedResponse.getDefaultInstance()) {
            this.responseType_ = validateSyncConnectedResponse;
        } else {
            this.responseType_ = ValidateSyncConnectedResponse.newBuilder((ValidateSyncConnectedResponse) this.responseType_).mergeFrom((ValidateSyncConnectedResponse.C6289a) validateSyncConnectedResponse).buildPartial();
        }
        this.responseTypeCase_ = 5;
    }

    public static C6290a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Sync$SyncResponse parseDelimitedFrom(InputStream inputStream) {
        return (Sync$SyncResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sync$SyncResponse parseFrom(ByteBuffer byteBuffer) {
        return (Sync$SyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Sync$SyncResponse> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setErrorResponse(ErrorResponse errorResponse) {
        errorResponse.getClass();
        this.responseType_ = errorResponse;
        this.responseTypeCase_ = 6;
    }

    private void setGetAccountBalances(GetAccountBalancesResponse getAccountBalancesResponse) {
        getAccountBalancesResponse.getClass();
        this.responseType_ = getAccountBalancesResponse;
        this.responseTypeCase_ = 3;
    }

    private void setGetAccounts(GetAccountsResponse getAccountsResponse) {
        getAccountsResponse.getClass();
        this.responseType_ = getAccountsResponse;
        this.responseTypeCase_ = 2;
    }

    private void setGetTransactionHistory(GetTransactionHistoryResponse getTransactionHistoryResponse) {
        getTransactionHistoryResponse.getClass();
        this.responseType_ = getTransactionHistoryResponse;
        this.responseTypeCase_ = 4;
    }

    private void setRequestId(String str) {
        str.getClass();
        this.requestId_ = str;
    }

    private void setRequestIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.requestId_ = byteString.toStringUtf8();
    }

    private void setValidateSyncConnected(ValidateSyncConnectedResponse validateSyncConnectedResponse) {
        validateSyncConnectedResponse.getClass();
        this.responseType_ = validateSyncConnectedResponse;
        this.responseTypeCase_ = 5;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6292a.f2168a[methodToInvoke.ordinal()]) {
            case 1:
                return new Sync$SyncResponse();
            case 2:
                return new C6290a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"responseType_", "responseTypeCase_", "requestId_", GetAccountsResponse.class, GetAccountBalancesResponse.class, GetTransactionHistoryResponse.class, ValidateSyncConnectedResponse.class, ErrorResponse.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Sync$SyncResponse> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Sync$SyncResponse.class) {
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

    public ErrorResponse getErrorResponse() {
        return this.responseTypeCase_ == 6 ? (ErrorResponse) this.responseType_ : ErrorResponse.getDefaultInstance();
    }

    public GetAccountBalancesResponse getGetAccountBalances() {
        return this.responseTypeCase_ == 3 ? (GetAccountBalancesResponse) this.responseType_ : GetAccountBalancesResponse.getDefaultInstance();
    }

    public GetAccountsResponse getGetAccounts() {
        return this.responseTypeCase_ == 2 ? (GetAccountsResponse) this.responseType_ : GetAccountsResponse.getDefaultInstance();
    }

    public GetTransactionHistoryResponse getGetTransactionHistory() {
        return this.responseTypeCase_ == 4 ? (GetTransactionHistoryResponse) this.responseType_ : GetTransactionHistoryResponse.getDefaultInstance();
    }

    public String getRequestId() {
        return this.requestId_;
    }

    public ByteString getRequestIdBytes() {
        return ByteString.copyFromUtf8(this.requestId_);
    }

    public EnumC6291b getResponseTypeCase() {
        return EnumC6291b.forNumber(this.responseTypeCase_);
    }

    public ValidateSyncConnectedResponse getValidateSyncConnected() {
        return this.responseTypeCase_ == 5 ? (ValidateSyncConnectedResponse) this.responseType_ : ValidateSyncConnectedResponse.getDefaultInstance();
    }

    public boolean hasErrorResponse() {
        return this.responseTypeCase_ == 6;
    }

    public boolean hasGetAccountBalances() {
        return this.responseTypeCase_ == 3;
    }

    public boolean hasGetAccounts() {
        return this.responseTypeCase_ == 2;
    }

    public boolean hasGetTransactionHistory() {
        return this.responseTypeCase_ == 4;
    }

    public boolean hasValidateSyncConnected() {
        return this.responseTypeCase_ == 5;
    }

    public static C6290a newBuilder(Sync$SyncResponse sync$SyncResponse) {
        return DEFAULT_INSTANCE.createBuilder(sync$SyncResponse);
    }

    public static Sync$SyncResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Sync$SyncResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Sync$SyncResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Sync$SyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Sync$SyncResponse parseFrom(ByteString byteString) {
        return (Sync$SyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Sync$SyncResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Sync$SyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Sync$SyncResponse parseFrom(byte[] bArr) {
        return (Sync$SyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Sync$SyncResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Sync$SyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Sync$SyncResponse parseFrom(InputStream inputStream) {
        return (Sync$SyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Sync$SyncResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Sync$SyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Sync$SyncResponse parseFrom(CodedInputStream codedInputStream) {
        return (Sync$SyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Sync$SyncResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Sync$SyncResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
