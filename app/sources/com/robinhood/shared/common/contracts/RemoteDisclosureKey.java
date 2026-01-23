package com.robinhood.shared.common.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.navigation.NavigationType;
import com.robinhood.android.navigation.keys.IntentKey;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: RemoteDisclosureKey.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u00012Be\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003Jk\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\bHÆ\u0001J\u0006\u0010&\u001a\u00020'J\u0013\u0010(\u001a\u00020\b2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020'HÖ\u0001J\t\u0010,\u001a\u00020\u0004HÖ\u0001J\u0016\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020'R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016¨\u00063"}, m3636d2 = {"Lcom/robinhood/shared/common/contracts/RemoteDisclosureKey;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "Landroid/os/Parcelable;", "contentfulId", "", "contentfulParams", "", "showButton", "", "useCloseIcon", "tint", "Lcom/robinhood/shared/common/contracts/RemoteDisclosureKey$TintOption;", "toolbarTitle", "ctaTitle", "shouldShowSupplementaryText", "<init>", "(Ljava/lang/String;Ljava/util/Map;ZZLcom/robinhood/shared/common/contracts/RemoteDisclosureKey$TintOption;Ljava/lang/String;Ljava/lang/String;Z)V", "getContentfulId", "()Ljava/lang/String;", "getContentfulParams", "()Ljava/util/Map;", "getShowButton", "()Z", "getUseCloseIcon", "getTint", "()Lcom/robinhood/shared/common/contracts/RemoteDisclosureKey$TintOption;", "getToolbarTitle", "getCtaTitle", "getShouldShowSupplementaryText", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "TintOption", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class RemoteDisclosureKey implements IntentKey, Parcelable {
    public static final Parcelable.Creator<RemoteDisclosureKey> CREATOR = new Creator();
    private final String contentfulId;
    private final Map<String, String> contentfulParams;
    private final String ctaTitle;
    private final boolean shouldShowSupplementaryText;
    private final boolean showButton;
    private final TintOption tint;
    private final String toolbarTitle;
    private final boolean useCloseIcon;

    /* compiled from: RemoteDisclosureKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<RemoteDisclosureKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RemoteDisclosureKey createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            boolean z2 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            return new RemoteDisclosureKey(string2, linkedHashMap, z2, parcel.readInt() != 0 ? z : false, TintOption.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? z : false);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RemoteDisclosureKey[] newArray(int i) {
            return new RemoteDisclosureKey[i];
        }
    }

    public static /* synthetic */ RemoteDisclosureKey copy$default(RemoteDisclosureKey remoteDisclosureKey, String str, Map map, boolean z, boolean z2, TintOption tintOption, String str2, String str3, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = remoteDisclosureKey.contentfulId;
        }
        if ((i & 2) != 0) {
            map = remoteDisclosureKey.contentfulParams;
        }
        if ((i & 4) != 0) {
            z = remoteDisclosureKey.showButton;
        }
        if ((i & 8) != 0) {
            z2 = remoteDisclosureKey.useCloseIcon;
        }
        if ((i & 16) != 0) {
            tintOption = remoteDisclosureKey.tint;
        }
        if ((i & 32) != 0) {
            str2 = remoteDisclosureKey.toolbarTitle;
        }
        if ((i & 64) != 0) {
            str3 = remoteDisclosureKey.ctaTitle;
        }
        if ((i & 128) != 0) {
            z3 = remoteDisclosureKey.shouldShowSupplementaryText;
        }
        String str4 = str3;
        boolean z4 = z3;
        TintOption tintOption2 = tintOption;
        String str5 = str2;
        return remoteDisclosureKey.copy(str, map, z, z2, tintOption2, str5, str4, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContentfulId() {
        return this.contentfulId;
    }

    public final Map<String, String> component2() {
        return this.contentfulParams;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowButton() {
        return this.showButton;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getUseCloseIcon() {
        return this.useCloseIcon;
    }

    /* renamed from: component5, reason: from getter */
    public final TintOption getTint() {
        return this.tint;
    }

    /* renamed from: component6, reason: from getter */
    public final String getToolbarTitle() {
        return this.toolbarTitle;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShouldShowSupplementaryText() {
        return this.shouldShowSupplementaryText;
    }

    public final RemoteDisclosureKey copy(String contentfulId, Map<String, String> contentfulParams, boolean showButton, boolean useCloseIcon, TintOption tint, String toolbarTitle, String ctaTitle, boolean shouldShowSupplementaryText) {
        Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
        Intrinsics.checkNotNullParameter(tint, "tint");
        return new RemoteDisclosureKey(contentfulId, contentfulParams, showButton, useCloseIcon, tint, toolbarTitle, ctaTitle, shouldShowSupplementaryText);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RemoteDisclosureKey)) {
            return false;
        }
        RemoteDisclosureKey remoteDisclosureKey = (RemoteDisclosureKey) other;
        return Intrinsics.areEqual(this.contentfulId, remoteDisclosureKey.contentfulId) && Intrinsics.areEqual(this.contentfulParams, remoteDisclosureKey.contentfulParams) && this.showButton == remoteDisclosureKey.showButton && this.useCloseIcon == remoteDisclosureKey.useCloseIcon && this.tint == remoteDisclosureKey.tint && Intrinsics.areEqual(this.toolbarTitle, remoteDisclosureKey.toolbarTitle) && Intrinsics.areEqual(this.ctaTitle, remoteDisclosureKey.ctaTitle) && this.shouldShowSupplementaryText == remoteDisclosureKey.shouldShowSupplementaryText;
    }

    public int hashCode() {
        int iHashCode = this.contentfulId.hashCode() * 31;
        Map<String, String> map = this.contentfulParams;
        int iHashCode2 = (((((((iHashCode + (map == null ? 0 : map.hashCode())) * 31) + Boolean.hashCode(this.showButton)) * 31) + Boolean.hashCode(this.useCloseIcon)) * 31) + this.tint.hashCode()) * 31;
        String str = this.toolbarTitle;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ctaTitle;
        return ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.shouldShowSupplementaryText);
    }

    public String toString() {
        return "RemoteDisclosureKey(contentfulId=" + this.contentfulId + ", contentfulParams=" + this.contentfulParams + ", showButton=" + this.showButton + ", useCloseIcon=" + this.useCloseIcon + ", tint=" + this.tint + ", toolbarTitle=" + this.toolbarTitle + ", ctaTitle=" + this.ctaTitle + ", shouldShowSupplementaryText=" + this.shouldShowSupplementaryText + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.contentfulId);
        Map<String, String> map = this.contentfulParams;
        if (map == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                dest.writeString(entry.getKey());
                dest.writeString(entry.getValue());
            }
        }
        dest.writeInt(this.showButton ? 1 : 0);
        dest.writeInt(this.useCloseIcon ? 1 : 0);
        dest.writeString(this.tint.name());
        dest.writeString(this.toolbarTitle);
        dest.writeString(this.ctaTitle);
        dest.writeInt(this.shouldShowSupplementaryText ? 1 : 0);
    }

    @Override // com.robinhood.android.navigation.keys.IntentKey
    public NavigationType getNavigationType() {
        return IntentKey.DefaultImpls.getNavigationType(this);
    }

    public RemoteDisclosureKey(String contentfulId, Map<String, String> map, boolean z, boolean z2, TintOption tint, String str, String str2, boolean z3) {
        Intrinsics.checkNotNullParameter(contentfulId, "contentfulId");
        Intrinsics.checkNotNullParameter(tint, "tint");
        this.contentfulId = contentfulId;
        this.contentfulParams = map;
        this.showButton = z;
        this.useCloseIcon = z2;
        this.tint = tint;
        this.toolbarTitle = str;
        this.ctaTitle = str2;
        this.shouldShowSupplementaryText = z3;
    }

    public final String getContentfulId() {
        return this.contentfulId;
    }

    public final Map<String, String> getContentfulParams() {
        return this.contentfulParams;
    }

    public final boolean getShowButton() {
        return this.showButton;
    }

    public final boolean getUseCloseIcon() {
        return this.useCloseIcon;
    }

    public /* synthetic */ RemoteDisclosureKey(String str, Map map, boolean z, boolean z2, TintOption tintOption, String str2, String str3, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : map, z, (i & 8) != 0 ? true : z2, (i & 16) != 0 ? TintOption.DEFAULT : tintOption, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3, (i & 128) != 0 ? false : z3);
    }

    public final TintOption getTint() {
        return this.tint;
    }

    public final String getToolbarTitle() {
        return this.toolbarTitle;
    }

    public final String getCtaTitle() {
        return this.ctaTitle;
    }

    public final boolean getShouldShowSupplementaryText() {
        return this.shouldShowSupplementaryText;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RemoteDisclosureKey.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/common/contracts/RemoteDisclosureKey$TintOption;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DEFAULT", "ACHROMATIC", "Companion", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TintOption {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TintOption[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final String value;
        public static final TintOption DEFAULT = new TintOption("DEFAULT", 0, AnalyticsStrings.BUTTON_ACCESSIBLE_COLORS_DEFAULT);
        public static final TintOption ACHROMATIC = new TintOption("ACHROMATIC", 1, "achromatic");

        private static final /* synthetic */ TintOption[] $values() {
            return new TintOption[]{DEFAULT, ACHROMATIC};
        }

        public static EnumEntries<TintOption> getEntries() {
            return $ENTRIES;
        }

        private TintOption(String str, int i, String str2) {
            this.value = str2;
        }

        public final String getValue() {
            return this.value;
        }

        static {
            TintOption[] tintOptionArr$values = $values();
            $VALUES = tintOptionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(tintOptionArr$values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: RemoteDisclosureKey.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/common/contracts/RemoteDisclosureKey$TintOption$Companion;", "", "<init>", "()V", "fromValue", "Lcom/robinhood/shared/common/contracts/RemoteDisclosureKey$TintOption;", "value", "", "contracts_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final TintOption fromValue(String value) {
                TintOption next;
                Iterator<TintOption> it = TintOption.getEntries().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (StringsKt.equals(next.getValue(), value, true)) {
                        break;
                    }
                }
                TintOption tintOption = next;
                return tintOption == null ? TintOption.DEFAULT : tintOption;
            }
        }

        public static TintOption valueOf(String str) {
            return (TintOption) Enum.valueOf(TintOption.class, str);
        }

        public static TintOption[] values() {
            return (TintOption[]) $VALUES.clone();
        }
    }
}
