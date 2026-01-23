package com.robinhood.shared.portfolio.lists.p391ui;

import com.robinhood.android.dashboard.lib.buyingpower.PortfolioBuyingPower5;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.common.strings.C32428R;
import com.robinhood.equityscreener.models.p294db.Screener;
import com.robinhood.lists.models.shared.p298db.SizedUrlHolder;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable6;
import com.robinhood.utils.extensions.HttpUrl2;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: UserListRowComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0012\u0013\u0014\u0015R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f\u0082\u0001\u0004\u0016\u0017\u0018\u0019¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState;", "", "displayName", "Lcom/robinhood/utils/resource/StringResource;", "getDisplayName", "()Lcom/robinhood/utils/resource/StringResource;", "subtitle", "getSubtitle", "primaryDisplayAsset", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowDisplayAsset;", "getPrimaryDisplayAsset", "()Lcom/robinhood/shared/portfolio/lists/ui/UserListRowDisplayAsset;", "rowEndAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getRowEndAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "overrideEndAsset", "getOverrideEndAsset", "BaseRow", "WatchlistRow", "CuratedListRow", "ScreenerRow", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState$BaseRow;", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState$CuratedListRow;", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState$ScreenerRow;", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState$WatchlistRow;", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.portfolio.lists.ui.UserListRowState, reason: use source file name */
/* loaded from: classes6.dex */
public interface UserListRowComposable7 {
    StringResource getDisplayName();

    ServerToBentoAssetMapper2 getOverrideEndAsset();

    UserListRowComposable6 getPrimaryDisplayAsset();

    ServerToBentoAssetMapper2 getRowEndAsset();

    StringResource getSubtitle();

    /* compiled from: UserListRowComposable.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006!"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState$BaseRow;", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState;", "displayName", "Lcom/robinhood/utils/resource/StringResource;", "primaryDisplayAsset", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowDisplayAsset;", "subtitle", "rowEndAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/shared/portfolio/lists/ui/UserListRowDisplayAsset;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getDisplayName", "()Lcom/robinhood/utils/resource/StringResource;", "getPrimaryDisplayAsset", "()Lcom/robinhood/shared/portfolio/lists/ui/UserListRowDisplayAsset;", "getSubtitle", "getRowEndAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "overrideEndAsset", "getOverrideEndAsset", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.UserListRowState$BaseRow, reason: from toString */
    public static final /* data */ class BaseRow implements UserListRowComposable7 {
        public static final int $stable = StringResource.$stable;
        private final StringResource displayName;
        private final ServerToBentoAssetMapper2 overrideEndAsset;
        private final UserListRowComposable6 primaryDisplayAsset;
        private final ServerToBentoAssetMapper2 rowEndAsset;
        private final StringResource subtitle;

        public static /* synthetic */ BaseRow copy$default(BaseRow baseRow, StringResource stringResource, UserListRowComposable6 userListRowComposable6, StringResource stringResource2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = baseRow.displayName;
            }
            if ((i & 2) != 0) {
                userListRowComposable6 = baseRow.primaryDisplayAsset;
            }
            if ((i & 4) != 0) {
                stringResource2 = baseRow.subtitle;
            }
            if ((i & 8) != 0) {
                serverToBentoAssetMapper2 = baseRow.rowEndAsset;
            }
            return baseRow.copy(stringResource, userListRowComposable6, stringResource2, serverToBentoAssetMapper2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getDisplayName() {
            return this.displayName;
        }

        /* renamed from: component2, reason: from getter */
        public final UserListRowComposable6 getPrimaryDisplayAsset() {
            return this.primaryDisplayAsset;
        }

        /* renamed from: component3, reason: from getter */
        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final ServerToBentoAssetMapper2 getRowEndAsset() {
            return this.rowEndAsset;
        }

        public final BaseRow copy(StringResource displayName, UserListRowComposable6 primaryDisplayAsset, StringResource subtitle, ServerToBentoAssetMapper2 rowEndAsset) {
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(primaryDisplayAsset, "primaryDisplayAsset");
            return new BaseRow(displayName, primaryDisplayAsset, subtitle, rowEndAsset);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BaseRow)) {
                return false;
            }
            BaseRow baseRow = (BaseRow) other;
            return Intrinsics.areEqual(this.displayName, baseRow.displayName) && Intrinsics.areEqual(this.primaryDisplayAsset, baseRow.primaryDisplayAsset) && Intrinsics.areEqual(this.subtitle, baseRow.subtitle) && this.rowEndAsset == baseRow.rowEndAsset;
        }

