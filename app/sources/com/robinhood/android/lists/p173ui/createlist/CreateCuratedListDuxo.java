package com.robinhood.android.lists.p173ui.createlist;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateCuratedListDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\nJ\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0010\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/lists/ui/createlist/CreateCuratedListDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/lists/ui/createlist/CreateCuratedListViewState;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "<init>", "(Lcom/robinhood/shared/store/lists/store/CuratedListStore;)V", "setEmoji", "", AnalyticsStrings.BUTTON_DESCRIPTION_LIST_EMOJI, "", "setListName", "listName", "setIsCreatingList", "isCreatingList", "", "createList", "feature-lists_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class CreateCuratedListDuxo extends OldBaseDuxo<CreateCuratedListViewState> {
    public static final int $stable = 8;
    private final CuratedListStore curatedListStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CreateCuratedListDuxo(CuratedListStore curatedListStore) {
        super(new CreateCuratedListViewState(null, null, false, null, null, 31, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        this.curatedListStore = curatedListStore;
    }

    public final void setEmoji(final String emoji) {
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.createlist.CreateCuratedListDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateCuratedListDuxo.setEmoji$lambda$0(emoji, (CreateCuratedListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateCuratedListViewState setEmoji$lambda$0(String str, CreateCuratedListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateCuratedListViewState.copy$default(applyMutation, str, null, false, null, null, 30, null);
    }

    public final void setListName(final String listName) {
        Intrinsics.checkNotNullParameter(listName, "listName");
        applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.createlist.CreateCuratedListDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateCuratedListDuxo.setListName$lambda$1(listName, (CreateCuratedListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateCuratedListViewState setListName$lambda$1(String str, CreateCuratedListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateCuratedListViewState.copy$default(applyMutation, null, str, false, null, null, 29, null);
    }

    private final void setIsCreatingList(final boolean isCreatingList) {
        applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.createlist.CreateCuratedListDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateCuratedListDuxo.setIsCreatingList$lambda$2(isCreatingList, (CreateCuratedListViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateCuratedListViewState setIsCreatingList$lambda$2(boolean z, CreateCuratedListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateCuratedListViewState.copy$default(applyMutation, null, null, z, null, null, 27, null);
    }

    public final void createList(String listName, String emoji) {
        Intrinsics.checkNotNullParameter(listName, "listName");
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        setIsCreatingList(true);
        LifecycleHost.DefaultImpls.bind$default(this, this.curatedListStore.createCuratedList(listName, emoji), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.lists.ui.createlist.CreateCuratedListDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateCuratedListDuxo.createList$lambda$4(this.f$0, (CuratedList) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.lists.ui.createlist.CreateCuratedListDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateCuratedListDuxo.createList$lambda$6(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createList$lambda$4(CreateCuratedListDuxo createCuratedListDuxo, final CuratedList createdList) {
        Intrinsics.checkNotNullParameter(createdList, "createdList");
        createCuratedListDuxo.setIsCreatingList(false);
        createCuratedListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.createlist.CreateCuratedListDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateCuratedListDuxo.createList$lambda$4$lambda$3(createdList, (CreateCuratedListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateCuratedListViewState createList$lambda$4$lambda$3(CuratedList curatedList, CreateCuratedListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateCuratedListViewState.copy$default(applyMutation, null, null, false, null, new UiEvent(curatedList), 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit createList$lambda$6(CreateCuratedListDuxo createCuratedListDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        createCuratedListDuxo.setIsCreatingList(false);
        createCuratedListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.createlist.CreateCuratedListDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CreateCuratedListDuxo.createList$lambda$6$lambda$5(throwable, (CreateCuratedListViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreateCuratedListViewState createList$lambda$6$lambda$5(Throwable th, CreateCuratedListViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CreateCuratedListViewState.copy$default(applyMutation, null, null, false, new UiEvent(th), null, 23, null);
    }
}
