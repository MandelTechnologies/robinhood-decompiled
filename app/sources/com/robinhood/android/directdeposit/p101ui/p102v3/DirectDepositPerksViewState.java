package com.robinhood.android.directdeposit.p101ui.p102v3;

import android.net.Uri;
import com.robinhood.staticcontent.model.TitleAndBody;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectDepositPerksViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositPerksViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositPerksViewState$Loaded;", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositPerksViewState$Loading;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public interface DirectDepositPerksViewState {

    /* compiled from: DirectDepositPerksViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositPerksViewState$Loading;", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositPerksViewState;", "<init>", "()V", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements DirectDepositPerksViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: DirectDepositPerksViewState.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositPerksViewState$Loaded;", "Lcom/robinhood/android/directdeposit/ui/v3/DirectDepositPerksViewState;", "title", "", "bullets", "", "Lcom/robinhood/staticcontent/model/TitleAndBody;", "termsLink", "Landroid/net/Uri;", "<init>", "(Ljava/lang/String;Ljava/util/List;Landroid/net/Uri;)V", "getTitle", "()Ljava/lang/String;", "getBullets", "()Ljava/util/List;", "getTermsLink", "()Landroid/net/Uri;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements DirectDepositPerksViewState {
        public static final int $stable = 8;
        private final List<TitleAndBody> bullets;
        private final Uri termsLink;
        private final String title;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, String str, List list, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loaded.title;
            }
            if ((i & 2) != 0) {
                list = loaded.bullets;
            }
            if ((i & 4) != 0) {
                uri = loaded.termsLink;
            }
            return loaded.copy(str, list, uri);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final List<TitleAndBody> component2() {
            return this.bullets;
        }

        /* renamed from: component3, reason: from getter */
        public final Uri getTermsLink() {
            return this.termsLink;
        }

        public final Loaded copy(String title, List<TitleAndBody> bullets, Uri termsLink) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(bullets, "bullets");
            return new Loaded(title, bullets, termsLink);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.title, loaded.title) && Intrinsics.areEqual(this.bullets, loaded.bullets) && Intrinsics.areEqual(this.termsLink, loaded.termsLink);
        }

        public int hashCode() {
            int iHashCode = ((this.title.hashCode() * 31) + this.bullets.hashCode()) * 31;
            Uri uri = this.termsLink;
            return iHashCode + (uri == null ? 0 : uri.hashCode());
        }

        public String toString() {
            return "Loaded(title=" + this.title + ", bullets=" + this.bullets + ", termsLink=" + this.termsLink + ")";
        }

        public Loaded(String title, List<TitleAndBody> bullets, Uri uri) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(bullets, "bullets");
            this.title = title;
            this.bullets = bullets;
            this.termsLink = uri;
        }

        public final String getTitle() {
            return this.title;
        }

        public /* synthetic */ Loaded(String str, List list, Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, uri);
        }

        public final List<TitleAndBody> getBullets() {
            return this.bullets;
        }

        public final Uri getTermsLink() {
            return this.termsLink;
        }
    }
}
