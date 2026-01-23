package com.twilio.util;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TwilioException.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b)\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-¨\u0006."}, m3636d2 = {"Lcom/twilio/util/ErrorReason;", "", "value", "", "description", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getValue", "()I", "Unknown", "Cancelled", "Timeout", "MediaUploadError", "MediaFetchError", "TooManyAttachments", "UnsupportedEmailBodyContentType", "UnsupportedEmailHistoryContentType", "TransportDisconnected", "NetworkBecameUnreachable", "Unauthorized", "TokenExpired", "TokenUpdatedLocally", "TooManyRequests", "HostnameUnverified", "SslHandshakeError", "CloseMessageReceived", "CannotParse", "RetrierReachedMaxAttempsCount", "RetrierReachedMaxTime", "ContentTemplatesFetchError", "CommandRecoverableError", "CommandPermanentError", "NoContentSid", "ContentMediaDownloadError", "CreateClientError", "UpdateTokenError", "OpenStreamError", "OpenDocumentError", "OpenCollectionError", "MutateOperationAborted", "MutateCollectionItemNotFound", "MismatchedLastUserAccount", "ClientShutdown", "IteratorError", "shared-public_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* renamed from: com.twilio.util.ErrorReason, reason: use source file name */
/* loaded from: classes11.dex */
public final class TwilioException2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TwilioException2[] $VALUES;
    private final String description;
    private final int value;
    public static final TwilioException2 Unknown = new TwilioException2("Unknown", 0, 0, "Unknown error");
    public static final TwilioException2 Cancelled = new TwilioException2("Cancelled", 1, 1, "Job was cancelled");
    public static final TwilioException2 Timeout = new TwilioException2("Timeout", 2, 2, "Timeout occurred");
    public static final TwilioException2 MediaUploadError = new TwilioException2("MediaUploadError", 3, 3, "Media upload error");
    public static final TwilioException2 MediaFetchError = new TwilioException2("MediaFetchError", 4, 4, "Media fetch error");
    public static final TwilioException2 TooManyAttachments = new TwilioException2("TooManyAttachments", 5, 5, "Too many attachments. See ConversationLimits.mediaAttachmentsCountLimit");
    public static final TwilioException2 UnsupportedEmailBodyContentType = new TwilioException2("UnsupportedEmailBodyContentType", 6, 6, "Unsupported email body content type. See ConversationLimits.emailBodiesAllowedContentTypes");
    public static final TwilioException2 UnsupportedEmailHistoryContentType = new TwilioException2("UnsupportedEmailHistoryContentType", 7, 7, "Unsupported email history content type. See ConversationLimits.emailHistoriesAllowedContentTypes");
    public static final TwilioException2 TransportDisconnected = new TwilioException2("TransportDisconnected", 8, 8, "Transport has been disconnected");
    public static final TwilioException2 NetworkBecameUnreachable = new TwilioException2("NetworkBecameUnreachable", 9, 9, "Network became unreachable");
    public static final TwilioException2 Unauthorized = new TwilioException2("Unauthorized", 10, 10, "Unauthorized");
    public static final TwilioException2 TokenExpired = new TwilioException2("TokenExpired", 11, 11, "Token expired");
    public static final TwilioException2 TokenUpdatedLocally = new TwilioException2("TokenUpdatedLocally", 12, 12, "Transport disconnected, token updated locally and will be used at reconnect");
    public static final TwilioException2 TooManyRequests = new TwilioException2("TooManyRequests", 13, 13, "Request failed with 429 reply");
    public static final TwilioException2 HostnameUnverified = new TwilioException2("HostnameUnverified", 14, 14, "Failed on ssl handshake: CERTIFICATE_VERIFY_FAILED");
    public static final TwilioException2 SslHandshakeError = new TwilioException2("SslHandshakeError", 15, 15, "Failed on ssl handshake: UNAUTHORIZED");
    public static final TwilioException2 CloseMessageReceived = new TwilioException2("CloseMessageReceived", 16, 16, "Twilsock received a close message from the server");
    public static final TwilioException2 CannotParse = new TwilioException2("CannotParse", 17, 17, "Error parsing incoming message");
    public static final TwilioException2 RetrierReachedMaxAttempsCount = new TwilioException2("RetrierReachedMaxAttempsCount", 18, 18, "Retrier reached max attempts count");
    public static final TwilioException2 RetrierReachedMaxTime = new TwilioException2("RetrierReachedMaxTime", 19, 19, "Retrier reached max time");
    public static final TwilioException2 ContentTemplatesFetchError = new TwilioException2("ContentTemplatesFetchError", 20, 20, "Content templates fetch error");
    public static final TwilioException2 CommandRecoverableError = new TwilioException2("CommandRecoverableError", 21, 21, "Command finished with recoverable error");
    public static final TwilioException2 CommandPermanentError = new TwilioException2("CommandPermanentError", 22, 22, "Command finished with permanent error");
    public static final TwilioException2 NoContentSid = new TwilioException2("NoContentSid", 23, 23, "Cannot return content data for this message, because contentSid is null");
    public static final TwilioException2 ContentMediaDownloadError = new TwilioException2("ContentMediaDownloadError", 24, 24, "Media download error");
    public static final TwilioException2 CreateClientError = new TwilioException2("CreateClientError", 25, 25, "Create client error");
    public static final TwilioException2 UpdateTokenError = new TwilioException2("UpdateTokenError", 26, 26, "Update token error");
    public static final TwilioException2 OpenStreamError = new TwilioException2("OpenStreamError", 27, 27, "Open stream error. Probably stream has been just removed remotely");
    public static final TwilioException2 OpenDocumentError = new TwilioException2("OpenDocumentError", 28, 28, "Open document error. Probably document has been just removed remotely");
    public static final TwilioException2 OpenCollectionError = new TwilioException2("OpenCollectionError", 29, 29, "Open map error. Probably map has been just removed remotely");
    public static final TwilioException2 MutateOperationAborted = new TwilioException2("MutateOperationAborted", 30, 30, "Mutate operation has been aborted. Mutator returned `null` value");
    public static final TwilioException2 MutateCollectionItemNotFound = new TwilioException2("MutateCollectionItemNotFound", 31, 31, "Mutate operation failed: Collection item not found");
    public static final TwilioException2 MismatchedLastUserAccount = new TwilioException2("MismatchedLastUserAccount", 32, 32, "Last user account does not match the current user account from twilio token. Create client with matching twilio token or set the useLastUserCache parameter to false.");
    public static final TwilioException2 ClientShutdown = new TwilioException2("ClientShutdown", 33, 33, "SyncClient already shutdown");
    public static final TwilioException2 IteratorError = new TwilioException2("IteratorError", 34, 34, "Error while iterating over the collection");

    private static final /* synthetic */ TwilioException2[] $values() {
        return new TwilioException2[]{Unknown, Cancelled, Timeout, MediaUploadError, MediaFetchError, TooManyAttachments, UnsupportedEmailBodyContentType, UnsupportedEmailHistoryContentType, TransportDisconnected, NetworkBecameUnreachable, Unauthorized, TokenExpired, TokenUpdatedLocally, TooManyRequests, HostnameUnverified, SslHandshakeError, CloseMessageReceived, CannotParse, RetrierReachedMaxAttempsCount, RetrierReachedMaxTime, ContentTemplatesFetchError, CommandRecoverableError, CommandPermanentError, NoContentSid, ContentMediaDownloadError, CreateClientError, UpdateTokenError, OpenStreamError, OpenDocumentError, OpenCollectionError, MutateOperationAborted, MutateCollectionItemNotFound, MismatchedLastUserAccount, ClientShutdown, IteratorError};
    }

    public static EnumEntries<TwilioException2> getEntries() {
        return $ENTRIES;
    }

    public static TwilioException2 valueOf(String str) {
        return (TwilioException2) Enum.valueOf(TwilioException2.class, str);
    }

    public static TwilioException2[] values() {
        return (TwilioException2[]) $VALUES.clone();
    }

    private TwilioException2(String str, int i, int i2, String str2) {
        this.value = i2;
        this.description = str2;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        TwilioException2[] twilioException2Arr$values = $values();
        $VALUES = twilioException2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(twilioException2Arr$values);
    }
}
