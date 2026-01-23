package com.robinhood.contentful.model;

import android.annotation.SuppressLint;
import android.util.Base64;
import com.robinhood.contentful.model.AssetDetail;
import com.squareup.moshi.JsonClass;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: ContentResource.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002\u0019\u001aB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007HÆ\u0003J)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/contentful/model/AssetResource;", "T", "Lcom/robinhood/contentful/model/AssetDetail;", "Lcom/robinhood/contentful/model/EntityResource;", "sys", "Lcom/robinhood/contentful/model/AssetMetadata;", "content", "Lcom/robinhood/contentful/model/AssetResource$Content;", "<init>", "(Lcom/robinhood/contentful/model/AssetMetadata;Lcom/robinhood/contentful/model/AssetResource$Content;)V", "getSys", "()Lcom/robinhood/contentful/model/AssetMetadata;", "getContent", "()Lcom/robinhood/contentful/model/AssetResource$Content;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "Content", "File", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"MissingMoshiCodegenAnnotation"})
/* loaded from: classes15.dex */
public final /* data */ class AssetResource<T extends AssetDetail> extends ContentResource4 {
    private final Content<T> content;
    private final AssetMetadata sys;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AssetResource copy$default(AssetResource assetResource, AssetMetadata resourceMetadata3, Content content, int i, Object obj) {
        if ((i & 1) != 0) {
            resourceMetadata3 = assetResource.sys;
        }
        if ((i & 2) != 0) {
            content = assetResource.content;
        }
        return assetResource.copy(resourceMetadata3, content);
    }

    /* renamed from: component1, reason: from getter */
    public final AssetMetadata getSys() {
        return this.sys;
    }

    public final Content<T> component2() {
        return this.content;
    }

    public final AssetResource<T> copy(AssetMetadata sys, Content<T> content) {
        Intrinsics.checkNotNullParameter(sys, "sys");
        Intrinsics.checkNotNullParameter(content, "content");
        return new AssetResource<>(sys, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetResource)) {
            return false;
        }
        AssetResource assetResource = (AssetResource) other;
        return Intrinsics.areEqual(this.sys, assetResource.sys) && Intrinsics.areEqual(this.content, assetResource.content);
    }

    public int hashCode() {
        return (this.sys.hashCode() * 31) + this.content.hashCode();
    }

    public String toString() {
        return "AssetResource(sys=" + this.sys + ", content=" + this.content + ")";
    }

    @Override // com.robinhood.contentful.model.ContentResource
    public AssetMetadata getSys() {
        return this.sys;
    }

    public final Content<T> getContent() {
        return this.content;
    }

    public AssetResource(AssetMetadata sys, Content<T> content) {
        Intrinsics.checkNotNullParameter(sys, "sys");
        Intrinsics.checkNotNullParameter(content, "content");
        this.sys = sys;
        this.content = content;
    }

    /* compiled from: ContentResource.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0003B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007HÆ\u0003J)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/contentful/model/AssetResource$Content;", "T", "Lcom/robinhood/contentful/model/AssetDetail;", "", "title", "", "file", "Lcom/robinhood/contentful/model/AssetResource$File;", "<init>", "(Ljava/lang/String;Lcom/robinhood/contentful/model/AssetResource$File;)V", "getTitle", "()Ljava/lang/String;", "getFile", "()Lcom/robinhood/contentful/model/AssetResource$File;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Content<T extends AssetDetail> {
        private final File<T> file;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, String str, File file, int i, Object obj) {
            if ((i & 1) != 0) {
                str = content.title;
            }
            if ((i & 2) != 0) {
                file = content.file;
            }
            return content.copy(str, file);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final File<T> component2() {
            return this.file;
        }

        public final Content<T> copy(String title, File<T> file) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(file, "file");
            return new Content<>(title, file);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.areEqual(this.title, content.title) && Intrinsics.areEqual(this.file, content.file);
        }

        public int hashCode() {
            return (this.title.hashCode() * 31) + this.file.hashCode();
        }

        public String toString() {
            return "Content(title=" + this.title + ", file=" + this.file + ")";
        }

        public Content(String title, File<T> file) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(file, "file");
            this.title = title;
            this.file = file;
        }

        public final String getTitle() {
            return this.title;
        }

        public final File<T> getFile() {
            return this.file;
        }
    }

    /* compiled from: ContentResource.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0003B'\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00028\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0016\u001a\u00020\u0007J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J\u000e\u0010\u001a\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u0014J<\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00028\u0001HÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, m3636d2 = {"Lcom/robinhood/contentful/model/AssetResource$File;", "T", "Lcom/robinhood/contentful/model/AssetDetail;", "", "mediaType", "Lokhttp3/MediaType;", "fileName", "", "url", "Lokhttp3/HttpUrl;", ErrorBundle.DETAIL_ENTRY, "<init>", "(Lokhttp3/MediaType;Ljava/lang/String;Lokhttp3/HttpUrl;Lcom/robinhood/contentful/model/AssetDetail;)V", "getMediaType", "()Lokhttp3/MediaType;", "getFileName", "()Ljava/lang/String;", "getUrl", "()Lokhttp3/HttpUrl;", "getDetails", "()Lcom/robinhood/contentful/model/AssetDetail;", "Lcom/robinhood/contentful/model/AssetDetail;", "hashKey", "component1", "component2", "component3", "component4", "copy", "(Lokhttp3/MediaType;Ljava/lang/String;Lokhttp3/HttpUrl;Lcom/robinhood/contentful/model/AssetDetail;)Lcom/robinhood/contentful/model/AssetResource$File;", "equals", "", "other", "hashCode", "", "toString", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SuppressLint({"MissingMoshiCodegenAnnotation"})
    /* loaded from: classes20.dex */
    public static final /* data */ class File<T extends AssetDetail> {
        private final T details;
        private final String fileName;
        private final MediaType mediaType;
        private final HttpUrl url;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ File copy$default(File file, MediaType mediaType, String str, HttpUrl httpUrl, AssetDetail assetDetail, int i, Object obj) {
            if ((i & 1) != 0) {
                mediaType = file.mediaType;
            }
            if ((i & 2) != 0) {
                str = file.fileName;
            }
            if ((i & 4) != 0) {
                httpUrl = file.url;
            }
            if ((i & 8) != 0) {
                assetDetail = file.details;
            }
            return file.copy(mediaType, str, httpUrl, assetDetail);
        }

        /* renamed from: component1, reason: from getter */
        public final MediaType getMediaType() {
            return this.mediaType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        /* renamed from: component3, reason: from getter */
        public final HttpUrl getUrl() {
            return this.url;
        }

        public final T component4() {
            return this.details;
        }

        public final File<T> copy(MediaType mediaType, String fileName, HttpUrl url, T details) {
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(details, "details");
            return new File<>(mediaType, fileName, url, details);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof File)) {
                return false;
            }
            File file = (File) other;
            return Intrinsics.areEqual(this.mediaType, file.mediaType) && Intrinsics.areEqual(this.fileName, file.fileName) && Intrinsics.areEqual(this.url, file.url) && Intrinsics.areEqual(this.details, file.details);
        }

        public int hashCode() {
            return (((((this.mediaType.hashCode() * 31) + this.fileName.hashCode()) * 31) + this.url.hashCode()) * 31) + this.details.hashCode();
        }

        public String toString() {
            return "File(mediaType=" + this.mediaType + ", fileName=" + this.fileName + ", url=" + this.url + ", details=" + this.details + ")";
        }

        public File(MediaType mediaType, String fileName, HttpUrl url, T details) {
            Intrinsics.checkNotNullParameter(mediaType, "mediaType");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(details, "details");
            this.mediaType = mediaType;
            this.fileName = fileName;
            this.url = url;
            this.details = details;
        }

        public final MediaType getMediaType() {
            return this.mediaType;
        }

        public final String getFileName() {
            return this.fileName;
        }

        public final HttpUrl getUrl() {
            return this.url;
        }

        public final T getDetails() {
            return this.details;
        }

        public final String hashKey() throws NoSuchAlgorithmException {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            String mediaType = this.mediaType.getMediaType();
            Charset charset = Charsets.UTF_8;
            byte[] bytes = mediaType.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            messageDigest.update(bytes);
            byte[] bytes2 = this.fileName.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
            messageDigest.update(bytes2);
            byte[] bytes3 = this.url.getUrl().getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes3, "getBytes(...)");
            messageDigest.update(bytes3);
            String strEncodeToString = Base64.encodeToString(messageDigest.digest(), 9);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(...)");
            return strEncodeToString;
        }
    }
}
