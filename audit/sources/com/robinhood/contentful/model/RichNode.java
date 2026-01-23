package com.robinhood.contentful.model;

import android.net.Uri;
import android.os.Parcelable;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RichText.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/contentful/model/RichNode;", "Landroid/os/Parcelable;", "<init>", "()V", "Data", "Lcom/robinhood/contentful/model/BlockNode;", "Lcom/robinhood/contentful/model/Text;", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public abstract class RichNode implements Parcelable {
    public /* synthetic */ RichNode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RichNode() {
    }

    /* compiled from: RichText.kt */
    @JsonClass(generateAdapter = true)
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/contentful/model/RichNode$Data;", "", "target", "Lcom/robinhood/contentful/model/ResourceLink;", "uri", "Landroid/net/Uri;", "<init>", "(Lcom/robinhood/contentful/model/ResourceLink;Landroid/net/Uri;)V", "getTarget", "()Lcom/robinhood/contentful/model/ResourceLink;", "getUri", "()Landroid/net/Uri;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-contentful-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final /* data */ class Data {
        private final ResourceLink<?> target;
        private final Uri uri;

        /* JADX WARN: Multi-variable type inference failed */
        public Data() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Data copy$default(Data data, ResourceLink contentResource8, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                contentResource8 = data.target;
            }
            if ((i & 2) != 0) {
                uri = data.uri;
            }
            return data.copy(contentResource8, uri);
        }

        public final ResourceLink<?> component1() {
            return this.target;
        }

        /* renamed from: component2, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        public final Data copy(ResourceLink<?> target, Uri uri) {
            return new Data(target, uri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.areEqual(this.target, data.target) && Intrinsics.areEqual(this.uri, data.uri);
        }

        public int hashCode() {
            ResourceLink<?> contentResource8 = this.target;
            int iHashCode = (contentResource8 == null ? 0 : contentResource8.hashCode()) * 31;
            Uri uri = this.uri;
            return iHashCode + (uri != null ? uri.hashCode() : 0);
        }

        public String toString() {
            return "Data(target=" + this.target + ", uri=" + this.uri + ")";
        }

        public Data(ResourceLink<?> contentResource8, Uri uri) {
            this.target = contentResource8;
            this.uri = uri;
        }

        public /* synthetic */ Data(ResourceLink contentResource8, Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : contentResource8, (i & 2) != 0 ? null : uri);
        }

        public final ResourceLink<?> getTarget() {
            return this.target;
        }

        public final Uri getUri() {
            return this.uri;
        }
    }
}
