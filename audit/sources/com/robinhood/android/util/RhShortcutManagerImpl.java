package com.robinhood.android.util;

import android.app.Application;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import com.robinhood.android.common.util.RhShortcut;
import com.robinhood.android.common.util.RhShortcutManager;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.librobinhood.data.store.AchRelationshipStore;
import com.robinhood.librobinhood.data.store.BalancesStore;
import com.robinhood.models.crypto.p314db.UnifiedBalances;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.shared.security.auth.AuthManager;
import com.robinhood.store.achrelationship.QueuedTransferStore;
import com.robinhood.utils.Optional;
import com.robinhood.utils.coroutines.scope.RootCoroutineScope;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.p408rx.ScopedSubscriptionKt;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import timber.log.Timber;

/* compiled from: RhShortcutManagerImpl.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001BC\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J!\u0010\u001a\u001a\u00020\u00132\u0012\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u001c\"\u00020\u0019H\u0002¢\u0006\u0002\u0010\u001dJ\u0016\u0010\u001a\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u001eH\u0002J\u0012\u0010\u001f\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\f\u0010\"\u001a\u00020#*\u00020\u0019H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/util/RhShortcutManagerImpl;", "Lcom/robinhood/android/common/util/RhShortcutManager;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "application", "Landroid/app/Application;", "achRelationshipStore", "Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;", "balancesStore", "Lcom/robinhood/librobinhood/data/store/BalancesStore;", "queuedTransferStore", "Lcom/robinhood/store/achrelationship/QueuedTransferStore;", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroid/app/Application;Lcom/robinhood/librobinhood/data/store/AchRelationshipStore;Lcom/robinhood/librobinhood/data/store/BalancesStore;Lcom/robinhood/store/achrelationship/QueuedTransferStore;Lcom/robinhood/shared/security/auth/AuthManager;Lcom/robinhood/coroutines/rx/RxFactory;)V", "initialize", "", "refreshShortcuts", "isLoggedIn", "", "reportUse", "shortcut", "Lcom/robinhood/android/common/util/RhShortcut;", "updateShortcuts", "shortcuts", "", "([Lcom/robinhood/android/common/util/RhShortcut;)V", "", "loadShortcutsForBalances", "balances", "Lcom/robinhood/models/crypto/db/UnifiedBalances;", "toShortcutInfo", "Landroid/content/pm/ShortcutInfo;", "app-provisions_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class RhShortcutManagerImpl implements RhShortcutManager {
    private final AchRelationshipStore achRelationshipStore;
    private final Application application;
    private final AuthManager authManager;
    private final BalancesStore balancesStore;
    private final CoroutineScope coroutineScope;
    private final QueuedTransferStore queuedTransferStore;
    private final RxFactory rxFactory;

    public RhShortcutManagerImpl(@RootCoroutineScope CoroutineScope coroutineScope, Application application, AchRelationshipStore achRelationshipStore, BalancesStore balancesStore, QueuedTransferStore queuedTransferStore, AuthManager authManager, RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(achRelationshipStore, "achRelationshipStore");
        Intrinsics.checkNotNullParameter(balancesStore, "balancesStore");
        Intrinsics.checkNotNullParameter(queuedTransferStore, "queuedTransferStore");
        Intrinsics.checkNotNullParameter(authManager, "authManager");
        Intrinsics.checkNotNullParameter(rxFactory, "rxFactory");
        this.coroutineScope = coroutineScope;
        this.application = application;
        this.achRelationshipStore = achRelationshipStore;
        this.balancesStore = balancesStore;
        this.queuedTransferStore = queuedTransferStore;
        this.authManager = authManager;
        this.rxFactory = rxFactory;
    }

    /* compiled from: RhShortcutManagerImpl.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.util.RhShortcutManagerImpl$initialize$1", m3645f = "RhShortcutManagerImpl.kt", m3646l = {48}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.util.RhShortcutManagerImpl$initialize$1 */
    static final class C313471 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C313471(Continuation<? super C313471> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhShortcutManagerImpl.this.new C313471(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313471) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Boolean> loggedInStateFlow = RhShortcutManagerImpl.this.authManager.getLoggedInStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(RhShortcutManagerImpl.this);
                this.label = 1;
                if (loggedInStateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            throw new ExceptionsH();
        }

        /* compiled from: RhShortcutManagerImpl.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.util.RhShortcutManagerImpl$initialize$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ RhShortcutManagerImpl $tmp0;

            AnonymousClass1(RhShortcutManagerImpl rhShortcutManagerImpl) {
                this.$tmp0 = rhShortcutManagerImpl;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, RhShortcutManagerImpl.class, "refreshShortcuts", "refreshShortcuts(Z)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit(((Boolean) obj).booleanValue(), (Continuation<? super Unit>) continuation);
            }

            public final Object emit(boolean z, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$refreshShortcuts = C313471.invokeSuspend$refreshShortcuts(this.$tmp0, z, continuation);
                return objInvokeSuspend$refreshShortcuts == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$refreshShortcuts : Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$refreshShortcuts(RhShortcutManagerImpl rhShortcutManagerImpl, boolean z, Continuation continuation) {
            rhShortcutManagerImpl.refreshShortcuts(z);
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.android.common.util.RhShortcutManager
    public void initialize() {
        BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C313471(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshShortcuts(boolean isLoggedIn) {
        Timber.INSTANCE.mo3350d("refreshing shortcuts : is logged in - " + isLoggedIn, new Object[0]);
        if (isLoggedIn) {
            Observable observableTake = this.rxFactory.convertToObservable(this.balancesStore.streamIndividualAccountUnifiedBalancesOptional()).take(1L);
            Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
            ScopedSubscriptionKt.subscribeIn(observableTake, this.coroutineScope, new Function1() { // from class: com.robinhood.android.util.RhShortcutManagerImpl$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhShortcutManagerImpl.refreshShortcuts$lambda$0(this.f$0, (Optional) obj);
                }
            });
            return;
        }
        updateShortcuts(CollectionsKt.emptyList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit refreshShortcuts$lambda$0(RhShortcutManagerImpl rhShortcutManagerImpl, Optional optional) {
        UnifiedBalances unifiedBalances = (UnifiedBalances) optional.component1();
        if (unifiedBalances == null) {
            rhShortcutManagerImpl.balancesStore.refreshIndividualAccount(false);
        }
        rhShortcutManagerImpl.loadShortcutsForBalances(unifiedBalances);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.util.RhShortcutManager
    public void reportUse(RhShortcut shortcut) {
        Intrinsics.checkNotNullParameter(shortcut, "shortcut");
        ContextSystemServices.getShortcutManager(this.application).reportShortcutUsed(shortcut.getShortcutId());
    }

    private final void updateShortcuts(RhShortcut... shortcuts) {
        updateShortcuts(ArraysKt.asList(shortcuts));
    }

    private final void updateShortcuts(List<? extends RhShortcut> shortcuts) {
        ShortcutManager shortcutManager = ContextSystemServices.getShortcutManager(this.application);
        List listTake = CollectionsKt.take(shortcuts, shortcutManager.getMaxShortcutCountPerActivity());
        try {
            List list = listTake;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(toShortcutInfo((RhShortcut) it.next()));
            }
            shortcutManager.setDynamicShortcuts(arrayList);
            List pinnedShortcuts = shortcutManager.getPinnedShortcuts();
            Intrinsics.checkNotNullExpressionValue(pinnedShortcuts, "getPinnedShortcuts(...)");
            List list2 = pinnedShortcuts;
            LinkedHashSet linkedHashSet = list2 instanceof Collection ? new LinkedHashSet(list2.size()) : new LinkedHashSet();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                linkedHashSet.add(RhShortcutManagerImpl$$ExternalSyntheticApiModelOutline8.m2568m(it2.next()).getId());
            }
            Set setUnmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
            Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
            List list3 = listTake;
            LinkedHashSet linkedHashSet2 = list3 instanceof Collection ? new LinkedHashSet(list3.size()) : new LinkedHashSet();
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                linkedHashSet2.add(((RhShortcut) it3.next()).getShortcutId());
            }
            Set setUnmodifiableSet2 = Collections.unmodifiableSet(linkedHashSet2);
            Intrinsics.checkNotNullExpressionValue(setUnmodifiableSet2, "unmodifiableSet(...)");
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : setUnmodifiableSet) {
                if (setUnmodifiableSet2.contains((String) obj)) {
                    arrayList2.add(obj);
                } else {
                    arrayList3.add(obj);
                }
            }
            Tuples2 tuples2 = new Tuples2(arrayList2, arrayList3);
            List list4 = (List) tuples2.component1();
            List list5 = (List) tuples2.component2();
            shortcutManager.enableShortcuts(list4);
            shortcutManager.disableShortcuts(list5);
        } catch (IllegalStateException unused) {
        }
    }

    private final void loadShortcutsForBalances(UnifiedBalances balances) {
        if (balances != null) {
            if (balances.getUsdEquity().isPositive()) {
                updateShortcuts(RhShortcut.SEARCH, RhShortcut.ACCOUNT, RhShortcut.HISTORY, RhShortcut.SETTINGS);
                return;
            }
            Observable<R> map = this.achRelationshipStore.getLinkedAchRelationships().take(1L).map(new io.reactivex.functions.Function() { // from class: com.robinhood.android.util.RhShortcutManagerImpl.loadShortcutsForBalances.1
                @Override // io.reactivex.functions.Function
                public final Boolean apply(List<AchRelationship> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(!it.isEmpty());
                }
            });
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            ScopedSubscriptionKt.subscribeIn(map, this.coroutineScope, new Function1() { // from class: com.robinhood.android.util.RhShortcutManagerImpl$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RhShortcutManagerImpl.loadShortcutsForBalances$lambda$5(this.f$0, (Boolean) obj);
                }
            });
            return;
        }
        List<? extends RhShortcut> listMutableListOf = CollectionsKt.mutableListOf(RhShortcut.SEARCH);
        if (!this.queuedTransferStore.hasQueuedDeposit()) {
            this.queuedTransferStore.refreshQueuedDeposit();
            listMutableListOf.add(RhShortcut.DEPOSIT_QUEUED_DEPOSIT);
        }
        listMutableListOf.add(RhShortcut.SETTINGS);
        updateShortcuts(listMutableListOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadShortcutsForBalances$lambda$5(RhShortcutManagerImpl rhShortcutManagerImpl, Boolean bool) {
        if (bool.booleanValue()) {
            rhShortcutManagerImpl.updateShortcuts(RhShortcut.SEARCH, RhShortcut.ACCOUNT, RhShortcut.HISTORY, RhShortcut.DEPOSIT);
        } else {
            rhShortcutManagerImpl.achRelationshipStore.refresh(false);
            rhShortcutManagerImpl.updateShortcuts(RhShortcut.SEARCH, RhShortcut.ACCOUNT, RhShortcut.HISTORY, RhShortcut.LINK_ACCOUNT);
        }
        return Unit.INSTANCE;
    }

    private final ShortcutInfo toShortcutInfo(RhShortcut rhShortcut) {
        RhShortcutManagerImpl$$ExternalSyntheticApiModelOutline14.m2561m();
        ShortcutInfo shortcutInfoBuild = RhShortcutManagerImpl$$ExternalSyntheticApiModelOutline13.m2560m(this.application, rhShortcut.getShortcutId()).setIcon(Icon.createWithResource(this.application, RhShortcutManagerImpl2.getIconResId(rhShortcut))).setIntent(RhShortcutManagerImpl2.createIntent(RhShortcutManagerImpl2.getDeepLinkPath(rhShortcut))).setShortLabel(this.application.getString(RhShortcutManagerImpl2.getLabelResIdShort(rhShortcut))).setLongLabel(this.application.getString(RhShortcutManagerImpl2.getLabelResIdLong(rhShortcut))).build();
        Intrinsics.checkNotNullExpressionValue(shortcutInfoBuild, "build(...)");
        return shortcutInfoBuild;
    }
}
