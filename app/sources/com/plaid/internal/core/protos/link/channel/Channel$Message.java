package com.plaid.internal.core.protos.link.channel;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.Timestamp;
import com.plaid.internal.core.protos.link.sync.Sync$SyncRequest;
import com.plaid.internal.core.protos.link.sync.Sync$SyncResponse;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKEvent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SDKInternalEvent;
import com.plaid.internal.core.protos.link.workflow.primitives.SdkResult$SDKResult;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes24.dex */
public final class Channel$Message extends GeneratedMessageLite<Channel$Message, C6266a> implements InterfaceC6269b {
    private static final Channel$Message DEFAULT_INSTANCE;
    public static final int EVENT_FIELD_NUMBER = 2;
    public static final int INTERNAL_EVENT_FIELD_NUMBER = 5;
    public static final int MESSAGE_ID_FIELD_NUMBER = 1;
    public static final int OOPWV_OPEN_MESSAGE_FIELD_NUMBER = 9;
    private static volatile Parser<Channel$Message> PARSER = null;
    public static final int PRE_COMPLETION_RESULT_FIELD_NUMBER = 6;
    public static final int RESULT_FIELD_NUMBER = 3;
    public static final int SYNC_REQUEST_FIELD_NUMBER = 7;
    public static final int SYNC_RESPONSE_FIELD_NUMBER = 8;
    public static final int TIMESTAMP_FIELD_NUMBER = 4;
    private int bitField0_;
    private Object payload_;
    private Timestamp timestamp_;
    private int payloadCase_ = 0;
    private String messageId_ = "";

    public static final class OopwvOpenMessage extends GeneratedMessageLite<OopwvOpenMessage, C6261a> implements MessageLiteOrBuilder {
        private static final OopwvOpenMessage DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 1;
        private static volatile Parser<OopwvOpenMessage> PARSER;
        private int event_;

