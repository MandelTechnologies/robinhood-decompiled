package com.robinhood.android.gold.investment.model;

import android.net.Uri;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: GoldHeaderPillData.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/gold/investment/model/GoldHeaderPillData;", "", AnnotatedPrivateKey.LABEL, "", "loggingIdentifier", "iconAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "deeplink", "Landroid/net/Uri;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Landroid/net/Uri;)V", "getLabel", "()Ljava/lang/String;", "getLoggingIdentifier", "getIconAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getDeeplink", "()Landroid/net/Uri;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-gold-investment-pill_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GoldHeaderPillData {
    public static final int $stable = 8;
    private final Uri deeplink;
    private final ServerToBentoAssetMapper2 iconAsset;
    private final String label;
    private final String loggingIdentifier;

    public static /* synthetic */ GoldHeaderPillData copy$default(GoldHeaderPillData goldHeaderPillData, String str, String str2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Uri uri, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldHeaderPillData.label;
        }
        if ((i & 2) != 0) {
            str2 = goldHeaderPillData.loggingIdentifier;
        }
        if ((i & 4) != 0) {
            serverToBentoAssetMapper2 = goldHeaderPillData.iconAsset;
        }
        if ((i & 8) != 0) {
            uri = goldHeaderPillData.deeplink;
        }
        return goldHeaderPillData.copy(str, str2, serverToBentoAssetMapper2, uri);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    /* renamed from: component3, reason: from getter */
    public final ServerToBentoAssetMapper2 getIconAsset() {
        return this.iconAsset;
    }

    /* renamed from: component4, reason: from getter */
    public final Uri getDeeplink() {
        return this.deeplink;
    }

    public final GoldHeaderPillData copy(String label, String loggingIdentifier, ServerToBentoAssetMapper2 iconAsset, Uri deeplink) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        return new GoldHeaderPillData(label, loggingIdentifier, iconAsset, deeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldHeaderPillData)) {
            return false;
        }
        GoldHeaderPillData goldHeaderPillData = (GoldHeaderPillData) other;
        return Intrinsics.areEqual(this.label, goldHeaderPillData.label) && Intrinsics.areEqual(this.loggingIdentifier, goldHeaderPillData.loggingIdentifier) && this.iconAsset == goldHeaderPillData.iconAsset && Intrinsics.areEqual(this.deeplink, goldHeaderPillData.deeplink);
    }

    public int hashCode() {
        int iHashCode = ((this.label.hashCode() * 31) + this.loggingIdentifier.hashCode()) * 31;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.iconAsset;
        int iHashCode2 = (iHashCode + (serverToBentoAssetMapper2 == null ? 0 : serverToBentoAssetMapper2.hashCode())) * 31;
        Uri uri = this.deeplink;
        return iHashCode2 + (uri != null ? uri.hashCode() : 0);
    }

    public String toString() {
        return "GoldHeaderPillData(label=" + this.label + ", loggingIdentifier=" + this.loggingIdentifier + ", iconAsset=" + this.iconAsset + ", deeplink=" + this.deeplink + ")";
    }

    public GoldHeaderPillData(String label, String loggingIdentifier, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Uri uri) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        this.label = label;
        this.loggingIdentifier = loggingIdentifier;
        this.iconAsset = serverToBentoAssetMapper2;
        this.deeplink = uri;
    }

    public /* synthetic */ GoldHeaderPillData(String str, String str2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, serverToBentoAssetMapper2, (i & 8) != 0 ? null : uri);
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    public final ServerToBentoAssetMapper2 getIconAsset() {
        return this.iconAsset;
    }

    public final Uri getDeeplink() {
        return this.deeplink;
    }
}
