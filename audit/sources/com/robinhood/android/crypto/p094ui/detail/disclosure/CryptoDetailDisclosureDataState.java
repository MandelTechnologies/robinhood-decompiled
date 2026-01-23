package com.robinhood.android.crypto.p094ui.detail.disclosure;

import com.robinhood.android.crypto.C12757R;
import com.robinhood.shared.app.type.AppType;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.resource.StringResource;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoDetailDisclosureDataState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÂ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÂ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÂ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u00020\u00078G¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\fR\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\t\u001a\u00020\u00078G¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\fR\u0011\u0010\r\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/disclosure/CryptoDetailDisclosureDataState;", "", "appType", "Lcom/robinhood/shared/app/type/AppType;", "disclosureContent", "Lcom/robinhood/utils/resource/StringResource;", "isSherwoodNewsCdpInfoBannerEnabled", "", "ukDisclosureContent", "isBitstampUkUpsellRegionGateEnabled", "<init>", "(Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/utils/resource/StringResource;ZLcom/robinhood/utils/resource/StringResource;Z)V", "()Z", "disclosureResource", "getDisclosureResource", "()Lcom/robinhood/utils/resource/StringResource;", "disclosureLink", "Lcom/robinhood/android/crypto/ui/detail/disclosure/DisclosureLink;", "getDisclosureLink", "()Lcom/robinhood/android/crypto/ui/detail/disclosure/DisclosureLink;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoDetailDisclosureDataState {
    public static final String US_DISCLOSURE_CONTENTFUL_ID = "Gl6QLbvkx8WdOijWrpegI";
    public static final String US_DISCLOSURE_NO_SHERWOOD_NEWS = "2yfON5zqt7kJjO14zJFzzx";
    private final AppType appType;
    private final StringResource disclosureContent;
    private final boolean isBitstampUkUpsellRegionGateEnabled;
    private final boolean isSherwoodNewsCdpInfoBannerEnabled;
    private final StringResource ukDisclosureContent;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = StringResource.$stable;

    /* compiled from: CryptoDetailDisclosureDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppType.values().length];
            try {
                iArr[AppType.NCW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppType.RHC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppType.TRADER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final AppType getAppType() {
        return this.appType;
    }

    /* renamed from: component2, reason: from getter */
    private final StringResource getDisclosureContent() {
        return this.disclosureContent;
    }

    /* renamed from: component4, reason: from getter */
    private final StringResource getUkDisclosureContent() {
        return this.ukDisclosureContent;
    }

    public static /* synthetic */ CryptoDetailDisclosureDataState copy$default(CryptoDetailDisclosureDataState cryptoDetailDisclosureDataState, AppType appType, StringResource stringResource, boolean z, StringResource stringResource2, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            appType = cryptoDetailDisclosureDataState.appType;
        }
        if ((i & 2) != 0) {
            stringResource = cryptoDetailDisclosureDataState.disclosureContent;
        }
        if ((i & 4) != 0) {
            z = cryptoDetailDisclosureDataState.isSherwoodNewsCdpInfoBannerEnabled;
        }
        if ((i & 8) != 0) {
            stringResource2 = cryptoDetailDisclosureDataState.ukDisclosureContent;
        }
        if ((i & 16) != 0) {
            z2 = cryptoDetailDisclosureDataState.isBitstampUkUpsellRegionGateEnabled;
        }
        boolean z3 = z2;
        boolean z4 = z;
        return cryptoDetailDisclosureDataState.copy(appType, stringResource, z4, stringResource2, z3);
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSherwoodNewsCdpInfoBannerEnabled() {
        return this.isSherwoodNewsCdpInfoBannerEnabled;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsBitstampUkUpsellRegionGateEnabled() {
        return this.isBitstampUkUpsellRegionGateEnabled;
    }

    public final CryptoDetailDisclosureDataState copy(AppType appType, StringResource disclosureContent, boolean isSherwoodNewsCdpInfoBannerEnabled, StringResource ukDisclosureContent, boolean isBitstampUkUpsellRegionGateEnabled) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(disclosureContent, "disclosureContent");
        return new CryptoDetailDisclosureDataState(appType, disclosureContent, isSherwoodNewsCdpInfoBannerEnabled, ukDisclosureContent, isBitstampUkUpsellRegionGateEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoDetailDisclosureDataState)) {
            return false;
        }
        CryptoDetailDisclosureDataState cryptoDetailDisclosureDataState = (CryptoDetailDisclosureDataState) other;
        return this.appType == cryptoDetailDisclosureDataState.appType && Intrinsics.areEqual(this.disclosureContent, cryptoDetailDisclosureDataState.disclosureContent) && this.isSherwoodNewsCdpInfoBannerEnabled == cryptoDetailDisclosureDataState.isSherwoodNewsCdpInfoBannerEnabled && Intrinsics.areEqual(this.ukDisclosureContent, cryptoDetailDisclosureDataState.ukDisclosureContent) && this.isBitstampUkUpsellRegionGateEnabled == cryptoDetailDisclosureDataState.isBitstampUkUpsellRegionGateEnabled;
    }

    public int hashCode() {
        int iHashCode = ((((this.appType.hashCode() * 31) + this.disclosureContent.hashCode()) * 31) + Boolean.hashCode(this.isSherwoodNewsCdpInfoBannerEnabled)) * 31;
        StringResource stringResource = this.ukDisclosureContent;
        return ((iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31) + Boolean.hashCode(this.isBitstampUkUpsellRegionGateEnabled);
    }

    public String toString() {
        return "CryptoDetailDisclosureDataState(appType=" + this.appType + ", disclosureContent=" + this.disclosureContent + ", isSherwoodNewsCdpInfoBannerEnabled=" + this.isSherwoodNewsCdpInfoBannerEnabled + ", ukDisclosureContent=" + this.ukDisclosureContent + ", isBitstampUkUpsellRegionGateEnabled=" + this.isBitstampUkUpsellRegionGateEnabled + ")";
    }

    public CryptoDetailDisclosureDataState(AppType appType, StringResource disclosureContent, boolean z, StringResource stringResource, boolean z2) {
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(disclosureContent, "disclosureContent");
        this.appType = appType;
        this.disclosureContent = disclosureContent;
        this.isSherwoodNewsCdpInfoBannerEnabled = z;
        this.ukDisclosureContent = stringResource;
        this.isBitstampUkUpsellRegionGateEnabled = z2;
    }

    public /* synthetic */ CryptoDetailDisclosureDataState(AppType appType, StringResource stringResource, boolean z, StringResource stringResource2, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(appType, stringResource, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : stringResource2, (i & 16) != 0 ? false : z2);
    }

    public final boolean isSherwoodNewsCdpInfoBannerEnabled() {
        return this.isSherwoodNewsCdpInfoBannerEnabled;
    }

    public final boolean isBitstampUkUpsellRegionGateEnabled() {
        return this.isBitstampUkUpsellRegionGateEnabled;
    }

    public final StringResource getDisclosureResource() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i == 1) {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(this.appType);
            throw new ExceptionsH();
        }
        if (i == 2) {
            return this.disclosureContent;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (!this.isBitstampUkUpsellRegionGateEnabled) {
            return StringResource.INSTANCE.invoke(C12757R.string.crypto_detail_disclaimer_text, new Object[0]);
        }
        StringResource stringResource = this.ukDisclosureContent;
        return stringResource == null ? StringResource.INSTANCE.invoke("") : stringResource;
    }

    public final DisclosureLink getDisclosureLink() {
        String str;
        int i = WhenMappings.$EnumSwitchMapping$0[this.appType.ordinal()];
        if (i == 1) {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(this.appType);
            throw new ExceptionsH();
        }
        if (i == 2) {
            return null;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        if (this.isBitstampUkUpsellRegionGateEnabled) {
            return null;
        }
        if (this.isSherwoodNewsCdpInfoBannerEnabled) {
            str = US_DISCLOSURE_CONTENTFUL_ID;
        } else {
            str = US_DISCLOSURE_NO_SHERWOOD_NEWS;
        }
        return new DisclosureLink(C12757R.string.crypto_detail_disclaimer_link_text, str);
    }

    /* compiled from: CryptoDetailDisclosureDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u000e\u0010\u0007\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/disclosure/CryptoDetailDisclosureDataState$Companion;", "", "<init>", "()V", "US_DISCLOSURE_CONTENTFUL_ID", "", "getUS_DISCLOSURE_CONTENTFUL_ID$feature_crypto_externalDebug$annotations", "US_DISCLOSURE_NO_SHERWOOD_NEWS", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: getUS_DISCLOSURE_CONTENTFUL_ID$feature_crypto_externalDebug$annotations */
        public static /* synthetic */ void m1904x526a1588() {
        }

        private Companion() {
        }
    }
}