        /* renamed from: com.plaid.internal.core.protos.link.channel.Channel$Message$OopwvOpenMessage$a */
        public static final class C6261a extends GeneratedMessageLite.Builder<OopwvOpenMessage, C6261a> implements MessageLiteOrBuilder {
            public C6261a() {
                super(OopwvOpenMessage.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.channel.Channel$Message$OopwvOpenMessage$b */
        public enum EnumC6262b implements Internal.EnumLite {
            OOPWV_EVENT_UNKNOWN(0),
            OOPWV_EVENT_FINISH(1),
            OOPWV_EVENT_CANCELLED(2),
            OOPWV_EVENT_IOS_DECLINED_DURING_OPEN_SESSION(3),
            UNRECOGNIZED(-1);

            public static final int OOPWV_EVENT_CANCELLED_VALUE = 2;
            public static final int OOPWV_EVENT_FINISH_VALUE = 1;
            public static final int OOPWV_EVENT_IOS_DECLINED_DURING_OPEN_SESSION_VALUE = 3;
            public static final int OOPWV_EVENT_UNKNOWN_VALUE = 0;

            /* renamed from: b */
            public static final a f2148b = new a();

            /* renamed from: a */
            public final int f2150a;

            /* renamed from: com.plaid.internal.core.protos.link.channel.Channel$Message$OopwvOpenMessage$b$a */
            public class a implements Internal.EnumLiteMap<EnumC6262b> {
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public final Internal.EnumLite findValueByNumber(int i) {
                    return EnumC6262b.forNumber(i);
                }
            }

            /* renamed from: com.plaid.internal.core.protos.link.channel.Channel$Message$OopwvOpenMessage$b$b */
            public static final class b implements Internal.EnumVerifier {

                /* renamed from: a */
                public static final b f2151a = new b();

                @Override // com.google.protobuf.Internal.EnumVerifier
                public final boolean isInRange(int i) {
                    return EnumC6262b.forNumber(i) != null;
                }
            }

            EnumC6262b(int i) {
                this.f2150a = i;
            }

            public static EnumC6262b forNumber(int i) {
                if (i == 0) {
                    return OOPWV_EVENT_UNKNOWN;
                }
                if (i == 1) {
                    return OOPWV_EVENT_FINISH;
                }
                if (i == 2) {
                    return OOPWV_EVENT_CANCELLED;
                }
                if (i != 3) {
                    return null;
                }
                return OOPWV_EVENT_IOS_DECLINED_DURING_OPEN_SESSION;
            }

            public static Internal.EnumLiteMap<EnumC6262b> internalGetValueMap() {
                return f2148b;
            }

            public static Internal.EnumVerifier internalGetVerifier() {
                return b.f2151a;
            }

            @Override // com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.f2150a;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            @Deprecated
            public static EnumC6262b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            OopwvOpenMessage oopwvOpenMessage = new OopwvOpenMessage();
            DEFAULT_INSTANCE = oopwvOpenMessage;
            GeneratedMessageLite.registerDefaultInstance(OopwvOpenMessage.class, oopwvOpenMessage);
        }

        private OopwvOpenMessage() {
        }

        private void clearEvent() {
            this.event_ = 0;
        }

        public static OopwvOpenMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static C6261a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OopwvOpenMessage parseDelimitedFrom(InputStream inputStream) {
            return (OopwvOpenMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OopwvOpenMessage parseFrom(ByteBuffer byteBuffer) {
            return (OopwvOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<OopwvOpenMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setEvent(EnumC6262b enumC6262b) {
            this.event_ = enumC6262b.getNumber();
        }

        private void setEventValue(int i) {
            this.event_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6268a.f2156a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OopwvOpenMessage();
                case 2:
                    return new C6261a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"event_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OopwvOpenMessage> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (OopwvOpenMessage.class) {
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

        public EnumC6262b getEvent() {
            EnumC6262b enumC6262bForNumber = EnumC6262b.forNumber(this.event_);
            return enumC6262bForNumber == null ? EnumC6262b.UNRECOGNIZED : enumC6262bForNumber;
        }

        public int getEventValue() {
            return this.event_;
        }

        public static C6261a newBuilder(OopwvOpenMessage oopwvOpenMessage) {
            return DEFAULT_INSTANCE.createBuilder(oopwvOpenMessage);
        }

        public static OopwvOpenMessage parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OopwvOpenMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OopwvOpenMessage parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (OopwvOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OopwvOpenMessage parseFrom(ByteString byteString) {
            return (OopwvOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static OopwvOpenMessage parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (OopwvOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OopwvOpenMessage parseFrom(byte[] bArr) {
            return (OopwvOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OopwvOpenMessage parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (OopwvOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static OopwvOpenMessage parseFrom(InputStream inputStream) {
            return (OopwvOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OopwvOpenMessage parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OopwvOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OopwvOpenMessage parseFrom(CodedInputStream codedInputStream) {
            return (OopwvOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OopwvOpenMessage parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OopwvOpenMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SDKEvent extends GeneratedMessageLite<SDKEvent, C6263a> implements MessageLiteOrBuilder {
        private static final SDKEvent DEFAULT_INSTANCE;
        public static final int DELAY_MS_FIELD_NUMBER = 4;
        public static final int EVENT_NAME_FIELD_NUMBER = 1;
        public static final int METADATA_FIELD_NUMBER = 2;
        public static final int METADATA_JSON_FIELD_NUMBER = 3;
        private static volatile Parser<SDKEvent> PARSER = null;
        public static final int QUEUE_BEHAVIOR_FIELD_NUMBER = 5;
        private int bitField0_;
        private Common$SDKEvent.Metadata metadata_;
        private Object triggerBehavior_;
        private int triggerBehaviorCase_ = 0;
        private String eventName_ = "";
        private String metadataJson_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.channel.Channel$Message$SDKEvent$a */
        public static final class C6263a extends GeneratedMessageLite.Builder<SDKEvent, C6263a> implements MessageLiteOrBuilder {
            public C6263a() {
                super(SDKEvent.DEFAULT_INSTANCE);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.channel.Channel$Message$SDKEvent$b */
        public enum EnumC6264b {
            DELAY_MS(4),
            QUEUE_BEHAVIOR(5),
            TRIGGERBEHAVIOR_NOT_SET(0);


            /* renamed from: a */
            public final int f2153a;

            EnumC6264b(int i) {
                this.f2153a = i;
            }

            public static EnumC6264b forNumber(int i) {
                if (i == 0) {
                    return TRIGGERBEHAVIOR_NOT_SET;
                }
                if (i == 4) {
                    return DELAY_MS;
                }
                if (i != 5) {
                    return null;
                }
                return QUEUE_BEHAVIOR;
            }

            public int getNumber() {
                return this.f2153a;
            }

            @Deprecated
            public static EnumC6264b valueOf(int i) {
                return forNumber(i);
            }
        }

        static {
            SDKEvent sDKEvent = new SDKEvent();
            DEFAULT_INSTANCE = sDKEvent;
            GeneratedMessageLite.registerDefaultInstance(SDKEvent.class, sDKEvent);
        }

        private SDKEvent() {
        }

        private void clearDelayMs() {
            if (this.triggerBehaviorCase_ == 4) {
                this.triggerBehaviorCase_ = 0;
                this.triggerBehavior_ = null;
            }
        }

        private void clearEventName() {
            this.eventName_ = getDefaultInstance().getEventName();
        }

        private void clearMetadata() {
            this.metadata_ = null;
            this.bitField0_ &= -2;
        }

        private void clearMetadataJson() {
            this.metadataJson_ = getDefaultInstance().getMetadataJson();
        }

        private void clearQueueBehavior() {
            if (this.triggerBehaviorCase_ == 5) {
                this.triggerBehaviorCase_ = 0;
                this.triggerBehavior_ = null;
            }
        }

        private void clearTriggerBehavior() {
            this.triggerBehaviorCase_ = 0;
            this.triggerBehavior_ = null;
        }

        public static SDKEvent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeMetadata(Common$SDKEvent.Metadata metadata) {
            metadata.getClass();
            Common$SDKEvent.Metadata metadata2 = this.metadata_;
            if (metadata2 == null || metadata2 == Common$SDKEvent.Metadata.getDefaultInstance()) {
                this.metadata_ = metadata;
            } else {
                this.metadata_ = Common$SDKEvent.Metadata.newBuilder(this.metadata_).mergeFrom((Common$SDKEvent.Metadata.C6478a) metadata).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static C6263a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SDKEvent parseDelimitedFrom(InputStream inputStream) {
            return (SDKEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SDKEvent parseFrom(ByteBuffer byteBuffer) {
            return (SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SDKEvent> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDelayMs(int i) {
            this.triggerBehaviorCase_ = 4;
            this.triggerBehavior_ = Integer.valueOf(i);
        }

        private void setEventName(String str) {
            str.getClass();
            this.eventName_ = str;
        }

        private void setEventNameBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.eventName_ = byteString.toStringUtf8();
        }

        private void setMetadata(Common$SDKEvent.Metadata metadata) {
            metadata.getClass();
            this.metadata_ = metadata;
            this.bitField0_ |= 1;
        }

        private void setMetadataJson(String str) {
            str.getClass();
            this.metadataJson_ = str;
        }

        private void setMetadataJsonBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.metadataJson_ = byteString.toStringUtf8();
        }

        private void setQueueBehavior(Common$SDKEvent.EnumC6480b enumC6480b) {
            this.triggerBehavior_ = Integer.valueOf(enumC6480b.getNumber());
            this.triggerBehaviorCase_ = 5;
        }

        private void setQueueBehaviorValue(int i) {
            this.triggerBehaviorCase_ = 5;
            this.triggerBehavior_ = Integer.valueOf(i);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6268a.f2156a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SDKEvent();
                case 2:
                    return new C6263a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ\u00047\u0000\u0005?\u0000", new Object[]{"triggerBehavior_", "triggerBehaviorCase_", "bitField0_", "eventName_", "metadata_", "metadataJson_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SDKEvent> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SDKEvent.class) {
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

        public int getDelayMs() {
            if (this.triggerBehaviorCase_ == 4) {
                return ((Integer) this.triggerBehavior_).intValue();
            }
            return 0;
        }

        public String getEventName() {
            return this.eventName_;
        }

        public ByteString getEventNameBytes() {
            return ByteString.copyFromUtf8(this.eventName_);
        }

        public Common$SDKEvent.Metadata getMetadata() {
            Common$SDKEvent.Metadata metadata = this.metadata_;
            return metadata == null ? Common$SDKEvent.Metadata.getDefaultInstance() : metadata;
        }

        public String getMetadataJson() {
            return this.metadataJson_;
        }

        public ByteString getMetadataJsonBytes() {
            return ByteString.copyFromUtf8(this.metadataJson_);
        }

        public Common$SDKEvent.EnumC6480b getQueueBehavior() {
            if (this.triggerBehaviorCase_ != 5) {
                return Common$SDKEvent.EnumC6480b.QUEUE_BEHAVIOR_UNKNOWN;
            }
            Common$SDKEvent.EnumC6480b enumC6480bForNumber = Common$SDKEvent.EnumC6480b.forNumber(((Integer) this.triggerBehavior_).intValue());
            return enumC6480bForNumber == null ? Common$SDKEvent.EnumC6480b.UNRECOGNIZED : enumC6480bForNumber;
        }

        public int getQueueBehaviorValue() {
            if (this.triggerBehaviorCase_ == 5) {
                return ((Integer) this.triggerBehavior_).intValue();
            }
            return 0;
        }

        public EnumC6264b getTriggerBehaviorCase() {
            return EnumC6264b.forNumber(this.triggerBehaviorCase_);
        }

        public boolean hasDelayMs() {
            return this.triggerBehaviorCase_ == 4;
        }

        public boolean hasMetadata() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasQueueBehavior() {
            return this.triggerBehaviorCase_ == 5;
        }

        public static C6263a newBuilder(SDKEvent sDKEvent) {
            return DEFAULT_INSTANCE.createBuilder(sDKEvent);
        }

        public static SDKEvent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDKEvent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SDKEvent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SDKEvent parseFrom(ByteString byteString) {
            return (SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SDKEvent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SDKEvent parseFrom(byte[] bArr) {
            return (SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SDKEvent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SDKEvent parseFrom(InputStream inputStream) {
            return (SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SDKEvent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SDKEvent parseFrom(CodedInputStream codedInputStream) {
            return (SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SDKEvent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDKEvent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SDKResult extends GeneratedMessageLite<SDKResult, C6265a> implements MessageLiteOrBuilder {
        public static final int CALLBACK_FIELD_NUMBER = 1;
        private static final SDKResult DEFAULT_INSTANCE;
        public static final int ERROR_FIELD_NUMBER = 3;
        public static final int ERROR_JSON_FIELD_NUMBER = 6;
        public static final int METADATA_FIELD_NUMBER = 4;
        public static final int METADATA_JSON_FIELD_NUMBER = 5;
        private static volatile Parser<SDKResult> PARSER = null;
        public static final int PUBLIC_TOKEN_FIELD_NUMBER = 2;
        private int bitField0_;
        private int callback_;
        private SdkResult$SDKResult.Error error_;
        private SdkResult$SDKResult.Metadata metadata_;
        private String publicToken_ = "";
        private String metadataJson_ = "";
        private String errorJson_ = "";

        /* renamed from: com.plaid.internal.core.protos.link.channel.Channel$Message$SDKResult$a */
        public static final class C6265a extends GeneratedMessageLite.Builder<SDKResult, C6265a> implements MessageLiteOrBuilder {
            public C6265a() {
                super(SDKResult.DEFAULT_INSTANCE);
            }
        }

        static {
            SDKResult sDKResult = new SDKResult();
            DEFAULT_INSTANCE = sDKResult;
            GeneratedMessageLite.registerDefaultInstance(SDKResult.class, sDKResult);
        }

        private SDKResult() {
        }

        private void clearCallback() {
            this.callback_ = 0;
        }

        private void clearError() {
            this.error_ = null;
            this.bitField0_ &= -2;
        }

        private void clearErrorJson() {
            this.errorJson_ = getDefaultInstance().getErrorJson();
        }

        private void clearMetadata() {
            this.metadata_ = null;
            this.bitField0_ &= -3;
        }

        private void clearMetadataJson() {
            this.metadataJson_ = getDefaultInstance().getMetadataJson();
        }

        private void clearPublicToken() {
            this.publicToken_ = getDefaultInstance().getPublicToken();
        }

        public static SDKResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeError(SdkResult$SDKResult.Error error) {
            error.getClass();
            SdkResult$SDKResult.Error error2 = this.error_;
            if (error2 == null || error2 == SdkResult$SDKResult.Error.getDefaultInstance()) {
                this.error_ = error;
            } else {
                this.error_ = SdkResult$SDKResult.Error.newBuilder(this.error_).mergeFrom((SdkResult$SDKResult.Error.C7010a) error).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        private void mergeMetadata(SdkResult$SDKResult.Metadata metadata) {
            metadata.getClass();
            SdkResult$SDKResult.Metadata metadata2 = this.metadata_;
            if (metadata2 == null || metadata2 == SdkResult$SDKResult.Metadata.getDefaultInstance()) {
                this.metadata_ = metadata;
            } else {
                this.metadata_ = SdkResult$SDKResult.Metadata.newBuilder(this.metadata_).mergeFrom((SdkResult$SDKResult.Metadata.C7015b) metadata).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static C6265a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SDKResult parseDelimitedFrom(InputStream inputStream) {
            return (SDKResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SDKResult parseFrom(ByteBuffer byteBuffer) {
            return (SDKResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<SDKResult> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCallback(SdkResult$SDKResult.EnumC7017b enumC7017b) {
            this.callback_ = enumC7017b.getNumber();
        }

        private void setCallbackValue(int i) {
            this.callback_ = i;
        }

        private void setError(SdkResult$SDKResult.Error error) {
            error.getClass();
            this.error_ = error;
            this.bitField0_ |= 1;
        }

        private void setErrorJson(String str) {
            str.getClass();
            this.errorJson_ = str;
        }

        private void setErrorJsonBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.errorJson_ = byteString.toStringUtf8();
        }

        private void setMetadata(SdkResult$SDKResult.Metadata metadata) {
            metadata.getClass();
            this.metadata_ = metadata;
            this.bitField0_ |= 2;
        }

        private void setMetadataJson(String str) {
            str.getClass();
            this.metadataJson_ = str;
        }

        private void setMetadataJsonBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.metadataJson_ = byteString.toStringUtf8();
        }

        private void setPublicToken(String str) {
            str.getClass();
            this.publicToken_ = str;
        }

        private void setPublicTokenBytes(ByteString byteString) throws IllegalArgumentException {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.publicToken_ = byteString.toStringUtf8();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser defaultInstanceBasedParser;
            switch (C6268a.f2156a[methodToInvoke.ordinal()]) {
                case 1:
                    return new SDKResult();
                case 2:
                    return new C6265a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ȉ\u0006Ȉ", new Object[]{"bitField0_", "callback_", "publicToken_", "error_", "metadata_", "metadataJson_", "errorJson_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SDKResult> parser = PARSER;
                    if (parser != null) {
                        return parser;
                    }
                    synchronized (SDKResult.class) {
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

        public SdkResult$SDKResult.EnumC7017b getCallback() {
            SdkResult$SDKResult.EnumC7017b enumC7017bForNumber = SdkResult$SDKResult.EnumC7017b.forNumber(this.callback_);
            return enumC7017bForNumber == null ? SdkResult$SDKResult.EnumC7017b.UNRECOGNIZED : enumC7017bForNumber;
        }

        public int getCallbackValue() {
            return this.callback_;
        }

        public SdkResult$SDKResult.Error getError() {
            SdkResult$SDKResult.Error error = this.error_;
            return error == null ? SdkResult$SDKResult.Error.getDefaultInstance() : error;
        }

        public String getErrorJson() {
            return this.errorJson_;
        }

        public ByteString getErrorJsonBytes() {
            return ByteString.copyFromUtf8(this.errorJson_);
        }

        public SdkResult$SDKResult.Metadata getMetadata() {
            SdkResult$SDKResult.Metadata metadata = this.metadata_;
            return metadata == null ? SdkResult$SDKResult.Metadata.getDefaultInstance() : metadata;
        }

        public String getMetadataJson() {
            return this.metadataJson_;
        }

        public ByteString getMetadataJsonBytes() {
            return ByteString.copyFromUtf8(this.metadataJson_);
        }

        public String getPublicToken() {
            return this.publicToken_;
        }

        public ByteString getPublicTokenBytes() {
            return ByteString.copyFromUtf8(this.publicToken_);
        }

        public boolean hasError() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasMetadata() {
            return (this.bitField0_ & 2) != 0;
        }

        public static C6265a newBuilder(SDKResult sDKResult) {
            return DEFAULT_INSTANCE.createBuilder(sDKResult);
        }

        public static SDKResult parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDKResult) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SDKResult parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (SDKResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static SDKResult parseFrom(ByteString byteString) {
            return (SDKResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static SDKResult parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (SDKResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static SDKResult parseFrom(byte[] bArr) {
            return (SDKResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static SDKResult parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (SDKResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static SDKResult parseFrom(InputStream inputStream) {
            return (SDKResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static SDKResult parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDKResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static SDKResult parseFrom(CodedInputStream codedInputStream) {
            return (SDKResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static SDKResult parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SDKResult) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.channel.Channel$Message$a */
    public static final class C6266a extends GeneratedMessageLite.Builder<Channel$Message, C6266a> implements InterfaceC6269b {
        public C6266a() {
            super(Channel$Message.DEFAULT_INSTANCE);
        }
    }

    /* renamed from: com.plaid.internal.core.protos.link.channel.Channel$Message$b */
    public enum EnumC6267b {
        EVENT(2),
        RESULT(3),
        PRE_COMPLETION_RESULT(6),
        INTERNAL_EVENT(5),
        SYNC_REQUEST(7),
        SYNC_RESPONSE(8),
        OOPWV_OPEN_MESSAGE(9),
        PAYLOAD_NOT_SET(0);


        /* renamed from: a */
        public final int f2155a;

        EnumC6267b(int i) {
            this.f2155a = i;
        }

        public static EnumC6267b forNumber(int i) {
            if (i == 0) {
                return PAYLOAD_NOT_SET;
            }
            if (i == 2) {
                return EVENT;
            }
            if (i == 3) {
                return RESULT;
            }
            switch (i) {
                case 5:
                    return INTERNAL_EVENT;
                case 6:
                    return PRE_COMPLETION_RESULT;
                case 7:
                    return SYNC_REQUEST;
                case 8:
                    return SYNC_RESPONSE;
                case 9:
                    return OOPWV_OPEN_MESSAGE;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.f2155a;
        }

        @Deprecated
        public static EnumC6267b valueOf(int i) {
            return forNumber(i);
        }
    }

    static {
        Channel$Message channel$Message = new Channel$Message();
        DEFAULT_INSTANCE = channel$Message;
        GeneratedMessageLite.registerDefaultInstance(Channel$Message.class, channel$Message);
    }

    private Channel$Message() {
    }

    private void clearEvent() {
        if (this.payloadCase_ == 2) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    private void clearInternalEvent() {
        if (this.payloadCase_ == 5) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    private void clearMessageId() {
        this.messageId_ = getDefaultInstance().getMessageId();
    }

    private void clearOopwvOpenMessage() {
        if (this.payloadCase_ == 9) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    private void clearPayload() {
        this.payloadCase_ = 0;
        this.payload_ = null;
    }

    private void clearPreCompletionResult() {
        if (this.payloadCase_ == 6) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    private void clearResult() {
        if (this.payloadCase_ == 3) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    private void clearSyncRequest() {
        if (this.payloadCase_ == 7) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    private void clearSyncResponse() {
        if (this.payloadCase_ == 8) {
            this.payloadCase_ = 0;
            this.payload_ = null;
        }
    }

    private void clearTimestamp() {
        this.timestamp_ = null;
        this.bitField0_ &= -2;
    }

    public static Channel$Message getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeEvent(SDKEvent sDKEvent) {
        sDKEvent.getClass();
        if (this.payloadCase_ != 2 || this.payload_ == SDKEvent.getDefaultInstance()) {
            this.payload_ = sDKEvent;
        } else {
            this.payload_ = SDKEvent.newBuilder((SDKEvent) this.payload_).mergeFrom((SDKEvent.C6263a) sDKEvent).buildPartial();
        }
        this.payloadCase_ = 2;
    }

    private void mergeInternalEvent(Common$SDKInternalEvent common$SDKInternalEvent) {
        common$SDKInternalEvent.getClass();
        if (this.payloadCase_ != 5 || this.payload_ == Common$SDKInternalEvent.getDefaultInstance()) {
            this.payload_ = common$SDKInternalEvent;
        } else {
            this.payload_ = Common$SDKInternalEvent.newBuilder((Common$SDKInternalEvent) this.payload_).mergeFrom((Common$SDKInternalEvent.C6490a) common$SDKInternalEvent).buildPartial();
        }
        this.payloadCase_ = 5;
    }

    private void mergeOopwvOpenMessage(OopwvOpenMessage oopwvOpenMessage) {
        oopwvOpenMessage.getClass();
        if (this.payloadCase_ != 9 || this.payload_ == OopwvOpenMessage.getDefaultInstance()) {
            this.payload_ = oopwvOpenMessage;
        } else {
            this.payload_ = OopwvOpenMessage.newBuilder((OopwvOpenMessage) this.payload_).mergeFrom((OopwvOpenMessage.C6261a) oopwvOpenMessage).buildPartial();
        }
        this.payloadCase_ = 9;
    }

    private void mergePreCompletionResult(SDKResult sDKResult) {
        sDKResult.getClass();
        if (this.payloadCase_ != 6 || this.payload_ == SDKResult.getDefaultInstance()) {
            this.payload_ = sDKResult;
        } else {
            this.payload_ = SDKResult.newBuilder((SDKResult) this.payload_).mergeFrom((SDKResult.C6265a) sDKResult).buildPartial();
        }
        this.payloadCase_ = 6;
    }

    private void mergeResult(SDKResult sDKResult) {
        sDKResult.getClass();
        if (this.payloadCase_ != 3 || this.payload_ == SDKResult.getDefaultInstance()) {
            this.payload_ = sDKResult;
        } else {
            this.payload_ = SDKResult.newBuilder((SDKResult) this.payload_).mergeFrom((SDKResult.C6265a) sDKResult).buildPartial();
        }
        this.payloadCase_ = 3;
    }

    private void mergeSyncRequest(Sync$SyncRequest sync$SyncRequest) {
        sync$SyncRequest.getClass();
        if (this.payloadCase_ != 7 || this.payload_ == Sync$SyncRequest.getDefaultInstance()) {
            this.payload_ = sync$SyncRequest;
        } else {
            this.payload_ = Sync$SyncRequest.newBuilder((Sync$SyncRequest) this.payload_).mergeFrom((Sync$SyncRequest.C6281a) sync$SyncRequest).buildPartial();
        }
        this.payloadCase_ = 7;
    }

    private void mergeSyncResponse(Sync$SyncResponse sync$SyncResponse) {
        sync$SyncResponse.getClass();
        if (this.payloadCase_ != 8 || this.payload_ == Sync$SyncResponse.getDefaultInstance()) {
            this.payload_ = sync$SyncResponse;
        } else {
            this.payload_ = Sync$SyncResponse.newBuilder((Sync$SyncResponse) this.payload_).mergeFrom((Sync$SyncResponse.C6290a) sync$SyncResponse).buildPartial();
        }
        this.payloadCase_ = 8;
    }

    private void mergeTimestamp(Timestamp timestamp) {
        timestamp.getClass();
        Timestamp timestamp2 = this.timestamp_;
        if (timestamp2 == null || timestamp2 == Timestamp.getDefaultInstance()) {
            this.timestamp_ = timestamp;
        } else {
            this.timestamp_ = Timestamp.newBuilder(this.timestamp_).mergeFrom((Timestamp.Builder) timestamp).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static C6266a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Channel$Message parseDelimitedFrom(InputStream inputStream) {
        return (Channel$Message) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Channel$Message parseFrom(ByteBuffer byteBuffer) {
        return (Channel$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<Channel$Message> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setEvent(SDKEvent sDKEvent) {
        sDKEvent.getClass();
        this.payload_ = sDKEvent;
        this.payloadCase_ = 2;
    }

    private void setInternalEvent(Common$SDKInternalEvent common$SDKInternalEvent) {
        common$SDKInternalEvent.getClass();
        this.payload_ = common$SDKInternalEvent;
        this.payloadCase_ = 5;
    }

    private void setMessageId(String str) {
        str.getClass();
        this.messageId_ = str;
    }

    private void setMessageIdBytes(ByteString byteString) throws IllegalArgumentException {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.messageId_ = byteString.toStringUtf8();
    }

    private void setOopwvOpenMessage(OopwvOpenMessage oopwvOpenMessage) {
        oopwvOpenMessage.getClass();
        this.payload_ = oopwvOpenMessage;
        this.payloadCase_ = 9;
    }

    private void setPreCompletionResult(SDKResult sDKResult) {
        sDKResult.getClass();
        this.payload_ = sDKResult;
        this.payloadCase_ = 6;
    }

    private void setResult(SDKResult sDKResult) {
        sDKResult.getClass();
        this.payload_ = sDKResult;
        this.payloadCase_ = 3;
    }

    private void setSyncRequest(Sync$SyncRequest sync$SyncRequest) {
        sync$SyncRequest.getClass();
        this.payload_ = sync$SyncRequest;
        this.payloadCase_ = 7;
    }

    private void setSyncResponse(Sync$SyncResponse sync$SyncResponse) {
        sync$SyncResponse.getClass();
        this.payload_ = sync$SyncResponse;
        this.payloadCase_ = 8;
    }

    private void setTimestamp(Timestamp timestamp) {
        timestamp.getClass();
        this.timestamp_ = timestamp;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser defaultInstanceBasedParser;
        switch (C6268a.f2156a[methodToInvoke.ordinal()]) {
            case 1:
                return new Channel$Message();
            case 2:
                return new C6266a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000\u0003<\u0000\u0004ဉ\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"payload_", "payloadCase_", "bitField0_", "messageId_", SDKEvent.class, SDKResult.class, "timestamp_", Common$SDKInternalEvent.class, SDKResult.class, Sync$SyncRequest.class, Sync$SyncResponse.class, OopwvOpenMessage.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Channel$Message> parser = PARSER;
                if (parser != null) {
                    return parser;
                }
                synchronized (Channel$Message.class) {
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

    public SDKEvent getEvent() {
        return this.payloadCase_ == 2 ? (SDKEvent) this.payload_ : SDKEvent.getDefaultInstance();
    }

    public Common$SDKInternalEvent getInternalEvent() {
        return this.payloadCase_ == 5 ? (Common$SDKInternalEvent) this.payload_ : Common$SDKInternalEvent.getDefaultInstance();
    }

    public String getMessageId() {
        return this.messageId_;
    }

    public ByteString getMessageIdBytes() {
        return ByteString.copyFromUtf8(this.messageId_);
    }

    public OopwvOpenMessage getOopwvOpenMessage() {
        return this.payloadCase_ == 9 ? (OopwvOpenMessage) this.payload_ : OopwvOpenMessage.getDefaultInstance();
    }

    public EnumC6267b getPayloadCase() {
        return EnumC6267b.forNumber(this.payloadCase_);
    }

    public SDKResult getPreCompletionResult() {
        return this.payloadCase_ == 6 ? (SDKResult) this.payload_ : SDKResult.getDefaultInstance();
    }

    public SDKResult getResult() {
        return this.payloadCase_ == 3 ? (SDKResult) this.payload_ : SDKResult.getDefaultInstance();
    }

    public Sync$SyncRequest getSyncRequest() {
        return this.payloadCase_ == 7 ? (Sync$SyncRequest) this.payload_ : Sync$SyncRequest.getDefaultInstance();
    }

    public Sync$SyncResponse getSyncResponse() {
        return this.payloadCase_ == 8 ? (Sync$SyncResponse) this.payload_ : Sync$SyncResponse.getDefaultInstance();
    }

    public Timestamp getTimestamp() {
        Timestamp timestamp = this.timestamp_;
        return timestamp == null ? Timestamp.getDefaultInstance() : timestamp;
    }

    public boolean hasEvent() {
        return this.payloadCase_ == 2;
    }

    public boolean hasInternalEvent() {
        return this.payloadCase_ == 5;
    }

    public boolean hasOopwvOpenMessage() {
        return this.payloadCase_ == 9;
    }

    public boolean hasPreCompletionResult() {
        return this.payloadCase_ == 6;
    }

    public boolean hasResult() {
        return this.payloadCase_ == 3;
    }

    public boolean hasSyncRequest() {
        return this.payloadCase_ == 7;
    }

    public boolean hasSyncResponse() {
        return this.payloadCase_ == 8;
    }

    public boolean hasTimestamp() {
        return (this.bitField0_ & 1) != 0;
    }

    public static C6266a newBuilder(Channel$Message channel$Message) {
        return DEFAULT_INSTANCE.createBuilder(channel$Message);
    }

    public static Channel$Message parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$Message) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Channel$Message parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Channel$Message parseFrom(ByteString byteString) {
        return (Channel$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Channel$Message parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Channel$Message parseFrom(byte[] bArr) {
        return (Channel$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Channel$Message parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static Channel$Message parseFrom(InputStream inputStream) {
        return (Channel$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Channel$Message parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Channel$Message parseFrom(CodedInputStream codedInputStream) {
        return (Channel$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Channel$Message parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Channel$Message) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
