package com.robinhood.shared.lists.quickadd;

import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.Security;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CuratedListQuickAddViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/shared/lists/quickadd/UpdateStatus;", "", "<init>", "()V", "QuickAdd", "Add", "Remove", "UpdateMultiple", "Lcom/robinhood/shared/lists/quickadd/UpdateStatus$Add;", "Lcom/robinhood/shared/lists/quickadd/UpdateStatus$QuickAdd;", "Lcom/robinhood/shared/lists/quickadd/UpdateStatus$Remove;", "Lcom/robinhood/shared/lists/quickadd/UpdateStatus$UpdateMultiple;", "lib-lists-quickadd_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.lists.quickadd.UpdateStatus, reason: use source file name */
/* loaded from: classes6.dex */
public abstract class CuratedListQuickAddViewState4 {
    public /* synthetic */ CuratedListQuickAddViewState4(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CuratedListQuickAddViewState4() {
    }

    /* compiled from: CuratedListQuickAddViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/lists/quickadd/UpdateStatus$QuickAdd;", "Lcom/robinhood/shared/lists/quickadd/UpdateStatus;", "security", "Lcom/robinhood/models/db/Security;", "<init>", "(Lcom/robinhood/models/db/Security;)V", "getSecurity", "()Lcom/robinhood/models/db/Security;", "lib-lists-quickadd_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.lists.quickadd.UpdateStatus$QuickAdd */
    public static final class QuickAdd extends CuratedListQuickAddViewState4 {
        private final Security security;

        public final Security getSecurity() {
            return this.security;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public QuickAdd(Security security) {
            super(null);
            Intrinsics.checkNotNullParameter(security, "security");
            this.security = security;
        }
    }

    /* compiled from: CuratedListQuickAddViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/lists/quickadd/UpdateStatus$Add;", "Lcom/robinhood/shared/lists/quickadd/UpdateStatus;", "security", "Lcom/robinhood/models/db/Security;", "listToUpdate", "Lcom/robinhood/models/db/CuratedList;", "customLoadingMessage", "", "<init>", "(Lcom/robinhood/models/db/Security;Lcom/robinhood/models/db/CuratedList;Ljava/lang/String;)V", "getSecurity", "()Lcom/robinhood/models/db/Security;", "getListToUpdate", "()Lcom/robinhood/models/db/CuratedList;", "getCustomLoadingMessage", "()Ljava/lang/String;", "lib-lists-quickadd_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.lists.quickadd.UpdateStatus$Add */
    public static final class Add extends CuratedListQuickAddViewState4 {
        private final String customLoadingMessage;
        private final CuratedList listToUpdate;
        private final Security security;

        public /* synthetic */ Add(Security security, CuratedList curatedList, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(security, curatedList, (i & 4) != 0 ? null : str);
        }

        public final Security getSecurity() {
            return this.security;
        }

        public final CuratedList getListToUpdate() {
            return this.listToUpdate;
        }

        public final String getCustomLoadingMessage() {
            return this.customLoadingMessage;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Add(Security security, CuratedList listToUpdate, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(security, "security");
            Intrinsics.checkNotNullParameter(listToUpdate, "listToUpdate");
            this.security = security;
            this.listToUpdate = listToUpdate;
            this.customLoadingMessage = str;
        }
    }

    /* compiled from: CuratedListQuickAddViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/shared/lists/quickadd/UpdateStatus$Remove;", "Lcom/robinhood/shared/lists/quickadd/UpdateStatus;", "security", "Lcom/robinhood/models/db/Security;", "listToUpdate", "Lcom/robinhood/models/db/CuratedList;", "customLoadingMessage", "", "<init>", "(Lcom/robinhood/models/db/Security;Lcom/robinhood/models/db/CuratedList;Ljava/lang/String;)V", "getSecurity", "()Lcom/robinhood/models/db/Security;", "getListToUpdate", "()Lcom/robinhood/models/db/CuratedList;", "getCustomLoadingMessage", "()Ljava/lang/String;", "lib-lists-quickadd_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.lists.quickadd.UpdateStatus$Remove */
    public static final class Remove extends CuratedListQuickAddViewState4 {
        private final String customLoadingMessage;
        private final CuratedList listToUpdate;
        private final Security security;

        public /* synthetic */ Remove(Security security, CuratedList curatedList, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(security, curatedList, (i & 4) != 0 ? null : str);
        }

        public final Security getSecurity() {
            return this.security;
        }

        public final CuratedList getListToUpdate() {
            return this.listToUpdate;
        }

        public final String getCustomLoadingMessage() {
            return this.customLoadingMessage;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Remove(Security security, CuratedList listToUpdate, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(security, "security");
            Intrinsics.checkNotNullParameter(listToUpdate, "listToUpdate");
            this.security = security;
            this.listToUpdate = listToUpdate;
            this.customLoadingMessage = str;
        }
    }

    /* compiled from: CuratedListQuickAddViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/lists/quickadd/UpdateStatus$UpdateMultiple;", "Lcom/robinhood/shared/lists/quickadd/UpdateStatus;", "listsToAdd", "", "Lcom/robinhood/models/db/CuratedList;", "listsToRemove", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getListsToAdd", "()Ljava/util/List;", "getListsToRemove", "lib-lists-quickadd_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.lists.quickadd.UpdateStatus$UpdateMultiple */
    public static final class UpdateMultiple extends CuratedListQuickAddViewState4 {
        private final List<CuratedList> listsToAdd;
        private final List<CuratedList> listsToRemove;

        public final List<CuratedList> getListsToAdd() {
            return this.listsToAdd;
        }

        public final List<CuratedList> getListsToRemove() {
            return this.listsToRemove;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateMultiple(List<CuratedList> listsToAdd, List<CuratedList> listsToRemove) {
            super(null);
            Intrinsics.checkNotNullParameter(listsToAdd, "listsToAdd");
            Intrinsics.checkNotNullParameter(listsToRemove, "listsToRemove");
            this.listsToAdd = listsToAdd;
            this.listsToRemove = listsToRemove;
        }
    }
}
