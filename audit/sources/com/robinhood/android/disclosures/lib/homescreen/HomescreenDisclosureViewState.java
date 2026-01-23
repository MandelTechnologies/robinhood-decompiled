package com.robinhood.android.disclosures.lib.homescreen;

import com.plaid.internal.EnumC7081g;
import com.robinhood.iso.countrycode.CountryCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomescreenDisclosureViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u0010\u0010%\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0017J\u000b\u0010&\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003J^\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\tHÖ\u0001J\t\u0010-\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0019\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013R\u0011\u0010\u001f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b \u0010\u0013¨\u0006."}, m3636d2 = {"Lcom/robinhood/android/disclosures/lib/homescreen/HomescreenDisclosureViewState;", "", "optionsDisclosureType", "Lcom/robinhood/android/disclosures/lib/homescreen/OptionsDisclosureType;", "showFuturesDisclosure", "", "disclosureContentfulId", "", "disclosureVersion", "", "lastSeenDisclosureVersion", "managedAccountDisclosure", "userLocality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "<init>", "(Lcom/robinhood/android/disclosures/lib/homescreen/OptionsDisclosureType;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/robinhood/iso/countrycode/CountryCode$Supported;)V", "getOptionsDisclosureType", "()Lcom/robinhood/android/disclosures/lib/homescreen/OptionsDisclosureType;", "getShowFuturesDisclosure", "()Z", "getDisclosureContentfulId", "()Ljava/lang/String;", "getDisclosureVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLastSeenDisclosureVersion", "getManagedAccountDisclosure", "getUserLocality", "()Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "showNewFeaturesAvailable", "getShowNewFeaturesAvailable", "shouldShowAnything", "getShouldShowAnything", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/robinhood/android/disclosures/lib/homescreen/OptionsDisclosureType;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Lcom/robinhood/iso/countrycode/CountryCode$Supported;)Lcom/robinhood/android/disclosures/lib/homescreen/HomescreenDisclosureViewState;", "equals", "other", "hashCode", "toString", "lib-disclosures_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final /* data */ class HomescreenDisclosureViewState {
    public static final int $stable = 8;
    private final String disclosureContentfulId;
    private final Integer disclosureVersion;
    private final Integer lastSeenDisclosureVersion;
    private final String managedAccountDisclosure;
    private final OptionsDisclosure2 optionsDisclosureType;
    private final boolean showFuturesDisclosure;
    private final CountryCode.Supported userLocality;

    public HomescreenDisclosureViewState() {
        this(null, false, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ HomescreenDisclosureViewState copy$default(HomescreenDisclosureViewState homescreenDisclosureViewState, OptionsDisclosure2 optionsDisclosure2, boolean z, String str, Integer num, Integer num2, String str2, CountryCode.Supported supported, int i, Object obj) {
        if ((i & 1) != 0) {
            optionsDisclosure2 = homescreenDisclosureViewState.optionsDisclosureType;
        }
        if ((i & 2) != 0) {
            z = homescreenDisclosureViewState.showFuturesDisclosure;
        }
        if ((i & 4) != 0) {
            str = homescreenDisclosureViewState.disclosureContentfulId;
        }
        if ((i & 8) != 0) {
            num = homescreenDisclosureViewState.disclosureVersion;
        }
        if ((i & 16) != 0) {
            num2 = homescreenDisclosureViewState.lastSeenDisclosureVersion;
        }
        if ((i & 32) != 0) {
            str2 = homescreenDisclosureViewState.managedAccountDisclosure;
        }
        if ((i & 64) != 0) {
            supported = homescreenDisclosureViewState.userLocality;
        }
        String str3 = str2;
        CountryCode.Supported supported2 = supported;
        Integer num3 = num2;
        String str4 = str;
        return homescreenDisclosureViewState.copy(optionsDisclosure2, z, str4, num, num3, str3, supported2);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionsDisclosure2 getOptionsDisclosureType() {
        return this.optionsDisclosureType;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowFuturesDisclosure() {
        return this.showFuturesDisclosure;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisclosureContentfulId() {
        return this.disclosureContentfulId;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getDisclosureVersion() {
        return this.disclosureVersion;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getLastSeenDisclosureVersion() {
        return this.lastSeenDisclosureVersion;
    }

    /* renamed from: component6, reason: from getter */
    public final String getManagedAccountDisclosure() {
        return this.managedAccountDisclosure;
    }

    /* renamed from: component7, reason: from getter */
    public final CountryCode.Supported getUserLocality() {
        return this.userLocality;
    }

    public final HomescreenDisclosureViewState copy(OptionsDisclosure2 optionsDisclosureType, boolean showFuturesDisclosure, String disclosureContentfulId, Integer disclosureVersion, Integer lastSeenDisclosureVersion, String managedAccountDisclosure, CountryCode.Supported userLocality) {
        Intrinsics.checkNotNullParameter(optionsDisclosureType, "optionsDisclosureType");
        return new HomescreenDisclosureViewState(optionsDisclosureType, showFuturesDisclosure, disclosureContentfulId, disclosureVersion, lastSeenDisclosureVersion, managedAccountDisclosure, userLocality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HomescreenDisclosureViewState)) {
            return false;
        }
        HomescreenDisclosureViewState homescreenDisclosureViewState = (HomescreenDisclosureViewState) other;
        return this.optionsDisclosureType == homescreenDisclosureViewState.optionsDisclosureType && this.showFuturesDisclosure == homescreenDisclosureViewState.showFuturesDisclosure && Intrinsics.areEqual(this.disclosureContentfulId, homescreenDisclosureViewState.disclosureContentfulId) && Intrinsics.areEqual(this.disclosureVersion, homescreenDisclosureViewState.disclosureVersion) && Intrinsics.areEqual(this.lastSeenDisclosureVersion, homescreenDisclosureViewState.lastSeenDisclosureVersion) && Intrinsics.areEqual(this.managedAccountDisclosure, homescreenDisclosureViewState.managedAccountDisclosure) && Intrinsics.areEqual(this.userLocality, homescreenDisclosureViewState.userLocality);
    }

    public int hashCode() {
        int iHashCode = ((this.optionsDisclosureType.hashCode() * 31) + Boolean.hashCode(this.showFuturesDisclosure)) * 31;
        String str = this.disclosureContentfulId;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.disclosureVersion;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.lastSeenDisclosureVersion;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.managedAccountDisclosure;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        CountryCode.Supported supported = this.userLocality;
        return iHashCode5 + (supported != null ? supported.hashCode() : 0);
    }

    public String toString() {
        return "HomescreenDisclosureViewState(optionsDisclosureType=" + this.optionsDisclosureType + ", showFuturesDisclosure=" + this.showFuturesDisclosure + ", disclosureContentfulId=" + this.disclosureContentfulId + ", disclosureVersion=" + this.disclosureVersion + ", lastSeenDisclosureVersion=" + this.lastSeenDisclosureVersion + ", managedAccountDisclosure=" + this.managedAccountDisclosure + ", userLocality=" + this.userLocality + ")";
    }

    public HomescreenDisclosureViewState(OptionsDisclosure2 optionsDisclosureType, boolean z, String str, Integer num, Integer num2, String str2, CountryCode.Supported supported) {
        Intrinsics.checkNotNullParameter(optionsDisclosureType, "optionsDisclosureType");
        this.optionsDisclosureType = optionsDisclosureType;
        this.showFuturesDisclosure = z;
        this.disclosureContentfulId = str;
        this.disclosureVersion = num;
        this.lastSeenDisclosureVersion = num2;
        this.managedAccountDisclosure = str2;
        this.userLocality = supported;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ HomescreenDisclosureViewState(com.robinhood.android.disclosures.lib.homescreen.OptionsDisclosure2 r2, boolean r3, java.lang.String r4, java.lang.Integer r5, java.lang.Integer r6, java.lang.String r7, com.robinhood.iso.countrycode.CountryCode.Supported r8, int r9, kotlin.jvm.internal.DefaultConstructorMarker r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            com.robinhood.android.disclosures.lib.homescreen.OptionsDisclosureType r2 = com.robinhood.android.disclosures.lib.homescreen.OptionsDisclosure2.NONE
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lb
            r3 = 0
        Lb:
            r10 = r9 & 4
            r0 = 0
            if (r10 == 0) goto L11
            r4 = r0
        L11:
            r10 = r9 & 8
            if (r10 == 0) goto L16
            r5 = r0
        L16:
            r10 = r9 & 16
            if (r10 == 0) goto L1b
            r6 = r0
        L1b:
            r10 = r9 & 32
            if (r10 == 0) goto L20
            r7 = r0
        L20:
            r9 = r9 & 64
            if (r9 == 0) goto L2d
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L35
        L2d:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L35:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.disclosures.lib.homescreen.HomescreenDisclosureViewState.<init>(com.robinhood.android.disclosures.lib.homescreen.OptionsDisclosureType, boolean, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, com.robinhood.iso.countrycode.CountryCode$Supported, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final OptionsDisclosure2 getOptionsDisclosureType() {
        return this.optionsDisclosureType;
    }

    public final boolean getShowFuturesDisclosure() {
        return this.showFuturesDisclosure;
    }

    public final String getDisclosureContentfulId() {
        return this.disclosureContentfulId;
    }

    public final Integer getDisclosureVersion() {
        return this.disclosureVersion;
    }

    public final Integer getLastSeenDisclosureVersion() {
        return this.lastSeenDisclosureVersion;
    }

    public final String getManagedAccountDisclosure() {
        return this.managedAccountDisclosure;
    }

    public final CountryCode.Supported getUserLocality() {
        return this.userLocality;
    }

    public final boolean getShowNewFeaturesAvailable() {
        Integer num;
        Integer num2 = this.disclosureVersion;
        return (num2 == null || (num = this.lastSeenDisclosureVersion) == null || Intrinsics.areEqual(num2, num)) ? false : true;
    }

    public final boolean getShouldShowAnything() {
        return this.optionsDisclosureType != OptionsDisclosure2.NONE || this.disclosureContentfulId != null || this.showFuturesDisclosure || getShowNewFeaturesAvailable();
    }
}
