package com.robinhood.shared.portfolio.lists.p391ui;

import android.net.Uri;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserListRowComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/UserListRowDisplayAsset;", "", "UriAsset", "EmojiAsset", "BentoIconAsset", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowDisplayAsset$BentoIconAsset;", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowDisplayAsset$EmojiAsset;", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowDisplayAsset$UriAsset;", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.portfolio.lists.ui.UserListRowDisplayAsset, reason: use source file name */
/* loaded from: classes6.dex */
public interface UserListRowComposable6 {

    /* compiled from: UserListRowComposable.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/UserListRowDisplayAsset$UriAsset;", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowDisplayAsset;", "uri", "Landroid/net/Uri;", "<init>", "(Landroid/net/Uri;)V", "getUri", "()Landroid/net/Uri;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.UserListRowDisplayAsset$UriAsset, reason: from toString */
    public static final /* data */ class UriAsset implements UserListRowComposable6 {
        public static final int $stable = 8;
        private final Uri uri;

        /* JADX WARN: Multi-variable type inference failed */
        public UriAsset() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ UriAsset copy$default(UriAsset uriAsset, Uri uri, int i, Object obj) {
            if ((i & 1) != 0) {
                uri = uriAsset.uri;
            }
            return uriAsset.copy(uri);
        }

        /* renamed from: component1, reason: from getter */
        public final Uri getUri() {
            return this.uri;
        }

        public final UriAsset copy(Uri uri) {
            return new UriAsset(uri);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof UriAsset) && Intrinsics.areEqual(this.uri, ((UriAsset) other).uri);
        }

        public int hashCode() {
            Uri uri = this.uri;
            if (uri == null) {
                return 0;
            }
            return uri.hashCode();
        }

        public String toString() {
            return "UriAsset(uri=" + this.uri + ")";
        }

        public UriAsset(Uri uri) {
            this.uri = uri;
        }

        public /* synthetic */ UriAsset(Uri uri, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : uri);
        }

        public final Uri getUri() {
            return this.uri;
        }
    }

    /* compiled from: UserListRowComposable.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/UserListRowDisplayAsset$EmojiAsset;", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowDisplayAsset;", AnalyticsStrings.BUTTON_DESCRIPTION_LIST_EMOJI, "", "<init>", "(Ljava/lang/String;)V", "getEmoji", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.UserListRowDisplayAsset$EmojiAsset, reason: from toString */
    public static final /* data */ class EmojiAsset implements UserListRowComposable6 {
        public static final int $stable = 0;
        private final String emoji;

        /* JADX WARN: Multi-variable type inference failed */
        public EmojiAsset() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static /* synthetic */ EmojiAsset copy$default(EmojiAsset emojiAsset, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = emojiAsset.emoji;
            }
            return emojiAsset.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getEmoji() {
            return this.emoji;
        }

        public final EmojiAsset copy(String emoji) {
            return new EmojiAsset(emoji);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EmojiAsset) && Intrinsics.areEqual(this.emoji, ((EmojiAsset) other).emoji);
        }

        public int hashCode() {
            String str = this.emoji;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return "EmojiAsset(emoji=" + this.emoji + ")";
        }

        public EmojiAsset(String str) {
            this.emoji = str;
        }

        public /* synthetic */ EmojiAsset(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : str);
        }

        public final String getEmoji() {
            return this.emoji;
        }
    }

    /* compiled from: UserListRowComposable.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/UserListRowDisplayAsset$BentoIconAsset;", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowDisplayAsset;", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "(Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.UserListRowDisplayAsset$BentoIconAsset, reason: from toString */
    public static final /* data */ class BentoIconAsset implements UserListRowComposable6 {
        public static final int $stable = 0;
        private final ServerToBentoAssetMapper2 icon;

        public static /* synthetic */ BentoIconAsset copy$default(BentoIconAsset bentoIconAsset, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, Object obj) {
            if ((i & 1) != 0) {
                serverToBentoAssetMapper2 = bentoIconAsset.icon;
            }
            return bentoIconAsset.copy(serverToBentoAssetMapper2);
        }

        /* renamed from: component1, reason: from getter */
        public final ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }

        public final BentoIconAsset copy(ServerToBentoAssetMapper2 icon) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            return new BentoIconAsset(icon);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BentoIconAsset) && this.icon == ((BentoIconAsset) other).icon;
        }

        public int hashCode() {
            return this.icon.hashCode();
        }

        public String toString() {
            return "BentoIconAsset(icon=" + this.icon + ")";
        }

        public BentoIconAsset(ServerToBentoAssetMapper2 icon) {
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.icon = icon;
        }

        public final ServerToBentoAssetMapper2 getIcon() {
            return this.icon;
        }
    }
}
