package com.robinhood.android.margin.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.contentful.markdown.MarkdownContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiDayTradeDisclosure.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/margin/model/UiDayTradeDisclosure;", "Landroid/os/Parcelable;", "buttonText", "", "disclosureMarkdown", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "<init>", "(Ljava/lang/String;Lcom/robinhood/contentful/markdown/MarkdownContent;)V", "getButtonText", "()Ljava/lang/String;", "getDisclosureMarkdown", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class UiDayTradeDisclosure implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UiDayTradeDisclosure> CREATOR = new Creator();
    private final String buttonText;
    private final MarkdownContent disclosureMarkdown;

    /* compiled from: UiDayTradeDisclosure.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UiDayTradeDisclosure> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiDayTradeDisclosure createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UiDayTradeDisclosure(parcel.readString(), (MarkdownContent) parcel.readParcelable(UiDayTradeDisclosure.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiDayTradeDisclosure[] newArray(int i) {
            return new UiDayTradeDisclosure[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.buttonText);
        dest.writeParcelable(this.disclosureMarkdown, flags);
    }

    public UiDayTradeDisclosure(String str, MarkdownContent disclosureMarkdown) {
        Intrinsics.checkNotNullParameter(disclosureMarkdown, "disclosureMarkdown");
        this.buttonText = str;
        this.disclosureMarkdown = disclosureMarkdown;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final MarkdownContent getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }
}
