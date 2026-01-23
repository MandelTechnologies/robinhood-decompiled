package com.robinhood.shared.lists.quickadd;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.api.CuratedListItemOperation;
import com.robinhood.models.api.CuratedListOperationType;
import com.robinhood.models.p320db.CuratedList;
import com.robinhood.models.p320db.Security;
import com.robinhood.p370rx.delay.CompletableDelay2;
import com.robinhood.p370rx.delay.SingleDelay2;
import com.robinhood.shared.lists.quickadd.CuratedListQuickAddViewState4;
import com.robinhood.shared.store.lists.store.CuratedListItemsStore;
import com.robinhood.shared.store.lists.store.CuratedListStore;
import com.robinhood.shared.store.lists.store.ListItemIdToUserListIdsStore;
import com.robinhood.udf.UiEvent;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.Function;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: CuratedListQuickAddDuxo.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J8\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0018J8\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0018J*\u0010\u001a\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00130\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/lists/quickadd/CuratedListQuickAddDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/shared/lists/quickadd/CuratedListQuickAddViewState;", "curatedListStore", "Lcom/robinhood/shared/store/lists/store/CuratedListStore;", "curatedListItemsStore", "Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;", "listItemIdToUserListIdsStore", "Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;", "<init>", "(Lcom/robinhood/shared/store/lists/store/CuratedListStore;Lcom/robinhood/shared/store/lists/store/CuratedListItemsStore;Lcom/robinhood/shared/store/lists/store/ListItemIdToUserListIdsStore;)V", "onResume", "", "onStop", "addToRecentList", "security", "Lcom/robinhood/models/db/Security;", "addToList", "curatedList", "Lcom/robinhood/models/db/CuratedList;", "customLoadingMessage", "", "customCompletionMessage", "showEditAction", "", "removeFromList", "updateLists", "listsToAdd", "", "listsToRemove", "Companion", "lib-lists-quickadd_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class CuratedListQuickAddDuxo extends OldBaseDuxo<CuratedListQuickAddViewState> {
    private static final long MIN_LOADING_TIME_IN_MILLIS = 300;
    private final CuratedListItemsStore curatedListItemsStore;
    private final CuratedListStore curatedListStore;
    private final ListItemIdToUserListIdsStore listItemIdToUserListIdsStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CuratedListQuickAddDuxo(CuratedListStore curatedListStore, CuratedListItemsStore curatedListItemsStore, ListItemIdToUserListIdsStore listItemIdToUserListIdsStore) {
        super(new CuratedListQuickAddViewState(null, null, null, null, null, null, null, null, null, 511, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(curatedListStore, "curatedListStore");
        Intrinsics.checkNotNullParameter(curatedListItemsStore, "curatedListItemsStore");
        Intrinsics.checkNotNullParameter(listItemIdToUserListIdsStore, "listItemIdToUserListIdsStore");
        this.curatedListStore = curatedListStore;
        this.curatedListItemsStore = curatedListItemsStore;
        this.listItemIdToUserListIdsStore = listItemIdToUserListIdsStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        this.curatedListStore.refreshFollowedLists(false);
        Observable<List<CuratedList>> observableDistinctUntilChanged = this.curatedListStore.streamCuratedListsByOwnerType(ApiCuratedList.OwnerType.CUSTOM).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListQuickAddDuxo.onResume$lambda$1(this.f$0, (List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(CuratedListQuickAddDuxo curatedListQuickAddDuxo, List list) {
        final CuratedList curatedList;
        final int size = list.size();
        if (size == 1) {
            Intrinsics.checkNotNull(list);
            curatedList = (CuratedList) CollectionsKt.first(list);
        } else {
            curatedList = null;
        }
        curatedListQuickAddDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListQuickAddDuxo.onResume$lambda$1$lambda$0(size, curatedList, (CuratedListQuickAddViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListQuickAddViewState onResume$lambda$1$lambda$0(int i, CuratedList curatedList, CuratedListQuickAddViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListQuickAddViewState.copy$default(applyMutation, null, null, null, null, null, Integer.valueOf(i), curatedList, null, null, 415, null);
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onStop() {
        super.onStop();
        applyMutation(new Function1() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListQuickAddDuxo.onStop$lambda$2((CuratedListQuickAddViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListQuickAddViewState onStop$lambda$2(CuratedListQuickAddViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListQuickAddViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, null, 255, null);
    }

    public final void addToRecentList(final Security security) {
        Intrinsics.checkNotNullParameter(security, "security");
        applyMutation(new Function1() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListQuickAddDuxo.addToRecentList$lambda$3(security, (CuratedListQuickAddViewState) obj);
            }
        });
        Observable observableFlatMapObservable = SingleDelay2.minTimeInFlight$default(this.curatedListStore.addItemToRecentlyEditedList(security, security.getCuratedListObjectType()), 300L, null, 2, null).flatMapObservable(new Function() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo.addToRecentList.2
            @Override // io.reactivex.functions.Function
            public final ObservableSource<? extends Tuples2<CuratedList, Integer>> apply(final CuratedList updatedList) {
                Intrinsics.checkNotNullParameter(updatedList, "updatedList");
                return CuratedListQuickAddDuxo.this.listItemIdToUserListIdsStore.stream(security.getId()).take(1L).map(new Function() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo.addToRecentList.2.1
                    @Override // io.reactivex.functions.Function
                    public final Tuples2<CuratedList, Integer> apply(List<UUID> listsWithSecurity) {
                        Intrinsics.checkNotNullParameter(listsWithSecurity, "listsWithSecurity");
                        return Tuples4.m3642to(updatedList, Integer.valueOf(listsWithSecurity.size()));
                    }
                });
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableFlatMapObservable, "flatMapObservable(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableFlatMapObservable, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListQuickAddDuxo.addToRecentList$lambda$5(this.f$0, security, (Tuples2) obj);
            }
        }, new Function1() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListQuickAddDuxo.addToRecentList$lambda$7(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListQuickAddViewState addToRecentList$lambda$3(Security security, CuratedListQuickAddViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListQuickAddViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, new CuratedListQuickAddViewState4.QuickAdd(security), 255, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addToRecentList$lambda$5(CuratedListQuickAddDuxo curatedListQuickAddDuxo, final Security security, Tuples2 tuples2) {
        Object objComponent1 = tuples2.component1();
        Intrinsics.checkNotNullExpressionValue(objComponent1, "component1(...)");
        final CuratedList curatedList = (CuratedList) objComponent1;
        final int iIntValue = ((Number) tuples2.component2()).intValue();
        curatedListQuickAddDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListQuickAddDuxo.addToRecentList$lambda$5$lambda$4(security, curatedList, iIntValue, (CuratedListQuickAddViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListQuickAddViewState addToRecentList$lambda$5$lambda$4(Security security, CuratedList curatedList, int i, CuratedListQuickAddViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListQuickAddViewState.copy$default(applyMutation, null, null, null, new UiEvent(new CuratedListQuickAddViewState2(security, curatedList, i, null, false, 24, null)), null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addToRecentList$lambda$7(CuratedListQuickAddDuxo curatedListQuickAddDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        curatedListQuickAddDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListQuickAddDuxo.addToRecentList$lambda$7$lambda$6(throwable, (CuratedListQuickAddViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListQuickAddViewState addToRecentList$lambda$7$lambda$6(Throwable th, CuratedListQuickAddViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListQuickAddViewState.copy$default(applyMutation, null, null, null, null, new UiEvent(th), null, null, null, null, 239, null);
    }

    public static /* synthetic */ void addToList$default(CuratedListQuickAddDuxo curatedListQuickAddDuxo, Security security, CuratedList curatedList, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            z = true;
        }
        curatedListQuickAddDuxo.addToList(security, curatedList, str, str2, z);
    }

    public final void addToList(final Security security, final CuratedList curatedList, final String customLoadingMessage, final String customCompletionMessage, final boolean showEditAction) {
        Intrinsics.checkNotNullParameter(security, "security");
        Intrinsics.checkNotNullParameter(curatedList, "curatedList");
        applyMutation(new Function1() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListQuickAddDuxo.addToList$lambda$8(security, curatedList, customLoadingMessage, (CuratedListQuickAddViewState) obj);
            }
        });
        Completable completableSwitchMapCompletable = Observable.timer(300L, TimeUnit.MICROSECONDS).switchMapCompletable(new Function() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo.addToList.2
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                CuratedListStore curatedListStore = CuratedListQuickAddDuxo.this.curatedListStore;
                UUID id = curatedList.getId();
                Security security2 = security;
                return curatedListStore.addToList(id, security2, security2.getCuratedListObjectType());
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, CompletableDelay2.minTimeInFlight$default(completableSwitchMapCompletable, 300L, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListQuickAddDuxo.addToList$lambda$10(this.f$0, security, curatedList, customCompletionMessage, showEditAction);
            }
        }, new Function1() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListQuickAddDuxo.addToList$lambda$12(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListQuickAddViewState addToList$lambda$8(Security security, CuratedList curatedList, String str, CuratedListQuickAddViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListQuickAddViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, new CuratedListQuickAddViewState4.Add(security, curatedList, str), 255, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addToList$lambda$10(CuratedListQuickAddDuxo curatedListQuickAddDuxo, final Security security, final CuratedList curatedList, final String str, final boolean z) {
        curatedListQuickAddDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListQuickAddDuxo.addToList$lambda$10$lambda$9(security, curatedList, str, z, (CuratedListQuickAddViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListQuickAddViewState addToList$lambda$10$lambda$9(Security security, CuratedList curatedList, String str, boolean z, CuratedListQuickAddViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListQuickAddViewState.copy$default(applyMutation, new UiEvent(new CuratedListQuickAddViewState2(security, curatedList, 0, str, z, 4, null)), null, null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit addToList$lambda$12(CuratedListQuickAddDuxo curatedListQuickAddDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        curatedListQuickAddDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListQuickAddDuxo.addToList$lambda$12$lambda$11(throwable, (CuratedListQuickAddViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListQuickAddViewState addToList$lambda$12$lambda$11(Throwable th, CuratedListQuickAddViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListQuickAddViewState.copy$default(applyMutation, null, null, null, null, new UiEvent(th), null, null, null, null, 239, null);
    }

    public static /* synthetic */ void removeFromList$default(CuratedListQuickAddDuxo curatedListQuickAddDuxo, Security security, CuratedList curatedList, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        if ((i & 16) != 0) {
            z = true;
        }
        curatedListQuickAddDuxo.removeFromList(security, curatedList, str, str2, z);
    }

    public final void removeFromList(final Security security, final CuratedList curatedList, final String customLoadingMessage, final String customCompletionMessage, final boolean showEditAction) {
        Intrinsics.checkNotNullParameter(security, "security");
        Intrinsics.checkNotNullParameter(curatedList, "curatedList");
        applyMutation(new Function1() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListQuickAddDuxo.removeFromList$lambda$13(security, curatedList, customLoadingMessage, (CuratedListQuickAddViewState) obj);
            }
        });
        Completable completableSwitchMapCompletable = Observable.timer(300L, TimeUnit.MICROSECONDS).switchMapCompletable(new Function() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo.removeFromList.2
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(Long it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return CuratedListQuickAddDuxo.this.curatedListStore.removeFromList(curatedList.getId(), security.getId(), security.getCuratedListObjectType());
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableSwitchMapCompletable, "switchMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, CompletableDelay2.minTimeInFlight$default(completableSwitchMapCompletable, 300L, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListQuickAddDuxo.removeFromList$lambda$15(this.f$0, security, curatedList, customCompletionMessage, showEditAction);
            }
        }, new Function1() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListQuickAddDuxo.removeFromList$lambda$17(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListQuickAddViewState removeFromList$lambda$13(Security security, CuratedList curatedList, String str, CuratedListQuickAddViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListQuickAddViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, new CuratedListQuickAddViewState4.Remove(security, curatedList, str), 255, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeFromList$lambda$15(CuratedListQuickAddDuxo curatedListQuickAddDuxo, final Security security, final CuratedList curatedList, final String str, final boolean z) {
        curatedListQuickAddDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListQuickAddDuxo.removeFromList$lambda$15$lambda$14(security, curatedList, str, z, (CuratedListQuickAddViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListQuickAddViewState removeFromList$lambda$15$lambda$14(Security security, CuratedList curatedList, String str, boolean z, CuratedListQuickAddViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListQuickAddViewState.copy$default(applyMutation, null, new UiEvent(new CuratedListQuickAddViewState2(security, curatedList, 0, str, z, 4, null)), null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit removeFromList$lambda$17(CuratedListQuickAddDuxo curatedListQuickAddDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        curatedListQuickAddDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListQuickAddDuxo.removeFromList$lambda$17$lambda$16(throwable, (CuratedListQuickAddViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListQuickAddViewState removeFromList$lambda$17$lambda$16(Throwable th, CuratedListQuickAddViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListQuickAddViewState.copy$default(applyMutation, null, null, null, null, new UiEvent(th), null, null, null, null, 239, null);
    }

    public final void updateLists(final Security security, final List<CuratedList> listsToAdd, final List<CuratedList> listsToRemove) {
        Intrinsics.checkNotNullParameter(security, "security");
        Intrinsics.checkNotNullParameter(listsToAdd, "listsToAdd");
        Intrinsics.checkNotNullParameter(listsToRemove, "listsToRemove");
        if (listsToAdd.isEmpty() && listsToRemove.isEmpty()) {
            return;
        }
        applyMutation(new Function1() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListQuickAddDuxo.updateLists$lambda$18(listsToAdd, listsToRemove, (CuratedListQuickAddViewState) obj);
            }
        });
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List<CuratedList> list = listsToAdd;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj : list) {
            linkedHashMap2.put(((CuratedList) obj).getId(), obj);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap2.size()));
        Iterator it = linkedHashMap2.entrySet().iterator();
        while (it.hasNext()) {
            linkedHashMap3.put(((Map.Entry) it.next()).getKey(), CollectionsKt.listOf(new CuratedListItemOperation(security.getCuratedListObjectType(), security.getId(), CuratedListOperationType.CREATE, null, 8, null)));
        }
        linkedHashMap.putAll(linkedHashMap3);
        List<CuratedList> list2 = listsToRemove;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (Object obj2 : list2) {
            linkedHashMap4.put(((CuratedList) obj2).getId(), obj2);
        }
        LinkedHashMap linkedHashMap5 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap4.size()));
        Iterator it2 = linkedHashMap4.entrySet().iterator();
        while (it2.hasNext()) {
            linkedHashMap5.put(((Map.Entry) it2.next()).getKey(), CollectionsKt.listOf(new CuratedListItemOperation(security.getCuratedListObjectType(), security.getId(), CuratedListOperationType.DELETE, null, 8, null)));
        }
        linkedHashMap.putAll(linkedHashMap5);
        LifecycleHost.DefaultImpls.bind$default(this, CompletableDelay2.minTimeInFlight$default(this.curatedListStore.updateLists(linkedHashMap), 300L, null, 2, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CuratedListQuickAddDuxo.updateLists$lambda$25(this.f$0, listsToAdd, listsToRemove, security);
            }
        }, new Function1() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return CuratedListQuickAddDuxo.updateLists$lambda$27(this.f$0, (Throwable) obj3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListQuickAddViewState updateLists$lambda$18(List list, List list2, CuratedListQuickAddViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListQuickAddViewState.copy$default(applyMutation, null, null, null, null, null, null, null, null, new CuratedListQuickAddViewState4.UpdateMultiple(list, list2), 255, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateLists$lambda$25(CuratedListQuickAddDuxo curatedListQuickAddDuxo, final List list, final List list2, final Security security) {
        curatedListQuickAddDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListQuickAddDuxo.updateLists$lambda$25$lambda$23(security, list, list2, (CuratedListQuickAddViewState) obj);
            }
        });
        for (CuratedList curatedList : CollectionsKt.plus((Collection) list, (Iterable) list2)) {
            CuratedListItemsStore.refreshListItems$default(curatedListQuickAddDuxo.curatedListItemsStore, true, curatedList.getId(), curatedList.getOwnerType(), null, null, null, 56, null);
            curatedListQuickAddDuxo.curatedListStore.refreshList(true, curatedList.getId(), curatedList.getOwnerType());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListQuickAddViewState updateLists$lambda$25$lambda$23(Security security, List list, List list2, CuratedListQuickAddViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListQuickAddViewState.copy$default(applyMutation, null, null, new UiEvent(new CuratedListQuickAddViewState3(security, list, list2)), null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit updateLists$lambda$27(CuratedListQuickAddDuxo curatedListQuickAddDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        curatedListQuickAddDuxo.applyMutation(new Function1() { // from class: com.robinhood.shared.lists.quickadd.CuratedListQuickAddDuxo$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CuratedListQuickAddDuxo.updateLists$lambda$27$lambda$26(throwable, (CuratedListQuickAddViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CuratedListQuickAddViewState updateLists$lambda$27$lambda$26(Throwable th, CuratedListQuickAddViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CuratedListQuickAddViewState.copy$default(applyMutation, null, null, null, null, new UiEvent(th), null, null, null, null, 239, null);
    }
}
