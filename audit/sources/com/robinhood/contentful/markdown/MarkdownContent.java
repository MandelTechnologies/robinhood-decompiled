package com.robinhood.contentful.markdown;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.util.text.MessageFormatting;
import com.robinhood.utils.extensions.ResourceTypes;
import com.squareup.moshi.JsonClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarkdownContent.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\b\u001a\u00020\u00002\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\nJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\u0013\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/contentful/markdown/MarkdownContent;", "Landroid/os/Parcelable;", ResourceTypes.RAW, "", "<init>", "(Ljava/lang/String;)V", "getRaw", "()Ljava/lang/String;", "formatWith", "arguments", "", "", "component1", "copy", "describeContents", "", "equals", "", "other", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class MarkdownContent implements Parcelable {
    private final String raw;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<MarkdownContent> CREATOR = new Creator();
    private static final MarkdownContent EMPTY = new MarkdownContent("");

    /* compiled from: MarkdownContent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final class Creator implements Parcelable.Creator<MarkdownContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarkdownContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MarkdownContent(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarkdownContent[] newArray(int i) {
            return new MarkdownContent[i];
        }
    }

    public static /* synthetic */ MarkdownContent copy$default(MarkdownContent markdownContent, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = markdownContent.raw;
        }
        return markdownContent.copy(str);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRaw() {
        return this.raw;
    }

    public final MarkdownContent copy(String raw) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        return new MarkdownContent(raw);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MarkdownContent) && Intrinsics.areEqual(this.raw, ((MarkdownContent) other).raw);
    }

    public int hashCode() {
        return this.raw.hashCode();
    }

    public String toString() {
        return "MarkdownContent(raw=" + this.raw + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.raw);
    }

    public MarkdownContent(String raw) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        this.raw = raw;
    }

    public final String getRaw() {
        return this.raw;
    }

    public final MarkdownContent formatWith(Map<String, ? extends Object> arguments) {
        return new MarkdownContent(MessageFormatting.formatMessageWith(this.raw, arguments));
    }

    /* compiled from: MarkdownContent.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/contentful/markdown/MarkdownContent$Companion;", "", "<init>", "()V", "EMPTY", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "getEMPTY", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "lib-contentful_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes15.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MarkdownContent getEMPTY() {
            return MarkdownContent.EMPTY;
        }
    }
}
