package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.streamingToken;

import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StreamingToken.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingToken;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/AbstractStreamingToken;", "MessageStreamingToken", "StreamingTokenValidation", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingToken$MessageStreamingToken;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingToken$StreamingTokenValidation;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface StreamingToken extends AbstractStreamingToken {

    /* compiled from: StreamingToken.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003JE\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0014\u0010\t\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingToken$MessageStreamingToken;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingToken;", "sequenceNumber", "", "timestamp", "", "targetMessageIdentifier", "", "batchNumber", "turnId", "token", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingTokenMessageFormat;", "<init>", "(IJLjava/lang/String;ILjava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingTokenMessageFormat;)V", "getSequenceNumber", "()I", "getTimestamp", "()J", "getTargetMessageIdentifier", "()Ljava/lang/String;", "getBatchNumber", "getTurnId", "getToken", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingTokenMessageFormat;", "tokenType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingTokenType;", "getTokenType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingTokenType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class MessageStreamingToken implements StreamingToken {
        private final int batchNumber;
        private final int sequenceNumber;
        private final String targetMessageIdentifier;
        private final long timestamp;
        private final StreamingTokenMessageFormat token;
        private final StreamingTokenType tokenType;
        private final String turnId;

        public static /* synthetic */ MessageStreamingToken copy$default(MessageStreamingToken messageStreamingToken, int i, long j, String str, int i2, String str2, StreamingTokenMessageFormat streamingTokenMessageFormat, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = messageStreamingToken.sequenceNumber;
            }
            if ((i3 & 2) != 0) {
                j = messageStreamingToken.timestamp;
            }
            if ((i3 & 4) != 0) {
                str = messageStreamingToken.targetMessageIdentifier;
            }
            if ((i3 & 8) != 0) {
                i2 = messageStreamingToken.batchNumber;
            }
            if ((i3 & 16) != 0) {
                str2 = messageStreamingToken.turnId;
            }
            if ((i3 & 32) != 0) {
                streamingTokenMessageFormat = messageStreamingToken.token;
            }
            return messageStreamingToken.copy(i, j, str, i2, str2, streamingTokenMessageFormat);
        }

        /* renamed from: component1, reason: from getter */
        public final int getSequenceNumber() {
            return this.sequenceNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTargetMessageIdentifier() {
            return this.targetMessageIdentifier;
        }

        /* renamed from: component4, reason: from getter */
        public final int getBatchNumber() {
            return this.batchNumber;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTurnId() {
            return this.turnId;
        }

        /* renamed from: component6, reason: from getter */
        public final StreamingTokenMessageFormat getToken() {
            return this.token;
        }

        public final MessageStreamingToken copy(int sequenceNumber, long timestamp, String targetMessageIdentifier, int batchNumber, String turnId, StreamingTokenMessageFormat token) {
            Intrinsics.checkNotNullParameter(targetMessageIdentifier, "targetMessageIdentifier");
            Intrinsics.checkNotNullParameter(turnId, "turnId");
            Intrinsics.checkNotNullParameter(token, "token");
            return new MessageStreamingToken(sequenceNumber, timestamp, targetMessageIdentifier, batchNumber, turnId, token);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageStreamingToken)) {
                return false;
            }
            MessageStreamingToken messageStreamingToken = (MessageStreamingToken) other;
            return this.sequenceNumber == messageStreamingToken.sequenceNumber && this.timestamp == messageStreamingToken.timestamp && Intrinsics.areEqual(this.targetMessageIdentifier, messageStreamingToken.targetMessageIdentifier) && this.batchNumber == messageStreamingToken.batchNumber && Intrinsics.areEqual(this.turnId, messageStreamingToken.turnId) && Intrinsics.areEqual(this.token, messageStreamingToken.token);
        }

        public int hashCode() {
            return (((((((((Integer.hashCode(this.sequenceNumber) * 31) + Long.hashCode(this.timestamp)) * 31) + this.targetMessageIdentifier.hashCode()) * 31) + Integer.hashCode(this.batchNumber)) * 31) + this.turnId.hashCode()) * 31) + this.token.hashCode();
        }

        public String toString() {
            return "MessageStreamingToken(sequenceNumber=" + this.sequenceNumber + ", timestamp=" + this.timestamp + ", targetMessageIdentifier=" + this.targetMessageIdentifier + ", batchNumber=" + this.batchNumber + ", turnId=" + this.turnId + ", token=" + this.token + ")";
        }

        public MessageStreamingToken(int i, long j, String targetMessageIdentifier, int i2, String turnId, StreamingTokenMessageFormat token) {
            Intrinsics.checkNotNullParameter(targetMessageIdentifier, "targetMessageIdentifier");
            Intrinsics.checkNotNullParameter(turnId, "turnId");
            Intrinsics.checkNotNullParameter(token, "token");
            this.sequenceNumber = i;
            this.timestamp = j;
            this.targetMessageIdentifier = targetMessageIdentifier;
            this.batchNumber = i2;
            this.turnId = turnId;
            this.token = token;
            this.tokenType = StreamingTokenType.MessageStreamingToken;
        }

        public /* synthetic */ MessageStreamingToken(int i, long j, String str, int i2, String str2, StreamingTokenMessageFormat streamingTokenMessageFormat, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, j, str, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? str : str2, streamingTokenMessageFormat);
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.streamingToken.AbstractStreamingToken
        public int getSequenceNumber() {
            return this.sequenceNumber;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.streamingToken.AbstractStreamingToken
        public long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.streamingToken.AbstractStreamingToken
        public String getTargetMessageIdentifier() {
            return this.targetMessageIdentifier;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.streamingToken.AbstractStreamingToken
        public int getBatchNumber() {
            return this.batchNumber;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.streamingToken.AbstractStreamingToken
        public String getTurnId() {
            return this.turnId;
        }

        public final StreamingTokenMessageFormat getToken() {
            return this.token;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.streamingToken.AbstractStreamingToken
        public StreamingTokenType getTokenType() {
            return this.tokenType;
        }
    }

    /* compiled from: StreamingToken.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003JE\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\u0003HÖ\u0001J\t\u0010(\u001a\u00020\u0007HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0014\u0010\t\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0019X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006)"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingToken$StreamingTokenValidation;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingToken;", "sequenceNumber", "", "timestamp", "", "targetMessageIdentifier", "", "batchNumber", "turnId", "result", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingTokenValidationResult;", "<init>", "(IJLjava/lang/String;ILjava/lang/String;Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingTokenValidationResult;)V", "getSequenceNumber", "()I", "getTimestamp", "()J", "getTargetMessageIdentifier", "()Ljava/lang/String;", "getBatchNumber", "getTurnId", "getResult", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingTokenValidationResult;", "tokenType", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingTokenType;", "getTokenType", "()Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/streamingToken/StreamingTokenType;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final /* data */ class StreamingTokenValidation implements StreamingToken {
        private final int batchNumber;
        private final StreamingTokenValidationResult result;
        private final int sequenceNumber;
        private final String targetMessageIdentifier;
        private final long timestamp;
        private final StreamingTokenType tokenType;
        private final String turnId;

        public static /* synthetic */ StreamingTokenValidation copy$default(StreamingTokenValidation streamingTokenValidation, int i, long j, String str, int i2, String str2, StreamingTokenValidationResult streamingTokenValidationResult, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = streamingTokenValidation.sequenceNumber;
            }
            if ((i3 & 2) != 0) {
                j = streamingTokenValidation.timestamp;
            }
            if ((i3 & 4) != 0) {
                str = streamingTokenValidation.targetMessageIdentifier;
            }
            if ((i3 & 8) != 0) {
                i2 = streamingTokenValidation.batchNumber;
            }
            if ((i3 & 16) != 0) {
                str2 = streamingTokenValidation.turnId;
            }
            if ((i3 & 32) != 0) {
                streamingTokenValidationResult = streamingTokenValidation.result;
            }
            return streamingTokenValidation.copy(i, j, str, i2, str2, streamingTokenValidationResult);
        }

        /* renamed from: component1, reason: from getter */
        public final int getSequenceNumber() {
            return this.sequenceNumber;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimestamp() {
            return this.timestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final String getTargetMessageIdentifier() {
            return this.targetMessageIdentifier;
        }

        /* renamed from: component4, reason: from getter */
        public final int getBatchNumber() {
            return this.batchNumber;
        }

        /* renamed from: component5, reason: from getter */
        public final String getTurnId() {
            return this.turnId;
        }

        /* renamed from: component6, reason: from getter */
        public final StreamingTokenValidationResult getResult() {
            return this.result;
        }

        public final StreamingTokenValidation copy(int sequenceNumber, long timestamp, String targetMessageIdentifier, int batchNumber, String turnId, StreamingTokenValidationResult result) {
            Intrinsics.checkNotNullParameter(targetMessageIdentifier, "targetMessageIdentifier");
            Intrinsics.checkNotNullParameter(turnId, "turnId");
            Intrinsics.checkNotNullParameter(result, "result");
            return new StreamingTokenValidation(sequenceNumber, timestamp, targetMessageIdentifier, batchNumber, turnId, result);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StreamingTokenValidation)) {
                return false;
            }
            StreamingTokenValidation streamingTokenValidation = (StreamingTokenValidation) other;
            return this.sequenceNumber == streamingTokenValidation.sequenceNumber && this.timestamp == streamingTokenValidation.timestamp && Intrinsics.areEqual(this.targetMessageIdentifier, streamingTokenValidation.targetMessageIdentifier) && this.batchNumber == streamingTokenValidation.batchNumber && Intrinsics.areEqual(this.turnId, streamingTokenValidation.turnId) && Intrinsics.areEqual(this.result, streamingTokenValidation.result);
        }

        public int hashCode() {
            return (((((((((Integer.hashCode(this.sequenceNumber) * 31) + Long.hashCode(this.timestamp)) * 31) + this.targetMessageIdentifier.hashCode()) * 31) + Integer.hashCode(this.batchNumber)) * 31) + this.turnId.hashCode()) * 31) + this.result.hashCode();
        }

        public String toString() {
            return "StreamingTokenValidation(sequenceNumber=" + this.sequenceNumber + ", timestamp=" + this.timestamp + ", targetMessageIdentifier=" + this.targetMessageIdentifier + ", batchNumber=" + this.batchNumber + ", turnId=" + this.turnId + ", result=" + this.result + ")";
        }

        public StreamingTokenValidation(int i, long j, String targetMessageIdentifier, int i2, String turnId, StreamingTokenValidationResult result) {
            Intrinsics.checkNotNullParameter(targetMessageIdentifier, "targetMessageIdentifier");
            Intrinsics.checkNotNullParameter(turnId, "turnId");
            Intrinsics.checkNotNullParameter(result, "result");
            this.sequenceNumber = i;
            this.timestamp = j;
            this.targetMessageIdentifier = targetMessageIdentifier;
            this.batchNumber = i2;
            this.turnId = turnId;
            this.result = result;
            this.tokenType = StreamingTokenType.StreamingTokenValidation;
        }

        public /* synthetic */ StreamingTokenValidation(int i, long j, String str, int i2, String str2, StreamingTokenValidationResult streamingTokenValidationResult, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, j, str, (i3 & 8) != 0 ? 0 : i2, (i3 & 16) != 0 ? str : str2, streamingTokenValidationResult);
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.streamingToken.AbstractStreamingToken
        public int getSequenceNumber() {
            return this.sequenceNumber;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.streamingToken.AbstractStreamingToken
        public long getTimestamp() {
            return this.timestamp;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.streamingToken.AbstractStreamingToken
        public String getTargetMessageIdentifier() {
            return this.targetMessageIdentifier;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.streamingToken.AbstractStreamingToken
        public int getBatchNumber() {
            return this.batchNumber;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.streamingToken.AbstractStreamingToken
        public String getTurnId() {
            return this.turnId;
        }

        public final StreamingTokenValidationResult getResult() {
            return this.result;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.streamingToken.AbstractStreamingToken
        public StreamingTokenType getTokenType() {
            return this.tokenType;
        }
    }
}
