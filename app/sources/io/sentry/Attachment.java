package io.sentry;

import io.sentry.protocol.ViewHierarchy;

/* loaded from: classes21.dex */
public final class Attachment {
    private final boolean addToTransactions;
    private String attachmentType;
    private byte[] bytes;
    private final String contentType;
    private final String filename;
    private String pathname;
    private final JsonSerializable serializable;

    public Attachment(byte[] bArr, String str, String str2, boolean z) {
        this(bArr, str, str2, "event.attachment", z);
    }

    public Attachment(byte[] bArr, String str, String str2, String str3, boolean z) {
        this.bytes = bArr;
        this.serializable = null;
        this.filename = str;
        this.contentType = str2;
        this.attachmentType = str3;
        this.addToTransactions = z;
    }

    public Attachment(JsonSerializable jsonSerializable, String str, String str2, String str3, boolean z) {
        this.bytes = null;
        this.serializable = jsonSerializable;
        this.filename = str;
        this.contentType = str2;
        this.attachmentType = str3;
        this.addToTransactions = z;
    }

    public byte[] getBytes() {
        return this.bytes;
    }

    public JsonSerializable getSerializable() {
        return this.serializable;
    }

    public String getPathname() {
        return this.pathname;
    }

    public String getFilename() {
        return this.filename;
    }

    public String getContentType() {
        return this.contentType;
    }

    boolean isAddToTransactions() {
        return this.addToTransactions;
    }

    public String getAttachmentType() {
        return this.attachmentType;
    }

    public static Attachment fromScreenshot(byte[] bArr) {
        return new Attachment(bArr, "screenshot.png", "image/png", false);
    }

    public static Attachment fromViewHierarchy(ViewHierarchy viewHierarchy) {
        return new Attachment((JsonSerializable) viewHierarchy, "view-hierarchy.json", "application/json", "event.view_hierarchy", false);
    }

    public static Attachment fromThreadDump(byte[] bArr) {
        return new Attachment(bArr, "thread-dump.txt", "text/plain", false);
    }
}
