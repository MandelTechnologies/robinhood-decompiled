package com.robinhood.shared.portfolio.lists.p391ui.watchlist;

import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.models.api.CuratedListObjectType;
import com.robinhood.models.p320db.CuratedListItem;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WatchlistItemRow.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u000e\u000f\u0010R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/watchlist/WatchlistItemRow;", "", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "itemType", "Lcom/robinhood/models/api/CuratedListObjectType;", "getItemType", "()Lcom/robinhood/models/api/CuratedListObjectType;", "curatedListItem", "Lcom/robinhood/models/db/CuratedListItem;", "getCuratedListItem", "()Lcom/robinhood/models/db/CuratedListItem;", "Position", "Instrument", "OptionsInstrument", "Lcom/robinhood/shared/portfolio/lists/ui/watchlist/WatchlistItemRow$Instrument;", "Lcom/robinhood/shared/portfolio/lists/ui/watchlist/WatchlistItemRow$OptionsInstrument;", "Lcom/robinhood/shared/portfolio/lists/ui/watchlist/WatchlistItemRow$Position;", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface WatchlistItemRow {
    CuratedListItem getCuratedListItem();

    UUID getId();

    CuratedListObjectType getItemType();

    /* compiled from: WatchlistItemRow.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/watchlist/WatchlistItemRow$Position;", "Lcom/robinhood/shared/portfolio/lists/ui/watchlist/WatchlistItemRow;", "position", "Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;", "curatedListItem", "Lcom/robinhood/models/db/CuratedListItem;", "<init>", "(Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;Lcom/robinhood/models/db/CuratedListItem;)V", "getPosition", "()Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;", "getCuratedListItem", "()Lcom/robinhood/models/db/CuratedListItem;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "itemType", "Lcom/robinhood/models/api/CuratedListObjectType;", "getItemType", "()Lcom/robinhood/models/api/CuratedListObjectType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Position implements WatchlistItemRow {
        public static final int $stable = 8;
        private final CuratedListItem curatedListItem;
        private final PositionsV2.PositionListItemV2 position;

        public static /* synthetic */ Position copy$default(Position position, PositionsV2.PositionListItemV2 positionListItemV2, CuratedListItem curatedListItem, int i, Object obj) {
            if ((i & 1) != 0) {
                positionListItemV2 = position.position;
            }
            if ((i & 2) != 0) {
                curatedListItem = position.curatedListItem;
            }
            return position.copy(positionListItemV2, curatedListItem);
        }

        /* renamed from: component1, reason: from getter */
        public final PositionsV2.PositionListItemV2 getPosition() {
            return this.position;
        }

        /* renamed from: component2, reason: from getter */
        public final CuratedListItem getCuratedListItem() {
            return this.curatedListItem;
        }

        public final Position copy(PositionsV2.PositionListItemV2 position, CuratedListItem curatedListItem) {
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(curatedListItem, "curatedListItem");
            return new Position(position, curatedListItem);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Position)) {
                return false;
            }
            Position position = (Position) other;
            return Intrinsics.areEqual(this.position, position.position) && Intrinsics.areEqual(this.curatedListItem, position.curatedListItem);
        }

        public int hashCode() {
            return (this.position.hashCode() * 31) + this.curatedListItem.hashCode();
        }

        public String toString() {
            return "Position(position=" + this.position + ", curatedListItem=" + this.curatedListItem + ")";
        }

        public Position(PositionsV2.PositionListItemV2 position, CuratedListItem curatedListItem) {
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(curatedListItem, "curatedListItem");
            this.position = position;
            this.curatedListItem = curatedListItem;
        }

        public final PositionsV2.PositionListItemV2 getPosition() {
            return this.position;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.watchlist.WatchlistItemRow
        public CuratedListItem getCuratedListItem() {
            return this.curatedListItem;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.watchlist.WatchlistItemRow
        public UUID getId() {
            return this.position.getMetadataId();
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.watchlist.WatchlistItemRow
        public CuratedListObjectType getItemType() {
            return WatchlistItemRowComposable3.toCuratedListObjectType(this.position.getInstrumentType());
        }
    }

    /* compiled from: WatchlistItemRow.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/watchlist/WatchlistItemRow$Instrument;", "Lcom/robinhood/shared/portfolio/lists/ui/watchlist/WatchlistItemRow;", "curatedListItem", "Lcom/robinhood/models/db/CuratedListItem;", "<init>", "(Lcom/robinhood/models/db/CuratedListItem;)V", "getCuratedListItem", "()Lcom/robinhood/models/db/CuratedListItem;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "itemType", "Lcom/robinhood/models/api/CuratedListObjectType;", "getItemType", "()Lcom/robinhood/models/api/CuratedListObjectType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Instrument implements WatchlistItemRow {
        public static final int $stable = 8;
        private final CuratedListItem curatedListItem;

        public static /* synthetic */ Instrument copy$default(Instrument instrument, CuratedListItem curatedListItem, int i, Object obj) {
            if ((i & 1) != 0) {
                curatedListItem = instrument.curatedListItem;
            }
            return instrument.copy(curatedListItem);
        }

        /* renamed from: component1, reason: from getter */
        public final CuratedListItem getCuratedListItem() {
            return this.curatedListItem;
        }

        public final Instrument copy(CuratedListItem curatedListItem) {
            Intrinsics.checkNotNullParameter(curatedListItem, "curatedListItem");
            return new Instrument(curatedListItem);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Instrument) && Intrinsics.areEqual(this.curatedListItem, ((Instrument) other).curatedListItem);
        }

        public int hashCode() {
            return this.curatedListItem.hashCode();
        }

        public String toString() {
            return "Instrument(curatedListItem=" + this.curatedListItem + ")";
        }

        public Instrument(CuratedListItem curatedListItem) {
            Intrinsics.checkNotNullParameter(curatedListItem, "curatedListItem");
            this.curatedListItem = curatedListItem;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.watchlist.WatchlistItemRow
        public CuratedListItem getCuratedListItem() {
            return this.curatedListItem;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.watchlist.WatchlistItemRow
        public UUID getId() {
            return getCuratedListItem().getId();
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.watchlist.WatchlistItemRow
        public CuratedListObjectType getItemType() {
            return getCuratedListItem().getObjectType();
        }
    }

    /* compiled from: WatchlistItemRow.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/watchlist/WatchlistItemRow$OptionsInstrument;", "Lcom/robinhood/shared/portfolio/lists/ui/watchlist/WatchlistItemRow;", "curatedListItem", "Lcom/robinhood/models/db/CuratedListItem;", "<init>", "(Lcom/robinhood/models/db/CuratedListItem;)V", "getCuratedListItem", "()Lcom/robinhood/models/db/CuratedListItem;", "id", "Ljava/util/UUID;", "getId", "()Ljava/util/UUID;", "itemType", "Lcom/robinhood/models/api/CuratedListObjectType;", "getItemType", "()Lcom/robinhood/models/api/CuratedListObjectType;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class OptionsInstrument implements WatchlistItemRow {
        public static final int $stable = 8;
        private final CuratedListItem curatedListItem;

        public static /* synthetic */ OptionsInstrument copy$default(OptionsInstrument optionsInstrument, CuratedListItem curatedListItem, int i, Object obj) {
            if ((i & 1) != 0) {
                curatedListItem = optionsInstrument.curatedListItem;
            }
            return optionsInstrument.copy(curatedListItem);
        }

        /* renamed from: component1, reason: from getter */
        public final CuratedListItem getCuratedListItem() {
            return this.curatedListItem;
        }

        public final OptionsInstrument copy(CuratedListItem curatedListItem) {
            Intrinsics.checkNotNullParameter(curatedListItem, "curatedListItem");
            return new OptionsInstrument(curatedListItem);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof OptionsInstrument) && Intrinsics.areEqual(this.curatedListItem, ((OptionsInstrument) other).curatedListItem);
        }

        public int hashCode() {
            return this.curatedListItem.hashCode();
        }

        public String toString() {
            return "OptionsInstrument(curatedListItem=" + this.curatedListItem + ")";
        }

        public OptionsInstrument(CuratedListItem curatedListItem) {
            Intrinsics.checkNotNullParameter(curatedListItem, "curatedListItem");
            this.curatedListItem = curatedListItem;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.watchlist.WatchlistItemRow
        public CuratedListItem getCuratedListItem() {
            return this.curatedListItem;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.watchlist.WatchlistItemRow
        public UUID getId() {
            return getCuratedListItem().getId();
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.watchlist.WatchlistItemRow
        public CuratedListObjectType getItemType() {
            return getCuratedListItem().getObjectType();
        }
    }
}