        public int hashCode() {
            int iHashCode = ((this.displayName.hashCode() * 31) + this.primaryDisplayAsset.hashCode()) * 31;
            StringResource stringResource = this.subtitle;
            int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.rowEndAsset;
            return iHashCode2 + (serverToBentoAssetMapper2 != null ? serverToBentoAssetMapper2.hashCode() : 0);
        }

        public String toString() {
            return "BaseRow(displayName=" + this.displayName + ", primaryDisplayAsset=" + this.primaryDisplayAsset + ", subtitle=" + this.subtitle + ", rowEndAsset=" + this.rowEndAsset + ")";
        }

        public BaseRow(StringResource displayName, UserListRowComposable6 primaryDisplayAsset, StringResource stringResource, ServerToBentoAssetMapper2 serverToBentoAssetMapper2) {
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(primaryDisplayAsset, "primaryDisplayAsset");
            this.displayName = displayName;
            this.primaryDisplayAsset = primaryDisplayAsset;
            this.subtitle = stringResource;
            this.rowEndAsset = serverToBentoAssetMapper2;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
        public StringResource getDisplayName() {
            return this.displayName;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
        public UserListRowComposable6 getPrimaryDisplayAsset() {
            return this.primaryDisplayAsset;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
        public StringResource getSubtitle() {
            return this.subtitle;
        }

        public /* synthetic */ BaseRow(StringResource stringResource, UserListRowComposable6 userListRowComposable6, StringResource stringResource2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringResource, userListRowComposable6, (i & 4) != 0 ? null : stringResource2, (i & 8) != 0 ? ServerToBentoAssetMapper2.CARET_RIGHT_16 : serverToBentoAssetMapper2);
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
        public ServerToBentoAssetMapper2 getRowEndAsset() {
            return this.rowEndAsset;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
        public ServerToBentoAssetMapper2 getOverrideEndAsset() {
            return this.overrideEndAsset;
        }
    }

    /* compiled from: UserListRowComposable.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0018\u0019\u001aB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0001\u0003\u001b\u001c\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState$WatchlistRow;", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState;", "<init>", "()V", PortfolioBuyingPower5.IntentKeyEntryPoint, "Lcom/robinhood/models/db/CuratedList;", "getWatchlist", "()Lcom/robinhood/models/db/CuratedList;", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "overrideEndAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getOverrideEndAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "rowEndAsset", "getRowEndAsset", "displayName", "getDisplayName", "primaryDisplayAsset", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowDisplayAsset;", "getPrimaryDisplayAsset", "()Lcom/robinhood/shared/portfolio/lists/ui/UserListRowDisplayAsset;", "Default", "Expandable", "Checkable", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState$WatchlistRow$Checkable;", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState$WatchlistRow$Default;", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState$WatchlistRow$Expandable;", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.UserListRowState$WatchlistRow */
    public static abstract class WatchlistRow implements UserListRowComposable7 {
        public static final int $stable = 0;
        private final ServerToBentoAssetMapper2 rowEndAsset;

        public /* synthetic */ WatchlistRow(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
        public abstract ServerToBentoAssetMapper2 getOverrideEndAsset();

        @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
        public abstract StringResource getSubtitle();

        public abstract CuratedList getWatchlist();

        private WatchlistRow() {
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
        public ServerToBentoAssetMapper2 getRowEndAsset() {
            return this.rowEndAsset;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
        public StringResource getDisplayName() {
            return StringResource.INSTANCE.invoke(getWatchlist().getDisplayName());
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
        public UserListRowComposable6 getPrimaryDisplayAsset() {
            return new UserListRowComposable6.EmojiAsset(getWatchlist().getIconEmoji());
        }

        /* compiled from: UserListRowComposable.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState$WatchlistRow$Default;", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState$WatchlistRow;", PortfolioBuyingPower5.IntentKeyEntryPoint, "Lcom/robinhood/models/db/CuratedList;", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "overrideEndAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "(Lcom/robinhood/models/db/CuratedList;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getWatchlist", "()Lcom/robinhood/models/db/CuratedList;", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "getOverrideEndAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.portfolio.lists.ui.UserListRowState$WatchlistRow$Default, reason: from toString */
        public static final /* data */ class Default extends WatchlistRow {
            public static final int $stable = 8;
            private final ServerToBentoAssetMapper2 overrideEndAsset;
            private final StringResource subtitle;
            private final CuratedList watchlist;

            public static /* synthetic */ Default copy$default(Default r0, CuratedList curatedList, StringResource stringResource, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, Object obj) {
                if ((i & 1) != 0) {
                    curatedList = r0.watchlist;
                }
                if ((i & 2) != 0) {
                    stringResource = r0.subtitle;
                }
                if ((i & 4) != 0) {
                    serverToBentoAssetMapper2 = r0.overrideEndAsset;
                }
                return r0.copy(curatedList, stringResource, serverToBentoAssetMapper2);
            }

            /* renamed from: component1, reason: from getter */
            public final CuratedList getWatchlist() {
                return this.watchlist;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component3, reason: from getter */
            public final ServerToBentoAssetMapper2 getOverrideEndAsset() {
                return this.overrideEndAsset;
            }

            public final Default copy(CuratedList watchlist, StringResource subtitle, ServerToBentoAssetMapper2 overrideEndAsset) {
                Intrinsics.checkNotNullParameter(watchlist, "watchlist");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                return new Default(watchlist, subtitle, overrideEndAsset);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Default)) {
                    return false;
                }
                Default r5 = (Default) other;
                return Intrinsics.areEqual(this.watchlist, r5.watchlist) && Intrinsics.areEqual(this.subtitle, r5.subtitle) && this.overrideEndAsset == r5.overrideEndAsset;
            }

            public int hashCode() {
                int iHashCode = ((this.watchlist.hashCode() * 31) + this.subtitle.hashCode()) * 31;
                ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.overrideEndAsset;
                return iHashCode + (serverToBentoAssetMapper2 == null ? 0 : serverToBentoAssetMapper2.hashCode());
            }

            public String toString() {
                return "Default(watchlist=" + this.watchlist + ", subtitle=" + this.subtitle + ", overrideEndAsset=" + this.overrideEndAsset + ")";
            }

            public /* synthetic */ Default(CuratedList curatedList, StringResource stringResource, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(curatedList, stringResource, (i & 4) != 0 ? null : serverToBentoAssetMapper2);
            }

            @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7.WatchlistRow
            public CuratedList getWatchlist() {
                return this.watchlist;
            }

            @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7.WatchlistRow, com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
            public StringResource getSubtitle() {
                return this.subtitle;
            }

            @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7.WatchlistRow, com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
            public ServerToBentoAssetMapper2 getOverrideEndAsset() {
                return this.overrideEndAsset;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Default(CuratedList watchlist, StringResource subtitle, ServerToBentoAssetMapper2 serverToBentoAssetMapper2) {
                super(null);
                Intrinsics.checkNotNullParameter(watchlist, "watchlist");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                this.watchlist = watchlist;
                this.subtitle = subtitle;
                this.overrideEndAsset = serverToBentoAssetMapper2;
            }
        }

        /* compiled from: UserListRowComposable.kt */
        @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u001b\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u001a\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010&HÖ\u0003J\t\u0010'\u001a\u00020\rHÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006*"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState$WatchlistRow$Expandable;", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState$WatchlistRow;", PortfolioBuyingPower5.IntentKeyEntryPoint, "Lcom/robinhood/models/db/CuratedList;", "expanded", "", "onExpandToggled", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "overrideEndAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "itemCount", "", "<init>", "(Lcom/robinhood/models/db/CuratedList;ZLkotlin/jvm/functions/Function2;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;I)V", "getWatchlist", "()Lcom/robinhood/models/db/CuratedList;", "getExpanded", "()Z", "getOnExpandToggled", "()Lkotlin/jvm/functions/Function2;", "getOverrideEndAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getItemCount", "()I", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.portfolio.lists.ui.UserListRowState$WatchlistRow$Expandable, reason: from toString */
        public static final /* data */ class Expandable extends WatchlistRow {
            public static final int $stable = 8;
            private final boolean expanded;
            private final int itemCount;
            private final Function2<UUID, Boolean, Unit> onExpandToggled;
            private final ServerToBentoAssetMapper2 overrideEndAsset;
            private final CuratedList watchlist;

            public static /* synthetic */ Expandable copy$default(Expandable expandable, CuratedList curatedList, boolean z, Function2 function2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    curatedList = expandable.watchlist;
                }
                if ((i2 & 2) != 0) {
                    z = expandable.expanded;
                }
                if ((i2 & 4) != 0) {
                    function2 = expandable.onExpandToggled;
                }
                if ((i2 & 8) != 0) {
                    serverToBentoAssetMapper2 = expandable.overrideEndAsset;
                }
                if ((i2 & 16) != 0) {
                    i = expandable.itemCount;
                }
                int i3 = i;
                Function2 function22 = function2;
                return expandable.copy(curatedList, z, function22, serverToBentoAssetMapper2, i3);
            }

            /* renamed from: component1, reason: from getter */
            public final CuratedList getWatchlist() {
                return this.watchlist;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getExpanded() {
                return this.expanded;
            }

            public final Function2<UUID, Boolean, Unit> component3() {
                return this.onExpandToggled;
            }

            /* renamed from: component4, reason: from getter */
            public final ServerToBentoAssetMapper2 getOverrideEndAsset() {
                return this.overrideEndAsset;
            }

            /* renamed from: component5, reason: from getter */
            public final int getItemCount() {
                return this.itemCount;
            }

            public final Expandable copy(CuratedList watchlist, boolean expanded, Function2<? super UUID, ? super Boolean, Unit> onExpandToggled, ServerToBentoAssetMapper2 overrideEndAsset, int itemCount) {
                Intrinsics.checkNotNullParameter(watchlist, "watchlist");
                Intrinsics.checkNotNullParameter(onExpandToggled, "onExpandToggled");
                return new Expandable(watchlist, expanded, onExpandToggled, overrideEndAsset, itemCount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Expandable)) {
                    return false;
                }
                Expandable expandable = (Expandable) other;
                return Intrinsics.areEqual(this.watchlist, expandable.watchlist) && this.expanded == expandable.expanded && Intrinsics.areEqual(this.onExpandToggled, expandable.onExpandToggled) && this.overrideEndAsset == expandable.overrideEndAsset && this.itemCount == expandable.itemCount;
            }

            public int hashCode() {
                int iHashCode = ((((this.watchlist.hashCode() * 31) + Boolean.hashCode(this.expanded)) * 31) + this.onExpandToggled.hashCode()) * 31;
                ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.overrideEndAsset;
                return ((iHashCode + (serverToBentoAssetMapper2 == null ? 0 : serverToBentoAssetMapper2.hashCode())) * 31) + Integer.hashCode(this.itemCount);
            }

            public String toString() {
                return "Expandable(watchlist=" + this.watchlist + ", expanded=" + this.expanded + ", onExpandToggled=" + this.onExpandToggled + ", overrideEndAsset=" + this.overrideEndAsset + ", itemCount=" + this.itemCount + ")";
            }

            @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7.WatchlistRow
            public CuratedList getWatchlist() {
                return this.watchlist;
            }

            public final boolean getExpanded() {
                return this.expanded;
            }

            public final Function2<UUID, Boolean, Unit> getOnExpandToggled() {
                return this.onExpandToggled;
            }

            @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7.WatchlistRow, com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
            public ServerToBentoAssetMapper2 getOverrideEndAsset() {
                return this.overrideEndAsset;
            }

            public /* synthetic */ Expandable(CuratedList curatedList, boolean z, Function2 function2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(curatedList, z, function2, (i2 & 8) != 0 ? null : serverToBentoAssetMapper2, (i2 & 16) != 0 ? curatedList.getItemCount() : i);
            }

            public final int getItemCount() {
                return this.itemCount;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Expandable(CuratedList watchlist, boolean z, Function2<? super UUID, ? super Boolean, Unit> onExpandToggled, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i) {
                super(null);
                Intrinsics.checkNotNullParameter(watchlist, "watchlist");
                Intrinsics.checkNotNullParameter(onExpandToggled, "onExpandToggled");
                this.watchlist = watchlist;
                this.expanded = z;
                this.onExpandToggled = onExpandToggled;
                this.overrideEndAsset = serverToBentoAssetMapper2;
                this.itemCount = i;
            }

            @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7.WatchlistRow, com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
            public StringResource getSubtitle() {
                int i;
                StringResource.Companion companion = StringResource.INSTANCE;
                if (getWatchlist().isOptionsWatchlist()) {
                    i = C39419R.plurals.watchlist_options_number_of_items;
                } else {
                    i = C32428R.plurals.lists_number_of_items;
                }
                return companion.invoke(new StringResource.PluralsResource(i, this.itemCount), Integer.valueOf(this.itemCount));
            }
        }

        /* compiled from: UserListRowComposable.kt */
        @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u001b\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\tHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\rHÆ\u0003JO\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010 \u001a\u00020\u00072\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R#\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState$WatchlistRow$Checkable;", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState$WatchlistRow;", PortfolioBuyingPower5.IntentKeyEntryPoint, "Lcom/robinhood/models/db/CuratedList;", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "checked", "", "onCheckToggled", "Lkotlin/Function2;", "Ljava/util/UUID;", "", "overrideEndAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "(Lcom/robinhood/models/db/CuratedList;Lcom/robinhood/utils/resource/StringResource;ZLkotlin/jvm/functions/Function2;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getWatchlist", "()Lcom/robinhood/models/db/CuratedList;", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "getChecked", "()Z", "getOnCheckToggled", "()Lkotlin/jvm/functions/Function2;", "getOverrideEndAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.portfolio.lists.ui.UserListRowState$WatchlistRow$Checkable, reason: from toString */
        public static final /* data */ class Checkable extends WatchlistRow {
            public static final int $stable = 8;
            private final boolean checked;
            private final Function2<UUID, Boolean, Unit> onCheckToggled;
            private final ServerToBentoAssetMapper2 overrideEndAsset;
            private final StringResource subtitle;
            private final CuratedList watchlist;

            public static /* synthetic */ Checkable copy$default(Checkable checkable, CuratedList curatedList, StringResource stringResource, boolean z, Function2 function2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, Object obj) {
                if ((i & 1) != 0) {
                    curatedList = checkable.watchlist;
                }
                if ((i & 2) != 0) {
                    stringResource = checkable.subtitle;
                }
                if ((i & 4) != 0) {
                    z = checkable.checked;
                }
                if ((i & 8) != 0) {
                    function2 = checkable.onCheckToggled;
                }
                if ((i & 16) != 0) {
                    serverToBentoAssetMapper2 = checkable.overrideEndAsset;
                }
                ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
                boolean z2 = z;
                return checkable.copy(curatedList, stringResource, z2, function2, serverToBentoAssetMapper22);
            }

            /* renamed from: component1, reason: from getter */
            public final CuratedList getWatchlist() {
                return this.watchlist;
            }

            /* renamed from: component2, reason: from getter */
            public final StringResource getSubtitle() {
                return this.subtitle;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getChecked() {
                return this.checked;
            }

            public final Function2<UUID, Boolean, Unit> component4() {
                return this.onCheckToggled;
            }

            /* renamed from: component5, reason: from getter */
            public final ServerToBentoAssetMapper2 getOverrideEndAsset() {
                return this.overrideEndAsset;
            }

            public final Checkable copy(CuratedList watchlist, StringResource subtitle, boolean checked, Function2<? super UUID, ? super Boolean, Unit> onCheckToggled, ServerToBentoAssetMapper2 overrideEndAsset) {
                Intrinsics.checkNotNullParameter(watchlist, "watchlist");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(onCheckToggled, "onCheckToggled");
                return new Checkable(watchlist, subtitle, checked, onCheckToggled, overrideEndAsset);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Checkable)) {
                    return false;
                }
                Checkable checkable = (Checkable) other;
                return Intrinsics.areEqual(this.watchlist, checkable.watchlist) && Intrinsics.areEqual(this.subtitle, checkable.subtitle) && this.checked == checkable.checked && Intrinsics.areEqual(this.onCheckToggled, checkable.onCheckToggled) && this.overrideEndAsset == checkable.overrideEndAsset;
            }

            public int hashCode() {
                int iHashCode = ((((((this.watchlist.hashCode() * 31) + this.subtitle.hashCode()) * 31) + Boolean.hashCode(this.checked)) * 31) + this.onCheckToggled.hashCode()) * 31;
                ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.overrideEndAsset;
                return iHashCode + (serverToBentoAssetMapper2 == null ? 0 : serverToBentoAssetMapper2.hashCode());
            }

            public String toString() {
                return "Checkable(watchlist=" + this.watchlist + ", subtitle=" + this.subtitle + ", checked=" + this.checked + ", onCheckToggled=" + this.onCheckToggled + ", overrideEndAsset=" + this.overrideEndAsset + ")";
            }

            public /* synthetic */ Checkable(CuratedList curatedList, StringResource stringResource, boolean z, Function2 function2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(curatedList, stringResource, z, function2, (i & 16) != 0 ? null : serverToBentoAssetMapper2);
            }

            @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7.WatchlistRow
            public CuratedList getWatchlist() {
                return this.watchlist;
            }

            @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7.WatchlistRow, com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
            public StringResource getSubtitle() {
                return this.subtitle;
            }

            public final boolean getChecked() {
                return this.checked;
            }

            public final Function2<UUID, Boolean, Unit> getOnCheckToggled() {
                return this.onCheckToggled;
            }

            @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7.WatchlistRow, com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
            public ServerToBentoAssetMapper2 getOverrideEndAsset() {
                return this.overrideEndAsset;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Checkable(CuratedList watchlist, StringResource subtitle, boolean z, Function2<? super UUID, ? super Boolean, Unit> onCheckToggled, ServerToBentoAssetMapper2 serverToBentoAssetMapper2) {
                super(null);
                Intrinsics.checkNotNullParameter(watchlist, "watchlist");
                Intrinsics.checkNotNullParameter(subtitle, "subtitle");
                Intrinsics.checkNotNullParameter(onCheckToggled, "onCheckToggled");
                this.watchlist = watchlist;
                this.subtitle = subtitle;
                this.checked = z;
                this.onCheckToggled = onCheckToggled;
                this.overrideEndAsset = serverToBentoAssetMapper2;
            }
        }
    }

    /* compiled from: UserListRowComposable.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState$CuratedListRow;", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState;", "curatedList", "Lcom/robinhood/models/db/CuratedList;", "overrideEndAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "(Lcom/robinhood/models/db/CuratedList;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getCuratedList", "()Lcom/robinhood/models/db/CuratedList;", "getOverrideEndAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "rowEndAsset", "getRowEndAsset", "displayName", "Lcom/robinhood/utils/resource/StringResource;", "getDisplayName", "()Lcom/robinhood/utils/resource/StringResource;", "subtitle", "getSubtitle", "primaryDisplayAsset", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowDisplayAsset;", "getPrimaryDisplayAsset", "()Lcom/robinhood/shared/portfolio/lists/ui/UserListRowDisplayAsset;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.UserListRowState$CuratedListRow, reason: from toString */
    public static final /* data */ class CuratedListRow implements UserListRowComposable7 {
        public static final int $stable = 8;
        private final CuratedList curatedList;
        private final ServerToBentoAssetMapper2 overrideEndAsset;

        public static /* synthetic */ CuratedListRow copy$default(CuratedListRow curatedListRow, CuratedList curatedList, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, Object obj) {
            if ((i & 1) != 0) {
                curatedList = curatedListRow.curatedList;
            }
            if ((i & 2) != 0) {
                serverToBentoAssetMapper2 = curatedListRow.overrideEndAsset;
            }
            return curatedListRow.copy(curatedList, serverToBentoAssetMapper2);
        }

        /* renamed from: component1, reason: from getter */
        public final CuratedList getCuratedList() {
            return this.curatedList;
        }

        /* renamed from: component2, reason: from getter */
        public final ServerToBentoAssetMapper2 getOverrideEndAsset() {
            return this.overrideEndAsset;
        }

        public final CuratedListRow copy(CuratedList curatedList, ServerToBentoAssetMapper2 overrideEndAsset) {
            Intrinsics.checkNotNullParameter(curatedList, "curatedList");
            return new CuratedListRow(curatedList, overrideEndAsset);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CuratedListRow)) {
                return false;
            }
            CuratedListRow curatedListRow = (CuratedListRow) other;
            return Intrinsics.areEqual(this.curatedList, curatedListRow.curatedList) && this.overrideEndAsset == curatedListRow.overrideEndAsset;
        }

        public int hashCode() {
            int iHashCode = this.curatedList.hashCode() * 31;
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.overrideEndAsset;
            return iHashCode + (serverToBentoAssetMapper2 == null ? 0 : serverToBentoAssetMapper2.hashCode());
        }

        public String toString() {
            return "CuratedListRow(curatedList=" + this.curatedList + ", overrideEndAsset=" + this.overrideEndAsset + ")";
        }

        public CuratedListRow(CuratedList curatedList, ServerToBentoAssetMapper2 serverToBentoAssetMapper2) {
            Intrinsics.checkNotNullParameter(curatedList, "curatedList");
            this.curatedList = curatedList;
            this.overrideEndAsset = serverToBentoAssetMapper2;
        }

        public /* synthetic */ CuratedListRow(CuratedList curatedList, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(curatedList, (i & 2) != 0 ? null : serverToBentoAssetMapper2);
        }

        public final CuratedList getCuratedList() {
            return this.curatedList;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
        public ServerToBentoAssetMapper2 getOverrideEndAsset() {
            return this.overrideEndAsset;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
        public ServerToBentoAssetMapper2 getRowEndAsset() {
            ServerToBentoAssetMapper2 overrideEndAsset = getOverrideEndAsset();
            return overrideEndAsset == null ? ServerToBentoAssetMapper2.CARET_RIGHT_16 : overrideEndAsset;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
        public StringResource getDisplayName() {
            return StringResource.INSTANCE.invoke(this.curatedList.getDisplayName());
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
        public StringResource getSubtitle() {
            return StringResource.INSTANCE.invoke(new StringResource.PluralsResource(C32428R.plurals.lists_number_of_items, this.curatedList.getItemCount()), Integer.valueOf(this.curatedList.getItemCount()));
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
        public UserListRowComposable6 getPrimaryDisplayAsset() {
            HttpUrl urlSize3x;
            SizedUrlHolder portraitSizedUrlHolder = this.curatedList.getPortraitSizedUrlHolder();
            return new UserListRowComposable6.UriAsset((portraitSizedUrlHolder == null || (urlSize3x = portraitSizedUrlHolder.getUrlSize3x()) == null) ? null : HttpUrl2.toAndroidUri(urlSize3x));
        }
    }

    /* compiled from: UserListRowComposable.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState$ScreenerRow;", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowState;", "screener", "Lcom/robinhood/equityscreener/models/db/Screener;", "overrideEndAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "(Lcom/robinhood/equityscreener/models/db/Screener;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getScreener", "()Lcom/robinhood/equityscreener/models/db/Screener;", "getOverrideEndAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "rowEndAsset", "getRowEndAsset", "displayName", "Lcom/robinhood/utils/resource/StringResource;", "getDisplayName", "()Lcom/robinhood/utils/resource/StringResource;", "subtitle", "getSubtitle", "primaryDisplayAsset", "Lcom/robinhood/shared/portfolio/lists/ui/UserListRowDisplayAsset;", "getPrimaryDisplayAsset", "()Lcom/robinhood/shared/portfolio/lists/ui/UserListRowDisplayAsset;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.UserListRowState$ScreenerRow, reason: from toString */
    public static final /* data */ class ScreenerRow implements UserListRowComposable7 {
        public static final int $stable = 8;
        private final ServerToBentoAssetMapper2 overrideEndAsset;
        private final Screener screener;

        public static /* synthetic */ ScreenerRow copy$default(ScreenerRow screenerRow, Screener screener, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, Object obj) {
            if ((i & 1) != 0) {
                screener = screenerRow.screener;
            }
            if ((i & 2) != 0) {
                serverToBentoAssetMapper2 = screenerRow.overrideEndAsset;
            }
            return screenerRow.copy(screener, serverToBentoAssetMapper2);
        }

        /* renamed from: component1, reason: from getter */
        public final Screener getScreener() {
            return this.screener;
        }

        /* renamed from: component2, reason: from getter */
        public final ServerToBentoAssetMapper2 getOverrideEndAsset() {
            return this.overrideEndAsset;
        }

        public final ScreenerRow copy(Screener screener, ServerToBentoAssetMapper2 overrideEndAsset) {
            Intrinsics.checkNotNullParameter(screener, "screener");
            return new ScreenerRow(screener, overrideEndAsset);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScreenerRow)) {
                return false;
            }
            ScreenerRow screenerRow = (ScreenerRow) other;
            return Intrinsics.areEqual(this.screener, screenerRow.screener) && this.overrideEndAsset == screenerRow.overrideEndAsset;
        }

        public int hashCode() {
            int iHashCode = this.screener.hashCode() * 31;
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = this.overrideEndAsset;
            return iHashCode + (serverToBentoAssetMapper2 == null ? 0 : serverToBentoAssetMapper2.hashCode());
        }

        public String toString() {
            return "ScreenerRow(screener=" + this.screener + ", overrideEndAsset=" + this.overrideEndAsset + ")";
        }

        public ScreenerRow(Screener screener, ServerToBentoAssetMapper2 serverToBentoAssetMapper2) {
            Intrinsics.checkNotNullParameter(screener, "screener");
            this.screener = screener;
            this.overrideEndAsset = serverToBentoAssetMapper2;
        }

        public /* synthetic */ ScreenerRow(Screener screener, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(screener, (i & 2) != 0 ? null : serverToBentoAssetMapper2);
        }

        public final Screener getScreener() {
            return this.screener;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
        public ServerToBentoAssetMapper2 getOverrideEndAsset() {
            return this.overrideEndAsset;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
        public ServerToBentoAssetMapper2 getRowEndAsset() {
            ServerToBentoAssetMapper2 overrideEndAsset = getOverrideEndAsset();
            return overrideEndAsset == null ? ServerToBentoAssetMapper2.CARET_RIGHT_16 : overrideEndAsset;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
        public StringResource getDisplayName() {
            return StringResource.INSTANCE.invoke(this.screener.getDisplayName());
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
        public StringResource getSubtitle() {
            return StringResource.INSTANCE.invoke(C39419R.string.screener_list_subtitle, new Object[0]);
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.UserListRowComposable7
        public UserListRowComposable6 getPrimaryDisplayAsset() {
            return new UserListRowComposable6.EmojiAsset(this.screener.getIconEmoji());
        }
    }
}
