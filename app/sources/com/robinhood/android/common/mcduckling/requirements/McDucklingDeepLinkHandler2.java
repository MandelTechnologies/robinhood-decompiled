package com.robinhood.android.common.mcduckling.requirements;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

/* compiled from: McDucklingDeepLinkHandler.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/mcduckling/requirements/ShowCardSettings;", "", "showCard", "", "constructor-impl", "(Z)Z", "getShowCard", "()Z", "equals", "other", "equals-impl", "(ZLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Z)I", "toString", "", "toString-impl", "(Z)Ljava/lang/String;", "feature-lib-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@JvmInline
/* renamed from: com.robinhood.android.common.mcduckling.requirements.ShowCardSettings, reason: use source file name */
/* loaded from: classes2.dex */
public final class McDucklingDeepLinkHandler2 {
    private final boolean showCard;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ McDucklingDeepLinkHandler2 m12258boximpl(boolean z) {
        return new McDucklingDeepLinkHandler2(z);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static boolean m12259constructorimpl(boolean z) {
        return z;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m12260equalsimpl(boolean z, Object obj) {
        return (obj instanceof McDucklingDeepLinkHandler2) && z == ((McDucklingDeepLinkHandler2) obj).m12264unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m12261equalsimpl0(boolean z, boolean z2) {
        return z == z2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m12262hashCodeimpl(boolean z) {
        return Boolean.hashCode(z);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m12263toStringimpl(boolean z) {
        return "ShowCardSettings(showCard=" + z + ")";
    }

    public boolean equals(Object obj) {
        return m12260equalsimpl(this.showCard, obj);
    }

    public int hashCode() {
        return m12262hashCodeimpl(this.showCard);
    }

    public String toString() {
        return m12263toStringimpl(this.showCard);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ boolean m12264unboximpl() {
        return this.showCard;
    }

    private /* synthetic */ McDucklingDeepLinkHandler2(boolean z) {
        this.showCard = z;
    }

    public final boolean getShowCard() {
        return this.showCard;
    }
}
