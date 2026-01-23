package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment;

import android.webkit.MimeTypeMap;
import com.plaid.internal.EnumC7081g;
import com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileMimeType;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.io.File;
import java.io.Serializable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.FilesKt;

/* compiled from: FileAsset.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0014\u0015\u0016\u0017R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0014\u0010\b\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u0012\u0010\f\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0005R\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u0082\u0001\u0003\u0018\u0019\u001a¨\u0006\u001b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset;", "", "id", "", "getId", "()Ljava/lang/String;", "parentEntryId", "getParentEntryId", "url", "getUrl", "name", "getName", "mimeType", "getMimeType", "file", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "setFile", "(Ljava/io/File;)V", "GenericMimeType", "PdfAsset", "ImageAsset", "UnknownAsset", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$ImageAsset;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$PdfAsset;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$UnknownAsset;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface FileAsset {
    File getFile();

    String getId();

    String getMimeType();

    String getName();

    String getParentEntryId();

    String getUrl();

    void setFile(File file);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: FileAsset.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$GenericMimeType;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileMimeType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "OCTET_STREAM", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class GenericMimeType implements FileMimeType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ GenericMimeType[] $VALUES;
        public static final GenericMimeType OCTET_STREAM = new GenericMimeType("OCTET_STREAM", 0, "application/octet-stream");
        private final String value;

        private static final /* synthetic */ GenericMimeType[] $values() {
            return new GenericMimeType[]{OCTET_STREAM};
        }

        public static EnumEntries<GenericMimeType> getEntries() {
            return $ENTRIES;
        }

        private GenericMimeType(String str, int i, String str2) {
            this.value = str2;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileMimeType
        public String getValue() {
            return this.value;
        }

        static {
            GenericMimeType[] genericMimeTypeArr$values = $values();
            $VALUES = genericMimeTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(genericMimeTypeArr$values);
        }

        public static GenericMimeType valueOf(String str) {
            return (GenericMimeType) Enum.valueOf(GenericMimeType.class, str);
        }

        public static GenericMimeType[] values() {
            return (GenericMimeType[]) $VALUES.clone();
        }
    }

    /* compiled from: FileAsset.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0016BG\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\fR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$PdfAsset;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset;", "id", "", "parentEntryId", "url", "name", "mimeType", "file", "Ljava/io/File;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V", "(Ljava/io/File;)V", "getId", "()Ljava/lang/String;", "getParentEntryId", "getUrl", "getName", "getMimeType", "getFile", "()Ljava/io/File;", "setFile", "PdfMimeType", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static class PdfAsset implements FileAsset {
        private transient File file;
        private final String id;
        private final String mimeType;
        private final String name;
        private final transient String parentEntryId;
        private final String url;

        public PdfAsset(String id, String str, String str2, String name, String mimeType, File file) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            this.id = id;
            this.parentEntryId = str;
            this.url = str2;
            this.name = name;
            this.mimeType = mimeType;
            this.file = file;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ PdfAsset(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.io.File r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto Lc
                java.util.UUID r2 = java.util.UUID.randomUUID()
                java.lang.String r2 = r2.toString()
            Lc:
                r9 = r8 & 2
                r0 = 0
                if (r9 == 0) goto L12
                r3 = r0
            L12:
                r9 = r8 & 4
                if (r9 == 0) goto L17
                r4 = r0
            L17:
                r9 = r8 & 8
                if (r9 == 0) goto L1d
                java.lang.String r5 = ""
            L1d:
                r8 = r8 & 32
                if (r8 == 0) goto L29
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L30
            L29:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L30:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset.PdfAsset.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.io.File, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset
        public String getId() {
            return this.id;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset
        public String getParentEntryId() {
            return this.parentEntryId;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset
        public String getUrl() {
            return this.url;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset
        public String getName() {
            return this.name;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset
        public String getMimeType() {
            return this.mimeType;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset
        public File getFile() {
            return this.file;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset
        public void setFile(File file) {
            this.file = file;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public PdfAsset(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(FilesKt.getExtension(file));
            this(null, null, null, name, mimeTypeFromExtension == null ? GenericMimeType.OCTET_STREAM.getValue() : mimeTypeFromExtension, file, 7, null);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: FileAsset.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\t¨\u0006\u000b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$PdfAsset$PdfMimeType;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileMimeType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PDF", "Companion", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class PdfMimeType implements FileMimeType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ PdfMimeType[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            public static final PdfMimeType PDF = new PdfMimeType("PDF", 0, "application/pdf");
            private final String value;

            private static final /* synthetic */ PdfMimeType[] $values() {
                return new PdfMimeType[]{PDF};
            }

            public static EnumEntries<PdfMimeType> getEntries() {
                return $ENTRIES;
            }

            private PdfMimeType(String str, int i, String str2) {
                this.value = str2;
            }

            @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileMimeType
            public String getValue() {
                return this.value;
            }

            static {
                PdfMimeType[] pdfMimeTypeArr$values = $values();
                $VALUES = pdfMimeTypeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(pdfMimeTypeArr$values);
                INSTANCE = new Companion(null);
            }

            /* compiled from: FileAsset.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$PdfAsset$PdfMimeType$Companion;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileMimeType$EnumValueTypeHelper;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$PdfAsset$PdfMimeType;", "<init>", "()V", "enumValueOfOrNull", "value", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements FileMimeType.EnumValueTypeHelper<PdfMimeType> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileMimeType.EnumValueTypeHelper
                public PdfMimeType enumValueOfOrNull(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    for (PdfMimeType pdfMimeType : PdfMimeType.values()) {
                        if (Intrinsics.areEqual(pdfMimeType.getValue(), value)) {
                            return pdfMimeType;
                        }
                    }
                    return null;
                }
            }

            public static PdfMimeType valueOf(String str) {
                return (PdfMimeType) Enum.valueOf(PdfMimeType.class, str);
            }

            public static PdfMimeType[] values() {
                return (PdfMimeType[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: FileAsset.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aBE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\fJ\u0006\u0010\u0016\u001a\u00020\u0017R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\f¨\u0006\u001b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$ImageAsset;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset;", "id", "", "parentEntryId", "url", "name", "mimeType", "file", "Ljava/io/File;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)V", "(Ljava/io/File;)V", "getId", "()Ljava/lang/String;", "getParentEntryId", "getUrl", "getName", "getMimeType", "getFile", "()Ljava/io/File;", "setFile", "isGif", "", "ImageMimeType", "RichLinkImage", "CarouselImage", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static class ImageAsset implements FileAsset {
        private transient File file;
        private final String id;
        private final String mimeType;
        private final String name;
        private final transient String parentEntryId;
        private final String url;

        public ImageAsset(String id, String str, String str2, String name, String mimeType, File file) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            this.id = id;
            this.parentEntryId = str;
            this.url = str2;
            this.name = name;
            this.mimeType = mimeType;
            this.file = file;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ ImageAsset(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.io.File r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto Lc
                java.util.UUID r2 = java.util.UUID.randomUUID()
                java.lang.String r2 = r2.toString()
            Lc:
                r9 = r8 & 2
                r0 = 0
                if (r9 == 0) goto L12
                r3 = r0
            L12:
                r9 = r8 & 4
                if (r9 == 0) goto L17
                r4 = r0
            L17:
                r8 = r8 & 32
                if (r8 == 0) goto L23
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L2a
            L23:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L2a:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset.ImageAsset.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.io.File, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset
        public String getId() {
            return this.id;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset
        public String getParentEntryId() {
            return this.parentEntryId;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset
        public String getUrl() {
            return this.url;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset
        public String getName() {
            return this.name;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset
        public String getMimeType() {
            return this.mimeType;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset
        public File getFile() {
            return this.file;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset
        public void setFile(File file) {
            this.file = file;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public ImageAsset(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(FilesKt.getExtension(file));
            this(null, null, null, name, mimeTypeFromExtension == null ? GenericMimeType.OCTET_STREAM.getValue() : mimeTypeFromExtension, file, 7, null);
        }

        public final boolean isGif() {
            return Intrinsics.areEqual(getMimeType(), ImageMimeType.GIF.getValue());
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: FileAsset.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$ImageAsset$ImageMimeType;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileMimeType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PNG", "GIF", "BMP", "JPG", "TIFF", "JPEG", "Companion", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class ImageMimeType implements FileMimeType {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ ImageMimeType[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String value;
            public static final ImageMimeType PNG = new ImageMimeType("PNG", 0, "image/png");
            public static final ImageMimeType GIF = new ImageMimeType("GIF", 1, "image/gif");
            public static final ImageMimeType BMP = new ImageMimeType("BMP", 2, "image/bmp");
            public static final ImageMimeType JPG = new ImageMimeType("JPG", 3, "image/jpg");
            public static final ImageMimeType TIFF = new ImageMimeType("TIFF", 4, "image/tiff");
            public static final ImageMimeType JPEG = new ImageMimeType("JPEG", 5, "image/jpeg");

            private static final /* synthetic */ ImageMimeType[] $values() {
                return new ImageMimeType[]{PNG, GIF, BMP, JPG, TIFF, JPEG};
            }

            public static EnumEntries<ImageMimeType> getEntries() {
                return $ENTRIES;
            }

            private ImageMimeType(String str, int i, String str2) {
                this.value = str2;
            }

            @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileMimeType
            public String getValue() {
                return this.value;
            }

            static {
                ImageMimeType[] imageMimeTypeArr$values = $values();
                $VALUES = imageMimeTypeArr$values;
                $ENTRIES = EnumEntries2.enumEntries(imageMimeTypeArr$values);
                INSTANCE = new Companion(null);
            }

            /* compiled from: FileAsset.kt */
            @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$ImageAsset$ImageMimeType$Companion;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileMimeType$EnumValueTypeHelper;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$ImageAsset$ImageMimeType;", "<init>", "()V", "enumValueOfOrNull", "value", "", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
            @SourceDebugExtension
            public static final class Companion implements FileMimeType.EnumValueTypeHelper<ImageMimeType> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileMimeType.EnumValueTypeHelper
                public ImageMimeType enumValueOfOrNull(String value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    for (ImageMimeType imageMimeType : ImageMimeType.values()) {
                        if (Intrinsics.areEqual(imageMimeType.getValue(), value)) {
                            return imageMimeType;
                        }
                    }
                    return null;
                }
            }

            public static ImageMimeType valueOf(String str) {
                return (ImageMimeType) Enum.valueOf(ImageMimeType.class, str);
            }

            public static ImageMimeType[] values() {
                return (ImageMimeType[]) $VALUES.clone();
            }
        }

        /* compiled from: FileAsset.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$ImageAsset$RichLinkImage;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$ImageAsset;", "id", "", "parentEntryId", "url", "name", "mimeType", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class RichLinkImage extends ImageAsset {
            private final transient String description;

            public RichLinkImage() {
                this(null, null, null, null, null, null, 63, null);
            }

            /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
                java.lang.NullPointerException
                */
            public /* synthetic */ RichLinkImage(java.lang.String r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
                /*
                    r1 = this;
                    r9 = r8 & 1
                    if (r9 == 0) goto Lc
                    java.util.UUID r2 = java.util.UUID.randomUUID()
                    java.lang.String r2 = r2.toString()
                Lc:
                    r9 = r8 & 2
                    r0 = 0
                    if (r9 == 0) goto L12
                    r3 = r0
                L12:
                    r9 = r8 & 4
                    if (r9 == 0) goto L17
                    r4 = r0
                L17:
                    r9 = r8 & 8
                    if (r9 == 0) goto L23
                    java.util.UUID r5 = java.util.UUID.randomUUID()
                    java.lang.String r5 = r5.toString()
                L23:
                    r9 = r8 & 16
                    if (r9 == 0) goto L2d
                    com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset$GenericMimeType r6 = com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset.GenericMimeType.OCTET_STREAM
                    java.lang.String r6 = r6.getValue()
                L2d:
                    r8 = r8 & 32
                    if (r8 == 0) goto L39
                    r9 = r0
                    r7 = r5
                    r8 = r6
                    r5 = r3
                    r6 = r4
                    r3 = r1
                    r4 = r2
                    goto L40
                L39:
                    r9 = r7
                    r8 = r6
                    r6 = r4
                    r7 = r5
                    r4 = r2
                    r5 = r3
                    r3 = r1
                L40:
                    r3.<init>(r4, r5, r6, r7, r8, r9)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset.ImageAsset.RichLinkImage.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
            }

            public final String getDescription() {
                return this.description;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public RichLinkImage(String id, String str, @Json(name = "assetUrl") String str2, String name, String mimeType, String str3) {
                super(id, str, str2, name, mimeType, null, 32, null);
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                this.description = str3;
            }
        }

        /* compiled from: FileAsset.kt */
        @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$ImageAsset$CarouselImage;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$ImageAsset;", "id", "", "parentEntryId", "url", "name", "mimeType", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
        public static final class CarouselImage extends ImageAsset {
            private final transient String description;

            public /* synthetic */ CarouselImage(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i & 2) != 0 ? null : str2, str3, (i & 8) != 0 ? UUID.randomUUID().toString() : str4, str5, (i & 32) != 0 ? null : str6);
            }

            public final String getDescription() {
                return this.description;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CarouselImage(String id, String str, @Json(name = "assetUrl") String str2, String name, String mimeType, String str3) {
                super(id, str, str2, name, mimeType, null, 32, null);
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(mimeType, "mimeType");
                this.description = str3;
            }
        }
    }

    /* compiled from: FileAsset.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0014\u0010\b\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u000eR\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010¨\u0006\u0019"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset$UnknownAsset;", "Ljava/io/Serializable;", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/message/component/attachment/FileAsset;", "id", "", "parentEntryId", "url", "name", "mimeType", "file", "Ljava/io/File;", "rawMimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/lang/String;)V", "(Ljava/io/File;)V", "getId", "()Ljava/lang/String;", "getParentEntryId", "getUrl", "getName", "getMimeType", "getFile", "()Ljava/io/File;", "setFile", "getRawMimeType", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    public static final class UnknownAsset implements Serializable, FileAsset {
        private transient File file;
        private final String id;
        private final String mimeType;
        private final String name;
        private final transient String parentEntryId;
        private final String rawMimeType;
        private final String url;

        public UnknownAsset() {
            this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
        }

        public UnknownAsset(String id, String str, String str2, String name, String mimeType, File file, String rawMimeType) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(mimeType, "mimeType");
            Intrinsics.checkNotNullParameter(rawMimeType, "rawMimeType");
            this.id = id;
            this.parentEntryId = str;
            this.url = str2;
            this.name = name;
            this.mimeType = mimeType;
            this.file = file;
            this.rawMimeType = rawMimeType;
        }

        public /* synthetic */ UnknownAsset(String str, String str2, String str3, String str4, String str5, File file, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? UUID.randomUUID().toString() : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? UUID.randomUUID().toString() : str4, (i & 16) != 0 ? GenericMimeType.OCTET_STREAM.getValue() : str5, (i & 32) != 0 ? null : file, (i & 64) != 0 ? GenericMimeType.OCTET_STREAM.getValue() : str6);
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset
        public String getId() {
            return this.id;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset
        public String getParentEntryId() {
            return this.parentEntryId;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset
        public String getUrl() {
            return this.url;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset
        public String getName() {
            return this.name;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset
        public String getMimeType() {
            return this.mimeType;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset
        public File getFile() {
            return this.file;
        }

        @Override // com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload.message.component.attachment.FileAsset
        public void setFile(File file) {
            this.file = file;
        }

        public final String getRawMimeType() {
            return this.rawMimeType;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public UnknownAsset(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            GenericMimeType genericMimeType = GenericMimeType.OCTET_STREAM;
            String value = genericMimeType.getValue();
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(FilesKt.getExtension(file));
            this(null, null, null, name, value, file, mimeTypeFromExtension == null ? genericMimeType.getValue() : mimeTypeFromExtension, 7, null);
        }
    }
}
