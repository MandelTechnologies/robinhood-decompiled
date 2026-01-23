package com.robinhood.android.libdesignsystem.serverui.experimental.page;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.StandardPageTemplate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GenericActionStandardPageFragment.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003J\u0019\u0010\u000b\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001J\u0006\u0010\f\u001a\u00020\rJ\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\rHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/libdesignsystem/serverui/experimental/page/GenericStandardPageKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "content", "Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;)V", "getContent", "()Lcom/robinhood/models/serverdriven/experimental/api/StandardPageTemplate;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-sdui_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GenericStandardPageKey implements FragmentKey, Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<GenericStandardPageKey> CREATOR = new Creator();
    private final StandardPageTemplate<GenericAction> content;

    /* compiled from: GenericActionStandardPageFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<GenericStandardPageKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GenericStandardPageKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GenericStandardPageKey((StandardPageTemplate) parcel.readParcelable(GenericStandardPageKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GenericStandardPageKey[] newArray(int i) {
            return new GenericStandardPageKey[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenericStandardPageKey copy$default(GenericStandardPageKey genericStandardPageKey, StandardPageTemplate standardPageTemplate, int i, Object obj) {
        if ((i & 1) != 0) {
            standardPageTemplate = genericStandardPageKey.content;
        }
        return genericStandardPageKey.copy(standardPageTemplate);
    }

    public final StandardPageTemplate<GenericAction> component1() {
        return this.content;
    }

    public final GenericStandardPageKey copy(StandardPageTemplate<? extends GenericAction> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new GenericStandardPageKey(content);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GenericStandardPageKey) && Intrinsics.areEqual(this.content, ((GenericStandardPageKey) other).content);
    }

    public int hashCode() {
        return this.content.hashCode();
    }

    public String toString() {
        return "GenericStandardPageKey(content=" + this.content + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.content, flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GenericStandardPageKey(StandardPageTemplate<? extends GenericAction> content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
    }

    public final StandardPageTemplate<GenericAction> getContent() {
        return this.content;
    }
}
