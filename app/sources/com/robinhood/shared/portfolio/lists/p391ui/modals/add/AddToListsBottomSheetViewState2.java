package com.robinhood.shared.portfolio.lists.p391ui.modals.add;

import com.robinhood.models.p320db.CuratedList;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AddToListsBottomSheetViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\n\u000bR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListRow;", "", "list", "Lcom/robinhood/models/db/CuratedList;", "getList", "()Lcom/robinhood/models/db/CuratedList;", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "Checkable", "Selectable", "Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListRow$Checkable;", "Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListRow$Selectable;", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListRow, reason: use source file name */
/* loaded from: classes6.dex */
public interface AddToListsBottomSheetViewState2 {
    CuratedList getList();

    StringResource getSubtitle();

    /* compiled from: AddToListsBottomSheetViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000f¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListRow$Checkable;", "Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListRow;", "list", "Lcom/robinhood/models/db/CuratedList;", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "isChecked", "", "isSecurityInList", "<init>", "(Lcom/robinhood/models/db/CuratedList;Lcom/robinhood/utils/resource/StringResource;ZZ)V", "getList", "()Lcom/robinhood/models/db/CuratedList;", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListRow$Checkable, reason: from toString */
    public static final /* data */ class Checkable implements AddToListsBottomSheetViewState2 {
        public static final int $stable = 8;
        private final boolean isChecked;
        private final boolean isSecurityInList;
        private final CuratedList list;
        private final StringResource subtitle;

        public static /* synthetic */ Checkable copy$default(Checkable checkable, CuratedList curatedList, StringResource stringResource, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                curatedList = checkable.list;
            }
            if ((i & 2) != 0) {
                stringResource = checkable.subtitle;
            }
            if ((i & 4) != 0) {
                z = checkable.isChecked;
            }
            if ((i & 8) != 0) {
                z2 = checkable.isSecurityInList;
            }
            return checkable.copy(curatedList, stringResource, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final CuratedList getList() {
            return this.list;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsSecurityInList() {
            return this.isSecurityInList;
        }

        public final Checkable copy(CuratedList list, StringResource subtitle, boolean isChecked, boolean isSecurityInList) {
            Intrinsics.checkNotNullParameter(list, "list");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new Checkable(list, subtitle, isChecked, isSecurityInList);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Checkable)) {
                return false;
            }
            Checkable checkable = (Checkable) other;
            return Intrinsics.areEqual(this.list, checkable.list) && Intrinsics.areEqual(this.subtitle, checkable.subtitle) && this.isChecked == checkable.isChecked && this.isSecurityInList == checkable.isSecurityInList;
        }

        public int hashCode() {
            return (((((this.list.hashCode() * 31) + this.subtitle.hashCode()) * 31) + Boolean.hashCode(this.isChecked)) * 31) + Boolean.hashCode(this.isSecurityInList);
        }

        public String toString() {
            return "Checkable(list=" + this.list + ", subtitle=" + this.subtitle + ", isChecked=" + this.isChecked + ", isSecurityInList=" + this.isSecurityInList + ")";
        }

        public Checkable(CuratedList list, StringResource subtitle, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(list, "list");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.list = list;
            this.subtitle = subtitle;
            this.isChecked = z;
            this.isSecurityInList = z2;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.modals.add.AddToListsBottomSheetViewState2
        public CuratedList getList() {
            return this.list;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.modals.add.AddToListsBottomSheetViewState2
        public StringResource getSubtitle() {
            return this.subtitle;
        }

        public final boolean isChecked() {
            return this.isChecked;
        }

        public final boolean isSecurityInList() {
            return this.isSecurityInList;
        }
    }

    /* compiled from: AddToListsBottomSheetViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListRow$Selectable;", "Lcom/robinhood/shared/portfolio/lists/ui/modals/add/AddToListRow;", "list", "Lcom/robinhood/models/db/CuratedList;", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/models/db/CuratedList;Lcom/robinhood/utils/resource/StringResource;)V", "getList", "()Lcom/robinhood/models/db/CuratedList;", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-lists-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.portfolio.lists.ui.modals.add.AddToListRow$Selectable, reason: from toString */
    public static final /* data */ class Selectable implements AddToListsBottomSheetViewState2 {
        public static final int $stable = 8;
        private final CuratedList list;
        private final StringResource subtitle;

        public static /* synthetic */ Selectable copy$default(Selectable selectable, CuratedList curatedList, StringResource stringResource, int i, Object obj) {
            if ((i & 1) != 0) {
                curatedList = selectable.list;
            }
            if ((i & 2) != 0) {
                stringResource = selectable.subtitle;
            }
            return selectable.copy(curatedList, stringResource);
        }

        /* renamed from: component1, reason: from getter */
        public final CuratedList getList() {
            return this.list;
        }

        /* renamed from: component2, reason: from getter */
        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        public final Selectable copy(CuratedList list, StringResource subtitle) {
            Intrinsics.checkNotNullParameter(list, "list");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            return new Selectable(list, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Selectable)) {
                return false;
            }
            Selectable selectable = (Selectable) other;
            return Intrinsics.areEqual(this.list, selectable.list) && Intrinsics.areEqual(this.subtitle, selectable.subtitle);
        }

        public int hashCode() {
            return (this.list.hashCode() * 31) + this.subtitle.hashCode();
        }

        public String toString() {
            return "Selectable(list=" + this.list + ", subtitle=" + this.subtitle + ")";
        }

        public Selectable(CuratedList list, StringResource subtitle) {
            Intrinsics.checkNotNullParameter(list, "list");
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            this.list = list;
            this.subtitle = subtitle;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.modals.add.AddToListsBottomSheetViewState2
        public CuratedList getList() {
            return this.list;
        }

        @Override // com.robinhood.shared.portfolio.lists.p391ui.modals.add.AddToListsBottomSheetViewState2
        public StringResource getSubtitle() {
            return this.subtitle;
        }
    }
}
