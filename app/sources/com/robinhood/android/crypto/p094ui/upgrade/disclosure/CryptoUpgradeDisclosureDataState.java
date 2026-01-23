package com.robinhood.android.crypto.p094ui.upgrade.disclosure;

import android.text.Spanned;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import io.noties.markwon.Markwon;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoUpgradeDisclosureDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureDataState;", "", "<init>", "()V", "Loading", "Loaded", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureDataState$Loaded;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureDataState$Loading;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class CryptoUpgradeDisclosureDataState {
    public static final int $stable = 0;

    public /* synthetic */ CryptoUpgradeDisclosureDataState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: CryptoUpgradeDisclosureDataState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureDataState$Loading;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureDataState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends CryptoUpgradeDisclosureDataState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -805679493;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    private CryptoUpgradeDisclosureDataState() {
    }

    /* compiled from: CryptoUpgradeDisclosureDataState.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureDataState$Loaded;", "Lcom/robinhood/android/crypto/ui/upgrade/disclosure/CryptoUpgradeDisclosureDataState;", "uiAgreementWithContent", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "<init>", "(Lcom/robinhood/android/agreements/models/UiAgreementWithContent;)V", "getUiAgreementWithContent", "()Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "getSpannedMarkdown", "", "markwon", "Lio/noties/markwon/Markwon;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded extends CryptoUpgradeDisclosureDataState {
        public static final int $stable = 8;
        private final UiAgreementWithContent uiAgreementWithContent;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, UiAgreementWithContent uiAgreementWithContent, int i, Object obj) {
            if ((i & 1) != 0) {
                uiAgreementWithContent = loaded.uiAgreementWithContent;
            }
            return loaded.copy(uiAgreementWithContent);
        }

        /* renamed from: component1, reason: from getter */
        public final UiAgreementWithContent getUiAgreementWithContent() {
            return this.uiAgreementWithContent;
        }

        public final Loaded copy(UiAgreementWithContent uiAgreementWithContent) {
            Intrinsics.checkNotNullParameter(uiAgreementWithContent, "uiAgreementWithContent");
            return new Loaded(uiAgreementWithContent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loaded) && Intrinsics.areEqual(this.uiAgreementWithContent, ((Loaded) other).uiAgreementWithContent);
        }

        public int hashCode() {
            return this.uiAgreementWithContent.hashCode();
        }

        public String toString() {
            return "Loaded(uiAgreementWithContent=" + this.uiAgreementWithContent + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loaded(UiAgreementWithContent uiAgreementWithContent) {
            super(null);
            Intrinsics.checkNotNullParameter(uiAgreementWithContent, "uiAgreementWithContent");
            this.uiAgreementWithContent = uiAgreementWithContent;
        }

        public final UiAgreementWithContent getUiAgreementWithContent() {
            return this.uiAgreementWithContent;
        }

        public final CharSequence getSpannedMarkdown(Markwon markwon) {
            Intrinsics.checkNotNullParameter(markwon, "markwon");
            Spanned spannedRender = markwon.render(markwon.mo17577parse(this.uiAgreementWithContent.getContent()));
            Intrinsics.checkNotNullExpressionValue(spannedRender, "render(...)");
            return spannedRender;
        }
    }
}
