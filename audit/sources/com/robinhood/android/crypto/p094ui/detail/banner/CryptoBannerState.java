package com.robinhood.android.crypto.p094ui.detail.banner;

import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.RichTexts2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.RichText;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoBannerComposable.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÂ\u0003J+\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerState;", "", "action", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "icon", "Lcom/robinhood/compose/bento/component/BentoIcons;", "text", "Lcom/robinhood/models/serverdriven/db/RichText;", "<init>", "(Lcom/robinhood/models/serverdriven/db/GenericAction;Lcom/robinhood/compose/bento/component/BentoIcons;Lcom/robinhood/models/serverdriven/db/RichText;)V", "getAction", "()Lcom/robinhood/models/serverdriven/db/GenericAction;", "getIcon", "()Lcom/robinhood/compose/bento/component/BentoIcons;", "bannerText", "Landroidx/compose/ui/text/AnnotatedString;", "getBannerText", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/AnnotatedString;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoBannerState {
    public static final int $stable = 8;
    private final GenericAction action;
    private final BentoIcon4 icon;
    private final RichText text;

    /* renamed from: component3, reason: from getter */
    private final RichText getText() {
        return this.text;
    }

    public static /* synthetic */ CryptoBannerState copy$default(CryptoBannerState cryptoBannerState, GenericAction genericAction, BentoIcon4 bentoIcon4, RichText richText, int i, Object obj) {
        if ((i & 1) != 0) {
            genericAction = cryptoBannerState.action;
        }
        if ((i & 2) != 0) {
            bentoIcon4 = cryptoBannerState.icon;
        }
        if ((i & 4) != 0) {
            richText = cryptoBannerState.text;
        }
        return cryptoBannerState.copy(genericAction, bentoIcon4, richText);
    }

    /* renamed from: component1, reason: from getter */
    public final GenericAction getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final BentoIcon4 getIcon() {
        return this.icon;
    }

    public final CryptoBannerState copy(GenericAction action, BentoIcon4 icon, RichText text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new CryptoBannerState(action, icon, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoBannerState)) {
            return false;
        }
        CryptoBannerState cryptoBannerState = (CryptoBannerState) other;
        return Intrinsics.areEqual(this.action, cryptoBannerState.action) && Intrinsics.areEqual(this.icon, cryptoBannerState.icon) && Intrinsics.areEqual(this.text, cryptoBannerState.text);
    }

    public int hashCode() {
        GenericAction genericAction = this.action;
        int iHashCode = (genericAction == null ? 0 : genericAction.hashCode()) * 31;
        BentoIcon4 bentoIcon4 = this.icon;
        return ((iHashCode + (bentoIcon4 != null ? bentoIcon4.hashCode() : 0)) * 31) + this.text.hashCode();
    }

    public String toString() {
        return "CryptoBannerState(action=" + this.action + ", icon=" + this.icon + ", text=" + this.text + ")";
    }

    public CryptoBannerState(GenericAction genericAction, BentoIcon4 bentoIcon4, RichText text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.action = genericAction;
        this.icon = bentoIcon4;
        this.text = text;
    }

    public final GenericAction getAction() {
        return this.action;
    }

    public final BentoIcon4 getIcon() {
        return this.icon;
    }

    @JvmName
    public final AnnotatedString getBannerText(Composer composer, int i) {
        composer.startReplaceGroup(-1444529184);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1444529184, i, -1, "com.robinhood.android.crypto.ui.detail.banner.CryptoBannerState.<get-bannerText> (CryptoBannerComposable.kt:106)");
        }
        AnnotatedString annotatedStringM15956toAnnotatedStringiJQMabo = RichTexts2.m15956toAnnotatedStringiJQMabo(this.text, 0L, composer, 0, 1);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return annotatedStringM15956toAnnotatedStringiJQMabo;
    }
}
