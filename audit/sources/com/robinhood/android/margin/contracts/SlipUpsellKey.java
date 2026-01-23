package com.robinhood.android.margin.contracts;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SlipUpsellKey.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u001eJ\u0016\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u001eR\u001d\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/margin/contracts/SlipUpsellKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "Landroid/os/Parcelable;", "content", "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "ctaContent", "accountNumber", "", "backgroundColor", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;)V", "getContent", "()Ljava/util/List;", "getCtaContent", "getAccountNumber", "()Ljava/lang/String;", "getBackgroundColor", "()Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "hasContents", "", "navigate", "", "context", "Landroid/content/Context;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "describeContents", "", "writeToParcel", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class SlipUpsellKey implements FragmentKey, Parcelable {
    public static final Parcelable.Creator<SlipUpsellKey> CREATOR = new Creator();
    private final String accountNumber;
    private final ThemedColor backgroundColor;
    private final List<UIComponent<GenericAction>> content;
    private final List<UIComponent<GenericAction>> ctaContent;

    /* compiled from: SlipUpsellKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes8.dex */
    public static final class Creator implements Parcelable.Creator<SlipUpsellKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SlipUpsellKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(SlipUpsellKey.class.getClassLoader()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(parcel.readParcelable(SlipUpsellKey.class.getClassLoader()));
            }
            return new SlipUpsellKey(arrayList, arrayList2, parcel.readString(), (ThemedColor) parcel.readParcelable(SlipUpsellKey.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SlipUpsellKey[] newArray(int i) {
            return new SlipUpsellKey[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<UIComponent<GenericAction>> list = this.content;
        dest.writeInt(list.size());
        Iterator<UIComponent<GenericAction>> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        List<UIComponent<GenericAction>> list2 = this.ctaContent;
        dest.writeInt(list2.size());
        Iterator<UIComponent<GenericAction>> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
        dest.writeString(this.accountNumber);
        dest.writeParcelable(this.backgroundColor, flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SlipUpsellKey(List<? extends UIComponent<? extends GenericAction>> content, List<? extends UIComponent<? extends GenericAction>> ctaContent, String str, ThemedColor backgroundColor) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(ctaContent, "ctaContent");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.content = content;
        this.ctaContent = ctaContent;
        this.accountNumber = str;
        this.backgroundColor = backgroundColor;
    }

    public final List<UIComponent<GenericAction>> getContent() {
        return this.content;
    }

    public final List<UIComponent<GenericAction>> getCtaContent() {
        return this.ctaContent;
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final ThemedColor getBackgroundColor() {
        return this.backgroundColor;
    }

    public final boolean hasContents() {
        return (this.content.isEmpty() && this.ctaContent.isEmpty()) ? false : true;
    }

    public final void navigate(Context context, Navigator navigator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, this, false, false, false, false, null, false, null, null, 1012, null);
    }
}
