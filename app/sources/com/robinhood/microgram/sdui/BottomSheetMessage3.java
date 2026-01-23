package com.robinhood.microgram.sdui;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.car.result.CarResultComposable2;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.squareup.moshi.JsonClass;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BottomSheetMessage.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001Bu\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010#\u001a\u00020\tJ\u0016\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\tR\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006)"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/BottomSheetPayload;", "Landroid/os/Parcelable;", CarResultComposable2.BODY, "", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/microgram/sdui/MicrogramAction;", "background", "Lcom/robinhood/microgram/sdui/Background;", "cornerRadius", "", Footer.f10637type, "name", "", "androidCanDismissWithBackPress", "", "canPassivelyDismiss", "theme", "Lcom/robinhood/microgram/sdui/Theme;", "<init>", "(Ljava/util/List;Lcom/robinhood/microgram/sdui/Background;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;ZZLcom/robinhood/microgram/sdui/Theme;)V", "getBody", "()Ljava/util/List;", "getBackground", "()Lcom/robinhood/microgram/sdui/Background;", "getCornerRadius", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFooter", "getName", "()Ljava/lang/String;", "getAndroidCanDismissWithBackPress", "()Z", "getCanPassivelyDismiss", "getTheme", "()Lcom/robinhood/microgram/sdui/Theme;", "describeContents", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.microgram.sdui.BottomSheetPayload, reason: use source file name */
/* loaded from: classes13.dex */
public final class BottomSheetMessage3 implements Parcelable {
    public static final Parcelable.Creator<BottomSheetMessage3> CREATOR = new Creator();
    private final boolean androidCanDismissWithBackPress;
    private final Background background;
    private final List<UIComponent<MicrogramAction>> body;
    private final boolean canPassivelyDismiss;
    private final Integer cornerRadius;
    private final List<UIComponent<MicrogramAction>> footer;
    private final String name;
    private final StandardScreen5 theme;

    /* compiled from: BottomSheetMessage.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.microgram.sdui.BottomSheetPayload$Creator */
    public static final class Creator implements Parcelable.Creator<BottomSheetMessage3> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BottomSheetMessage3 createFromParcel(Parcel parcel) {
            StandardScreen5 standardScreen5;
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(BottomSheetMessage3.class.getClassLoader()));
            }
            Background background = (Background) parcel.readParcelable(BottomSheetMessage3.class.getClassLoader());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                arrayList2.add(parcel.readParcelable(BottomSheetMessage3.class.getClassLoader()));
            }
            String string2 = parcel.readString();
            if (parcel.readInt() != 0) {
                standardScreen5 = null;
                z = true;
            } else {
                standardScreen5 = null;
                z = false;
            }
            return new BottomSheetMessage3(arrayList, background, numValueOf, arrayList2, string2, z, parcel.readInt() != 0, parcel.readInt() == 0 ? standardScreen5 : StandardScreen5.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BottomSheetMessage3[] newArray(int i) {
            return new BottomSheetMessage3[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List<UIComponent<MicrogramAction>> list = this.body;
        dest.writeInt(list.size());
        Iterator<UIComponent<MicrogramAction>> it = list.iterator();
        while (it.hasNext()) {
            dest.writeParcelable(it.next(), flags);
        }
        dest.writeParcelable(this.background, flags);
        Integer num = this.cornerRadius;
        if (num == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(num.intValue());
        }
        List<UIComponent<MicrogramAction>> list2 = this.footer;
        dest.writeInt(list2.size());
        Iterator<UIComponent<MicrogramAction>> it2 = list2.iterator();
        while (it2.hasNext()) {
            dest.writeParcelable(it2.next(), flags);
        }
        dest.writeString(this.name);
        dest.writeInt(this.androidCanDismissWithBackPress ? 1 : 0);
        dest.writeInt(this.canPassivelyDismiss ? 1 : 0);
        StandardScreen5 standardScreen5 = this.theme;
        if (standardScreen5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(standardScreen5.name());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetMessage3(List<? extends UIComponent<MicrogramAction>> body, Background background, Integer num, List<? extends UIComponent<MicrogramAction>> footer, String str, boolean z, boolean z2, StandardScreen5 standardScreen5) {
        Intrinsics.checkNotNullParameter(body, "body");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.body = body;
        this.background = background;
        this.cornerRadius = num;
        this.footer = footer;
        this.name = str;
        this.androidCanDismissWithBackPress = z;
        this.canPassivelyDismiss = z2;
        this.theme = standardScreen5;
    }

    public final List<UIComponent<MicrogramAction>> getBody() {
        return this.body;
    }

    public final Background getBackground() {
        return this.background;
    }

    public final Integer getCornerRadius() {
        return this.cornerRadius;
    }

    public /* synthetic */ BottomSheetMessage3(List list, Background background, Integer num, List list2, String str, boolean z, boolean z2, StandardScreen5 standardScreen5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : background, (i & 4) != 0 ? null : num, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, (i & 16) != 0 ? null : str, (i & 32) != 0 ? true : z, (i & 64) != 0 ? true : z2, (i & 128) != 0 ? null : standardScreen5);
    }

    public final List<UIComponent<MicrogramAction>> getFooter() {
        return this.footer;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getAndroidCanDismissWithBackPress() {
        return this.androidCanDismissWithBackPress;
    }

    public final boolean getCanPassivelyDismiss() {
        return this.canPassivelyDismiss;
    }

    public final StandardScreen5 getTheme() {
        return this.theme;
    }
}
